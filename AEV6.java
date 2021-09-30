import java.util.Scanner;
import javax.swing.JOptionPane;


public class AEV6 {

    public static void main(String[] args) {
        int nums[] = new int[5];
        int total = 0;
        Scanner sc=new Scanner(System.in);
        for (int z=0; z<nums.length; z++);
        {
            System.out.println("Introduzca los numeros");
            nums[ z ]=sc.nextInt();// no detecta la z como variable para almacenar los numeros
        }
        System.out.println("Los numeros en orden inverso:");//mostramos en orden inverso
        int x = 4;
        while(x>0)
        {
            System.out.println(nums[x]);
            x--;
        }
        for(int s = 0;s<nums.length; s++){
            total = nums[s]; 
        }
        System.out.println("tu suma es igual a" + total);
    }
}