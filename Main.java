public class Main {
    public static void main(String[] args) {
        TecladoC teclado = new TecladoC();
        USB adaptador = new AdaptadorCParaUSB(teclado);

        Gabinete gabinete = new Gabinete();
        gabinete.conectarDispositivo(adaptador);
    }
}