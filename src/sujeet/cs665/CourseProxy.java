package sujeet.cs665;

import java.util.ArrayList;
import java.util.List;

public class CourseProxy implements Course {
	private String title;
    private ConcreteCourse course;
    private String formattedContent;
    private int enrollmentLimit;
    private List<Student> studentsEnrolled = new ArrayList<>();
	private List<Student> waitList;

    public CourseProxy(String title, String description, String syllabus, int maxEnrollmentLimit) {
        this.course = new ConcreteCourse(title, description, syllabus, maxEnrollmentLimit);
        this.enrollmentLimit = maxEnrollmentLimit;
    }
    
    public void enrollStudent(Student student) {
    	String notifyMsg = "";
		if (studentsEnrolled.size() >= enrollmentLimit) {
			waitList.add(student);
//			System.out.println("Course is full. " + student.getName() + " has been added to the waitlist.");
			notifyMsg = "Course is full. " + student.getName() + " has been added to the waitlist.";
		} else {
			studentsEnrolled.add(student);
//			System.out.println(student.getName() + " has been enrolled in " + course.getName() + ".");
			notifyMsg = student.getName() + " has been enrolled in " + course.getTitle() + ".";
		}
	}

	public void dropStudent(Student student) {
    	String notifyMsg = "";
		studentsEnrolled.remove(student);
		System.out.println(student.getName() + " has been dropped from " + course.getTitle() + ".");
		if (waitList.size() > 0) {
			Student nextStudent = waitList.remove(0);
			studentsEnrolled.add(nextStudent);
			System.out.println(
					nextStudent.getName() + " has been automatically enrolled from the waitlist in " + course.getTitle() + ".");
//			notifyChairperson();
			notifyMsg = nextStudent.getName() + " has been automatically enrolled from the waitlist in " + course.getTitle() + ".";
		}
	}

    @Override
    public String getDescription() {
        return course.getDescription();
    }

    @Override
    public String getSyllabus() {
        return course.getSyllabus();
    }

    @Override
    public String getFormattedContent() {
        // lazy initialization of formattedContent
        if (formattedContent == null) {
            formattedContent = course.getFormattedContent();
        }
        return formattedContent;
    }
    
    public String getTitle() {
    	return course.getTitle();
    }
    public int getMaxEnrollmentLimit() {
    	return enrollmentLimit;
    }
}

