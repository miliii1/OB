// Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
// Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

public class Main {

    public static void main(String[] args) {
        int num = 5;
        if (num > 0) {
            System.out.println("Este número " + num + " es positivo");
        } else if (num == 0) {
            System.out.println("Este número " + num + " es igual a 0");
        } else {
            System.out.println("Este número " + num + " es negativo");
        }

        // Crea un bucle While, este bucle tendrá que tener como condición que la
        // variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
        // bucle deberá:
        // Incrementar el valor de la variable en uno cada vez que se ejecute.
        // Mostrarlo por pantalla cada vez que se ejecute.

        int numb = 1;
        while (numb < 3) {
            System.out.println("La variable num actual es: " + numb);
            numb++;
        }

        // Para el bucle Do While, deberás crear la misma estructura que en el While,
        // pero solo se debe ejecutar una vez.
        do {
            System.out.println("Una vez se ejecutará este número: " + numb);
            numb--;
        } while (numb > 2);

        // Para el bucle For, crea una variable numeroFor, esta variable tendrá como
        // valor 0 y su condición será que la variable
        // sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se
        // ejecute y deberá mostrarse por pantalla.

        for(int number = 0; number <= 3; number++) {
            System.out.println("La variable number vale: " + number);
        }

        // Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
        // Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola 
        // informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

        String estacion = "primavera";

        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
                default:
                System.out.println("No es una estacion");
                    break;
        }

    }
}
