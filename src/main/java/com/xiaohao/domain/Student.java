package com.xiaohao.domain;

import java.io.Serializable;

/**
 * Created by xiaohao on 2014/11/5.
 */
public class Student implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
