import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class encryption {
    public static void main(String[] args) throws IOException {
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
        String str0 = "Oxygen is the chemical element with the symbol O and atomic number 8. It is a member of the chalcogen group in the periodic table, a highly reactive nonmetal, and an oxidizing agent that readily forms oxides with most elements as well as with other compounds. After hydrogen and helium, oxygen is the third-most abundant element in the universe by mass. At standard temperature and pressure, two atoms of the element bind to form dioxygen, a colorless and odorless diatomic gas with the formula O\n" +
                "2. Diatomic oxygen gas constitutes 20.95% of the Earth's atmosphere. As compounds including oxides, the element makes up almost half of the Earth's crust.[2]\n" +
                "\n" +
                "Dioxygen provides the energy released in combustion[3] and aerobic cellular respiration,[4] and many major classes of organic molecules in living organisms contain oxygen atoms, such as proteins, nucleic acids, carbohydrates, and fats, as do the major constituent inorganic compounds of animal shells, teeth, and bone. Most of the mass of living organisms is oxygen as a component of water, the major constituent of lifeforms. Oxygen is continuously replenished in Earth's atmosphere by photosynthesis, which uses the energy of sunlight to produce oxygen from water and carbon dioxide. Oxygen is too chemically reactive to remain a free element in air without being continuously replenished by the photosynthetic action of living organisms. Another form (allotrope) of oxygen, ozone (O\n" +
                "3), strongly absorbs ultraviolet UVB radiation and the high-altitude ozone layer helps protect the biosphere from ultraviolet radiation. However, ozone present at the surface is a byproduct of smog and thus a pollutant.\n" +
                "\n" +
                "Oxygen was isolated by Michael Sendivogius before 1604, but it is commonly believed that the element was discovered independently by Carl Wilhelm Scheele, in Uppsala, in 1773 or earlier, and Joseph Priestley in Wiltshire, in 1774. Priority is often given for Priestley because his work was published first. Priestley, however, called oxygen \"dephlogisticated air\", and did not recognize it as a chemical element. The name oxygen was coined in 1777 by Antoine Lavoisier, who first recognized oxygen as a chemical element and correctly characterized the role it plays in combustion.\n" +
                "\n" +
                "Common uses of oxygen include production of steel, plastics and textiles, brazing, welding and cutting of steels and other metals, rocket propellant, oxygen therapy, and life support systems in aircraft, submarines, spaceflight and diving.";
        String str1 = "";
        ArrayList<Character> arr = new ArrayList<>();
        System.out.println(arr);
        for (int i = 0; i < str0.length(); i++) {
            if (Character.isLowerCase(str0.charAt(i))) {
                arr.add(a.get(small_letters.indexOf(str0.charAt(i))));
            }else if(Character.isUpperCase(str0.charAt(i))){
                arr.add(b.get(capital_letters.indexOf(str0.charAt(i))));
            } else {
                arr.add(str0.charAt(i));
            }
        }
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            str1 = str1.concat(String.valueOf(arr.get(i)));
        }
        System.out.println(str1);
        FileWriter file = new FileWriter("a.txt");
        file.write(str1);
        file.close();
    }
}
