package se.lexicon.samuel;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.samuel.config.AppConfig;
import se.lexicon.samuel.service.StudentService;

import java.time.LocalDate;

public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);


        StudentService service = context.getBean(StudentService.class);

        System.out.println(service.create("erik", "Johnson", LocalDate.now(), "erik@gmailo.com").getName());

        context.close();
    }
}
