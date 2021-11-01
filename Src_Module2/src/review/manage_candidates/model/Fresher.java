package review.manage_candidates.model;

import javafx.scene.shape.TriangleMesh;

import java.util.Date;

public class Fresher extends Candidates {
    private String graduationYear;
    private String rank;
    private String uni;
    private String uniWhere;


    public Fresher(String name, String yearOfBirth, String address,
                   String numberPhone, String email, int type,
                   String graduationYear, String rank, String uni, String uniWhere) {
        super(name, yearOfBirth, address, numberPhone, email, type);
        this.graduationYear = graduationYear;
        this.rank = rank;
        this.uni = uni;
        this.uniWhere = uniWhere;
    }

    public Fresher() {

    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public String getUniWhere() {
        return uniWhere;
    }

    public void setUniWhere(String uniWhere) {
        this.uniWhere = uniWhere;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.graduationYear + ", " + this.rank + ", " + this.uni + ", " + this.uniWhere;
    }
}
