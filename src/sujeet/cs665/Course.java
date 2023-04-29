/**
 * 
 */
package sujeet.cs665;

/**
 * @author iamsu
 *
 */

public interface Course {
    String getDescription();
    Department getDepartment();
    String getSyllabus();
    String getFormattedContent();
    String getTitle();
    int getMaxEnrollmentLimit();
}

