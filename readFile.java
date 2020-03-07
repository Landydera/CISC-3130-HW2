/** Islande Derazin
 *
 */


import java.io.Writer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;


public class readFile {
        // Create a folder that holds two files
        static String inpath = ("C://Users//islande.derazin//Documents//Music");
        //Create a new file to merge the data
        static String outpath = ("C://Users//islande.derazin//Documents//newFile.txt");

        public static void main(String[]args) throws IOException{
                File Folder = new File(inpath);
                File files[];
                files = Folder.listFiles();

                if(files.length>1)
                {
                        for(int i = 0;i<files.length; i++){
                                System.out.println("reading file...");
                                System.out.println(files[i]);
                                Reader in = new FileReader(files[i]);
                                Writer out = new FileWriter(outpath , false);

                                // close files
                                in.close();
                                out.close();
                        }
                }
                else{
                        System.out.println("found only one file...");
                        System.out.println(files);
                }


        }

}
       
         
