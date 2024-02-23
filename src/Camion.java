/**
 * Clase Camion que implementa la interfaz IComun.
 */
public class Camion implements IComun {

    /**
     * Método que muestra el coste total del producto.
     *
     * @param cp Código postal.
     *           return Float
     */
    @Override
    public float costeTotal(int cp) {
        // Supongamos que el coste base por envío en camión es de $50 y se añade $1 por kilómetro
        float costeBase = 50.0f;
        float costePorKilometro = 1.0f;
        int distanciaKilometros = obtenerDistancia(cp); // Supongamos que esta función devuelve la distancia hasta el destino en kilómetros
        return costeBase + (costePorKilometro * distanciaKilometros);
    }

    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        // Supongamos que para un camión se requiere un embalaje robusto como una caja de madera para artículos grandes y pesados
        if (peso > 20 || x > 50 || y > 50 || z > 50) {
            return 2; // Caja de madera
        } else {
            return 1; // Envoltorio cartón
        }
    }

    /**
     * Método que muestra la distancia real basada en el código postal
     * @param cp Código postal
     * @return Integer
     */
    private int obtenerDistancia(int cp) {
        // Supongamos que aquí se implementa la lógica para obtener la distancia hasta el destino
        // basada en el código postal
        // Por simplicidad, retornamos un valor fijo
        return 100; // 100 km de distancia
    }
}
