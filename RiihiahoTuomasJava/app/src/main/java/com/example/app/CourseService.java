
package com.example.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService implements ICourseService {

    boolean find;
    public List<Student> students = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();
    
    CourseService myCourseService;
    CourseFileService courseFileService = new CourseFileService();

    @Override
    public List<Student> getStudents() {
        return students;
    }
   
    public void setStudents(List<Student> students){
        this.students = students;
    }

    public void setCourses(List<Course> courses){
        this.courses = courses;
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public Student getStudentByID(long studentId) {
        
        for (Student a : students) {
            if(a.getStudentId() == studentId) {
                return a;
            }
        }
        return null;
    }

    @Override
    public Course getCourseByID(long courseId) {
        
        for (Course c : courses) {
            if(c.getCourseId() == courseId) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Course> getCoursesOfStudent(long studentId) {
        return myCourseService.getCoursesOfStudent(studentId);
    }

    @Override
    public boolean addStudentToCourse(long studentId, long courseId) {
        System.out.println("For loop alkaa");
        
        for (Course c : courses) {

            //Käydään kurssit läpi

            if(c.getCourseId() == courseId){

                //Kurssi löytynyt
                //Katsotaan löytyykö student

                for (Student s : students) {
                    if(s.getStudentId() == studentId){

                        //Student löytynyt
                    c.addStudent(s);
                    
                    find = c.addStudent(s);
                    }
                }
            }
        }
        return find;
    }
    
    
}
