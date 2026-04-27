public class App {
    public static void main(String[] args) throws Exception {

        Viatura viatura1 = new Viatura();
        viatura1.setTipoCarro("Ford");
        viatura1.setNumRodas(4);
        viatura1.setVelMaxima(120);

        viatura1.mostraInfo();

    }
}