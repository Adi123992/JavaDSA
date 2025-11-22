package OOPS_iitm.Week5to8.Collections;

import java.util.*;

class Artist {
    String name;
    int experience;

    // Constructor to initialize instance variables
    public Artist(String n, int e) {
        name = n;
        experience = e;
    }

    public String toString() {
        return name;

    }
}

public class AuthorList {
    public static void modifyArtistList(List<Artist> artistList) {
        ListIterator<Artist> it = artistList.listIterator();
        while (it.hasNext()) {
            Artist a = it.next();
            if (a.experience < 5) {
                it.remove();
                //we cannot use remove(a) method of List becoz we are iterating over it using the ListIterator, we can use thr iterator;s remove method to make the change
            }

        }
    }

    public static void main(String[] args) {
        {
            var artists = new ArrayList<Artist>();
            artists.add(new Artist("Tagore", 12));
            artists.add(new Artist("Sudha", 3));
            artists.add(new Artist("Amitabh", 7));
            artists.add(new Artist("Sharukh", 5));

            modifyArtistList(artists);
            System.out.println(artists);

        }

    }
}
