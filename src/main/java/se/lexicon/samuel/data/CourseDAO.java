package se.lexicon.samuel.data;

import se.lexicon.samuel.model.Course;

import java.util.Optional;

public interface CourseDAO {
    Course persist(Course course);
    Optional<Course> findById(String courseId);
    Course update(Course course);
    void delete(String courseId);
    void clear();

}
