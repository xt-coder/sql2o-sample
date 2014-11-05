package com.xiaohao.repository;

import com.xiaohao.domain.Student;

/**
 * Created by xiaohao on 2014/11/5.
 */
public interface IStudentRepository {

    Student queryAStudent(Integer id);

}
