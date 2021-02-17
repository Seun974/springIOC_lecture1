package se.lexicon.samuel.data;

import se.lexicon.samuel.model.Course;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class CourseDAOListImpl implements CourseDAO{
    //field that will be used in this class
    private Set<Course> courses;

    //constructor
    public CourseDAOListImpl() {
        this.courses = new HashSet<>();
    }

    @Override
    public Course persist(Course course) {
        courses.add(course);
        return course;
    }

    @Override
    public Optional<Course> findById(String courseId) {
        return courses.stream()
        .filter(course -> course.getCourseId().equals(courseId))
        .findFirst();
    }

    @Override
    public Course update(Course course) {
        return course;
    }

    @Override
    public void delete(String courseId) {
        Course course = findById(courseId).orElseThrow(()-> new RuntimeException("Could not find course aborted"));
        courses.remove(course);
    }

    //this clears the program and sorts of empties everything
    @Override
    public void clear() {
        courses.clear();
    }
}
