package com.project.student.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class DepartmentDTO {
    private  Integer departmentId;
    private String departmentName;
    private String departmentDescription;
}
