package sujeet.cs665;

import java.util.ArrayList;
import java.util.List;

class Student implements Observer {
    private String name;
    private List<ConcreteCourse> coursesEnrolled = new ArrayList<>();
    private Department department;
    
    public Student(String name, Department department) {
        this.name = name;
        this.department = department;
        department.registerObserver(this);
    }
    
    public void enrollCourse(ConcreteCourse course) {
        coursesEnrolled.add(course);
        department.notifyObservers();
    }
    
    @Override
    public void update(ComputerScienceDepartment department) {
        // Check for updates related to courses enrolled
        List<ConcreteCourse> updatedCourses = new ArrayList<>();
        for (ConcreteCourse course : coursesEnrolled) {
            if (department.getCoursesOffered().contains(course)) {
                updatedCourses.add(course);
            }
        }
        coursesEnrolled = updatedCourses;
    }
    
    // Other student-related methods
}
