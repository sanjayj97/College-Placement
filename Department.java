public class Department {
    String name;
    String hod;
    Staff[] staffMembers;
    ECO[] ecos;
    Student[] students;

    public Department(String name, String hod) {
        this.name = name;
        this.hod = hod;
    }

    public String getName() {
        return name;
    }

    public String getHod() {
        return hod;
    }    

    public Staff[] getStaffMembers() {
        return staffMembers;
    }

    public ECO[] getEcos() {
        return ecos;
    }
    
}
