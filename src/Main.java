public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //losowanie liczb do tablicy 6 elementowej
        /*
        tablica musi mieć  zdefinowanyrozmiar,
        którego potem nie może przechowywać typy proste i złożone

         */
        int[] tablicaLiczbLosowych = new int[6];
        for (int i = 0; i < tablicaLiczbLosowych.length ; i++) {
            tablicaLiczbLosowych[i] = (int) (Math.random()*100+1);

        }

        System.out.println("WYlosowana Liczba");
        for (int element:tablicaLiczbLosowych) {

            System.out.println(element+", ");
        }
    }
}