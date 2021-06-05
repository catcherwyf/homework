package com.catcher.springBean.Entity;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Student{


    private int id;
    private String name;


    public void init() {
        System.out.println("hello...........");
    }

}
