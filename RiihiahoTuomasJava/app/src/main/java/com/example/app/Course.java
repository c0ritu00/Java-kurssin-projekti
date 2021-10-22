package com.example.app;

import java.util.List;
import java.util.ArrayList;

public class Course {
    private long courseId;
    protected String courseName;
    private String teacherName;
    private String room;

    public List<Student> students = new ArrayList<>();

    private static long courseIdCounter = 0;

    public Course() {
        this("", "", "", 0);
    }

    public Course(String courseName, String teacherName, String room, long courseId) {
        this.courseId = courseIdCounter++;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.room = room;
        
    }

    public long getCourseId() {
        return this.courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //----------------------------------------------------------------

    //Palautetaan Listan kopio niin alkuperäistä listaa ei muuteta
    public List<Student> getStudentList() {

        return new ArrayList<>(this.students); 

    }

   
    //Lisätään opiskelija arrayhyn
    public boolean addStudent(Student student){

       if(students.contains(student)){
           return false;
       }else{
           students.add(student);
           return true;
       }

    }

    //Poistaa opiskelijan
    public void deleteStudent(Student student){  
        if(students.contains(student)){
            students.remove(student);
        }
    }
}

  
