package day15arraylists;

import java.util.*;

public class karakterKacKezKullanilmis {
    public static void main(String[] args) {


        String str = "Lutfen bir String giriniz";

        List<String>list = new ArrayList<>(List.of(str.split("")));

        Collections.sort(list);
        System.out.println(list);

        int counter = 0;

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i-1).equals(list.get(i))) {
                counter++;

            } else {
                System.out.println(list.get(i-1) + " karakter sayisi " + (counter + 1));
                counter = 0;
            }
            if (i == list.size() - 1 ) {
                System.out.println(list.get(i) + " karakter sayisi " + (counter + 1));
            }
        }
    }
}
