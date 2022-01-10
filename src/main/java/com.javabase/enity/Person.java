package com.javabase.enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Person
 * @Description: person enity
 * @Author
 * @Date 2022/1/8
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person extends AbstractBase {
    private String name;
    private int age;

}
