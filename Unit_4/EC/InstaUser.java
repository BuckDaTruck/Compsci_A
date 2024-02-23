
package Unit_4.EC;

public class InstaUser {
    private String Handle;
    private String firstname;
    private String lastname;
    private String posts;
    private String followers[];
    private String following[];
    public InstaUser(String Handle, String firstname, String lastname) {
        this.Handle = "@"+Handle;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public int getFollowers() {
        int count = 0;
        for (String follower : followers) {
            if (follower != null) {
                count++;
            }
        }
        return count;
    }
    public int getFollowing() {
        int count = 0;
        for (String follow : following) {
            if (follow != null) {
                count++;
            }
        }
        return count;
    }
 
    public String getUsername() {
        return Handle;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getlastname() {
        return lastname;
    }
    public String toString() {
        return "Username: " + Handle + ", Firstname: " + firstname + ", Lastname: " + lastname + ", Followers: " + getFollowers() + ", Following: " + getFollowing();
    }
    public static void addFollowers(String[] followers, String follower) {
        for (int i = 0; i < followers.length; i++) {
            if (followers[i] == null) {
                followers[i] = follower;
                break;
            }
        }
    }
   
    public void follow(String Username) {
        if (Handle.equals(Username)) {
            System.out.println("You can't follow yourself");
            return;
        }
        if(Username.getFollowers() >= 3){
            System.out.println("You can't follow " + Username + " because they have too many followers");
            return;
        }
        if (getFollowers() >= 3) {
            System.out.println("You can't follow " + Username + " because you have too many followers");
            return;
        }

        for (int i = 0; i < following.length; i++) {
            if (following[i] != null && following[i].equals(Username)) {
                System.out.println("Already following " + Username);
                return;
            }
            if (following[i] == null) {
                following[i] = Username;
                addFollowers(followers, Handle);
                System.out.println("Now following " + Username);
                return;
            }
        }
    }

      
    public void removeFollowers(String Username){
        for (int i = 0; i < followers.length; i++) {
            if (followers[i].equals(Username)){
                followers[i] = null;
                break;
            }
        }
    }


    public void unfollow(String Username){
        if(Handle != Username){
            boolean isFollowing = false;
            for (int i = 0; i < following.length; i++) {
                if (following[i] != null && following[i].equals(Username)){
                    isFollowing = true;
                    Username.removeFollowers(this.Handle);
                    System.out.println("Unfollowing " + Username);
                    following[i] = null;
                    break;
                }
            }
            if (!isFollowing) {
                System.out.println("You are not following " + Username);
            }
        }
    }
    public void post(String imageURL, String caption, String Title){
        if (imageURL == null || caption == null || Title == null) {
            System.out.println("You must provide an image URL, caption, and title");
            return;
        }
        for (String p : posts) {
            if (p != null) {
                if (p.equals(caption)) {
                    System.out.println("You have already posted this");
                    return;
                }
            }
        }
        posts[posts.length] = caption;
        post Post = new post(imageURL, caption, Handle);
        System.out.println("Posted: " + Post);
    }

}
