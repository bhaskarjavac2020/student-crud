package com.project.student.serviceImpl;

import com.project.student.dto.DepartmentDTO;
import com.project.student.dto.StudentDTO;
import com.project.student.entity.Department;
import com.project.student.entity.Student;
import com.project.student.repository.CollegeRepository;
import com.project.student.repository.DepartmentRepository;
import com.project.student.repository.StudentRepository;
import com.project.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private CollegeRepository collegeRepository;
    /*
    // save
    @Override
    public Student saveStudent(StudentDTO studentDTO) {
        Department department= departmentRepository.findById(dId).get();

        Clg  clg= collegeRepository.findById(clgId).get();
        Student s = new Student();
        s.setName(dto.getName());
        s.setDob(dto.getDob());
        s.setFather(dto.getFather());
        s.setClgs(clg);
        s.setDepts(dept);
        return repo.save(s);
    }

    //update
    @Override
    public Student updateStudent(StudentDTO dto, Integer Id, Integer dId, Integer clgId){
        Student s = repo.findById(Id).get();

        Department dept= departmentRepository.findById(dId).get();

        Clg  clg= collegeRepository.findById(clgId).get();
        s.setName(dto.getName());
        dept.setStudentd((List<Student>) s);
        s.setDepts(dept);
        s.setClgs(clg);
        return repo.save(s);
    }




    //get
    public List<Student> getStudent(){
        return repo.findAll();
    }
    //delete
    public void deleteStudent(Integer dId){
        repo.deleteById(dId);
    }

*/
    // save
    @Override
    public Department saveDepartment(DepartmentDTO departmentDTO) {
        Department dept = departmentRepository.findByName(departmentDTO.getDepartmentName());
        Department department=null;
        if(dept == null){
            department=new Department();
            department.setName(departmentDTO.getDepartmentName());
            department.setDescription(departmentDTO.getDepartmentDescription());
            department=departmentRepository.save(department);
        }else{
            department=dept;
        }
        return department;
    }

    //update
    @Override
    public Department updateDepartment(DepartmentDTO departmentDTO){
        Optional<Department> opt = departmentRepository.findById(departmentDTO.getDepartmentId());
        Department dept=null;
        if(opt.isPresent()){
            dept=opt.get();
        }
        dept.setName(departmentDTO.getDepartmentName());
        dept.setDescription(departmentDTO.getDepartmentDescription());
        return departmentRepository.save(dept);
    }
    //get all department
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }
    //delete
    @Override
    public void deleteDepartment(Integer departmentId){
        departmentRepository.deleteById(departmentId);
    }
/*
    @Autowired
    private CollegeRepository clgREpo;
    // save
    public Clg saveClg(CollegeDTO dto) {
        Clg clg=new Clg();
        clg.setClgName(dto.getClgName());
        return clgREpo.save(clg);
    }
    //update
    public Clg updateClg(CollegeDTO dto, Integer clgId){
        Clg clg=clgREpo.findById(clgId).get();
        clg.setClgName(dto.getClgName());
        return clgREpo.save(clg);
    }
    //get
    public List<Clg> getClg(){
        return clgREpo.findAll();
    }
    //delete
    public void deleteClg(Integer clgId){
        clgREpo.deleteById(clgId);
    }
*/
}
