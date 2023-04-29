package sujeet.cs665;

import java.util.ArrayList;
import java.util.List;

public class UndergraduateAdvisor extends Faculty {

    private List<Student> advisees;

    public UndergraduateAdvisor(String name, Department department, boolean status) {
        super(name, department, status);
        advisees = new ArrayList<>();
    }

    public void addAdvisee(Student student) {
        advisees.add(student);
    }

    public void removeAdvisee(Student student) {
        advisees.remove(student);
    }

    public List<Student> getAdvisees() {
        return advisees;
    }

}

