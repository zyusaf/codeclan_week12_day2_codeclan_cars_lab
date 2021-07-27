import CarComponents.CarType;
import CarComponents.Doors;
import CarComponents.Engine;
import CarComponents.Tyres;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Engine engine;
    Tyres tyres;
    Doors doors;
    ArrayList<Car> ownedCars;


    @Before
    public void before(){
        engine = new Engine();
        tyres = new Tyres();
        doors = new Doors();
        car = new Car("Volvo", 25000, CarType.HYBRID, "Red", engine, tyres, doors);
        ownedCars = new ArrayList<>();
        ownedCars.add(car);
        customer = new Customer("Gary", 30000, ownedCars);
    }

    @Test
    public void hasName(){
        assertEquals("Gary", customer.getName());
    }

    @Test
    public void hasMoney(){
        assertEquals(30000, customer.getMoney());
    }

    @Test
    public void hasOwnedCars(){
        assertEquals(1, customer.getOwnedCars().size());
    }

    @Test
    public void customerCanBuyCar(){
        customer.buyCar(car);
        assertEquals(2, customer.getOwnedCars().size());
        assertEquals(5000, customer.getMoney());
    }
}
