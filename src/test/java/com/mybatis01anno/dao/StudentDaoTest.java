package com.mybatis01anno.dao;

import com.mybatis01anno.entities.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;

public class StudentDaoTest {
    StudentDao studentDao = null;
    @Before
    public void before() throws Exception {
        studentDao = new StudentDao();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: selectStudentById(int id)
     */
    @Test
    public void testSelectStudentById() throws Exception {
        Student student = studentDao.selectStudentById(12);
        System.out.println(student);
        Assert.assertNotNull(student);
    }

    /**
     * Method: selectStudentsByName(String name)
     */
    @Test
    public void testSelectStudentsByName() throws Exception {
        List<Student> students = studentDao.selectStudentsByName("o");
        System.out.println(students);
        Assert.assertNotNull(students);
    }

    /**
     * Method: insertStudent(Student student)
     */
    @Test
    public void testInsertStudent() throws Exception {
        Student student = new Student();
        student.setName("yangluo");
        Assert.assertEquals(1, studentDao.insertStudent(student));
    }

    /**
     * Method: updateStudent(Student student)
     */
    @Test
    public void testUpdateStudent() throws Exception {
        Student student = new Student();
        student.setName("llolo");
        student.setSex("boy");
        student.setId(16);
        Assert.assertEquals(1, studentDao.updateStudent(student));
    }

    /**
     * Method: deleteStudentById(int id)
     */
    @Test
    public void testDeleteStudentById() throws Exception {
        Assert.assertEquals(1, studentDao.deleteStudentById(15));
    }


} 
