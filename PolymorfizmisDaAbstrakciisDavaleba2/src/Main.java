public class Main {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();


        Music song1 = new Music("Bohemian Rhapsody", 5.55, "Rock");
        Music song2 = new Music("Imagine", 3.03, "Pop");
        Music song3 = new Music("Hey Jude", 7.11, "Pop Rock");
        Music song4 = new Music("Smells Like Teen Spirit", 5.01, "Grunge");
        Music song5 = new Music("Billie Jean", 4.54, "Pop");


        Album album1 = new Album("A Night at the Opera", 1975);
        album1.addMusic(song1);

        Album album2 = new Album("Imagine", 1971);
        album2.addMusic(song2);

        Album album3 = new Album("1", 2000);
        album3.addMusic(song3);

        Album album4 = new Album("Nevermind", 1991);
        album4.addMusic(song4);

        Album album5 = new Album("Thriller", 1982);
        album5.addMusic(song5);


        Artist artist1 = new Artist("Queen");
        artist1.addAlbum(album1);

        Artist artist2 = new Artist("John Lennon");
        artist2.addAlbum(album2);

        Artist artist3 = new Artist("The Beatles");
        artist3.addAlbum(album3);

        Artist artist4 = new Artist("Nirvana");
        artist4.addAlbum(album4);

        Artist artist5 = new Artist("Michael Jackson");
        artist5.addAlbum(album5);

        library.addArtist(artist1);
        library.addArtist(artist2);
        library.addArtist(artist3);
        library.addArtist(artist4);
        library.addArtist(artist5);

        library.addAlbum(album1);
        library.addAlbum(album2);
        library.addAlbum(album3);
        library.addAlbum(album4);
        library.addAlbum(album5);

        library.addMusic(song1);
        library.addMusic(song2);
        library.addMusic(song3);
        library.addMusic(song4);
        library.addMusic(song5);

        artist1.displayInfo();
        artist2.displayInfo();
        artist3.displayInfo();
        artist4.displayInfo();
        artist5.displayInfo();

        Music song = library.searchMusic("Imagine");

        if(song != null){
            song.displayInfo();
            song.play();
            song.stop();
        }

        System.out.println();

        Music randomSong = library.giveRandomMusic();
        System.out.println("Random Song: " + randomSong.getTitle());

        library.removeMusic(song2);
    }
}