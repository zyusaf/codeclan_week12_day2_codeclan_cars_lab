import CarComponents.CarType;
import CarComponents.Doors;
import CarComponents.Engine;
import CarComponents.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyres tyres;
    Doors doors;

    @Before
    public void before(){
        engine = new Engine();
        tyres = new Tyres();
        doors = new Doors();
        car = new Car("Volvo", 25000, CarType.HYBRID, "Red", engine, tyres, doors);
    }

    @Test
    public void hasBrand(){
        assertEquals("Volvo", car.getBrand());
    }

    @Test
    public void hasPrice(){
        assertEquals(25000, car.getPrice());
    }

    @Test
    public void hasCarType(){
        assertEquals(CarType.HYBRID, car.getCarType());
    }

    @Test
    public void hasCarColour(){
        assertEquals("Red", car.getColour());
    }

    @Test
    public void canStartEngine(){
        assertEquals("Turn the ignition", car.getEngine().engineStart());
    }

    @Test
    public void carDamageStartsZero(){
        assertEquals(0, car.getDamage());
    }

    @Test
    public void carIsDamaged(){
        car.carDamaged(500);
        assertEquals(24500, car.getPrice());
    }
}
