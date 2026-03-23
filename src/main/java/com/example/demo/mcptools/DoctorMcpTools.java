package com.example.demo.mcptools;

import com.example.demo.dto.DoctorDto;
import com.example.demo.service.DoctorService;

import java.util.List;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Component;

@Component
public class DoctorMcpTools {

    private final DoctorService doctorService;

    public DoctorMcpTools(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @McpTool(
        name = "get_all_doctors",
        description = "Retrieve the complete list of all doctors registered in the system. " +
                      "Use this to show available doctors, count them, or filter in-memory if needed."
    )
    public List<DoctorDto> getAllDoctors() {
        return doctorService.findAll();
    }

    @McpTool(
        name = "get_doctor_by_id",
        description = "Fetch detailed information for one specific doctor using their unique ID."
    )
    public DoctorDto getDoctorById(
        @McpToolParam(description = "The doctor's numeric ID", required = true)
        Integer id
    ) {
        DoctorDto doctor = doctorService.findById(id);
        if (doctor == null) {
            throw new IllegalArgumentException("No doctor found with ID: " + id);
        }
        return doctor;
    }

    // ── Full DTO example ────────────────────────────────────────────────────────
    @McpTool(
        name = "create_doctor",
        description = """
            Create and register a new doctor in the hospital system.
            Provide the complete doctor information as a structured object.
            The 'id' field will be auto-generated — do not set it.
            'isActive' defaults to true if omitted.
            """
    )
    public DoctorDto createDoctor(
        @McpToolParam(
            description = """
                The full doctor details object.
                Required fields: name, email, specialisation.
                Example structure:
                {
                  "name": "Dr. Rajesh Kumar",
                  "email": "rajesh.kumar@hospital.in",
                  "specialisation": "Cardiology",
                  "isActive": true
                }
                """,
            required = true
        )
        DoctorDto doctor
    ) {
        // Optional: lightweight validation here if you want extra safety
        if (doctor.getName() == null || doctor.getName().isBlank()) {
            throw new IllegalArgumentException("Doctor name is required");
        }
        // id should be null for create
        doctor.setId(null);
        return doctorService.create(doctor);
    }

    // ── Update example with full DTO (overwrite style) ─────────────────────────
    @McpTool(
        name = "update_doctor_full",
        description = """
            Update an existing doctor's information by providing the complete updated object.
            The 'id' field is required and must match an existing doctor.
            All other fields will overwrite the current values.
            """
    )
    public DoctorDto updateDoctorFull(
        @McpToolParam(
            description = """
                The updated doctor object with ALL fields.
                'id' is mandatory and must exist.
                Example:
                {
                  "id": 42,
                  "name": "Dr. Priya Sharma (updated)",
                  "email": "priya.sharma@newmail.in",
                  "specialisation": "Neurology",
                  "isActive": false
                }
                """,
            required = true
        )
        DoctorDto doctor
    ) {
        if (doctor.getId() == null) {
            throw new IllegalArgumentException("Doctor ID is required for update");
        }
        return doctorService.update(doctor.getId(), doctor);
    }

    // Bonus: partial update variant (still using DTO, but you patch inside)
    @McpTool(
        name = "update_doctor_partial",
        description = """
            Partially update a doctor. Only send the fields that should change.
            Missing fields keep their current values.
            'id' is required.
            """
    )
    public DoctorDto updateDoctorPartial(
        @McpToolParam(required = true) DoctorDto updates
    ) {
        if (updates.getId() == null) {
            throw new IllegalArgumentException("Doctor ID is required");
        }
        
        DoctorDto current = doctorService.findById(updates.getId());
        if (current == null) {
            throw new IllegalArgumentException("Doctor not found with ID: " + updates.getId());
        }

        // Patch only provided fields (you can use a library like MapStruct or manual)
        if (updates.getName() != null)        current.setName(updates.getName());
        if (updates.getEmail() != null)       current.setEmail(updates.getEmail());
        if (updates.getSpecialisation() != null) current.setSpecialisation(updates.getSpecialisation());
        if (updates.getIsActive() != null)    current.setIsActive(updates.getIsActive());

        return doctorService.update(current.getId(), current);
    }

    @McpTool(
        name = "delete_doctor",
        description = "Remove a doctor permanently by their ID. This cannot be undone."
    )
    public String deleteDoctor(
        @McpToolParam(description = "The ID of the doctor to delete", required = true)
        Integer id
    ) {
        doctorService.delete(id);
        return "Doctor ID " + id + " deleted successfully.";
    }
}