package se.lexicon.samuel;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.samuel.service.StudentService;
import se.lexicon.samuel.service.StudentServiceImpl;

public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScanningConfig.class);

        StudentService service = context.getBean(StudentService.class);

        System.out.println(service.create("Sam", "Max", null, null).getName());

        context.close();
    }
}
