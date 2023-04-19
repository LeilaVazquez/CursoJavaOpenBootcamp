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
    }
}

