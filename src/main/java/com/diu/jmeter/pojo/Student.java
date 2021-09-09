package com.diu.jmeter.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Diu
 */
@DynamicUpdate
@DynamicInsert
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
//    @GenericGenerator(name = "myid", strategy = "com.git.hui.boot.jpa.generator.ManulInsertGenerator")
    @Column(name = "id")
    private Integer id;
    @Column(name = "grade_Id")
    private Integer gradeId;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "age")
    private Integer age;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "admission")
    private java.sql.Timestamp admission;
    @Column(name = "emp_status")
    private String empStatus;

}
