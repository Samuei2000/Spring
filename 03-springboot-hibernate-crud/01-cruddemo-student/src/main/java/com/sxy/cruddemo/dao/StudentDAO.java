package com.sxy.cruddemo.dao;

import com.sxy.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
}
