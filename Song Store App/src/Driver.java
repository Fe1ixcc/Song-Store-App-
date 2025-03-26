import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.runMenu();
        System.out.println("test");
    }



    private int mainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
        Song Store App
        1)  add Method
        2)  list Method
        3)  search Method
        4)  remove Method
        5)  setSong
        0)  Exit
        ==>> """);
        System.out.print("Please enter your choice : ");
        int option = sc.nextInt();
        System.out.println("---------------------------------------");
        return option;
    }
    private void runMenu() {
        Scanner sc= new Scanner(System.in);
        int option = mainMenu();
        while (option != 0) {
            switch (option) {
                case 1 -> addMenu();
                case 2 -> listMenu();
                case 3 -> searchMenu();
                case 4 -> removeMenu();
                case 5 -> setSong();
                default -> System.out.println("Invalid option entered: " + option) ;
            }

            System.out.print("\nPress enter key to continue...");
            sc.nextLine();
            option = mainMenu();
        }

        System.out.println("Exiting...bye");
        System.exit(0);
    }

    private void addMenu() {
        Scanner sc = new Scanner(System.in);
            System.out.print("""
        Add methods
        1)  addtsong
        2)  addArtist
        0)  Exit
        ==>> """);
        System.out.print("Please enter your choice : ");
        int option = sc.nextInt();
        while (option != 0) {
            switch (option) {
                case 1 -> addsong();
                case 2 -> addArtist();
                case 0 -> runMenu();
                default -> System.out.println("Invalid option entered: " + option);
            }
            System.out.println("---------------------------------------");
            Driver driver = new Driver();
            driver.runMenu();
        }
    }
    private void listMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
        List methods
        1)  listsong
        2)  listArtist
        3)  listVerifiedArtistSong
        4)  listArtistSong  
        0)  Exit
        ==>> """);
        System.out.print("Please enter your choice : ");
        int option = sc.nextInt();
        while (option != 0) {
            switch (option) {
                case 1 -> listSong();
                case 2 -> listArtist();
                case 3 -> listVerifiedArtistSong();
                case 4 -> listArtistSong();
                case 0 -> runMenu();
                default -> System.out.println("Invalid option entered: " + option);
            }
            System.out.println("---------------------------------------");
            Driver driver = new Driver();
            driver.runMenu();
        }
    }
    private void searchMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
        Search methods
        1)  searchSong
        2)  SearchLongTimeSong
        0)  Exit
        ==>> """);
        System.out.print("Please enter your choice : ");
        int option = sc.nextInt();
        while (option != 0) {
            switch (option) {
                case 1 -> searchSong();
                case 2 -> SearchLongTimeSong();
                case 0 -> runMenu();
                default -> System.out.println("Invalid option entered: " + option);
            }
            System.out.println("---------------------------------------");
            Driver driver = new Driver();
            driver.runMenu();
        }
    }


    private void removeMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
        Remove methods
        1)  removeSong
        2)  remove Artist
        0)  Exit
        ==>> """);
        System.out.print("Please enter your choice : ");
        int option = sc.nextInt();
        while (option != 0) {
            switch (option) {
                case 1 -> removeSong();
                case 2 -> removeArtist();
                case 0 -> runMenu();
                default -> System.out.println("Invalid option entered: " + option);
            }
            System.out.println("---------------------------------------");
            Driver driver = new Driver();
            driver.runMenu();
        }
    }



    private void addsong(){
        System.out.println(Method.addSong());
    }
    private void addArtist(){
        System.out.println(Method.addArtist());
    }
    private void listSong(){
        System.out.println(Method.listSong());
    }
    private void listArtist(){
        System.out.println(Method.listArtist());
    }
    private void listVerifiedArtistSong() {
        System.out.println(Method.listVerifiedArtistSong());
    }
    private void removeSong() {
        System.out.println(Method.removeSong());
    }
    private void removeArtist(){
        System.out.println(Method.removeArtist());
    }
    private void searchSong() {
        System.out.println(Method.searchSong());
    }
    private void setSong(){
        System.out.println(Method.setSong());
    }
    private void SearchLongTimeSong() {
        System.out.println(Method.SearchLongTimeSong());
    }
    private void listArtistSong() {
        System.out.println(Method.listArtistSong());
    }


  }
