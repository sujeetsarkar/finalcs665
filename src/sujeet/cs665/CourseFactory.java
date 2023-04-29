/**
 * 
 */
package sujeet.cs665;

/**
 * @author iamsu
 *
 */
public interface CourseFactory {
    public Course createCourse(String title, String description, String syllabus, int erollmentLimit, Department department);
}
