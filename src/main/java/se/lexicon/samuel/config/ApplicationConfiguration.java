package se.lexicon.samuel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.lexicon.samuel.data.CourseDAOListImpl;
import se.lexicon.samuel.data.StudentDAOListImpl;
import se.lexicon.samuel.model.Student;

@Configuration
public class ApplicationConfiguration {
    //creating methods to instantiate the objects
    @Bean
    public CourseDAOListImpl courseDAOList(){
        return new CourseDAOListImpl();
    }
    @Bean
    public StudentDAOListImpl studentDAOList(){
        return new StudentDAOListImpl();
    }

}
