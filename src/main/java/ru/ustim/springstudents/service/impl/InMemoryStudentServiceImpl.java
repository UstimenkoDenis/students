package ru.ustim.springstudents.service.impl;

import org.springframework.stereotype.Service;
import ru.ustim.springstudents.model.Student;
import ru.ustim.springstudents.service.StudentService;

import java.util.List;

@Service
public class InMemoryStudentServiceImpl implements StudentService {

    @Override
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Denis").email("ustimenko82@mail.ru").age(42).build(),
                Student.builder().firstName("Petr").email("vasiliev@mail.ru").age(41).build(),
                Student.builder().firstName("Ivan").email("sidorov@mail.ru").age(35).build()
        );
    }
}
