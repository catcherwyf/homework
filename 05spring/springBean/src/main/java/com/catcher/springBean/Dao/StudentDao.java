package com.catcher.springBean.Dao;

import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDao {

    public void init(){
        System.out.println("studentDao init print");
    }

}
