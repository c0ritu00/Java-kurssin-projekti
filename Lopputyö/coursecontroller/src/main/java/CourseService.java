

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService implements ICourseService {

    //Kumpi oikein?
    File students = new File("./files/students.txt");
    File courses = new File("./files/courses.txt");

    String filePath1 = "./files//students.txt";
    String filePath2 = "./files//courses.txt";
    


    @Override
    public List<Student> getStudents() {
        
        return null;
    }
   
    @Override
    public List<Course> getCourses() {
       
        return null;
    }

    @Override
    public Student getStudentByID(long studentId) {
        
        return null;
    }

    @Override
    public Course getCourseByID(long courseId) {
        
        return null;
    }

    @Override
    public List<Course> getCoursesOfStudent(long studentId) {
        
        return null;
    }

    @Override
    public boolean addStudentToCourse(long studentId, long courseId) {
        
        return false;
    }
    
    
}
