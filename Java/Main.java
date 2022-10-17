class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        UberX UberX = new UberX("AMQ123", new Account("Elkin Jaramillo", "11558558"), "Chevrolet", "Sonic");
        UberX.setPassenger(4);
        UberX.dataCar();

        UberVan uberVan = new UberVan("LKI4521", new Account("Andres Herrera", "4854514"));
        uberVan.setPassenger(6);
        uberVan.dataCar();
    }
}