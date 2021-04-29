public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String nationalityIdentity;
    private String email;

    public User() {
    }

    public User(int id,String firstName,String lastName,String nationalityIdentity,String email){
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setNationalityIdentity(nationalityIdentity);
        this.setEmail(email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityIdentity() {
        return nationalityIdentity;
    }

    public void setNationalityIdentity(String nationalityIdentity) {
        this.nationalityIdentity = nationalityIdentity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFullName(){
        return (firstName+" "+lastName);
    }
}
