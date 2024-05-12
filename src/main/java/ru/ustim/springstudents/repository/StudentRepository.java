package ru.ustim.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ustim.springstudents.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
