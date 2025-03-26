import java.util.ArrayList;
import java.util.Scanner;
//import com.thoughtworks.xstream.XStream;
//import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Method {
    static ArrayList<Song> Song = new ArrayList<>();
    static ArrayList<Artist> Artist = new ArrayList<>();
    static ArrayList<Playlist> Playlist = new ArrayList<>();
    public void save() throws Exception
    {
        XStream xstream = new XStream() {
            @Override
            public ObjectOutputStream createObjectOutputStream(FileWriter fileWriter) {
                return null;
            }
        }; //1
        ObjectOutputStream out =
                xstream.createObjectOutputStream(new FileWriter("products.xml")); //2
        out.writeObject(Song);
        out.close();
        //4
        //3
    }


    public static String addSong() {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many Song do you want to add?: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            Song song = new Song();
            System.out.print("Enter Song ID: ");
            int songID = sc.nextInt();
            System.out.print("Enter Song Name: ");
            String SongName = sc.next();
            System.out.print("Enter Artist Name: ");
            String ArtistName = sc.next();
            System.out.print("Is this Song Verified? (y/n): ");
            char ans = sc.next().charAt(0);
            boolean result = false;
            if ((ans == 'y') || (ans == 'Y'))
                result = true;
            boolean VerifiedArtist = result;
            System.out.print("Enter length of Song ");
            int lengthOfSong = sc.nextInt();

            song.setSongID(songID);
            song.setSongName(SongName);
            song.setArtistName(ArtistName);
            song.setVerifiedArtist(VerifiedArtist);
            song.setLengthOfSong(lengthOfSong);

            Song.add(song);
            System.out.println("Song Added Successfully");
        }
        return "";
    }

    public static String listSong() {
        if (Song.isEmpty()) {
            System.out.println("No Song in the list");
        }
        for (int i = 0; i < Song.size(); i++) {
            System.out.println(Song.get(i));
        }

        return "";
    }


    public static String addArtist() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Artist du you want to add?: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            Artist artist = new Artist();

            System.out.print("Enter Artist Name: ");
            String ArtistName = sc.next();

            System.out.print("Is this Artist Verified? (y/n): ");
            char ans = sc.next().charAt(0);
            boolean result = false;
            if ((ans == 'y') || (ans == 'Y'))
                result = true;
            boolean VerifiedArtist = result;

            artist.setArtistName(ArtistName);
            artist.setVerifiedArtist(VerifiedArtist);

            Artist.add(artist);
            System.out.println("Artist Added Successfully");


        }
        return "";
    }

    public static String listArtist() {
        if (Artist.size() == 0) {
            System.out.println("No Artist Found");
        }
        for (int i = 0; i < Artist.size(); i++) {
            System.out.println(Artist.get(i));
        }
        return "";
    }



    public static String listVerifiedArtistSong() {
        if (Song.size() == 0) {
            System.out.println("No Song in the list");
        }
        if (Song.size() != 0) {
            for (int i = 0; i < Song.size(); i++) {
                if (Song.get(i).isVerifiedArtist() == true) {
                    System.out.println(Song.get(i));
                }
            }
        }

        return "";
    }

    public static String removeSong() {
        if (Song.size() == 0) {
            System.out.println("No Song in the list");
        }
        if (Song.size() != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("How many Song do you want to remove?: ");
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.print("Enter the ID of the song which you want to remove: ");
                int songID = sc.nextInt();
                Song.remove(songID - 1);
            }
        }
        System.out.println("Song Removed Successfully");
        return "";
    }

    public static String removeArtist() {
        if (Song.size() == 0) {
            System.out.println("No Song in the list");
        }
        if (Song.size() != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("How many Artist du you want to remove?: ");
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.print("Enter the name of the artist which you want to remove: ");
                String artistName = sc.next();
                if (Artist.get(i).getArtistName() == artistName) {
                    Artist.remove(i);
                }
            }
        }

        return "";
    }

    public static String searchSong() {
        if (Song.size() == 0) {
            System.out.println("No Song in the list");
        }
        if (Song.size() != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of the song you want to search : ");
            String SongName = sc.nextLine();
            for (int i = 0; i < Song.size(); i++) {
                if (Song.get(i).getSongName().equals(SongName)) {
                    System.out.println(Song.get(i));
                } else {
                    System.out.println("Song Not Found");
                    break;
                }
            }
        }
        return "";
    }

    public static String setSong() {
        if (Song.size() == 0) {
            System.out.println("No Song in the list");
        }
        if (Song.size() != 0) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the codeof the song want to set : ");
        String SongCode = sc.nextLine();
        for (int i = 0; i < Song.size(); i++) {
            if (Song.get(i).getSongID() == Integer.parseInt((SongCode))) {
                System.out.print("Please enter the new Song ID: ");
                int newCode = sc.nextInt();
                System.out.print("Enter the new Song Name: ");
                String newName = sc.next();
                System.out.print("Enter the new Artist Name: ");
                String newArtist = sc.next();
                System.out.print("Is the new Song Artist Verified ? (y/n): ");
                char ans = sc.next().charAt(0);
                boolean newVerifiedArtist = false;
                if ((ans == 'y') || (ans == 'Y'))
                    newVerifiedArtist = true;
                boolean VerifiedArtist = newVerifiedArtist;
                System.out.print("Enter the new Length of Song: ");
                int newLength = sc.nextInt();
                Song song = new Song();
                song.setSongID(newCode);
                song.setSongName(newName);
                song.setArtistName(newArtist);
                song.setVerifiedArtist(newVerifiedArtist);
                song.setLengthOfSong(newLength);
                Song.set(i, song);
            }
          }
        }
        return "";
    }

    public static String SearchLongTimeSong() {
        if (Song.size() == 0) {
            System.out.println("No Song in the list");
        }
        if (Song.size() != 0) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of the song you expcted : ");
        int expctedlength = sc.nextInt();
        for (int i = 0; i < Song.size(); i++) {
            if (Song.get(i).getLengthOfSong() > expctedlength) {
                System.out.println(Song.get(i));
              }
            }
        }
        return "";
    }

    public static String listArtistSong() {
        if (Song.size() == 0) {
            System.out.println("No Song in the list");
        }
        if (Song.size() != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of the Artist who you want to list his or her song : ");
            String ArtistName = sc.next();
            for (int i = 0; i < Song.size(); i++) {
                if (Song.get(i).getArtistName().equals(ArtistName)) {
                    System.out.println(Song.get(i));
                }
            }
        }
        return "";
    }
  /*  @SuppressWarnings("unchecked")
    public void load() throws Exception {
        //list of classes that you wish to include in the serialisation, separated by a comma
        Class<?>[] classes = new Class[] { Song.class}; //1
        //setting up the xstreamobject with default security and the above classes
        XStreamxstream= new XStream(new Driver());
        XStream.setupDefaultSecurity(xstream); //2
        xstream.allowTypes(classes);
        //doing the actual serialisation to an XML file
        ObjectInputStreamis = xstream.createObjectInputStream(new
                FileReader("products.xml")); //3
        products = (ArrayList<Product>) is.readObject(); //4
        is.close(); //5*/
    }

