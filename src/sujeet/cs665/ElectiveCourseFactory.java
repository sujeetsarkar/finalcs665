package sujeet.cs665;

public class ElectiveCourseFactory implements CourseFactory {
    @Override
    public Course createCourse(String title, String description, String syllabus, int erollmentLimit) {
        return new ElectiveCourse(title, description, syllabus, erollmentLimit);
    }
}
