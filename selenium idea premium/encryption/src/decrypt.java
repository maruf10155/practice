import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class decrypt {
    public static void main(String[] args) throws FileNotFoundException {
        String str0="";
        List<Character> small_letters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        List<Character> capital_letters = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z');
        List<Character> a = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        List<Character> b = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z');
        Collections.shuffle(b, new Random(55));
        Collections.shuffle(a, new Random(55));
        System.out.println(a);
        System.out.println(b);
        File myObj = new File("a.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            str0 =str0.concat(myReader.nextLine());
        }
        myReader.close();
        String str1 = "";
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < str0.length(); i++) {
            if (Character.isUpperCase(str0.charAt(i))) {
                arr.add(capital_letters.get(b.indexOf(str0.charAt(i))));
            }else if (Character.isLowerCase(str0.charAt(i))) {
                arr.add(small_letters.get(a.indexOf(str0.charAt(i))));
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

