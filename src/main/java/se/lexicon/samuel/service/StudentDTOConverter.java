package se.lexicon.samuel.service;

import se.lexicon.samuel.dto.StudentDTO;
import se.lexicon.samuel.model.Student;

public interface StudentDTOConverter {
    StudentDTO convert(Student student);
}
