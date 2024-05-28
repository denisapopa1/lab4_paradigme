import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nume;
    private String prenume;
    private String grupa;
    private List<Integer> note=new ArrayList<>();
    private double medie;
    private int restante;

    public Student(String nume,String prenume, String grupa) {
        this.nume = nume;
        this.prenume=prenume;
        this.grupa = grupa;
        this.note=new ArrayList<>();
        this.medie = calculeazaMedie();
        this.restante = calculeazaRestante();
    }

    public void adaugaNota(int nota){
        note.add(nota);
    }
    private int calculeazaRestante() {
        int restante=0;
        for(int nota:note){
            if(nota<5)
                restante++;
        }
        return restante;

    }

    private double calculeazaMedie(){
        int sum=0;
        for(int nota:note){
            sum=sum+nota;
        }
        return (double) sum/note.size();
    }

}
