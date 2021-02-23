package se.lexicon.samuel.service;

import se.lexicon.samuel.dto.CourseDTO;
import se.lexicon.samuel.dto.StudentDTO;

import java.time.LocalDate;
import java.util.List;

public interface CourseCRUDService {
    CourseDTO create(String courseName, LocalDate start, LocalDate end);
    CourseDTO findById(String courseDTO);
    List<CourseDTO> findAll();
    CourseDTO update(String studentId, String courseName, LocalDate start, LocalDate end, List<StudentDTO> students);
    boolean delete(String courseId);
}
