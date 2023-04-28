package sujeet.cs665;

import java.util.ArrayList;
import java.util.List;


public class ComputerScienceDepartment implements Concentration, Department {
	private String name;
    private String description;
    private List<Concentration> concentrations;
    private static Department instance;
    private List<Course> coursesOffered;
    private List<Student> students;
    private List<Faculty> faculty;
    private Chairperson chairperson;
    private GraduateAdvisor gradAdvisor;
    private UndergraduateAdvisor undergradAdvisor;
    private List<Observer> observers = new ArrayList<>();

    private ComputerScienceDepartment() {
    	this.name = "Computer Science Department";
        this.description = "Desctiption of computer science department";
        concentrations = new ArrayList<>();
        this.coursesOffered = new ArrayList<>();
        this.students = new ArrayList<>();
        this.faculty = new ArrayList<>();
    }
    
    public List<Course> getCoursesOffered() {
        return coursesOffered;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public List<Faculty> getFaculty() {
        return faculty;
    }
    
    public Chairperson getChairperson() {
    	return chairperson;
    }
    
    public void addChairperson(Chairperson chairperson) {
    	this.chairperson = chairperson;
    }

    public static Department getInstance() {
        if (instance == null) {
            instance = new ComputerScienceDepartment();
        }
        return instance;
    }

    public void addCourse(Course course) {
    	coursesOffered.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
        notifyObservers();
    }

    public void addFaculty(Faculty faculty) {
        this.faculty.add(faculty);
        if (faculty instanceof GraduateAdvisor) {
            gradAdvisor = (GraduateAdvisor) faculty;
        } else if (faculty instanceof UndergraduateAdvisor) {
            undergradAdvisor = (UndergraduateAdvisor) faculty;
        }
        notifyObservers();
    }
    
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    
    public void addConcentration(Concentration concentration) {
        concentrations.add(concentration);
    }

    public void removeConcentration(Concentration concentration) {
        concentrations.remove(concentration);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String format() {
        String result = "<h1>" + name + "</h1>" + "<p>" + description + "</p>";
        for (Concentration concentration : concentrations) {
            result += concentration.format();
        }
        return result;
    }
}
