package com.xiaohao.repository.impl;

import com.xiaohao.domain.Student;
import com.xiaohao.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Sql2o;

import java.sql.Connection;

/**
 * Created by xiaohao on 2014/11/5.
 */
@Repository
public class StudentRepositoryImpl implements IStudentRepository {

    @Autowired
    Sql2o sql2o;

    @Override
    public Student queryAStudent(Integer id) {
        sql2o.beginTransaction();
        org.sql2o.Connection connection =sql2o.open();
        return null;
    }
}
