import CarComponents.CarType;
import CarComponents.Doors;
import CarComponents.Engine;
import CarComponents.Tyres;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car1;
    Car car2;
    Engine engine;
    Tyres tyres;
    Doors doors;
    ArrayList<Car> ownedCars;
    Customer customer;


    @Before
    public void before(){
        engine = new Engine();
        tyres = new Tyres();
        doors = new Doors();
        car1 = new Car("Volvo", 25000, CarType.HYBRID, "Red", engine, tyres, doors);
        car2 = new Car("Tesla", 40000, CarType.ELECTRIC, "White", engine, tyres, doors);
        ownedCars = new ArrayList<>();
        ownedCars.add(car1);
        ownedCars.add(car2);
        dealership = new Dealership("Rust to Riches", 30000, ownedCars);
        customer = new Customer("Gary", 30000, ownedCars);
    }

    @Test
    public void hasName(){
        assertEquals("Rust to Riches", dealership.getName());
    }

    @Test
    public void hasMoneyInTill(){
        assertEquals(30000, dealership.getTillMoney());
    }

    @Test
    public void hasOwnedCars(){
        assertEquals(2, dealership.getOwnedCars().size());
    }

    @Test
    public void canBuyCar(){
        dealership.buyCar(car1);
        assertEquals(3, dealership.getOwnedCars().size());
        assertEquals(5000, dealership.getTillMoney());
    }

    @Test
    public void canSellCar(){
        dealership.sellCar(customer, car1);
        assertEquals(1, dealership.getOwnedCars().size());
        assertEquals(55000, dealership.getTillMoney());
        assertEquals(5000, customer.getMoney());
    }

    @Test
    public void canRepairDamage(){
        car1.carDamaged(1000);
        assertEquals(24000, car1.getDamagedPrice());
        dealership.repairCar(car1);
        assertEquals(29000, dealership.getTillMoney());
        assertEquals(25000, car1.getDamagedPrice());
    }
}
