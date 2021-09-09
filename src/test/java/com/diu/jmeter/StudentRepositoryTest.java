package com.diu.jmeter;

import com.diu.jmeter.pojo.Student;
import com.diu.jmeter.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Date;
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
        Student student = new Student(null, 2, "刘虞诩", "lsrs123", 21, "江西南昌", "18154195313",new Timestamp(System.currentTimeMillis()),"200");
        Student save = studentRepository.save(student);
        System.out.println(save);
    }

}