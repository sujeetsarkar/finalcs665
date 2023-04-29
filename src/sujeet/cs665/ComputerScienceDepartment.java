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
    private List<Faculty> fulltimeFaculty;
    private List<Faculty> parttimeFaculty;
    private Faculty chairperson;
    private GraduateAdvisor gradAdvisor;
    private UndergraduateAdvisor undergradAdvisor;
    private List<Observer> observers = new ArrayList<>();

    private ComputerScienceDepartment() {
    	this.name = "Computer Science Department";
        this.description = "Desctiption of computer science department";
        concentrations = new ArrayList<>();
        this.coursesOffered = new ArrayList<>();
        this.students = new ArrayList<>();
        this.fulltimeFaculty = new ArrayList<>();
        this.parttimeFaculty = new ArrayList<>();
    }
    
    public List<Course> getCoursesOffered() {
        return coursesOffered;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public List<Faculty> getFullTimeFaculty() {
        return fulltimeFaculty;
    }
    public Faculty getGradAdvisor() {
    	return gradAdvisor;
    }
    public Faculty getUndergradAdvisor() {
    	return undergradAdvisor;
    }
    public List<Faculty> parttimeFaculty() {
        return parttimeFaculty;
    }
    
    public Faculty getChairperson() {
    	return chairperson;
    }
    
    public void addChairperson(Faculty chairperson) {
    	this.chairperson = chairperson;
    	System.out.println("Chairperson " + chairperson.getName() + " added to department " + chairperson.getDepartment().getTitle());
    }

    public static Department getInstance() {
        if (instance == null) {
            instance = new ComputerScienceDepartment();
        }
        return instance;
    }

    public void addCourse(Course course) {
    	coursesOffered.add(course);
    	System.out.println("Course " + course.getTitle() + " added to department "+ name);
    }

    public void addStudent(Student student) {
        students.add(student);
    	System.out.println("Student " + student.getName() + " added to department "+ name);
        notifyObservers();
    }

    public void addFaculty(Faculty faculty) {
    	if(faculty.getFacultyStatus()) {
    		this.fulltimeFaculty.add(faculty);
            System.out.println("Fulltime Faculty " + faculty.getName()  + " added to " + faculty.getDepartment().getTitle());
    	} else {
    		this.parttimeFaculty.add(faculty);
            System.out.println("Parttime Faculty " + faculty.getName()  + " added to " + faculty.getDepartment().getTitle());
    	}
        if (faculty instanceof GraduateAdvisor) {
            gradAdvisor = (GraduateAdvisor) faculty;
            System.out.println(faculty.getName() + " added as GraduateAdvisor.");
        } else if (faculty instanceof UndergraduateAdvisor) {
            undergradAdvisor = (UndergraduateAdvisor) faculty;
            System.out.println(faculty.getName() + " added as UndergraduateAdvisor.");
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

    public String getTitle() {
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
