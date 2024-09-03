package miPrincipal;

public class AppTriangulo {
    public static void menu() {
        System.out.println("*******************************************");
        System.out.println("          Operaciones con Triagulo  ");
        System.out.println("*******************************************");

        Punto p1 = new Punto(2,1);
        Punto p2 = new Punto(2,3);
        Punto p3 = new Punto(4,2);
        Triangulo t1 = new Triangulo(p1,p2,p3);
        double lados[]=t1.longitudes();
        System.out.println("Lado 1 ="+lados[0]);
        System.out.println("Lado 2 ="+lados[1]);
        System.out.println("Lado 3 ="+lados[2]);
    }
    
}
