package sujeet.cs665;

import java.util.ArrayList;
import java.util.List;

class Student implements Observer {
    private String name;
    private List<Course> coursesEnrolled = new ArrayList<>();
    private Department department;
    private String email;
    
    public Student(String name, String email, Department department) {
        this.name = name;
        this.department = department;
        this.email = email;
        department.registerObserver(this);
    }
    
    public void enrollCourse(Course course) {
    	coursesEnrolled.add(course);
    	CourseProxy courseProxy = new CourseProxy(course.getTitle(), course.getDescription(), course.getSyllabus(), course.getMaxEnrollmentLimit(), course.getDepartment());
    	courseProxy.enrollStudent(this);
//        department.notifyObservers();
    }
    
    @Override
    public void update(String message) {
		System.out.println(message);
        // Check for updates related to courses enrolled
//        List<Course> updatedCourses = new ArrayList<>();
//        for (Course course : coursesEnrolled) {
//            if (department.getCoursesOffered().contains(course)) {
//                updatedCourses.add(course);
//            }
//        }
//        coursesEnrolled = updatedCourses;
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the coursesEnrolled
	 */
	public List<Course> getCoursesEnrolled() {
		return coursesEnrolled;
	}

	/**
	 * @param coursesEnrolled the coursesEnrolled to set
	 */
	public void setCoursesEnrolled(List<Course> coursesEnrolled) {
		this.coursesEnrolled = coursesEnrolled;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
