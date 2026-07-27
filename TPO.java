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
        System.out.println("Company added successfully.");
    }

    public void removeCompany(String companyId) {
        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getCompanyId().equals(companyId)) {
                companies.remove(i);
                System.out.println("Company removed successfully.");
                return;
            }
        }
        System.out.println("Company not found.");
    }

    public void createPlacementDrive(PlacementDrive drive) {
        drives.add(drive);
        System.out.println("Placement drive created successfully.");
    }

    public void closePlacementDrive(String driveId) {
        for (PlacementDrive drive : drives) {
            if (drive.getDriveId().equals(driveId)) {
                drive.closeDrive();
                System.out.println("Drive closed successfully.");
                return;
            }
        }
        System.out.println("Drive not found.");
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

    public void generateEligibleStudentsReport(double minCgpa, int maxBacklog) {

        for (ECO eco : ecos) {
            eco.shortListStudents(minCgpa, maxBacklog);
        }
    }
}