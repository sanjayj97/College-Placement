public class Course {
    String courseId;
    String courseName;
    double credits;

    public Course(String courseId, String courseName, double credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCredits() {
        return credits;
    }

}
