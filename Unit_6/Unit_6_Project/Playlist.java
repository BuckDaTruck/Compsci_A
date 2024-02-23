package Unit_6.Unit_6_Project;

import java.util.ArrayList;
import java.util.Random;

public class Playlist {
    private String title;
    private SpotifyUser owner;
    private ArrayList<Song> songs;

    public Playlist(String title, SpotifyUser owner, Song firstSong) {
        this.title = title;
        this.owner = owner;
        this.songs = new ArrayList<>();
        this.songs.add(firstSong);
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public boolean containsSong(Song song) {
        return songs.contains(song);
    }

    public boolean removeSong(Song song) {
        return songs.remove(song);
    }

    public Song playRandomSong() {
        Random rand = new Random();
        return songs.get(rand.nextInt(songs.size()));
    }

    public String getTitle() {
        return title;
    }

    public SpotifyUser getOwner() {
        return owner;
    }
    public String toString() {
        return "Playlist{" +
                "title='" + title + '\'' +
                ", owner=" + owner.getName() + 
                ", songs=" + songs +
                '}';
    }
   
}