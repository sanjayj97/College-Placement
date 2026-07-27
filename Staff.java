public class Staff extends User {
    String staffId;
    String designation;
    String department;
    
    public Staff(String userId, String name, String email, String password, String phone, String staffId, String designation, String department) {
        super(userId, name, email, password, phone);
        this.staffId = staffId;
        this.designation = designation;
        this.department = department;
    }
    
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getStaffId() {
        return staffId;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }
    
}
