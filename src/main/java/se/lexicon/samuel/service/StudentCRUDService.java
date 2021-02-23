package se.lexicon.samuel.service;

import se.lexicon.samuel.dto.StudentDTO;

import java.time.LocalDate;
import java.util.List;

public interface StudentCRUDService {
    StudentDTO create(String firstname, String lastname, LocalDate birthDate, String email);
    StudentDTO findById(String studentId);
    List<StudentDTO> findAll();
    StudentDTO update(String firstName, String lastName, LocalDate birthDate, String email);
    boolean delete(String studentId);


}
