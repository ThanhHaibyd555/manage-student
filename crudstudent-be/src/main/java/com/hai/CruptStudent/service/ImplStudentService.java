package com.hai.CruptStudent.service;

import com.hai.CruptStudent.model.Student;

import java.util.List;

public interface ImplStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();

    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id);

    void deleteStudent(Long id);
}
