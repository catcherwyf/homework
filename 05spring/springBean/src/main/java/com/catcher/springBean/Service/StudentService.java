package com.catcher.springBean.Service;

import com.catcher.springBean.Dao.StudentDao;
import com.catcher.springBean.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("studentService")
public class StudentService {
    @Resource(name = "studentDao")
    private StudentDao studentDao;

    public void init(){
        studentDao.init();
    }

}
