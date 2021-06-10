import java.util.*;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int n,mul6=0,sinter=0,suma=0;
        float s=0,i=0;
        do{
           System.out.println("Ingresar numero");
           n=scanner.nextInt();
           if (n % 6 == 0){
              mul6++; 
           }
           if(n<=10 && n>=1){
              sinter+=n;
           }
           suma+=n;
        }while(suma>=1000);
        System.out.println("suma: "+suma);
    }
}