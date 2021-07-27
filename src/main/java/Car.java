import CarComponents.CarType;
import CarComponents.Doors;
import CarComponents.Engine;
import CarComponents.Tyres;

public class Car {

    private String brand;
    private int price;
    private int damage;
    private CarType carType;
    private String colour;
    private Engine engine;
    private Tyres tyres;
    private Doors doors;

    public Car(String brand, int price, CarType carType, String colour, Engine engine, Tyres tyres, Doors doors) {
        this.brand = brand;
        this.price = price;
        this.damage = 0;
        this.carType = carType;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
        this.doors = doors;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getPrice() {
        return this.price;
    }

    public int getDamagedPrice(){
        return this.price - this.damage;
    }

    public CarType getCarType() {
        return carType;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Doors getDoors() {
        return doors;
    }

    public int getDamage() {
        return damage;
    }

    public void carDamaged(int newDamage){
        this.damage += newDamage;
    }

    public void carRepaired(){
        this.damage = 0;
    }
}
