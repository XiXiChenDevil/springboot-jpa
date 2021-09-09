package com.diu.jmeter;

import com.diu.jmeter.pojo.Student;
import com.diu.jmeter.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
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
    @Transactional      // 在测试类对于事务提交方式默认的是回滚。
    @Rollback(false)    //取消自动回滚
    public void saveStudent() {
        Student student = new Student(null, 2, "刘虞诩", "lsrs123", 21, "江西南昌", "18154195313", new Timestamp(System.currentTimeMillis()), "200");
        Student save = this.studentRepository.save(student);
        System.out.println("数据库增加的数据是：" + save);
    }

    @Test
    public void findByStudentNameIs() {
        Student list = this.studentRepository.findBystudentName("普罗米修斯");
        System.out.println(list);
    }

}
