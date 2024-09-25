package conjuntos_slides;

import java.util.*;

public class Conjunto1 {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Dois");
        conjunto.add("Tres");
        conjunto.add("Um");
        conjunto.add("Um");
        
        System.out.println("Tamanho do conjunto: " + conjunto.size());
        
        for (String num : conjunto) {
            System.out.println(num);
        }
        
        System.out.println(conjunto.contains("Cinco"));
    }
}
