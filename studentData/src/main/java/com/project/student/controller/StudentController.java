package com.project.student.controller;

import com.project.student.dto.DepartmentDTO;
import com.project.student.dto.StudentDTO;
import com.project.student.entity.Department;
import com.project.student.entity.Student;
import com.project.student.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentServiceImpl;
/*
    @PostMapping("/student/save")
    public ResponseEntity<Student> saveStudent(@RequestBody StudentDTO studentDTO){
        Student result=studentServiceImpl.saveStudent(studentDTO);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @PutMapping("/student/update")
    public ResponseEntity<Student> updateStudent(@RequestBody StudentDTO studentDTO){
        Student result=studentServiceImpl.updateStudent(dto,Id,dId,clgId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("get")
    public List<Student> getStudent(){
        List<Student> result=impl1.getStudent();
        return (List<Student>) ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @DeleteMapping("delete")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer dId){
        impl1.deleteStudent(dId);
        return  ResponseEntity.status(HttpStatus.OK).body("deleted");
    }

 */
    @PostMapping("/save/department")
    public ResponseEntity<Department> saveDepartment(@RequestBody DepartmentDTO departmentDTO){
        Department result=studentServiceImpl.saveDepartment(departmentDTO);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @PutMapping("/update/department")
    public ResponseEntity<Department> updateDepartment(@RequestBody DepartmentDTO departmentDTO){
        Department result=studentServiceImpl.updateDepartment(departmentDTO);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("/department-list")
    public ResponseEntity<List<Department>> getAllDepartments(){
        List<Department> result=studentServiceImpl.getAllDepartment();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @DeleteMapping("/delete-department/{id}")
    public ResponseEntity<String> deleteDepartmentById(@PathVariable Integer id){
        studentServiceImpl.deleteDepartment(id);
        String result=id+" deleted successfully.";
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
