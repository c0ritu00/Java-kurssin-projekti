import java.io.FileNotFoundException;
import java.util.List;

public interface ICourseFileService  {
    /**
     * Reads list of students from txt-file
     */
    List<Student> readStudentsFromFile(String filePath1) throws FileNotFoundException;
    /**
     * Reads list of courses from txt-file
     */
    List<Course> readCoursesFromFile(String filePath2) throws FileNotFoundException;;
}
