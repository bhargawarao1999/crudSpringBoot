package com.vm.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vm.springboot.entity.Student;


@Repository
public interface StudentRepository extends CrudRepository <Student, Long> { 
    List<Student> findByName(String name); 
}