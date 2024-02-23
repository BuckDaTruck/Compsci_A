package Unit_6.Unit_6_Project;
public class Main {
    public static void main(String[] args) {

        SpotifyUser user = new SpotifyUser("BUCK DA TRUCK");


        Song song1 = new Song("Toby Kieth", "Beer for my Horses");
        Song song2 = new Song("Ye", "Stronger");
        Song song3 = new Song("TAY", "142 of the same exact song");

        Playlist playlist = user.createPlaylist("Country", song1);
        if (playlist != null) {
    
            playlist.addSong(song2);
            playlist.addSong(song3);

    
            System.out.println(playlist.containsSong(song1));
            System.out.println(playlist.containsSong(song2)); 
            System.out.println(playlist.containsSong(song3));


            System.out.println(playlist.playRandomSong());

    
            playlist.removeSong(song1);
            System.out.println(playlist.containsSong(song1)); 
        }


        Playlist duplicatePlaylist = user.createPlaylist("Playlist1", song1);
        System.out.println(duplicatePlaylist == null);

 
        System.out.println(user);
    }
}