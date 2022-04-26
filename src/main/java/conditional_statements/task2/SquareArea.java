package conditional_statements.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareArea {
    /*
        Napisz program obliczający pole powierzchni i obwód kwadratu.
        Długość boku kwadratu użytkownik powinien wprowadzić z klawiatury.
        Program powinien sprawdzić, czy wprowadzona długość boku jest poprawna
    */
    public static void main(String[] args) throws IOException {
        double a, squareArea, perimeterSquare;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        System.out.print("Please insert side a for square. Remember, that side is positive, a = ");
        a = Double.parseDouble(br.readLine());

        input.close();
        squareArea = Math.pow(a, 2);
        perimeterSquare = 4 * a;
        if (a <= 0) {
            System.out.println("Error. Length of square side is positive.");
        } else {
            System.out.printf("The length of side square a = %s cm.%nSquare area P = %2.2f cm^2.%nPerimeter square L = %2.2f cm."
                    , a, squareArea, perimeterSquare);
        }
    }
}
