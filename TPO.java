public class TPO extends Staff {
    public TPO(String userId, String name, String email, String password, String phone, String staffId,
            String designation, String department) {
        super(userId, name, email, password, phone, staffId, designation, department);
    }

    ECO[] ecos;

    public void generateEligibleStudentsReport(double minCgpa, int maxBacklog) {
        for (ECO eco : ecos) {
            if (eco != null) {
                eco.shortListStudents(minCgpa, maxBacklog);
            }
        }
    }

    public void generateDeptWiseEligibleStudentsReport(String departmentName, double minCgpa, int maxBacklog) {
        for (ECO eco : ecos) {
            if (eco != null) {
                eco.deptWiseShortListStudents(departmentName, minCgpa, maxBacklog);
            }
        }
    }

    

}
