/**
 * @version 1.0, 23/02/2024
 * @autor emontesadraz
 */
public class Main {
    public static void main(String[] args) {
        Camion c = new Camion();
        Bicicleta b = new Bicicleta();

        int codigoPostal = 12345;
        float costeCamion = c.costeTotal(codigoPostal);
        int embalajeCamion = c.tipoEmbalaje(60.0f, 60.0f, 60.0f, 30.0f);
        float costeBicicleta = b.costeTotal(codigoPostal);
        int embalajeBicicleta = b.tipoEmbalaje(30.0f, 30.0f, 30.0f, 5.0f);

        System.out.println("Coste total para envío en camión: $" + costeCamion);
        System.out.println("Tipo de embalaje para envío en camión: " + obtenerTipoEmbalaje(embalajeCamion));
        System.out.println("Coste total para envío en bicicleta: $" + costeBicicleta);
        System.out.println("Tipo de embalaje para envío en bicicleta: " + obtenerTipoEmbalaje(embalajeBicicleta));
    }

    private static String obtenerTipoEmbalaje(int tipo) {
        switch (tipo) {
            case 0:
                return "Palet";
            case 1:
                return "Envoltorio cartón";
            case 2:
                return "Caja de madera";
            default:
                return "Desconocido";
        }
    }

}