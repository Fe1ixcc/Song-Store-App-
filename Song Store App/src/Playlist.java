public class Playlist {
    private String playlistName;
    private String PlaylistDescription ;
    private String Songs;
    private int likes;

    public void Playlist(String playlistName, String PlaylistDescription, String Songs, int likes) {
        this.playlistName = playlistName;
        this.PlaylistDescription = PlaylistDescription;
        this.Songs = Songs;
        this.likes = likes;
    }
    public Playlist() {
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getPlaylistDescription() {
        return PlaylistDescription;
    }

    public void setPlaylistDescription(String playlistDescription) {
        PlaylistDescription = playlistDescription;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getSongs() {
        return Songs;
    }

    public void setSongs(String songs) {
        Songs = songs;
    }

    public String toString() {
        return "Playlist{" +
                "likes=" + likes +
                ", playlistName='" + playlistName + '\'' +
                ", PlaylistDescription='" + PlaylistDescription + '\'' +
                ", Songs='" + Songs + '\'' +
                '}';
    }
}
