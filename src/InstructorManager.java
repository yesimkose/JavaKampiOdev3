public class InstructorManager extends UserManager{
    public void login(Instructor instructor){
        System.out.println(instructor.getFullName()+" isimli eğitmen başarıyla giriş yaptı.");
    }
    public void exit(Instructor instructor){
        System.out.println(instructor.getFullName()+" isimli eğitmen başarıyla çıkış yaptı.");
    }
    public void addCourse(Instructor instructor) {
        System.out.println(instructor.getFullName()+" isimli eğitmen "+instructor.getCourseName()+" kursunu ekledi.");
    }
}
