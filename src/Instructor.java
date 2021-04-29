public class Instructor extends User{
    private double salary;
    private int studentCount;
    private String profession;
    private String courseName;

    public Instructor() {
    }

    public Instructor(int id,String firstName,String lastName,String nationalityIdentity,String email,double salary,int studentCount,String profession,String courseName){
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setNationalityIdentity(nationalityIdentity);
        this.setEmail(email);
        this.setSalary(salary);
        this.setStudentCount(studentCount);
        this.setProfession(profession);
        this.setCourseName(courseName);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
