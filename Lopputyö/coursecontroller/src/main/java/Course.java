import java.util.List;
import java.util.ArrayList;

public class Course {
    private long courseId;
    protected String courseName;
    private String teacherName;
    //public List<Student> students = new ArrayList<>();

    private static long idCounter = 0;

    public Course() {
        this("", "", 0);
    }

    public Course(String courseName, String teacherName, long idCounter) {
        this.courseId = idCounter++;
        this.courseName = courseName;
        this.teacherName = teacherName;
    }

    public long getCourseId() {
        return this.courseId;
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
    //Pitää palauttaa boolean arvo
    public boolean addStudent(Student student){

        students.add(student);
        return true;  

    }

    //Poistaa opiskelijan
    public void deleteStudent(Student student){  

        students.remove(student);

    }
}

  
