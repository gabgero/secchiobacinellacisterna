import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ciao!");
        System.out.println("cosa vuoi fare? secchio da 1 litro, bacinella da 0,2 litri o cisterna da 1000 litri?");
        String scelta;

        scelta = input.nextLine();
        if (scelta.equals("secchio")) {
            double litri, capacità, litritot;

            litritot = 0;
            capacità = 1000;
            System.out.println("ok riempi il secchio fino a 1 litro (1000 ml)");
            while (litritot < capacità) {
                System.out.println("Inserisci litri");
                System.out.println(litritot);
                litri = input.nextDouble();
                litritot = litri + litritot;
            }
            if (litri == capacità) {
                System.out.println("hai riempito al 100%!");
            } else {
                System.out.println("hai riempito troppo");
                System.out.println(litritot);
            }
        } else {
            if (scelta.equals("bacinella")) {
                double litri, capacità, litritot;

                litritot = 0;
                capacità = 200;
                System.out.println("ok riempi la bacinella fino a 0,2 litri (200 ml)");
                while (litritot < capacità) {
                    System.out.println("Inserisci litri");
                    System.out.println(litritot);
                    litri = input.nextDouble();
                    litritot = litri + litritot;
                }
                if (litri == capacità) {
                    System.out.println("hai riempito al 100%!");
                } else {
                    System.out.println("hai riempito troppo");
                    System.out.println(litritot);
                }
            } else {
                double litri, capacità, litritot;

                litritot = 0;
                capacità = 1000000;
                System.out.println("ok riempi cisterna fino a 1000 litri (1000000 ml)");
                while (litritot < capacità) {
                    System.out.println("Inserisci litri");
                    System.out.println(litritot);
                    litri = input.nextDouble();
                    litritot = litri + litritot;
                }
                if (litri == capacità) {
                    System.out.println("hai riempito al 100%!");
                } else {
                    System.out.println("hai riempito troppo");
                    System.out.println(litritot);
                }
            }
        }
        System.out.println("digita fine");
        String fine;

        fine = input.nextLine();
    }
}
