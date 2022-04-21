package SEMANA1;
/*
Introducción
* Clase: Conjunto de objetos con características similares que se identifican por nombre, atributos y una serie de funciones o mtodos aplicables a todo el conjunto. Es una plantilla para caracterizar o definir objetos.
* Abstracción: Es la facultad intiuitiva del ser humano que le permite conocer la escencia de las cosas.
* Modularidad: Es un proceso mental que permite distinguir los componentes de los objetos que estan siendo estudiados.
* Encapsulamiento: Permite ocultar las características no relevantes de una clase, destacar las relevantes y modelar su comportamiento. Dando como resultado la Abstracción de Datos.
* Herencia: Relación entre clases cuya existencia depende de un ancestro, la clase base delega sus atributos y métodos a las clases derivadas.
* Polimorfismo: Es el conjunto de operaciones aplicables a un objeto por medio de los mensajes que invocan a alguno de los métodos definidos en la clase a la que pertenece el objeto de acuerdo al dominio de la aplicación (Contexto).
* Objeto: Es una entidad real o imaginaria que tiene identidad, estado y un comportamiento, conforme al conjunto de objetos (clase) a la que pertenece. Es una instancia de una clase.
Un objeto launchx es una instancia de una clase Innovaccion.
    Innovaccion launchx = new Innovaccion();
Una clase en java contiene lo siguiente:
* Campos
* Métodos
* Constructores
* Bloques
* Clases anidadas e interfaces
  class <class_name> {
  field;
  method;
  }
Variables de instancia
    Innovaccion launchx = new Innovaccion();
 */
public class TestBiciclea {
    public static void main(String[] args) {
        def();
    }
    public static void def(){
        bicicleta biciMountain = new bicicleta();
        biciMountain.setColor("Blanco");
        biciMountain.setPins(6);
        biciMountain.setRodada(6);
        biciMountain.setVelocidad(13.2);
        String msg = "Soy uan bici de montaña con estas caracteristicas: ";
        msg += "\nColor: "+biciMountain.getColor();
        msg += "\nVelocidad: "+biciMountain.getVelocidad();
        msg += "\nPins: "+biciMountain.getPins();
        msg += "\nRodada: "+biciMountain.getRodada();
        System.out.println(msg);
    }
    public static void show(){

    }

}
