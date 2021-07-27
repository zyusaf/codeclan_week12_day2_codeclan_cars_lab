import java.util.ArrayList;

public class Customer {

    private String name;
    private int money;
    private ArrayList<Car> ownedCars;

    public Customer(String name, int money, ArrayList<Car> ownedCars) {
        this.name = name;
        this.money = money;
        this.ownedCars = ownedCars;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public void buyCar(Car car){
        if (this.money > car.getPrice()){
            this.money -= car.getPrice();
            ownedCars.add(car);
        }
    }
}
