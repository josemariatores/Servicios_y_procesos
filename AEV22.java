import java.util.ArrayList;
import java.util.Scanner;

public class AEV22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("pepe")  ;
        nombres.add("juan")  ;
        nombres.add("alberto")  ;
        nombres.add("pedro") ;
        nombres.add("jorge")  ;
        nombres.add("jose") ;
        nombres.add("benito")  ;
        nombres.add("sergio")  ;
        nombres.add("empar") ;
        nombres.add("selena") ;

        for( String nombre: nombres){
            System.out.println(nombre);
        }
    }
}
