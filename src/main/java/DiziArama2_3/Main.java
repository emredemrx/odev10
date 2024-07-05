package DiziArama2_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {55, 28, 45, 41, 33, 3, 9};
        int aranan = 3;
        System.out.println(arama(dizi,aranan));
        int aranan2 = 66;
        System.out.println(arama(dizi,aranan2));
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
