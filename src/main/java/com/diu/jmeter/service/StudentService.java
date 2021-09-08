package com.diu.jmeter.service;

import com.diu.jmeter.pojo.Student;

import java.util.List;

/**
 * @Author: DIU
 * @Date: 2021/9/5 16:50
 */
public interface StudentService {

    /**
     * 查询全部学生数据
     *
     * @return
     */
    List<Student> findAll();

    /**
     * 增加学生数据
     *
     * @param student
     * @return
     */
    Integer saveStudent(Student student);

    /**
     * 修改学生数据
     *
     * @param student
     * @return
     */
    Integer updateStudent(Student student);

    /**
     * 删除学生数据
     *
     * @param id
     * @return
     */
    Integer deleteById(Integer id);

}
