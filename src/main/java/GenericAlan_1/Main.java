package GenericAlan_1;

public class Main {
    public static void main(String[] args) {
        genericClass<Integer> intDeger = new genericClass<>(123);
        intDeger.ekranaYaz();

        genericClass<String> stringDeger = new genericClass<>("Emre Demir");
        stringDeger.ekranaYaz();

        genericClass<Double> doubleDeger = new genericClass<>(8.547);
        doubleDeger.ekranaYaz();
    }
}