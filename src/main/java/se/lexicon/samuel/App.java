package se.lexicon.samuel;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.samuel.config.ApplicationConfiguration;
import se.lexicon.samuel.data.StudentDAO;
import se.lexicon.samuel.model.Student;

import java.time.LocalDate;
import java.util.UUID;


public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        String id = UUID.randomUUID().toString();

        StudentDAO studentDAO = context.getBean(StudentDAO.class);
        studentDAO.persist(new Student(
                id, "Erik", LocalDate.now(), "erik@gmail.com"
        ));

        System.out.println(studentDAO.findById(id));

        context.close();

    }
}
