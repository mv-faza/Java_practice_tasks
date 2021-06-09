class Car {
    String brand;
    public Car() {
        this.brand = "Ford";
    }
    public String getBrand() {
        return brand;
    }
    void run() {
        System.out.println("PLEASE WAIT FOR CHECKING DATA");
    }
}
public class BrandOfCar {
    public static void main(String[] args) {
        Car ford = new Car();
        String brand = ford.getBrand();
        System.out.println(brand);
    }

}

