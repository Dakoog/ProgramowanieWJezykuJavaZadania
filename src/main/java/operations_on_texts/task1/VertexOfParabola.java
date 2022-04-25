package operations_on_texts.task1;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class VertexOfParabola {
    /*
    Napisz program, który wyświetli w konsoli współrzędne wierzchołka paraboli funkcji kwadratowej
    f(x) = ax^2 + bx + c. Pobierz od użytkownika rzeczywiste wartości parametrów a, b oraz c.
    */
    public static void main(String[] args) throws IOException {
        double a, b, c, coordinateOfVertexP, coordinateOfVertexQ;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.println("Please insert value for a, b and c for f(x) = ax^2 + bx +c");
        a = Double.parseDouble(br.readLine());
        b = Double.parseDouble(br.readLine());
        c = Double.parseDouble(br.readLine());
        coordinateOfVertexP = -b / (2 * a);
        coordinateOfVertexQ = a * Math.pow(coordinateOfVertexP, 2) + b * coordinateOfVertexP + c;

        // output method -> printf
        System.out.printf("There is a function f(x) = %sx^2 + %sx + %s%n", a, b, c);
        System.out.printf("Coordinates of the vertex it V = (%2.2f , %2.2f) - printf%n", coordinateOfVertexP, coordinateOfVertexQ);

        // output method -> StringBuilder.append or StringBuffer (older version with java 1.0)
        StringBuilder vertex = new StringBuilder("Coordinates of the vertex it V = (");
        vertex.append(coordinateOfVertexP).append(", ")
                .append(coordinateOfVertexQ).append(" )");
        System.out.println(vertex + " - StringBuilder.append");

        // output method -> StringBuilder.insert
        vertex = new StringBuilder("Coordinates of the vertex it V = (, )");
        vertex.insert(36, coordinateOfVertexQ).insert(34, coordinateOfVertexP);
        System.out.println(vertex + " - StringBuilder.insert");

        // output method _> StringBuilder.replace
        vertex = new StringBuilder("(#1, #2)");
        int start = vertex.indexOf("#1");
        vertex.replace(start, start+1, String.valueOf(coordinateOfVertexP));
        start = vertex.indexOf("#2");
        vertex.replace(start, start+1,String.valueOf(coordinateOfVertexQ));
        System.out.println("Coordinates of the vertex it V ="+vertex+" - StringBuilder.replace");

        //concatenation method
        String vertex1 = "Coordinates of the vertex it V = (" + coordinateOfVertexP + ", " +
                coordinateOfVertexQ + " )";
        System.out.println(vertex1 + " - concatenation operator");

    }
}

