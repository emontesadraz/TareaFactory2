import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FactoryTest {
    @Test
    @DisplayName("Comprueba que el objeto es del tipo de la clase que debe ser")
    public void getProductoTest(){
        IComun camion = Factory.getProducto(1);
        IComun bicicleta = Factory.getProducto(2);
        IComun camion2 = Factory.getProducto(3);
        IComun nulo = Factory.getProducto(4);

        assertEquals(camion.getClass(), Camion.class);
        assertEquals(bicicleta.getClass(), Bicicleta.class);
        assertEquals(camion2.getClass(), Camion.class);
        assertNull(nulo);
    }

}
