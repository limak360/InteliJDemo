class Insect{
    private int i=9;
    protected int j;
    Insect(){
        System.out.println("i="+i+", j="+j);
        j=39;
    }
    static int print(String s){
        System.out.println(s);
        return 47;
    }
}

class Zuk extends  Beetle{
    private int k;
    public Zuk(){
        System.out.println("k="+k);
        System.out.println("k="+j);
    }
    public static void main(String[] args){
        System.out.println("konstruktor klasy Zuk");
        Zuk ee= new Zuk();
    }
}

public class Beetle extends Insect{
    private int k;
   public Beetle(){
       System.out.println("k="+k);
       System.out.println("k="+j);
   }
//   public static void main(String[] args){
//       System.out.println("konstruktor klasy beetle");
//        Beetle b= new Beetle();
//   }
}
