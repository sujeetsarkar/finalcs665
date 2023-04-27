package sujeet.cs665;

public class ConcreteCourse implements Concentration, Course {
	private String title;
    private String description;
    private String syllabus;

    public ConcreteCourse(String title, String description, String syllabus) {
        this.title = title;
        this.description = description;
        this.syllabus = syllabus;
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

//    public abstract String getFormat();
    
    public String getFormattedContent() {
        return "<h3>" + title + "</h3>" + "<p>" + description + "</p>" + "<p>" + syllabus + "</p>";
    }

	@Override
	public String format() {
		// TODO Auto-generated method stub
		return null;
	}
}