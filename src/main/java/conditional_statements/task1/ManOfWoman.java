package conditional_statements.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManOfWoman {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        System.out.println("Please insert name: ");
        String name = br.readLine();
        input.close();

        StringBuilder otherName = new StringBuilder(name);
        char lastLetter = otherName.charAt(otherName.length() - 1);
        if (lastLetter == 'a' || lastLetter == 'e') {
            if (!name.equalsIgnoreCase("Kuba") &&
                    !name.equalsIgnoreCase("Barnaba") &&
                    (!name.equalsIgnoreCase("Bonawentura"))) {
                System.out.println(name +" is a woman.");
            } else {
                System.out.println(name +" is a man.");
            }
        } else {
            System.out.println(name +" is a man.");
        }
    }
}
