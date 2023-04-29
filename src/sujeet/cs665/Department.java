package sujeet.cs665;

public interface Department {
	void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
    void addCourse(Course course);
    void addStudent(Student student);
    void addFaculty(Faculty faculty);
    void addChairperson(Faculty chairperson);
    String getTitle();
}
