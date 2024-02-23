package Unit_6.Unit_6_Project;

import java.util.ArrayList;

public class SpotifyUser {
    private String username;
    private ArrayList<Playlist> ownedPlaylists;
    private ArrayList<Playlist> followedPlaylists;

    public SpotifyUser(String username) {
        this.username = username;
        this.ownedPlaylists = new ArrayList<>();
        this.followedPlaylists = new ArrayList<>();
    }

    public Playlist createPlaylist(String title, Song firstSong) {
        for (Playlist playlist : ownedPlaylists) {
            if (playlist.getTitle().equals(title)) {
                return null;
            }
        }
        Playlist newPlaylist = new Playlist(title, this, firstSong);
        ownedPlaylists.add(newPlaylist);
        return newPlaylist;
    }

    public Playlist getOwnedPlaylist(String playlistTitle) {
        for (Playlist playlist : ownedPlaylists) {
            if (playlist.getTitle().equals(playlistTitle)) {
                return playlist;
            }
        }
        return null;
    }

    public boolean deleteOwnedPlaylist(String playlistTitle) {
        Playlist playlist = getOwnedPlaylist(playlistTitle);
        if (playlist == null) {
            return false;
        }
        return ownedPlaylists.remove(playlist);
    }

    public boolean addToOwnedPlaylist(Playlist playlist, Song song) {
        if (!ownedPlaylists.contains(playlist)) {
            System.out.println("Dis not be urs");
            return false;
        }
        playlist.addSong(song);
        return true;
    }

    public boolean removeFromOwnedPlaylist(Playlist playlist, Song song) {
        if (!ownedPlaylists.contains(playlist)) {
            System.out.println("WHo you think your are editing someone elses playlist? A playlist is deeply personal and I am deeply saddend you attempted to wreck someones vibe.");
            return false;
        }
        playlist.removeSong(song);
        return true;
    }

    public boolean addToFollowed(Playlist playlist) {
        if (followedPlaylists.contains(playlist)) {
            return false;
        }
        followedPlaylists.add(playlist);
        return true;
    }

    public boolean removeFromFollowed(Playlist playlist) {
        if (!followedPlaylists.contains(playlist)) {
            return false;
        }
        followedPlaylists.remove(playlist);
        return true;
    }

    public String getName() {
        return username;
    }

    @Override
    public String toString() {
        return "SpotifyUser{" +
                "username='" + username + '\'' +
                ", ownedPlaylists=" + ownedPlaylists +
                ", followedPlaylists=" + followedPlaylists +
                '}';
    }
}