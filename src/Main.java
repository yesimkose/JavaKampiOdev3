public class Main {

    public static void main(String[] args) {
        Student student=new Student(1,"Yeşim","Köse","123454322","yesim@hotmail.com",2,"Java");
        Instructor instructor=new Instructor(1,"Engin","Demiroğ","654321234554","engin@hotmail.com",15000,1000,"MCT,PMP,ITIL","Java");


	    UserManager userManager=new UserManager();
	    userManager.Add(student);
	    userManager.Update(student,"Aynur","Köse");

	    StudentManager studentManager=new StudentManager();
	    studentManager.login(student);

	    InstructorManager instructorManager=new InstructorManager();
	    instructorManager.addCourse(instructor);
    }
}
