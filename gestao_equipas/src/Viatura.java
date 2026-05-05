public class Viatura {
    private String tipoCarro;
    private int numRodas;
    private int velMaxima;

    public Viatura() {
    }
    public Viatura(String tipoCarro, int numRodas, int velMaxima) {
        this.tipoCarro = tipoCarro;
        this.numRodas = numRodas;
        this.velMaxima = velMaxima;
    }
    public String getTipoCarro() {
        return tipoCarro;
    }
    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
    public int getNumRodas() {
        return numRodas;
    }
    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
    public int getVelMaxima() {
        return velMaxima;
    }
    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }

    public void mostraInfo(){
        System.out.println("Vou mostrar a informação do viatura");
        System.out.println("Tipo: " + this.tipoCarro);
        System.out.println("Numero de rodas: " + this.numRodas);
        System.out.println("Velocidade Maxima: " + this.velMaxima);
    }
}
