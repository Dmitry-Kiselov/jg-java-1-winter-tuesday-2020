package l7;

import java.util.Arrays;

public class Muroveynik {

    public static void main(String[] args) {

        Murovey vasya = new Murovey("Vasya");
        Murovey lena = new Murovey("Lena");
        Murovey gena = new Murovey("Gena");
        Murovey sigizmond = new Murovey("Sigizmond");

        Murovey[] muroveys = new Murovey[10];
        muroveys[0] = vasya;
        muroveys[1] = lena;
        muroveys[2] = gena;
        muroveys[3] = sigizmond;
        muroveys[8] = new Murovey("Konstantin"); //oof

        System.out.println(Arrays.toString(muroveys));

        System.out.println(muroveys[8]);

//        muroveys[11] = new Murovey("John");

        int[] a = new int[0];
        System.out.println("a = " + Arrays.toString(a));



    }

}
