public class cicloWhile {
    public static void main(String[] args) {

        //Ciclo while
        //pintar los numeros del 1 al 10

        boolean noHaTerminado = true;
        int numero = 0;

        while (noHaTerminado){
            System.out.println("Numero: " + numero);
            numero++;

            if (numero >= 10){
                noHaTerminado = false;
            }
        }
    }
}