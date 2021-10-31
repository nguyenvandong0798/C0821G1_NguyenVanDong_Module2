package review.manage_candidates.model;


public class Candidates {
    private int id;
    private String name;
    private String yearOfBirth;
    private String address;
    private String numberPhone;
    private String email;
    private int type;

    public Candidates() {
    }

    public Candidates(int id, String name, String yearOfBirth,
                      String address, String numberPhone,
                      String email, int type) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.numberPhone = numberPhone;
        this.email = email;
        this.type = type;
    }

    public Candidates(String name, String yearOfBirth, String address,
                      String numberPhone, String email, int type) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.numberPhone = numberPhone;
        this.email = email;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.yearOfBirth + ", " + this.address + ", " + this.numberPhone + ", " + this.email + ", " + this.type;
    }
}
