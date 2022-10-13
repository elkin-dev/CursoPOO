class Car {
    Integer id;
    String license;
    Account driver;
    int passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void dataCar() {
        System.out.println("Lisence: " + license + " Name Driver: " + driver.name);
    }
}