public class ECO extends Staff {
    Student[] students;
    
    public ECO(String userId, String name, String email, String password, String phone, String staffId, String designation, String department) {
        super(userId, name, email, password, phone, staffId, designation, department);
    }

    public void viewStudentProfiles() {
        System.out.println("Viewing student profiles:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Phone: " + student.getPhone());
            System.out.println("Roll No: " + student.getRollNo());
            System.out.println("Year: " + student.getYear());
            System.out.println("Department: " + student.getDepartment().getName());
            System.out.println("CGPA: " + student.getCgpa());
            System.out.println("Backlog: " + student.getBacklog());
            System.out.println("Resume Link: " + student.getResumeLink());
            System.out.println("---------------------------");
        }
    }

    public void shortListStudents(double minCgpa, int maxBacklog) {
        System.out.println("Shortlisting students with CGPA >= " + minCgpa + " and Backlog <= " + maxBacklog);
        for (Student student : students) {
            if (student.getCgpa() >= minCgpa && student.getBacklog() <= maxBacklog) {
                System.out.println("Name: " + student.getName());
                System.out.println("Email: " + student.getEmail());
                System.out.println("Phone: " + student.getPhone());
                System.out.println("Roll No: " + student.getRollNo());
                System.out.println("Year: " + student.getYear());
                System.out.println("Department: " + student.getDepartment().getName());
                System.out.println("CGPA: " + student.getCgpa());
                System.out.println("Backlog: " + student.getBacklog());
                System.out.println("Resume Link: " + student.getResumeLink());
                System.out.println("---------------------------");
            }
        }
    }
}
