public class cicloWhile {

    public cicloWhile(){
        primerEjemplo();
        segundoEjemplo();
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


    public static void main(String[] args) {
       new cicloWhile();
    }
}