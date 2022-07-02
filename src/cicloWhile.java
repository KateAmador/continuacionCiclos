public class cicloWhile {

    public cicloWhile() {
        //primerEjemplo();
        //segundoEjemplo();
        //tercerEjemplo();
        cuartoEjemplo();
    }

    public void primerEjemplo() {
        //Ciclo while
        //pintar los numeros del 1 al 10

        boolean noHaTerminado = true;
        int numero = 0;

        while (noHaTerminado) {
            System.out.println("Numero: " + numero);
            numero++;

            if (numero >= 10) {
                noHaTerminado = false;
            }
        }
    }

    public void segundoEjemplo() {
        //Ciclo while
        //pintar los numeros del 10 al 1

        int numero = 10;

        while (numero >= 1) {
            System.out.println("Numero: " + numero);
            numero--;

        }
    }

    public void tercerEjemplo() {

        /*Imprimir:
        1 - D
        2 - L
        3 - D
        4 - L
        Hasta el 100
         */

        int numero = 1;
        String d = "D", l = "L";

        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero + " - " + l);
            } else {
                System.out.println(numero + " - " + d);
            }
            numero++;
        }

    }


    public void cuartoEjemplo(){

        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
       new cicloWhile();
    }
}