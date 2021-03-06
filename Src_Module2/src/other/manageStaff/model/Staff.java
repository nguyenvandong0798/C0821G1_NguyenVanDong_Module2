package other.manageStaff.model;

public class Staff {
    private int id;
    private String name;
    private String Date;
    private String code;
    private String address;
    private String numberPhone;

    public Staff() {
    }

    public Staff(int id, String name, String Date, String code, String address, String numberPhone) {
        this.id = id;
        this.name = name;
        this.Date = Date;
        this.code = code;
        this.address = address;
        this.numberPhone = numberPhone;
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

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    @Override
    public String toString() {
        return this.id + "," + this.name + "," + this.Date + "," + this.code + "," + this.address + "," + this.numberPhone;
    }
}
