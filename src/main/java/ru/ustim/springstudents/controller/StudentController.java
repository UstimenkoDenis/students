package ru.ustim.springstudents.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ustim.springstudents.model.Student;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Denis").email("ustimenko@mail.ru").age(42).build(),
                Student.builder().firstName("Petr").email("vasiliev@mail.ru").age(41).build(),
                Student.builder().firstName("Ivan").email("sidorov@mail.ru").age(35).build()
        );
    }
}
