import java.util.Date;

public class Application {
    String applicationId;
    Student student;
    PlacementDrive drive;
    Date appliedDate;
    String status;

    public Application(String applicationId, Student student,
                       PlacementDrive drive) {
        this.applicationId = applicationId;
        this.student = student;
        this.drive = drive;
        appliedDate = new Date();
        status = "Applied";
    }

    public void submitApplication() {
        drive.addApplication(this);
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void viewStatus() {
        System.out.println(status);
    }

    public void cancelApplication() {
        status = "Cancelled";
    }

    public String getApplicationDetails() {
        return applicationId + " " +
               student.getRollNo() + " " +
               drive.getDriveId() + " " +
               status;
    }

    public String getStatus() {
        return status;
    }
}