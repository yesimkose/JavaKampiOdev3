public class Student extends User{
    private int courseCount;
    private String courseName;

    public Student() {
    }
    public Student(int id,String firstName,String lastName,String nationalityIdentity,String email,int courseCount,String courseName){
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setNationalityIdentity(nationalityIdentity);
        this.setEmail(email);
        this.setCourseCount(courseCount);
        this.setCourseName(courseName);
    }

    public int getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(int courseCount) {
        this.courseCount = courseCount;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
