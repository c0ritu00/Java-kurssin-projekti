import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseFileService implements ICourseFileService{
   
    public List<Student> students = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();


    @Override
    public List<Student> readStudentsFromFile(String filePath) throws FileNotFoundException {
        File f = new File(filePath);
        Scanner sc = new Scanner(f);
        

        while(sc.hasNextLine()){
            String[] studentInfo = sc.nextLine().split("---");
            Student s = new Student(studentInfo[0], studentInfo[1], Integer.parseInt(studentInfo[2]));

            students.add(s);
        }
        sc.close();
    }

    @Override
    public List<Course> readCoursesFromFile(String filePath) throws FileNotFoundException {
        File f = new File(filePath);
        Scanner sc = new Scanner(f);
        

        while(sc.hasNextLine()){
            String[] courseInfo = sc.nextLine().split("---");
            Course c = new Course(courseInfo[1], courseInfo[2], Integer.parseInt(courseInfo[2]));

            courses.add(c);
        }
        sc.close();
    }
    
}
