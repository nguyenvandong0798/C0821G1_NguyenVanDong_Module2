package review.manage_candidates.model;

public class Intern extends Candidates {
    private String majors;
    private int semester;
    private String uni;

    public Intern(String name, String yearOfBirth, String address,
                  String numberPhone, String email, int type, String majors, int semester, String uni) {
        super(name, yearOfBirth, address, numberPhone, email, type);
        this.majors = majors;
        this.semester = semester;
        this.uni = uni;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.majors + ", " + this.semester + ", " + this.uni;
    }
}
