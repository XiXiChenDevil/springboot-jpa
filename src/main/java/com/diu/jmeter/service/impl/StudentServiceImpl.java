package com.diu.jmeter.service.impl;

import com.diu.jmeter.pojo.Student;
import com.diu.jmeter.repository.StudentRepository;
import com.diu.jmeter.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: DIU
 * @Date: 2021/9/5 16:54
 */
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        long l = System.currentTimeMillis();
        List<Student> all = studentRepository.findAll();
        System.out.println("一共耗时：" + (System.currentTimeMillis() - l));
        return all;
    }

    @Override
    public Integer saveStudent(Student student) {
        Student save = studentRepository.save(student);
        if (save == null){
            return 0;
        }
        return 1;
    }

    @Override
    public Integer updateStudent(Student student) {
        return null;
    }

    @Override
    public Integer deleteById(Integer id) {
        return null;
    }
}
