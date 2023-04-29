package sujeet.cs665;

public class CoreCourseFactory implements CourseFactory {
    @Override
    public Course createCourse(String title, String description, String syllabus, int erollmentLimit, Department department) {
        return new CoreCourse(title, description, syllabus, erollmentLimit, department);
    }
}
