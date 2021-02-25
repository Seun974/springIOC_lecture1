package se.lexicon.samuel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.lexicon.samuel.data.CourseDAOListImpl;
import se.lexicon.samuel.data.StudentDAOListImpl;
import se.lexicon.samuel.service.StudentDTOConverterImpl;
import se.lexicon.samuel.service.StudentServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public CourseDAOListImpl courseDAOListImpl(){
        return new CourseDAOListImpl();
    }

    @Bean
    public StudentDAOListImpl studentDAOListImpl(){
        return new StudentDAOListImpl();
    }

    @Bean
    public StudentDTOConverterImpl studentDTOConverterImpl(){
        return new StudentDTOConverterImpl();
    }

    @Bean
    public StudentServiceImpl studentServiceImpl(){
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.setStudentDAO(studentDAOListImpl());
        studentService.setConverter(studentDTOConverterImpl());
        return studentService;
    }
}
