public class Artist{
    private String ArtistName;
    private boolean VerifiedArtist;


    public void Artist(String ArtistName, boolean VerifiedArtist) {
        this.ArtistName = ArtistName;
        this.VerifiedArtist = VerifiedArtist;
    }
    public void Artist() {
    }

    public String getArtistName() {
        return ArtistName;
    }

    public void setArtistName(String artistName) {
        ArtistName = artistName;
    }

    public boolean isVerifiedArtist() {
        return VerifiedArtist;
    }

    public void setVerifiedArtist(boolean verifiedArtist) {
        VerifiedArtist = verifiedArtist;
    }

    public void Modles(String artistName) {
        ArtistName = artistName;
    }

    public String toString() {
        return "{" + "ArtistName: " + ArtistName +  " VerifiedArtist: " + VerifiedArtist + '}';
    }
}