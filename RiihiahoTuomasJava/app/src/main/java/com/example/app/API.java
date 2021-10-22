package com.example.app;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {

    @Autowired
    CourseFileService courseFileService;

    @Autowired
    CourseService courseService;

    String filePath1 = "demo/students.txt";
    String filePath2 = "demo/courses.txt";

    @GetMapping()
    public String HelloWorld(){
    return "Hello World";
    }

    @GetMapping("/students")
    public List<Student> readStudentsFromFile()throws FileNotFoundException {
    
        courseService.setStudents(courseFileService.readStudentsFromFile(filePath1));
        return courseService.getStudents();
    }

    @GetMapping("/courses")
    public List<Course> readCoursesFromFile()throws FileNotFoundException {
        courseService.setCourses(courseFileService.readCoursesFromFile(filePath2));
        return courseService.getCourses();
    }

    @GetMapping("/onlinecourses")
    public List<Course> readOnlineCourses() throws FileNotFoundException {
        return courseFileService.readCoursesFromFile(filePath2);
    }

    //Palauttaa id:n perusteella opiskelijan tiedot ja myös kurssit, joissa opiskelija on. Voidaan palauttaa HTML-muodossa Stringinä
    @GetMapping("/students/{studentId}")
    public Student getStudentID(@PathVariable long studentId){
        return courseService.getStudentByID(studentId);
    }

    //Palauttaa kurssin nimen ja siihen rekisteröityneet opiskelijat HTML muodossa
    @GetMapping("/courses/{studentId}")
    public Course getCourseID(@PathVariable long courseId){
        return courseService.getCourseByID(courseId);
    }

    //Lisää POST-mappauksella opiskelija kurssille JSON-rakenteen perusteelle JSON annetaan
    //esim. muodossa {”sid”: ”0”, ”cid”: ”1”} . sid on opiskelijan id ja cid kurssin id. Testaa
    //toimintaa esim. Postmanilla tai Thunder Clientilla.
    @GetMapping("/add")
    public String course()
    {
        return null;
    }

}
