package Unit_4.EC;

public class Main {
    public static void main(String[] args) {
        InstaUser user1 = new InstaUser("Trump", "Donald", "Trump");
        InstaUser user2 = new InstaUser("Hilary", "Hilary", "Clinton");
        InstaUser user3 = new InstaUser("Yeezus", "Kanye", "West");
        InstaUser user4 = new InstaUser("TayTay", "Taylor", "Swift");
        //Initialize chaos
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);

        user1.follow(user2);

        user2.follow(user3);

        user3.follow(user4);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        user3.post("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.rollingstone.com%2Fmusic%2Fmusic-country%2Fkanye-west-storms-the-vmas-stage-during-taylor-swifts-speech-83468%2F&psig=AOvVaw1CFkbd7WpT5PVer-MKwfRX&ust=1701484229477000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCPDP9uuY7YIDFQAAAAAdAAAAABAD", "I made You Famous @taytay", "Yeezus4Life");
        user4.follow(user1);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
    }
}
