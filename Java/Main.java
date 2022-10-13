class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Car car = new Car("AMQ123", new Account("Elkin Jaramillo", "11558558"));
        car.passengers = 4;
        car.dataCar();

        Car car2 = new Car("LKI584", new Account("Manuel Perez", "5964736"));
        car.passengers = 6;
        car2.dataCar();

        
        

        


    }
}