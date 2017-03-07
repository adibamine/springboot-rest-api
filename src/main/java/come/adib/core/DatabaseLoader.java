package come.adib.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.adib.course.Course;
import com.adib.course.CourseRepository;

@Component
public class DatabaseLoader implements ApplicationRunner{
	private final CourseRepository courses;
	
	@Autowired
	public DatabaseLoader(CourseRepository courses) {
		this.courses = courses;
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("heere");
		Course course = new Course("Java Basics", "http://kooora.com");
		courses.save(course);
	}

}
