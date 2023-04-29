/**
 * 
 */
package sujeet.cs665;

/**
 * @author iamsu
 *
 */
public class CoreCourse extends ConcreteCourse {
    public CoreCourse(String title, String description, String syllabus, int erollmentLimit, Department department) {
        super(title, description, syllabus, erollmentLimit, department);
    }

    public String getFormat() {
		return null;
    }
}

