public class Barco extends Viatura {
    private boolean tempiscina;

    public boolean isTempiscina() {
        return tempiscina;
    }
    public void setTempiscina(boolean tempiscina) {
        this.tempiscina = tempiscina;
    }

    public Barco() {
        super("Barco", 0 , 0);
    }

    @Override
    public void mostraInfo(){
        System.out.println("Vou mostrar a informação do Barco");
        System.out.println("Tipo: " + getTipoCarro());
        System.out.println("Numero de rodas: " + getNumRodas());
        System.out.println("Velocidade Maxima: " + getVelMaxima());
        if (tempiscina) {
            System.out.println("Tem piscina -)");
        } else {
            System.out.println("NAO Tem piscina :-(");
        }
    }
    
}
