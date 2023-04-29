package sujeet.cs665;

import java.util.ArrayList;
import java.util.List;

public class CourseProxy implements Course, Observer {
	private String title;
    private ConcreteCourse course;
    private String formattedContent;
    private int enrollmentLimit;
    private List<Student> studentsEnrolled;
	private List<Student> waitList;
	private Department department;

    public CourseProxy(String title, String description, String syllabus, int maxEnrollmentLimit, Department department) {
        this.course = new ConcreteCourse(title, description, syllabus, maxEnrollmentLimit, department);
        this.enrollmentLimit = maxEnrollmentLimit;
        this.department = department;
        this.title = title;
        this.studentsEnrolled = new ArrayList<>();
        this.waitList = new ArrayList<>();
        department.registerObserver(this);
    }
    
    public void enrollStudent(Student student) {
		if (studentsEnrolled.size() >= enrollmentLimit) {
			waitList.add(student);
			department.notifyObservers("Course is full. " + student.getName() + " has been added to the waitlist.");
		} else {
			studentsEnrolled.add(student);
			System.out.println(student.getName() + " has been enrolled in " + title + ".");
		}
	}
    
    public Department getDepartment() {
    	return department;
    }

	public void dropStudent(Student student) {
    	String notifyMsg = "";
		studentsEnrolled.remove(student);
		System.out.println(student.getName() + " has been dropped from " + title + ".");
		if (waitList.size() > 0) {
			Student nextStudent = waitList.remove(0);
			studentsEnrolled.add(nextStudent);
			System.out.println(
					nextStudent.getName() + " has been automatically enrolled from the waitlist in " + title + ".");
			notifyMsg = nextStudent.getName() + " has been automatically enrolled from the waitlist in " + title + ".";
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
	@Override
	public void update(String message) {
		System.out.println(message);
		
	}
}

