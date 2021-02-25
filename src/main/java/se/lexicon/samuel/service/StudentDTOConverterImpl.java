package se.lexicon.samuel.service;

import org.springframework.stereotype.Service;
import se.lexicon.samuel.dto.StudentDTO;
import se.lexicon.samuel.model.Student;

@Service
public class StudentDTOConverterImpl implements  StudentDTOConverter{

    public StudentDTO convert(Student student){
        StudentDTO dto = new StudentDTO();
        dto.setStudentId(student.getStudentId());
        dto.setName(student.getName());
        dto.setBirthDate(student.getBirthDate());
        return dto;
    }
}
