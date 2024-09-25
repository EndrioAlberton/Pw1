package conjuntos_slides;

import java.util.LinkedHashSet;

public class Conjunto4 {
    public static void main(String[] args) {
        // criar dois conjuntos A e B
        LinkedHashSet<Integer> A = new LinkedHashSet<>();
        LinkedHashSet<Integer> B = new LinkedHashSet<>();

        // a = 1,2,3,4
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);

        // b = 4,5,6,7
        B.add(4);
        B.add(5);
        B.add(6);
        B.add(7);

        //A u B
        LinkedHashSet<Integer> uniao = new LinkedHashSet<>(A);
        uniao.addAll(B);

        //A n B
        LinkedHashSet<Integer> intersecacao = new LinkedHashSet<>(A);
        intersecacao.retainAll(B);

        //A - B 
        LinkedHashSet<Integer> diferencaAB = new LinkedHashSet<>(A);
        diferencaAB.removeAll(B);

        //B - A
        LinkedHashSet<Integer> diferencaBA = new LinkedHashSet<>(B);
        diferencaBA.removeAll(A);

        System.out.println("A u B: " + uniao);
        System.out.println("A n B: " + intersecacao);
        System.out.println("A - B: " + diferencaAB);
        System.out.println("B - A: " + diferencaBA);
    }
}