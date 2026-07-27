import java.util.ArrayList;

public class ECO extends Staff {
    Student[] students;
    
    public ECO(String userId, String name, String email, String password, String phone, String staffId, String designation, String department) {
        super(userId, name, email, password, phone, staffId, designation, department);
    }

    public void receiveNotification(PlacementDrive drive, String message) {
        System.out.println("Notification for ECO " + this.getName() + ": " + message + " for Placement Drive: " + drive.getDriveId());
    }

    public void viewEligibleStudents(double minCgpa, int maxBacklog, ArrayList<Student> allStudents) {
        System.out.println("Eligible Students for Placement Drive:");
        for (Student student : allStudents) {
            if (student.getCgpa() >= minCgpa && student.getBacklog() <= maxBacklog) {
                System.out.println("Name: " + student.getName() + ", Roll No: " + student.getRollNo() + ", CGPA: " + student.getCgpa() + ", Backlog: " + student.getBacklog());
            }
        }
    }

    public void notifyStudents(ArrayList<Student> eligibleStudents, String message) {
        for (Student student : eligibleStudents) {
            student.receiveNotification(message);
        }
    }

    public void updateApplicationStatus(Application application, String status) {
        //application.setStatus(status);
        System.out.println("Application status updated to: " + status + " for Student: " + application.getStudent().getName());
    }


}
