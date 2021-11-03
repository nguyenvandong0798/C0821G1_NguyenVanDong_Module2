package s020_structural_design_pattern.practice.faccade;

public class Client {
    public void share(String message) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new Linkedln());
        socialMediaFacade.share(message);
    }
}

