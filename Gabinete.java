public class Gabinete {
    public void conectarDispositivo(USB dispositivo) {
        dispositivo.conectarUSB();
        System.out.println("Gabinete recebeu: " + dispositivo.enviarDados());
    }
}