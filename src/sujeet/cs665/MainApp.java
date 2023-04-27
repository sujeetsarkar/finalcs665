package sujeet.cs665;

public class MainApp {

	public static void main(String[] args) {
		CourseFactory coreCourseFactory = new CoreCourseFactory();
        CourseFactory electiveCourseFactory = new ElectiveCourseFactory();

        Course coreCourse1 = coreCourseFactory.createCourse("Data Structures", "Description of Data Structures", "Syllabus for Data Structures");
        Course electiveCourse1 = electiveCourseFactory.createCourse("Artificial Intelligence", "Description of AI", "Syllabus for AI");
        
        // use the created courses as required
        
        Department department = ComputerScienceDepartment.getInstance();
        Course cs101 = new Course("CS101", "Introduction to Computer Science", 4, CourseLevel.UNDERGRADUATE);
        Course cs201 = new Course("CS201", "Data Structures and Algorithms", 4, CourseLevel.UNDERGRADUATE);
        department.addCourse(cs101);
        department.addCourse(cs201);
        Student alice = new Student("Alice", "Smith", "alice@example.com", "BS-CS");
        Student bob = new Student("Bob", "Johnson", "bob@example.com", "BS-CIS");
        department.addStudent(alice);
        department.addStudent(bob);
        Faculty profX = new Faculty("Prof. X", "CS");
        Faculty profY = new Faculty("Prof. Y", "CIS");
        department.addFaculty(profX);
        department.addFaculty(profY);
        chairperson = new Chairperson("Prof. Z", "CS");
        department.addFaculty(chairperson);
        gradAdvisor = new GraduateAdvisor("Prof. A", "CS");
        department.addFaculty(gradAdvisor);
        undergradAdvisor = new UndergraduateAdvisor("Prof. B", "CS");
        department.addFaculty(undergradAdvisor);
        // Other code for managing courses, students, and faculty
        
        Course course = new CourseProxy("Java Programming", "Syllabus for Java Programming");
        System.out.println(course.getFormattedContent());

	}

}
