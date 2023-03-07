public class FactoriaTransportable {
    /**
     * Declaro literal de camion
     */
    public static final int CAMION = 1;
    /**
     * Declaro literal de bicicleta
     */
    public static final int BICICLETA = 2;

    /**
     * Metodo que devuelve el tipo de transporte
     *
     * @param num opcion del switch del tipo de transporte a elegir
     * @return objeto del tipo de transporte elegido
     */
    public static ITransportable getProducto(int num) {

        switch (num) {

            case CAMION:
                return new Camion();//creo objeto con constructor vacio

            case BICICLETA:
                return new Bicicleta();

            default:
                return null;


        }


    }


}
