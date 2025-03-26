public class Song {
   private int songID;
   private String songName;
   private String artistName;
   private boolean verifiedArtist ;
   private int lengthOfSong;

    public Song() {
    }



    public void Song(int songId , String songName, String artistName, boolean verifiedArtist, int lengthOfSong) {
        this.songID = songId;
        this.songName = songName;
        this.artistName = artistName;
        this.verifiedArtist = verifiedArtist;
        this.lengthOfSong = lengthOfSong;

    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public boolean isVerifiedArtist() {
        return verifiedArtist;
    }

    public void setVerifiedArtist(boolean verifiedArtist) {
        this.verifiedArtist = verifiedArtist;
    }

    public int getLengthOfSong() {
        return lengthOfSong;
    }

    public void setLengthOfSong(int lengthOfSong) {
        this.lengthOfSong = lengthOfSong;
    }

    public String toString() {
        return "Song{songID : " + songID + ", songName : " + songName + ", artistName : " + artistName + ", verifiedArtist : " + verifiedArtist + ", lengthOfSong : " + lengthOfSong + "}";
    }
}
