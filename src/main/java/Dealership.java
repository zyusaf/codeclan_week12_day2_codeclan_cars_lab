import java.util.ArrayList;

public class Dealership {

    private String name;
    private int till;
    private ArrayList<Car> ownedCars;

    public Dealership(String name, int till, ArrayList<Car> ownedCars) {
        this.name = name;
        this.till = till;
        this.ownedCars = ownedCars;
    }

    public String getName() {
        return name;
    }

    public int getTillMoney() {
        return this.till;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public void buyCar(Car car){
        if (this.till > car.getPrice()){
            this.till -= car.getPrice();
            ownedCars.add(car);
        }
    }

    public void removeCar(Car car){
        for (int i=0; i < ownedCars.size(); i++){
            if (ownedCars.get(i).getPrice() == car.getPrice() && ownedCars.get(i).getBrand().equals(car.getBrand()) && ownedCars
                    .get(i).getColour().equals(car.getColour())){
                ownedCars.remove(i);
            }
        }
    }

    public void sellCar(Customer customer, Car car){
        customer.buyCar(car);
        this.till += car.getPrice();
        removeCar(car);
    }

    public void repairCar(Car car) {
        this.till -= car.getDamage();
        car.carRepaired();
    }
}
