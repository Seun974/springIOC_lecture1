package se.lexicon.samuel;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.lexicon.samuel.data.CourseDAO;
import se.lexicon.samuel.data.StudentDAO;
import se.lexicon.samuel.model.Course;

import java.time.LocalDate;
import java.util.UUID;

public class App {
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CourseDAO courseDAO = context.getBean(CourseDAO.class);
        StudentDAO studentDAO = context.getBean(StudentDAO.class);

        //declaring the variable
        String id = UUID.randomUUID().toString();

        courseDAO.persist(
                new Course(id, "Java", LocalDate.parse("2021-03-15"), LocalDate.now().plusMonths(4), null)
        );

        System.out.println(courseDAO.findById(id));

        context.close();

    }
}
