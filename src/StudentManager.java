public class StudentManager extends UserManager{
    public void login(Student student){
        System.out.println(student.getFullName()+" isimli öğrenci başarıyla giriş yaptı.");
    }
    public void exit(Student student){
        System.out.println(student.getFullName()+" isimli öğrenci başarıyla çıkış yaptı.");
    }
    public void selectCourse(Student student) {
        System.out.println(student.getFullName()+" isimli öğrenci "+student.getCourseName()+" kursunu seçti.");
    }
}
