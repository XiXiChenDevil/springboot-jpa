package com.diu.jmeter;

import com.diu.jmeter.pojo.Student;
import com.diu.jmeter.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void findAll() {
        List<Student> all = studentRepository.findAll();
        all.forEach(System.out::println);
    }

    @Test
    public void saveStudent() {
        System.out.println("hello world 1");
        System.out.println("hello world 2");
        System.out.println("hello world 3");
    }

}