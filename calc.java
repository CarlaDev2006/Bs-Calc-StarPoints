
import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static int puntos = 0;
   public static Scanner in = new Scanner(System.in);
   public static int aux;
   
   public static void main(String args[])
   {
     
     System.out.println("Bs Calc");
     cuenta(70 , 550);
     cuenta(120 , 600);
     cuenta(160 , 650);
     cuenta(200 , 700);
     cuenta(220 , 750);
     cuenta(240 , 800);
     cuenta(260 , 850);
     System.out.println("puntos totales: " + puntos);
   }
   
   private static void cuenta(int p, int min){
     System.out.println("cuantos brawlers tienes entre");
     System.out.println(""+min + " y " + (min+49));
     aux = in.nextInt();
     puntos += (p * aux);
   }
 }
