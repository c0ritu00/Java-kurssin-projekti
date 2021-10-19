import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {


    @Autowired
    CourseService myService;

    //String filePath = "./files/students.txt";

    @GetMapping("/students")
    public List<Student> readStudentsFromFile(String filePath)throws FileNotFoundException {
        return myService.students;
    }

    @GetMapping("/courses")
    public List<Student> readCoursesFromFile(String filePath)throws FileNotFoundException {
        return myService.courses;
    }

    //Palauttaa id:n perusteella opiskelijan tiedot ja myös kurssit, joissa opiskelija on. Voidaan palauttaa HTML-muodossa Stringinä
    @GetMapping("/students/{id}")
    public String studentInfo(@PathVariable String id){
        return myService.studentInfo(id);
    }

    //Palauttaa kurssin nimen ja siihen rekisteröityneet opiskelijat HTML muodossa
    @GetMapping("/courses/{id}")
    public String courseInfo(@PathVariable String id){
        return myService.courseInfo(id);
    }

    //Lisää POST-mappauksella opiskelija kurssille JSON-rakenteen perusteelle JSON annetaan
    //esim. muodossa {”sid”: ”0”, ”cid”: ”1”} . sid on opiskelijan id ja cid kurssin id. Testaa
    //toimintaa esim. Postmanilla tai Thunder Clientilla.
    @GetMapping("/add")




}
