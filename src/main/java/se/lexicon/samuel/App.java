package se.lexicon.samuel;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.lexicon.samuel.service.StudentService;

import java.time.LocalDate;

public class App {
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService service = context.getBean(StudentService.class);
        System.out.println(service.create("Samuel", "Adetoye", LocalDate.now(), "sam@gmail.se").getBirthDate());

        context.close();
    }
}
