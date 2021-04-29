package com.dlkyy.service.impl;

import com.dlkyy.dao.StudentDao;
import com.dlkyy.entity.Student;
import com.dlkyy.service.StudentService;

import java.util.List;

/**
 * Created by dlkyy on 2021/4/26 21:51
 */
public class StudentServiceImpl implements StudentService {
  // y引用类型
  private StudentDao studentDao;

  // 使用set注入，赋值
  public void setStudentDao(StudentDao studentDao){
    this.studentDao = studentDao;
  }

  @Override
  public int addStudent(Student student) {
    int nums = studentDao.insertStudent(student);
    return nums;
  }

  @Override
  public List<Student> queryStudents() {
    List<Student> students = studentDao.selectStudents();
    return students;
  }
}
