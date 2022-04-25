package operations_on_texts.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReciprocalDifferenceTwoNumbers {
    /*
    Napisz program, który obliczy różnice liczby całkowitej dodatniej wprowadzonej
    z konsoli i liczby zapisanej tymi samymi cyframi w odwrotnej kolejności. Wynik
    wyświetl w postaci całego wyrażenia, np.: 452-254 = 198.
    */
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.println("Please insert some natural number (three-digit");
        int threeDigitNumber = Integer.parseInt(br.readLine());
        input.close();// why?

        StringBuilder number = new StringBuilder();
        number.append(threeDigitNumber).reverse();
        int number1 = Integer.parseInt(number.toString());
        System.out.printf("%s - %s = %s%n",threeDigitNumber,number1,(threeDigitNumber - number1));


    }
}
