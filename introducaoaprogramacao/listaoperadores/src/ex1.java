package javaapplication5;

public class ex1 {

    public static void main(String[] args) {
        System.out.println("Ex1");
        System.out.println("5 + 3 * 6 / 2 >= 10");
        boolean b1 = 5+3*6/2 >= 10;
        if (b1==true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("36 / 3 * 2 – 5 +8 == 27");
        boolean b2 = 36/3*2-5+8 == 27;
        if (b2==true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("! (30 / 4 * 6 == 15)");
        boolean b3 = !(30/4*6 == 15);
        if (b3==true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("(30 % 4 * 6 == 12) || true");
        boolean b4 = (30%4*6 == 12) || true;
        if (b4==true){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("(5 * 7 % 3) + 4 / 2 + 5 == 12 && (12 / 4 < 8)");
        boolean b5 = (5*7%3)+4/2+5 == 12 && (12/4<8);
        if (b5==true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("(((5 * 7 % 3 + 5) / 2 + 5) <= 14) || (! (12 / 4 < 8 * 2))");
        boolean b6 = (((5*7%3+5)/2+5) <= 14) || (!(12/4<8*2));
        if (b6==true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }  
}

