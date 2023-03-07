public class Bicicleta implements ITransportable {
    /**
     * Declaro literal de tipo de embalaje palet
     */
    public static final int PALET = 0;
    /**
     * Declaro literal de tipo de embalaje madera
     */
    public static final int MADERA = 1;
    /**
     * Declaro literal de tipo de embalaje carton
     */
    public static final int CARTON = 2;


    /**
     * Metodo que recibe un codigo postal y devuelve el coste total
     * @param codigoPostal recibe un codigo postal
     * @return coste total
     */
    @Override
    public Float costeTotal(Integer codigoPostal) {
        Float res;
        if (codigoPostal < codigoPostal1) {

            res = 30.0F;
            ;
        } else {
            res = 60.0F;
        }

        return res;
    }

    /**
     * Metodo que recibe las dimensiones del paquete y que devuelve el tipo de embalaje
     * @param dimX longitud paquete
     * @param dimY altura del paquete
     * @param dimZ anchura del paquete
     * @param peso peso del paquete
     * @return valor del tipo de embalaje
     */
    @Override
    public Integer tipoEmbalaje(Float dimX, Float dimY, Float dimZ, Float peso) {
        int res;
        Float dim = (dimX * dimY * dimZ);
        if (dim < 500 && peso < 5) {
            System.out.println("El tipo de embalaje es: Palet");
            return 0;

        } else if (dim > 500 && dim < 5000 && peso > 10) {
            System.out.println("El tipo de embalaje es: Carton");
            return 1;

        } else {
            System.out.println("El tipo de embalaje es: Madera");
            return 2;
        }

    }
}
