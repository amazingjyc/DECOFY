package decofy.dlsu.edu.ph.decofy;

/**
 * Created by jarre on 24/02/2018.
 */

public class Designer {
    private String name;
    private String contactNo;
    private String email;
    private int id;

    public Designer(){

    }

    public Designer(String name, String contactNo, String email, int id) {
        this.name = name;
        this.contactNo = contactNo;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
