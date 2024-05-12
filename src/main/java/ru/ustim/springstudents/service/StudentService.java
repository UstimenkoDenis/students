package ru.ustim.springstudents.service;

import ru.ustim.springstudents.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();
}
