package sujeet.cs665;

import java.util.List;
import java.util.NoSuchElementException;

public class CourseListIterator implements CourseIterator {
    private List<Course> courses;
    private int position;

    public CourseListIterator(List<Course> courses) {
        this.courses = courses;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < courses.size();
    }

    @Override
    public Course next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Course course = courses.get(position);
        position++;
        return course;
    }
}
