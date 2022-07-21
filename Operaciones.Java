public abstract class Operaciones
{

    //Atributos

    protected String nombre;

    
    //metodo contructor
    public Operaciones(String n)
    {
        nombre = n;
        
    }
    
    //Método abstracto

    public abstract double calcularDatos();

    public String toString()
    {
        return nombre " datos" + " = " + calcularDatos();
    }
}