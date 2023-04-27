package sujeet.cs665;

import java.util.List;

public class DepartmentCourseAggregate implements CourseAggregate {
    private List<Course> courses;

    public DepartmentCourseAggregate(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public CourseIterator iterator() {
        return new CourseListIterator(courses);
    }
}
