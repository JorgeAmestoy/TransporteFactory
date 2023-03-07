/**
 * @author Jorge Amestoy Sabucedo
 * version 06.03.2023
 */

public class Camion implements ITransportable {

    /**
     * Declaro variable literal de tipo de embalaje carton
     */
    public static final int CARTON = 0;
    /**
     * Declaro variable literal de tipo de embalaje palet
     */
    public static final int PALET = 1;
    /**
     * Declaro variable literal de tipo de embalaje madera
     */
    public static final int MADERA = 2;


    /**
     * Metodo que recibe un codigo postal y devuelve el coste total
     * @param codigoPostal
     * @return coste total
     */
    @Override
    public Float costeTotal(Integer codigoPostal) {
        Float precio;
        if (codigoPostal < codigoPostal1) {

            precio = 100.99F;
            ;
        } else {
            precio = 250.65F;
        }

        return precio;
    }

    /**
     * Metodo que recibe las dimensiones del paquete y que devuelve el tipo de embalaje
     * @param dimX longitud del paquete
     * @param dimY altura del paquete
     * @param dimZ anchura del paquete
     * @param peso peso del paquete
     * @return valor del tipo de embalaje
     */
    @Override
    public Integer tipoEmbalaje(Float dimX, Float dimY, Float dimZ, Float peso) {
        int res;
        Float dim = (dimX * dimY * dimZ);
        if (dim < 50000 && peso < 25) {
            System.out.println("El tipo de embalaje es: Palet");
            return 0;


        } else if (dim > 50000 && dim < 150000 && peso > 25 && peso < 50) {
            System.out.println("El tipo de embalaje es: Carton");
            return 1;

        } else {
            System.out.println("El tipo de embalaje es: Madera");
            return 2;
        }

    }
}
