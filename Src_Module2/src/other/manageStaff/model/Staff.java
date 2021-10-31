package other.manageStaff.model;

public class Staff {
    private String name;
    private int Date;
    private int code;
    private String address;
    private Long Salary;

    public Staff() {
    }

    public Staff(String name, int Date, int code, String address, long salary) {
        this.name = name;
        this.Date = Date;
        this.code = code;
        this.address = address;
        this.Salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return this.name + "," + this.Date + "," + this.code + "," + this.address + "," + this.Salary;
    }
}
