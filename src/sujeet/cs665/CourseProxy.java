package sujeet.cs665;

public class CourseProxy implements Course {
    private ConcreteCourse course;
    private String formattedContent;

    public CourseProxy(String title, String description, String syllabus) {
        this.course = new ConcreteCourse(title, description, syllabus);
    }

    @Override
    public String getDescription() {
        return course.getDescription();
    }

    @Override
    public String getSyllabus() {
        return course.getSyllabus();
    }

    @Override
    public String getFormattedContent() {
        // lazy initialization of formattedContent
        if (formattedContent == null) {
            formattedContent = course.getFormattedContent();
        }
        return formattedContent;
    }
}

