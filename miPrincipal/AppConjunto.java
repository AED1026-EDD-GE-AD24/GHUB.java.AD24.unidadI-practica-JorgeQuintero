package miPrincipal;
public class AppConjunto{
    public static void menu(){
        System.out.println("\n=====================================");
        System.out.println(" Operaciones con Conjuntos ");
        System.out.println("=====================================");
        Conjunto A = new Conjunto();
        if(A.esVacio()){
            System.out.println("El conjunto A esta vacio");
        }
        else{
            System.out.println("El conjunto A NO esta vacio");
        }
        //Añadir elementos al conjunto
        A.añadir(4);
        A.añadir(7);
        A.añadir(2);
        A.añadir(5);
        A.añadir(4);
        System.out.println("Cantidad de elementos del conjunto A="+A.getCardinal());
        if(A.esVacio()){
            System.out.println("El conjunto A esta vacio");
        }
        else{
            System.out.println("El conjunto A NO esta vacio");
        }
        //Crear otro conjunto
        Conjunto B = new Conjunto();
        //Añadir elementos al conjunto B
        B.añadir(0);
        B.añadir(10);
        B.añadir(20);
        B.añadir(4);
        B.añadir(7);
        System.out.println("Cantidad de elementos del conjunto B="+B.getCardinal());
        Conjunto C = A.union(B);
        System.out.println("Cantidad de elementos del conjunto A="+A.getCardinal());
        System.out.println("Cantidad de elementos del conjunto B="+B.getCardinal());
        System.out.println("Cantidad de elementos del conjunto C="+C.getCardinal());
        C.retirar(10);
        System.out.println("Cantidad de elementos del conjunto C="+C.getCardinal());
        C.retirar(10);
        System.out.println("Cantidad de elementos del conjunto C="+C.getCardinal());

    }
}