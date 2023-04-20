public class Main {
public static class Coche{
    int puertas = 4;
    void masPuertas(){
        this.puertas++;
    }
    void mostrar()
    {
        System.out.println(puertas);
    }
}

public static void Ej2(){

    int numero = 1;

    if (numero > 0)
        System.out.println("Es positivo");
    else if ( numero < 0 )
        System.out.println("Es negativo");
    else
        System.out.println("Es cero");

    while (numero < 3){
        numero++;
        System.out.println(numero);
    }

    do {
        numero++;
        System.out.println(numero);
    }while(numero <3);

    for(int i =0; i<= 3; i++){
        System.out.println(i);
    }
    var estacion ="otoño";

    switch(estacion) {
        case "otoño":
                System.out.println("Es otoño");
            break;
        case "invierno":
                System.out.println("Es invierno");
        case "primavera":
                System.out.println("Es primavera");
        case "verano":
                System.out.println("Es verano");
        default:
           System.out.println("No es una estación");
    }
}
public static int suma(int a, int b, int c)
{
    return a + b + c;
}
    public static void main(String[] args) {
        int total;
        int a= 4, b=5, c=6;

        total = suma(a,b,c);

        System.out.println(total);
        Coche miCoche = new Coche();
        miCoche.masPuertas();
        miCoche.mostrar();

        Ej2();

    }
}

//•	Por último, para el Switch, deberás crear la variable estacion, y distintos case para las
// cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje
// por consola informando de la estación en la que está. También habrá que poner un default para cuando
// el valor de la variable no sea una estación.

