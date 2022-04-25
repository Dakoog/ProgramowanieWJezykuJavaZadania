package operations_on_texts.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VectorLength {
    /*
    Symbol [a, b] w geometrii analitycznej oznacza wektor o współrzędnych, a i b (w przestrzeni
    dwuwymiarowej, czyli na płaszczyźnie). Napisz, program obliczający długość
    wektora [a, b] wprowadzonego przez użytkownika z klawiatury w postaci łańcucha
    znaków, np. [2.5, -4]. Zakładamy, że użytkownik będzie podawał poprawną postać
    danych (nawiasy prostokątne, przecinek i liczby dziesiętne w notacji z kropką).
    Z łańcucha znaków należy wydobyć podłańcuchy reprezentujące liczby, a i b
    (współrzędne wektora), zamieniając je na liczby i obliczyć długość wektora ze wzoru
    */
    public static void main(String[] args) throws IOException {//InputOutput Exception
        double a, b, vectorLength;
        System.out.println("Please insert vector in convention [a, b], where a and b are real numbers ");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        String vector = br.readLine().trim();//removing whitespace
        System.out.println(vector);
        StringBuilder sb = new StringBuilder(vector);
        sb.deleteCharAt(0).deleteCharAt(sb.length()-1);
        String[] number = sb.toString().split(",");

        a = Double.parseDouble(number[0]);
        b = Double.parseDouble(number[1]);

         vectorLength = Math.sqrt(a*a+b*b);



        System.out.printf("Vector %s length is %2.2f ",vector,vectorLength);



    }
}
