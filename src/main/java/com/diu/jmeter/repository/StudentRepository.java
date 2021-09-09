package com.diu.jmeter.repository;

import com.diu.jmeter.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author: DIU
 * @Date: 2021/9/5 16:39
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>, JpaSpecificationExecutor<Student> {

    /**
     * 占位符，1代表你方法内的第一个参数
     *
     * @param name 学生名
     * @return 学生信息
     */
    @Query(value = "select * from student where name = ?1", nativeQuery = true)
    Student findBystudentName(@Param("name") String name);
}
