package sujeet.cs665;

public class ConcreteCourse implements Concentration, Course {
	private String title;
    private String description;
    private String syllabus;
    private int maxEnrollmentLimit;
    private Department department;

    public ConcreteCourse(String title, String description, String syllabus, int maxEnrollmentLimit, Department department) {
        this.title = title;
        this.description = description;
        this.syllabus = syllabus;
        this.maxEnrollmentLimit = maxEnrollmentLimit;
        this.department = department;
    }
    
    public Department getDepartment() {
    	return department;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSyllabus() {
        return syllabus;
    }
    
    public String getFormattedContent() {
        return title + description + syllabus;
    }

	@Override
	public String format() {
		// TODO Auto-generated method stub
		return null;
	}
    public int getMaxEnrollmentLimit() {
    	return maxEnrollmentLimit;
    }
}
