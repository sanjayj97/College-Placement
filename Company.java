import java.util.ArrayList;

public class Company {
    String companyId;
    String companyName;
    String industry;
    String contactPerson;
    String email;
    String phone;
    ArrayList<PlacementDrive> drives;

    public Company(String companyId, String companyName, String industry,
                   String contactPerson, String email, String phone) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.industry = industry;
        this.contactPerson = contactPerson;
        this.email = email;
        this.phone = phone;
        drives = new ArrayList<>();
    }


    public void updateCompanyDetails(String contactPerson, String email, String phone) {
        this.contactPerson = contactPerson;
        this.email = email;
        this.phone = phone;
    }

    public String getCompanyDetails() {
        return companyId + " " + companyName + " " + industry;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyId() {
        return companyId;
    }
}