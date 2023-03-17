public class Main {


    static ITransportable tran;

    public static void main(String[] args) {


        tran = FactoriaTransportable.getProducto(FactoriaTransportable.BICICLETA);
        System.out.println("El coste total es: " + tran.costeTotal(20000) + " euros");
        System.out.println(tran.tipoEmbalaje(10F, 3F, 10F, 4F));


        tran = FactoriaTransportable.getProducto(FactoriaTransportable.CAMION);
        System.out.println("El coste total es: " + tran.costeTotal(20000) + " euros");
        System.out.println(tran.tipoEmbalaje(50F, 50F, 50F, 40F));

        tran = FactoriaTransportable.getProducto(FactoriaTransportable.BARCO);
        System.out.println("El coste total es: " + tran.costeTotal(20000) + " euros");
        System.out.println(tran.tipoEmbalaje(90F, 100F, 50F, 60F));


    }
}