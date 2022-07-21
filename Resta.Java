public class Resta extends Operaciones
{
//Atributos
private double numero1;
private double numero2;

//Constructor
public Resta(double n1, double n2)
{
    numero1 = n1;
    numero2  = n2;

}

//Metodo acceso
public void setNumero1(double n1)
{
    this.numero1 = n1;


}

public double getNumero1()
{
    return numero1;

}

public void setNumero2(double n2)
{
    this.numero2 = n2;

}

public double getNumero2()
{
    return numero2 ;

}
//metodo abstracto sobreescrito
@override
public double calcularArea()
{
    return numero1 - numero2
}
}