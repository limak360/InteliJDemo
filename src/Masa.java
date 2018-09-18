public class Masa {
    static int i=4;
    Masa(){
        System.out.println("laduje klase");
    }
}

class Jak  {
    Jak(){}
    public static void main(String[] args){
        Masa f=new Masa();
        Masa c= new Masa();
    }
}
