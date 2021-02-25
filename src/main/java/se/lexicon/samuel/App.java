package se.lexicon.samuel;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.samuel.config.AppConfig;
import se.lexicon.samuel.service.StudentService;

public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService service = context.getBean(StudentService.class);

        System.out.println(service.create("Jael", "John", null, null).getName());

        context.close();
    }
}
