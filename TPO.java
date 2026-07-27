import java.util.ArrayList;

public class TPO extends Staff {

    private ArrayList<Company> companies;
    private ArrayList<PlacementDrive> drives;
    private ArrayList<ECO> ecos;

    public TPO(String userId, String name, String email, String password,
               String phone, String staffId, String designation,
               String department) {

        super(userId, name, email, password, phone, staffId, designation, department);

        companies = new ArrayList<>();
        drives = new ArrayList<>();
        ecos = new ArrayList<>();
    }

    public void addCompany(Company company) {
        companies.add(company);
    }


    public void createPlacementDrive(PlacementDrive drive) {
        drives.add(drive);
        System.out.println("Placement drive created successfully.");
    }

    public void closeDriveAfterResults(PlacementDrive drive) {
        if (drives.contains(drive)) {
            drive.closeDrive();
            System.out.println("Placement drive closed successfully.");
        } else {
            System.out.println("Placement drive not found.");
        }
    }

    public void assignECO(ECO eco) {
        ecos.add(eco);
        System.out.println("ECO assigned successfully.");
    }

    public void viewCompanies() {
        for (Company company : companies) {
            System.out.println(company.getCompanyDetails());
        }
    }

    public void viewPlacementDrives() {
        for (PlacementDrive drive : drives) {
            System.out.println(drive.getDriveDetails());
        }
    }

    public void generatePlacedStudentsReport(ArrayList<Application> applications) {

        System.out.println("Placed Students Report");

        for (Application app : applications) {
            if (app.getStatus().equalsIgnoreCase("Selected")) {

                Student s = app.getStudent();

                System.out.println("Roll No : " + s.getRollNo());
                System.out.println("Name    : " + s.getName());
                System.out.println("Company : " + app.getDrive().getCompany().getCompanyName());
                System.out.println("--------------------------------");
            }
        }
    }

    public void notifyEcos(PlacementDrive drive, String message) {
        for (ECO eco : ecos) {
            eco.receiveNotification(drive, message);
        }
    }
}