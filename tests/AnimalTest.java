import org.junit.jupiter.api.*;
// "*" means everything
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    private Animal a;

    @BeforeEach
    public void setup(){
        a = new Animal("dog",5,15);
    }

    @Test
    public void testDefaultConstructor(){
Animal defaultAnimal = new Animal();
assertEquals("horse", defaultAnimal.getType());
assertEquals(1,defaultAnimal.getStrength());
assertEquals(10,defaultAnimal.getHealth());
    }

    @Test
    public void testParameterizedConstructor(){
        Animal a = new Animal("Goat", 20, 15);
        assertEquals("Goat", a.getType());
        assertEquals(20,a.getStrength());
        assertEquals(15,a.getHealth());
        Animal a2 = new Animal("Fish", -10, -5);
        assertEquals("Fish", a2.getType());
        assertEquals(1,a2.getStrength());
        assertEquals(0,a2.getHealth());
    }
 @Test
    public void testSetType(){
a.setType("Gorilla");
assertEquals("Gorilla", a.getType());
 }

 @Test
    public void testSetStrength(){
a.setStrength((1));
assertEquals(1,a.getStrength());
 }
}
