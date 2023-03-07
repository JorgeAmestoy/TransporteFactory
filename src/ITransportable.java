public interface ITransportable {
    /**
     * Metodo abstracto para saber el coste total enviando codigo postal
     * @param codigoPostal recibe un codigo postal
     * @return el coste total
     */
    Float costeTotal(Integer codigoPostal);

    /**
     * Metodo abstracto para saber el tipo de embalaje enviando dimensiones y peso
     * @param dimX longitud del paquete
     * @param dimY altura del paquete
     * @param dimZ anchura del paquete
     * @param peso peso del paquete
     * @return el tipo de embalaje en Integer
     */
    Integer tipoEmbalaje(Float dimX, Float dimY, Float dimZ, Float peso);

    /**
     * Declaro constante de codigo postal 1
     */
    int codigoPostal1 = 25000;


}
