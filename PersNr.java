package Uppgifter;
import java.util.Scanner;

public class PersNr {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ange ditt personnummer: ");
        
        String pnr = input.nextLine();
        char[] persnr = pnr.toCharArray();
        
        if (persnr.length < 10 || persnr.length > 10) {
            System.out.println("Felaktigt personnummer, format: ÅÅMMDDXXXX");
        }else {
            //Gör om char-värdena till räknebara int-värden
            int Y1 = Integer.parseInt(String.valueOf(persnr[0]));
            int Y2 = Integer.parseInt(String.valueOf(persnr[1]));
            int Y3 = Integer.parseInt(String.valueOf(persnr[2]));
            int Y4 = Integer.parseInt(String.valueOf(persnr[3]));
            int Y5 = Integer.parseInt(String.valueOf(persnr[4]));
            int Y6 = Integer.parseInt(String.valueOf(persnr[5]));
            int Y7 = Integer.parseInt(String.valueOf(persnr[6]));
            int Y8 = Integer.parseInt(String.valueOf(persnr[7]));
            int Y9 = Integer.parseInt(String.valueOf(persnr[8]));
            int Y10 = Integer.parseInt(String.valueOf(persnr[9]));
            
            int Y1_2 = Y1*2;
            int Y3_2 = Y3*2;
            int Y5_2 = Y5*2;
            int Y7_2 = Y7*2;
            int Y9_2 = Y9*2;
            int Y10_2 = Y10*2;
            
            if (Y1_2 > 9) {
            
                String[] split = Y1_2.toCharArray();
            }
        }
    }
}


/* package Examinationsuppgifter;
import java.util.Scanner;

public class Test {
        public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv in personnummer. Tio siffror: ");
        
        String pnr = input.nextLine();
       
        char[] charsPnr = pnr.toCharArray();
        
        if (charsPnr.length < 10 || charsPnr.length > 10){
            System.out.println("Fel format: ÅÅMMDDXXXX");
            
        }else{
            
            int one = Integer.parseInt(String.valueOf(charsPnr[0]));
            int two = Integer.parseInt(String.valueOf(charsPnr[2]));
            int three = Integer.parseInt(String.valueOf(charsPnr[4]));
            int four = Integer.parseInt(String.valueOf(charsPnr[6]));
            int five = Integer.parseInt(String.valueOf(charsPnr[8]));
            
            int one1 = one*2;
            int two2 = two*2;
            int three3 = three*2;
            int four4 = four*2;
            int five5 = five*2;
            
            
            System.out.println(one1);
            System.out.println(two2);
            System.out.println(three3);
            System.out.println(four4);
            System.out.println(five5);

            
            
        }
    }
    
}

*/