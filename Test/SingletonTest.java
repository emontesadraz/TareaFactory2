import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SingletonTest {
    @Test
    @DisplayName("Test SIngletone que comprueba que la instancia es único")
    public void testSingletonGetInstance(){
        Singleton pedroMaricon = Singleton.getInstance();
        Singleton estebanGod = Singleton.getInstance();
        assertEquals(pedroMaricon,estebanGod);
    }
}
