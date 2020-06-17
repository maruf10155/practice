import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class encrypted2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Character> c = new ArrayList<>();
        ArrayList<Character> c1 = new ArrayList<>();
        for (int i = 32; i < 127; i++) //Loop for printing A to Z character
        {
            c.add((char) i);
            c1.add((char) i);
        }
        Collections.shuffle(c1, new Random(55));
        String str0 = "maruf Amin 756";
        String str1 = "";
        int xc=45;
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < str0.length(); i++) {
            if (c.contains(str0.charAt(i))) {
                arr.add(c1.get(c.indexOf(str0.charAt(i))));
            } else {
                arr.add(str0.charAt(i));
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            str1 = str1.concat(String.valueOf(arr.get(i)));
        }
        System.out.println(str1);
        FileWriter file = new FileWriter("a2.txt");
        file.write(str1);
        file.close();
    }
}
