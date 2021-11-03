package s020_structural_design_pattern.practice.faccade;

public class Linkedln implements SocialShare {
    private String message;
    @Override
    public void setMessage(String message) {
        this.message =message;
    }

    @Override
    public void share() {
        System.out.println("sharing to linkedln: " + this.message);
    }
}
