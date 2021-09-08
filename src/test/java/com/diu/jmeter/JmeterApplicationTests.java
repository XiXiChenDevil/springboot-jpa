package com.diu.jmeter;

import com.diu.jmeter.pojo.Student;
import com.diu.jmeter.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JmeterApplicationTests {

    @Autowired
    private StudentService studentService;

    @Test
    void contextLoads() {
        List<Student> all = studentService.findAll();
        all.forEach(System.out::println);
    }

}
