public class UserManager {
    public void Add(User user){
        System.out.println(user.getFullName()+" eklendi.");
    }
    public void Delete(User user){
        System.out.println(user.getFullName()+" silindi.");
    }
    public void Update(User user,String newFirstName,String newLastName){
        String newFullName=newFirstName+" "+newLastName;
        System.out.println(user.getFullName()+" adı "+newFullName+" olarak güncellendi.");
    }

}
