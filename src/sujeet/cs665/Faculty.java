package sujeet.cs665;

import java.util.ArrayList;
import java.util.List;

public class Faculty implements Observer {
	private String name;
    private List<Course> coursesTaught;
    private List<Student> advisingStudents;
    private Department department;
    private boolean facultyStatus; // 1 - Fulltime , 0 - PartTime
    
    public Faculty(String name, Department department, boolean facultyStatus) {
        this.name = name;
        this.department = department;
        this.facultyStatus = facultyStatus;
        this.coursesTaught = new ArrayList<>();
        this.advisingStudents = new ArrayList<>();
        department.registerObserver(this);
    }
    
    public String getName() {
    	return name;
    }
    
    public Department getDepartment() {
    	return department;
    }
    
    public boolean getFacultyStatus() {
    	return facultyStatus;
    }
    
    public void addCourseTaught(Course course) {
        coursesTaught.add(course);
//        department.notifyObservers();
    }
    
    public void addAdvisingStudent(Student student) {
        advisingStudents.add(student);
//        department.notifyObservers();
    }

	@Override
	public void update(String message) {
//		List<Course> updatedCourses = new ArrayList<>();
//        for (Course course : this.coursesTaught) {
//        	
//        }
		System.out.println(message);
	}
}
