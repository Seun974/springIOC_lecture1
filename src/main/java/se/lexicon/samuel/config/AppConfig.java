package se.lexicon.samuel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.lexicon.samuel.data.CourseDAO;
import se.lexicon.samuel.data.CourseDAOListImpl;
import se.lexicon.samuel.data.StudentDAO;
import se.lexicon.samuel.data.StudentDAOListImpl;
import se.lexicon.samuel.dto.StudentDTO;
import se.lexicon.samuel.model.Student;
import se.lexicon.samuel.service.StudentDTOConverter;
import se.lexicon.samuel.service.StudentDTOConverterImpl;
import se.lexicon.samuel.service.StudentService;
import se.lexicon.samuel.service.StudentServiceImpl;

@Configuration
public class AppConfig {
    @Bean
    //this makes it eligible for autowire
    public CourseDAO courseDAOListImpl(){
        return new CourseDAOListImpl();
    }
    @Bean
    public StudentDAO studentDAOListImpl(){
        return new StudentDAOListImpl();
    }
    @Bean
    public StudentDTOConverter studentDTOConverterImpl(){
        return new StudentDTOConverterImpl();
    }
    @Bean
    public StudentService studentServiceImpl(){
        return new StudentServiceImpl(studentDAOListImpl(), studentDTOConverterImpl());
    }


}
