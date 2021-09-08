package com.diu.jmeter.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: DIU
 * @Date: 2021/8/13 14:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 662692451122902511L;
    private String name;
    private Integer age;

}
