package s020_structural_design_pattern.practice.faccade;

public class Facebook implements SocialShare{
    String message;
    @Override
    public void setMessage(String message) {
        this.message=message;
    }

    @Override
    public void share() {
        System.out.println("sharing to facebook: "+ this.message);
    }
}
