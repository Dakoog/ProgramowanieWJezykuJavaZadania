package conditional_statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumericalInterval {


    /*
            Użytkownik wprowadza z klawiatury dwie liczby rzeczywiste, a i b. Napisz program, który wyświetli
            (zapisany w sposób symboliczny) zabiór złożony z tych liczb oraz wszysktich liczb zawartych między nimi.
             */

    public static void main(String[] args) throws IOException {
        double a, b;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.println("Please insert two real numbers ");
        a = Double.parseDouble(br.readLine());
        b = Double.parseDouble(br.readLine());
        br.close();
        StringBuilder intervalNumber = new StringBuilder();
        System.out.println();
        if (a > b) {
            intervalNumber.append('<').append(b).append(" ; ").append(a).append(">");
        } else if (b > a) {
            intervalNumber.append('<').append(a).append(" ; ").append(b).append(">");
        } else {
            intervalNumber.append("{ ").append(a).append(" }");
        }
        intervalNumber.insert(0, "the set between these numbers is X = ");
        System.out.println(intervalNumber);


    }
}
