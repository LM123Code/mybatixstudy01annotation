package com.mybatis01anno.dao;

import com.mybatis01anno.entities.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author LM_Code
 * @create 2019-03-31-10:37
 */
public interface StudentMapper {
    /**
     * 根据id查找学生
     * @param id
     * @return
     */
    @Select("select id, name, sex from student where id = #{id};")
    Student selectStudentById(int id);

    /**
     * 根据姓名查找学生
     * @param name
     * @return
     */
    @Select("select id, name, sex from student where name like '%${value}%'")
    List<Student> selectStudentsByName(String name);

    /**
     * 插入学生
     * @param student
     * @return
     */
    @Insert("insert into student(name, sex) values(#{name}, #{sex});")
    int insertStudent(Student student);

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    @Update("update student set name = #{name}, sex = #{sex} where id = #{id};")
    int updateStudent(Student student);

    /**
     * 删除学生信息
     * @param id
     * @return
     */
    @Delete("delete from student where id = #{id};")
    int deleteStudentById(int id);
}
