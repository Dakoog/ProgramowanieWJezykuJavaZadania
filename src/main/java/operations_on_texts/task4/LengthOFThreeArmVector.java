package operations_on_texts.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LengthOFThreeArmVector {
    /*
    Napisz program obliczający długość wektora [a, b, c] (w przestrzeni trójwymiarowej)
    wprowadzonego przez użytkownika z klawiatury w postaci łańcucha znaków. Zakładamy,
    że użytkownik będzie podawał poprawną postać danych (nawiasy prostokątne,
    dwa przecinki oddzielające współrzędne i trzy liczby dziesiętne w notacji z kropką).
    */
    public static void main(String[] args) throws IOException {
        double a, b, c, lengthThreeArmVector;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        System.out.println("Please insert three-arm vector in convention [a, b, c], where a, b and c are real numbers \"");
        String threeArmVector = br.readLine().trim();
        StringBuilder vector = new StringBuilder(threeArmVector);
        vector.deleteCharAt(0).deleteCharAt(vector.length() - 1);
        String[] numbers = vector.toString().split(",");
        a = Double.parseDouble(numbers[0]);
        b = Double.parseDouble(numbers[1]);
        c = Double.parseDouble(numbers[2]);
        lengthThreeArmVector = Math.sqrt(a * a + b * b + c * c);
        System.out.printf("Length of three-arm vector v = %s is %2.2f", threeArmVector, lengthThreeArmVector);


    }
}
