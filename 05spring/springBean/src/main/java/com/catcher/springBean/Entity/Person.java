package com.catcher.springBean.Entity;

import lombok.*;
import org.springframework.stereotype.Repository;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Repository
public class Person {
    private int id;
    private String name;
    private String sex;
    private String phone;

    public void init(){
        System.out.println("Person {id:1, name:catcher, sex: 1, phone: 18812345678}");
    }
}
