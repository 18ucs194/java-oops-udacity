import java.util.StringBuffer;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class WordCount {
    public static void main(String [] args) throws FileNotFoundException {
       File file = new File("E:\\pg10748.txt");
        Scanner scanner =new Scanner(file);
        int word=0;
        while(scanner.hasNextLine()){
         String line = scanner.nextLine();
            //System.out.println(line.split(" ")); //it returns the array containing word obtained from split line
            //System.out.println(line.split(" ").length);    //gives the length of each line i.e. number of words in each line
            //But we have to count number of words in a whole file and for that we will add the number of worlds in each line
        word=word+(line.split(" ").length);

        }
        System.out.println("This file conatins "+ word +" words");
    }
}
