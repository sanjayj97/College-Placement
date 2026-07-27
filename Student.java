public class Student extends User {
    String rollNo;
    int yearOfPassing;
    Department department;
    double cgpa;
    int backlog;
    String resumeLink;
    String placementStatus;

    public Student(String userId, String name, String email, String password, String phone, String rollNo, int yearOfPassing, Department department, double cgpa, int backlog, String resumeLink) {
        super(userId, name, email, password, phone);
        this.rollNo = rollNo;
        this.yearOfPassing = yearOfPassing;
        this.department = department;
        this.cgpa = cgpa;
        this.backlog = backlog;
        this.resumeLink = resumeLink;
        this.placementStatus = "Not Placed";
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setYearOfPassing(int yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public void setResumeLink(String resumeLink) {
        this.resumeLink = resumeLink;
    }


    public String getRollNo() {
        return rollNo;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
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

    public boolean updateResumeLink(String resumeLink) {
        this.resumeLink = resumeLink;
        System.out.println("Resume link updated successfully!");
        return true;
    }

    public boolean applyForDrive(PlacementDrive drive) {
        
        Application application = new Application("APP" + System.currentTimeMillis(), this, drive);
        application.submitApplication();
        System.out.println("Applied for placement drive: " + drive.getDriveId());
        return true;
    }

    public void viewPlacementStatus(){
        System.out.println("Placement status for student: " + this.getName() + " is: " + this.placementStatus);
    }
    
    public void receiveNotification(String message) {
        System.out.println("Notification for Student " + this.getName() + ": " + message);
    }
}
