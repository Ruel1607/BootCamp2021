package LinkedList.Challenge;

import java.util.Iterator;
import java.util.LinkedList;

public class PlayList {
    public static void main(String[] args) {
        LinkedList<Song> songs = new LinkedList<>();

        songs.add(0,(new Song("HEAVEN" , 195)));
        songs.add(1,(new Song("POTA" , 185)));
        printList(songs);

        }

    public static void printList(LinkedList<Song> linkedList) {

       for(int i = 0 ; i<linkedList.size(); i++){
           System.out.println("SONGS:" + i + "\n TITLE: " + linkedList.get(i).getTitle() + "\n DURATION: " + linkedList.get(i).getDuration()+" seconds");
       }
        System.out.println("====================================");
    }

    }




