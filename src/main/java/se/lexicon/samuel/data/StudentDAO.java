package se.lexicon.samuel.data;

import se.lexicon.samuel.model.Student;

import java.util.Optional;

public interface StudentDAO {
    Student persist(Student student);
    Optional<Student> findById(String studentId);
    Student update(Student student);
    void delete(String studentId);
    void deleteAll();
}
