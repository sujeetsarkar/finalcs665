package sujeet.cs665;

public class MainApp {

	public static void main(String[] args) {
		// Create a computer science department
        Department csDepartment = ComputerScienceDepartment.getInstance();

        // Create a chairperson for the department
        Faculty chairperson = new Chairperson("Dr. Smith", csDepartment);
        csDepartment.addChairperson(chairperson);

        // Create some faculty for the department
        Faculty partTimeFaculty1 = new Faculty("Dr. Johnson", csDepartment, Boolean.FALSE);
        Faculty partTimeFaculty2 = new Faculty("Dr. Katiee", csDepartment, Boolean.FALSE);
        Faculty fullTimeFaculty1 = new GraduateAdvisor("Dr. Brown", csDepartment, Boolean.TRUE);
        Faculty fullTimeFaculty2 = new UndergraduateAdvisor("Dr. Joshua", csDepartment, Boolean.TRUE);
        csDepartment.addFaculty(partTimeFaculty1);
        csDepartment.addFaculty(partTimeFaculty2);
        csDepartment.addFaculty(fullTimeFaculty1);
        csDepartment.addFaculty(fullTimeFaculty2);

        // Create a course
        Course course1 = new CourseProxy("CS101", "Introduction to Python", "CS101 Syallabus", 10, csDepartment);
        Course course2 = new CourseProxy("CS102", "Introduction to Java", "CS102 Syallabus", 5, csDepartment);
        Course course3 = new CourseProxy("CS103", "Introduction to C++", "CS103 Syallabus", 4, csDepartment);
        Course course4 = new CourseProxy("CS104", "Introduction to .Net", "CS104 Syallabus", 6, csDepartment);
        csDepartment.addCourse(course1);
        csDepartment.addCourse(course2);
        csDepartment.addCourse(course3);
        csDepartment.addCourse(course4);

        // Create some students
        Student student1 = new Student("John Doe", "jd123", csDepartment);
        Student student2 = new Student("Jane Smith", "js457", csDepartment);
        Student student3 = new Student("Davis Miller", "jd124", csDepartment);
        Student student4 = new Student("Martinez Hernandez", "js458", csDepartment);
        Student student5 = new Student("Gonzalez Lopez", "jd125", csDepartment);
        Student student6 = new Student("Wilson Anderson", "js459", csDepartment);
        Student student7 = new Student("Thomas Taylor", "jd126", csDepartment);
        Student student8 = new Student("Jackson Moore", "js460", csDepartment);
        Student student9 = new Student("Martin Lee", "jd127", csDepartment);
        Student student10 = new Student("Perez Thompson", "js461", csDepartment);
        Student student11 = new Student("Harris White", "jd128", csDepartment);
        Student student12 = new Student("Robinson Walker", "js462", csDepartment);
        csDepartment.addStudent(student1);
        csDepartment.addStudent(student2);
        csDepartment.addStudent(student3);
        csDepartment.addStudent(student4);
        csDepartment.addStudent(student5);
        csDepartment.addStudent(student6);
        csDepartment.addStudent(student7);
        csDepartment.addStudent(student8);
        csDepartment.addStudent(student9);
        csDepartment.addStudent(student10);
        csDepartment.addStudent(student11);
        csDepartment.addStudent(student12);
        
        
        
        chairperson.addCourseTaught(course1);


        // Enroll a student in the course
        student1.enrollCourse(course1);
        student1.enrollCourse(course1);
        student1.enrollCourse(course1);
        student1.enrollCourse(course1);
        student1.enrollCourse(course1);
        student1.enrollCourse(course1);
        student1.enrollCourse(course1);
        student1.enrollCourse(course1);
        student1.enrollCourse(course1);
        student1.enrollCourse(course1);
        student1.enrollCourse(course1);
        student1.enrollCourse(course1);
        // The chairperson should not be notified because the enrollment limit has not been reached

        // Enroll more students in the course until the enrollment limit is reached
        // The chairperson should be notified because the enrollment limit has been reached

        // Waitlist a student for the course
//        Student student3 = new Student("Bob Smith", "bs789", csDepartment);
//        csDepartment.addStudent(student3);
//        student3.waitlistForCourse(course1);

        // Drop a student from the course
//        student1.dropCourse(course1);
        // The waitlisted student should be enrolled in the course
        // The chairperson should not be notified because the enrollment limit has not been reached
	}

}
