public class Suma extends Operaciones
{
//Atributos
private double numero1;
private double numero2;
private double numero3;

//Constructor
public Suma(double n1, double n2, double n3)
{
    numero1 = n1;
    numero2  = n2;
    numero3 = n3;

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


public void setNumero3(double n3)
{
    this.numero3 = n3;


}

public double getNumero3()
{
    return numero3;

}
//metodo abstracto sobreescrito
@override
public double calcularArea()
{
    return numero1 + numero2 + numero3
}
}