package com.diu.jmeter.repository;

import com.diu.jmeter.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: DIU
 * @Date: 2021/9/5 16:39
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
