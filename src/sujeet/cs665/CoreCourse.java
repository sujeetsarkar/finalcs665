/**
 * 
 */
package sujeet.cs665;

/**
 * @author iamsu
 *
 */
public class CoreCourse extends ConcreteCourse {
    public CoreCourse(String title, String description, String syllabus, int erollmentLimit) {
        super(title, description, syllabus, erollmentLimit);
    }

    public String getFormat() {
		return null;
        // implementation for formatting a core course
    }
}

