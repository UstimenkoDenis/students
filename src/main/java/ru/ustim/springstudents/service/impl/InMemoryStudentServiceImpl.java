package ru.ustim.springstudents.service.impl;

import org.springframework.stereotype.Service;
import ru.ustim.springstudents.model.Student;
import ru.ustim.springstudents.service.StudentService;

import java.util.List;

@Service
public class InMemoryStudentServiceImpl implements StudentService {

    @Override
    public List<Student> findAllStudent() {
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(String email) {

    }

}
