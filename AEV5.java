
public class AEV5{
   
    public static void main(String[] args) {
   int[] lista = {1,4,6,7,3,12,3,5,6,7,8,1};
        int numero,pos;
numero = lista[0];
pos = 0;

for(int x=1; x<lista.length;x++){
    if(lista[x]> numero){
        numero = lista[x];
        pos = x;
    }
}

System.out.println("el numero mayor es" + numero);
System.out.println("la posicion es" + pos);
            
        }

    }
