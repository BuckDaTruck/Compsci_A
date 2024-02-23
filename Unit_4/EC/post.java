package Unit_4.EC;

public class post {
    private String imageURL;
    private String caption;
    private int likes;
    private String username;
    public post(String imageURL, String caption, String username) {
        this.imageURL = imageURL;
        this.caption = caption;
        this.username = username;
    }
    public String getImageURL() {
        return imageURL;
    }
    public String getCaption() {
        return caption;
    }
    public int getLikes() {
        return likes;
    }
    public String getUsername() {
        return username;
    }
    

    public void like() {
        likes++;
    }
    public String toString() {
        return "Username: " + username + ", Image URL: " + imageURL + ", Caption: " + caption + ", Likes: " + likes;
    }
}
