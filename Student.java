public class Student extends User {
    String rollNo;
    int year;
    Department department;
    double cgpa;
    int backlog;
    String resumeLink;

    public Student(String userId, String name, String email, String password, String phone, String rollNo, int year, Department department, double cgpa, int backlog, String resumeLink) {
        super(userId, name, email, password, phone);
        this.rollNo = rollNo;
        this.year = year;
        this.department = department;
        this.cgpa = cgpa;
        this.backlog = backlog;
        this.resumeLink = resumeLink;
    }

    public String getRollNo() {
        return rollNo;
    }

    public int getYear() {
        return year;
    }

    public Department getDepartment() {
        return department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getBacklog() {
        return backlog;
    }

    public String getResumeLink() {
        return resumeLink;
    }

    public boolean updateResume(String resumeLink) {
        this.resumeLink = resumeLink;
        System.out.println("Resume link updated successfully!");
        return true;
    }


    public boolean updateCgpa(double cgpa) {
        this.cgpa = cgpa;
        System.out.println("CGPA updated successfully!");
        return true;
    }   
}
