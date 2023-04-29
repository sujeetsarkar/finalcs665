package sujeet.cs665;

import java.util.ArrayList;
import java.util.List;

public class Chairperson extends Faculty {
	private String name;
	private Course courseTaught;

    public Chairperson(String name, Department department) {
    	super(name, department, Boolean.TRUE); // Chairperson will always be fulltime
    	this.name = name;
    }

    public void addCourseTaught(Course course) {
    	courseTaught = course;
        System.out.println("Course " + course.getTitle() + " assigned to chairman " + name);
    }
    

	@Override
	public void update(String message) {
		System.out.println(message);
	}
}
