package sujeet.cs665;

public class ElectiveCourse extends ConcreteCourse {
    public ElectiveCourse(String title, String description, String syllabus, int erollmentLimit, Department department) {
        super(title, description, syllabus, erollmentLimit, department);
    }

    public String getFormat() {
		return null;
        // implementation for formatting an elective course
    }
}
