package sujeet.cs665;

import java.util.List;

public class StudentCourseAggregate implements CourseAggregate {
    private List<Course> courses;

    public StudentCourseAggregate(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public CourseIterator iterator() {
        return new CourseListIterator(courses);
    }
}
