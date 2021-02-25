package se.lexicon.samuel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.samuel.data.StudentDAO;
import se.lexicon.samuel.dto.StudentDTO;
import se.lexicon.samuel.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService{

    //adding dependency
    //points to studentDAO too
    private StudentDAO studentDAO;
    private StudentDTOConverter converter;

    @Autowired
    public void setStudentDAO(StudentDAO studentDAO) {
        System.out.println("Calling setStudentDAO()");
        this.studentDAO = studentDAO;
    }
    @Autowired
    public void setConverter(StudentDTOConverter converter) {
        System.out.println("Calling setConverter()");
        this.converter = converter;
    }

    @Override
    public StudentDTO create(String firstname, String lastname, LocalDate birthDate, String email) {
        Student student = new Student(
                UUID.randomUUID().toString(),
                firstname.trim() + " " + lastname.trim(),
                birthDate,
                email
        );
        studentDAO.persist(student);
        return converter.convert(student);
    }

    @Override
    public StudentDTO findById(String studentId) {
        Optional<Student> optional = studentDAO.findById(studentId);
        if(optional.isPresent()){
            return converter.convert(optional.get());
        }
        throw new RuntimeException("cant find user with id " + studentId);
    }

    @Override
    public List<StudentDTO> findAll() {
        return new ArrayList<>();
    }

    @Override
    public StudentDTO update(String studentId, String name, LocalDate birthDate, String email) {
        Student student = studentDAO.findById(studentId)
                .orElseThrow(() -> new RuntimeException("cant find user with id " + studentId));
        student.setName(name);
        student.setBirthDate(birthDate);
        student.setEmail(email);
        return converter.convert(studentDAO.update(student));
    }

    @Override
    public boolean delete(String studentId) {
        studentDAO.delete(studentId);
        return studentDAO.findById(studentId).isPresent();
    }
}
