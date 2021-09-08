package com.diu.jmeter.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private Integer id;
    private Integer gradeId;
    private String name;
    private String password;
    private Integer age;
    private String address;
    private String phone;
    private java.sql.Timestamp admission;
    private String empStatus;

}
