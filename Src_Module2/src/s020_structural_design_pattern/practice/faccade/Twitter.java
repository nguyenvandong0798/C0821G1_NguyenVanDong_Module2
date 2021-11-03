package s020_structural_design_pattern.practice.faccade;

public class Twitter implements SocialShare {
    String message;
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to twitter: " + this.message);
    }
}
