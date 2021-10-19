

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApp.class, args);

		//CourseFileService cfc = new CourseFileService("./files/students.txt");
	}

}
