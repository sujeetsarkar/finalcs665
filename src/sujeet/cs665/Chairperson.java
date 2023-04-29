package sujeet.cs665;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chairperson extends Faculty {
    private List<Course> coursesOffered;
    private Map<String, ConcentrationGroup> concentrations;
    private List<Faculty> fullTimeFaculty;
    private List<Faculty> partTimeFaculty;
    private Faculty graduateAdvisor;
    private Faculty undergraduateAdvisor;

    public Chairperson(String name, Department department) {
    	super(name, department);
        coursesOffered = new ArrayList<>();
        concentrations = new HashMap<>();
        fullTimeFaculty = new ArrayList<>();
        partTimeFaculty = new ArrayList<>();
    }

    public void addCourseTaught(Course course) {
        coursesOffered.add(course);
        System.out.println("Faculty");
    }

    public void addConcentration(ConcentrationGroup concentration) {
        concentrations.put(concentration.getTitle(), concentration);
    }

    public void addFullTimeFaculty(Faculty faculty) {
        fullTimeFaculty.add(faculty);
    }

    public void addPartTimeFaculty(Faculty faculty) {
        partTimeFaculty.add(faculty);
    }

    public void setGraduateAdvisor(Faculty faculty) {
        graduateAdvisor = faculty;
    }

    public void setUndergraduateAdvisor(Faculty faculty) {
        undergraduateAdvisor = faculty;
    }

    public List<Course> getCoursesOffered() {
        return coursesOffered;
    }

    public ConcentrationGroup getConcentration(String name) {
        return concentrations.get(name);
    }

    public List<Faculty> getFullTimeFaculty() {
        return fullTimeFaculty;
    }

    public List<Faculty> getPartTimeFaculty() {
        return partTimeFaculty;
    }

    public Faculty getGraduateAdvisor() {
        return graduateAdvisor;
    }

    public Faculty getUndergraduateAdvisor() {
        return undergraduateAdvisor;
    }
}
