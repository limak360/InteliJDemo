import Note.*;

import java.util.Random;

class Instrument{
    void play(Note n){
        System.out.println("Instrument.play()"+ n);
    }
    public String toString(){
       return "Instrument";
    }
}
class Wind extends Instrument{
    void play(Note n){
        System.out.println("Wind.play()"+ n);
    }
    public String toString(){
        return "wind";
    }
}
class Percussion extends Instrument{
    void play(Note n){
        System.out.println("Percussion.play()"+ n);
    }
    public String toString(){
        return "percussion";
    }
}
class Stringed extends Instrument{
    void play(Note n){
        System.out.println("Stringed.play()"+ n);
    }
    public String toString(){
        return "stringed";
    }
}
class Brass extends Wind{
    void play(Note n){
        System.out.println("Brass.play()"+ n);
    }
}
class Woodwind extends Wind{
    void play(Note n){
        System.out.println("Woodwind.play()"+ n);
    }
    public String toString(){
        return "woodwind";
    }
}
class RandomInstrumentsGenerator{
    private Random rand = new Random(); //losowanie
    public Instrument next() {
        switch (rand.nextInt(5)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Brass();
            case 4:
                return new Woodwind();

        }
    }
}

public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e){
        for (int i=0;i<e.length;i++)
            tune(e[i]);
    }
    public static void main(String[] args){
        Instrument[] orchestra={
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
       // tuneAll(orchestra);
//        for (int i=0;i<orchestra.length;i++)
//            System.out.println(orchestra[i]);
        RandomInstrumentsGenerator randobj = new RandomInstrumentsGenerator();
        for (int i=0;i<orchestra.length;i++)
            System.out.println(randobj.next());
    }
}
