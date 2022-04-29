package vn.pt.simple.task.model;

public class User {
    private long id;//
    private String fullName;
    private String username;
    private String mobile;
    private String email;
    private String address;
    private Role role;
    private String password;

    public User(long id, String fullName, String phone, String email) {
        this.id = id;
        this.fullName = fullName;
        this.mobile = phone;
        this.email = email;
    }
    // private Role role = ADMIN/ USER
    //  private Status status= Available |Blocked;
//   public static void main(String[] args) {
//       //System.out.println( System.currentTimeMillis());
//   }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
