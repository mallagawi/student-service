package com.cleansoft.studentservice.repositories;

import com.cleansoft.studentservice.entities.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends PagingAndSortingRepository<Student,Long>{

    Student findByStudentName(String studentName);
}
