package DiziArama2_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};
        int aranan = 3;
        System.out.println(arama(dizi,aranan));

    }
    public static int arama(int[] dizi, int aranan){
        boolean bulunan = Arrays.stream(dizi).anyMatch(n -> n == aranan);
        if (bulunan == true){
            return aranan;
        }
        else{
            return -1;
        }
    }
}
