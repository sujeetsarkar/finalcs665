package sujeet.cs665;

public class ElectiveCourseFactory implements CourseFactory {
    @Override
    public Course createCourse(String title, String description, String syllabus) {
        return new ElectiveCourse(title, description, syllabus);
    }
}
