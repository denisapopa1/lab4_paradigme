import java.util.*;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>(); //a
        Set<Integer> zSet = new TreeSet<>(); //b
        List<Integer> xMinusY = new ArrayList<>();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>(); //d

        int numarElementeX = 5;
        int numarElementeY = 7;
      /*  java.util.Random rand = new java.util.Random();
        for (int i = 0; i < numarElementeX; i++) {
            x.add(rand.nextInt(11)); 
        }
        for (int i = 0; i < numarElementeY; i++) {
         */
        Collections.sort(x);
        Collections.sort(y);


        System.out.println("x: " + x);
        System.out.println("y: " + y);
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        System.out.println("xPlusY: "+xPlusY);
        x.retainAll(y);
        zSet.addAll(x);
        System.out.println("zSet:"+zSet);
        xPlusY.removeAll(y);
        xMinusY.addAll(xPlusY);
        System.out.println("xMinusY: "+xMinusY);
        xPlusYLimitedByP.addAll(xPlusY);
        xPlusYLimitedByP.removeIf(num->num>4);
        System.out.println("xPlusYLimitedByP: "+xPlusYLimitedByP);
        List<Student>studenti=new ArrayList<>();
        Random rand=new Random();
        for(int i=0;i<10;i++){
            Student student=new Student("Nume:"+i,"Prenume"+i,"Grupa"+i);
        }
        for
    }
}

        



