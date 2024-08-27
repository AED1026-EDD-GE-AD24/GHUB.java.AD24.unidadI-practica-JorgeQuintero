public class Conjunto {
    public Conjunto(){
        static int M=20;
        Object cto[];
        private int cardinal;
        private int capacidad;

        public Conjunto(){
            cto = new Object(M);
            cardinal = 0;
            capacidad = M;
        }
        public boolean esVacio(){
            return(cardianl ==0);
        }
        //pertenece al conjunto 
        public boolean pertenece(Object elemento){
            int k =0;
            boolean encontrado = false;
            while (k<cardinal && !encontrado){
                encontrado = cto [k.equals(elemento)];
                k++;
            }
            return encontrado;
        }
    }
    //añada un elemento al conjunto si no estaen el conjunto
    public void añadir(Object elemento){
        if(!pertenece(elemento)){
            /*
             * verificar si hay posiciones libre
             * en caso contrario se amplia
             * el conjunto
             */
            if (cardinal == capacidad){
                Object nuevoCto[];
                nuevoCto = new Object[capacidad+M];
                for(int k=0;k<capacidad;k++){
                    nuevoCto [k] =cto[k];
                }
                capacidad +=M;
                cto = nuevoCto;
            }
            cto [cardinal] = elemento;
            cardinal ++;
        }
    }
    //quita el elemento del conjunto
    public void retirar(Object elemento){
        if(pertenece(elemento)){
            int k=0;
            while (!cto[k].equals(elemento)){
                k++;
            }
            /*
             * desde el elemento k hasta la ultima
             * posicion mover los elementos una posicion
             * a la izquierda
             */
            for(;k<cardinal;k++){
                cto[k]=cto[k+1];
            }
            cardinal--;
        }
    }
}