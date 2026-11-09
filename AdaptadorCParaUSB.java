public class AdaptadorCParaUSB implements USB {
    private final TecladoC tecladoC;

    public AdaptadorCParaUSB(TecladoC tecladoC) {
        this.tecladoC = tecladoC;
    }

    @Override
    public void conectarUSB() {
        System.out.
                println("Adaptador: convertendo C para USB...");
        tecladoC.conectarC();
    }

    @Override
    public String enviarDados() {
        return "[USB] " + tecladoC.enviarDadosC();
    }
}