import CarComponents.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine();
    }

    @Test
    public void canStartEngine(){
        assertEquals("Turn the ignition", engine.engineStart());
    }
}
