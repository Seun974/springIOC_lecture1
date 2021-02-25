package se.lexicon.samuel.service;

import org.springframework.stereotype.Service;
import se.lexicon.samuel.dto.CourseDTO;
import se.lexicon.samuel.dto.StudentDTO;

import java.time.LocalDate;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    //this process is called stubbing
    @Override
    public CourseDTO create(String courseName, LocalDate start, LocalDate end) {
        return null;
    }

    @Override
    public CourseDTO findById(String courseDTO) {
        return null;
    }

    @Override
    public List<CourseDTO> findAll() {
        return null;
    }

    @Override
    public CourseDTO update(String studentId, String courseName, LocalDate start, LocalDate end, List<StudentDTO> students) {
        return null;
    }

    @Override
    public boolean delete(String courseId) {
        return false;
    }
}
