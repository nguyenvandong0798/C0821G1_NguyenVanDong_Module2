package review.manage_candidates.model;


public class Experience extends Candidates {
    private int yearOfExperience;
    private String proSkill;



    public Experience(String name, String yearOfBirth, String address,
                      String numberPhone, String email, int type, int yearOfExperience, String proSkill) {
        super(name, yearOfBirth, address, numberPhone, email, type);
        this.yearOfExperience = yearOfExperience;
        this.proSkill=proSkill;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + " |yearOfExperience " + yearOfExperience + " |proSkill " + proSkill;
    }
}
