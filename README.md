# Clases Abstractas

Una clase abstracta puede proporcionar la implementación de una interfaz. Una interfaz no puede proporcionar la implementación de una clase abstracta. Puede tener métodos con implementaciones. Proporciona una abstracción absoluta y no puede tener implementaciones de métodos.

## Relacion con la vida cotidiana.

Podemos pensar en las clases abstractas como anotaciones, como una especie de lista de compras. En la vida real, tendemos a tomar notas breves de las tareas que estamos tratando, sin describir en detalle o cómo realizar cada tarea. Se trata de no olvidar nada y evitar repetir errores o repetirlos organizando nuestro tiempo.

Por lo tanto, en programación, una clase abstracta actúa como una clase para declarar la existencia de métodos en lugar de su implementación. Esto es lo que haremos más adelante en diferentes subclases derivadas de la clase abstracta. Las clases abstractas pueden contener métodos no abstractos, pero al menos uno de los métodos debe ser abstract.



     public abstract class Producto 
      {
     private int precio;

     public Producto(int precio) 
     {
     this.precio = precio;
     }

     public int getPrecio()
     {
     return this.precio;
     }

     
    public abstract void getName();
    }   

    public class Banana extends Producto{

    public Banana(){
      super(200);
    }

    @Override 
    public String getName(){
     return "banana";
    }
    }