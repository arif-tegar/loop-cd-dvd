import java.util.Scanner;
    //Driver Class
    public class Tester {
        public static void main(String [] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Berapa objek yang dibuat? (Max: 20)");
            int jumlah = in.nextInt();
            System.out.println("CD atau DVD?");
            String pilihan = in.next();
    
            //Kondisi
            if (pilihan.equals("CD")) {
                CD c1 = new CD();
                c1.print();
            } else if (pilihan.equals("DVD")){
                DVD d1 = new DVD();
                d1.print();
            } else {
                System.out.println("Input Salah.");
            }
    
    
    
    
            in.close();
        }
    }
    

