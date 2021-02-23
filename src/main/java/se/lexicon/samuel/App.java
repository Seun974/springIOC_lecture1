package se.lexicon.samuel;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import se.lexicon.samuel.config.ApplicationConfiguration;
import se.lexicon.samuel.data.CourseDAO;
import se.lexicon.samuel.data.StudentDAO;
import se.lexicon.samuel.model.Course;

import java.time.LocalDate;
import java.util.UUID;

public class App {
    public static void main( String[] args ) {

//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//
//        StudentDAO studentDAO = context.getBean(StudentDAO.class);
//        CourseDAO courseDAO = context.getBean(CourseDAO.class);
//
//        String id = UUID.randomUUID().toString();
//
//        //to find them
//        courseDAO.persist(new Course(id, "C#", LocalDate.now(), LocalDate.now().plusMonths(8), null));
//        System.out.println(courseDAO.findById(id));
//
//
//
//        context.close();
    }
}
