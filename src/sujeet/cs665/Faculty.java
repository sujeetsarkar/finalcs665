package sujeet.cs665;

import java.util.ArrayList;
import java.util.List;

public class Faculty implements Observer {
	private String name;
    private List<Course> coursesTaught = new ArrayList<>();
    private List<Student> advisingStudents = new ArrayList<>();
    private Department department;
    
    public Faculty(String name, Department department) {
        this.name = name;
        this.department = department;
        department.registerObserver(this);
    }
    
    public String getName() {
    	return name;
    }
    
    public Department getDepartment() {
    	return department;
    }
    
    public void addCourseTaught(Course course) {
        coursesTaught.add(course);
        System.out.println("Faculty");
        department.notifyObservers();
    }
    
    public void addAdvisingStudent(Student student) {
        advisingStudents.add(student);
        department.notifyObservers();
    }

	@Override
	public void update(ComputerScienceDepartment department) {
		List<Course> updatedCourses = new ArrayList<>();
        for (Course course : this.coursesTaught) {
        	
        }
	}
}
