import java.util.ArrayList;
import java.util.Date;

public class PlacementDrive {
    String driveId;
    Company company;
    String jobRole;
    double packageOffered;
    Date driveDate;
    double minimumCGPA;
    int maximumBacklogs;
    String status;
    ArrayList<Application> applications;

    public PlacementDrive(String driveId, Company company, String jobRole,
                          double packageOffered, Date driveDate,
                          double minimumCGPA, int maximumBacklogs) {

        this.driveId = driveId;
        this.company = company;
        this.jobRole = jobRole;
        this.packageOffered = packageOffered;
        this.driveDate = driveDate;
        this.minimumCGPA = minimumCGPA;
        this.maximumBacklogs = maximumBacklogs;
        status = "Open";
        applications = new ArrayList<>();
    }

    public boolean checkEligibility(Student student) {
        return student.getCgpa() >= minimumCGPA &&
               student.getBacklog() <= maximumBacklogs;
    }

    public void openDrive() {
        status = "Open";
    }

    public void closeDrive() {
        status = "Closed";
    }

    public void addApplication(Application application) {
        applications.add(application);
    }

    public void viewApplicants() {
        for (Application app : applications) {
            System.out.println(app.getApplicationDetails());
        }
    }

    public void updateDriveDetails(String jobRole, double packageOffered) {
        this.jobRole = jobRole;
        this.packageOffered = packageOffered;
    }

    public String getDriveDetails() {
        return driveId + " " + company.getCompanyName() + " " + jobRole;
    }

    public String getDriveId() {
        return driveId;
    }

    public Company getCompany() {
        return company;
    }
}