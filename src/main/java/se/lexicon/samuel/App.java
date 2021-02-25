package se.lexicon.samuel;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.samuel.service.StudentService;

import java.time.LocalDate;

public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationScanningConfig.class);

        StudentService service = context.getBean(StudentService.class);
        System.out.println(service.create("Erik", "Olsson", LocalDate.now(), "asdef@gmail.com").getName());
    }
}
//this application context file is supposed to import on it's own but for now, just forget about it and move on
//if you move the package from config to se.lexicon.samuel, it will work