package com.project.student.service;

import com.project.student.dto.CollegeDTO;
import com.project.student.dto.DepartmentDTO;
import com.project.student.dto.StudentDTO;
import com.project.student.entity.College;
import com.project.student.entity.Department;
import com.project.student.entity.Student;

import java.util.List;

public interface StudentService {
    /*
    //save
    public Student saveStudent(StudentDTO studentDTO);
    //update
    public Student updateStudent(StudentDTO studentDTO);
    //get
    public List<Student> getStudent();
    //delete
    public void deleteStudent(Integer dId);
     */
    //save department
    public Department saveDepartment(DepartmentDTO departmentDTO);
    //update department
    public Department updateDepartment(DepartmentDTO departmentDTO);
    //get department list
    public List<Department> getAllDepartment();
    //delete
    public void deleteDepartment(Integer departmentId);
    /*
    //save college
    public College saveCollege(CollegeDTO collegeDTO);
    //update college
    public College updateCollege(CollegeDTO collegeDTO);
    //get college list
    public List<College> getAllCollege();
    //delete college
    public void deleteClg(Integer collegeId);
     */

}
