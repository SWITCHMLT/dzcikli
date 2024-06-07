//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void evenMy(int a){
        if (a%2==0){System.out.println (a);}
    }

    public static void strokMy( int st){
       for (int i=1; i<=st; i++){
           System.out.println ("Test"+i);
       }
    }

    public static void kratFive( int num){
        for (int i=1; i<=num; i++){

            if (i%5==0)
            {System.out.print (i+" ");}
        }
        System.out.println (" ");
    }

    public static void srAr(int a, int b, int c){
        double sredAr = (double) (a + b + c) /3;
        System.out.println (sredAr);
    }

    public static void main( String[] args ) {

Main.evenMy(8);
        System.out.println ("-------------");
Main.strokMy (5);
        System.out.println ("-------------");
Main.kratFive (50);
        System.out.println ("-------------");
Main.srAr (3,3,3);
        }
    }
