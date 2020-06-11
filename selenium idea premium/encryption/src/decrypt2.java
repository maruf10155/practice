import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class decrypt2 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Character> c = new ArrayList<>();
        String str0="";
        ArrayList<Character> c1 = new ArrayList<>();
        for (int i = 32; i < 127; i++) //Loop for printing A to Z character
        {
            c.add((char) i);
            c1.add((char) i);
        }
        Collections.shuffle(c1, new Random(55));
        File myObj = new File("a2.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            str0 =str0.concat(myReader.nextLine());
        }
        myReader.close();
        String str1 = "";
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < str0.length(); i++) {
            if (c.contains(str0.charAt(i))) {
                arr.add(c.get(c1.indexOf(str0.charAt(i))));
            } else {
                arr.add(str0.charAt(i));
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            str1 = str1.concat(String.valueOf(arr.get(i)));
        }
        System.out.println(str1);
    }
}
