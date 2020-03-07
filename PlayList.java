/** Islande Derazin
 *
 */


import java.util.*;



        public class PlayList {

                // this will point to the first NODE in the list
                Song start = null;
                Private Scanner scan =new Scanner(System.in);

                public void addSong() {
                        // temp points at first node
                        Song temp = start;
                        // find last node
                        while (temp.next != null)
                        {
                                // move to next node
                                temp = temp.next;
                        }

                        Song newSong = new Song();
                        // make a new NO
                        System.out.println("Enter title of the new song");
                        newSong.title(scan.nextLine());
                        // attach new NODE at end of list
                        temp.next = newSong;
                }

                public void Playlist

                {
                        // point at first node
                        Song temp = start;

                        // stop at end of list
                        while (temp != null)
                        {
                                // move to next node
                                temp = temp.next;
                        }
                }


                /** this "inner class" is used to hold  a node for the list, including
                  the title of the song and a pointer to next node in the list
                 **/
                class Song
                {
                        String title = "";
                        Song next = null;
                }
        }
