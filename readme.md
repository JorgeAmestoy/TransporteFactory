# APLICACIÓN QUE CALCULE EL COSTE Y EL TIPO DE EMBALAJE SEGÚN EL TIPO DE TRANSPORTE UTILIZANDO EL FACTORY
<br>

**ITransportable<br>**
Declaro los métodos comunes que implementarán posteriormente las clases

```
    Float costeTotal(Integer codigoPostal);

    Integer tipoEmbalaje(Float dimX, Float dimY, Float dimZ, Float peso);
```
**Clase Bicicleta <br>**
Desarrolla los métodos de la Interfaz Transportable de acuerdo a las propias características de la clase



**Clase Camion<br>**
Desarrolla los distintos métodos de la Interfaz Transportable de acuerdo 
a las propias características de la clase

**Clase Barco<br>**
Desarrolla los distintos métodos de la Interfaz Transportable de acuerdo
a las propias características de la clase

**FactoriaTransportable<br>**
Fábrica encargada de devolver el transporte elegido con un menú (switch)

```
 public static ITransportable getProducto(int num) {

        switch (num) {

            case CAMION:
                return new Camion();//creo objeto con constructor vacio

            case BICICLETA:
                return new Bicicleta();
                
            case BARCO:
                 return new Barco();

            default:
                return null;


        }
 ```       
**Clase Main<br>**
Llamo a la factoría para crear los objetos y calcular el coste y el tipo de embalaje. 

```
 tran = FactoriaTransportable.getProducto(FactoriaTransportable.BARCO);
        System.out.println("El coste total es: " + tran.costeTotal(20000) + " euros");
        System.out.println(tran.tipoEmbalaje(90F, 100F, 50F, 60F));
```        

Me va a mostrar el resultado de los métodos implantados en la clase Barco:



<br>

**Diagrama de Clases:**
<br>



