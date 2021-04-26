package com.dlkyy.dao;

import com.dlkyy.entity.Student;

import java.util.List;

/**
 * Created by dlkyy on 2021/4/26 21:40
 */
public interface StudentDao {
  int insertStudent(Student student);
  List<Student> selectStudents();

}
