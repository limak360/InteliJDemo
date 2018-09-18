public class Amphibian {

    Amphibian(){
        System.out.println("jestem płazem konstruktorem");
    }

    void nic(){
        System.out.println("nic nie robie void");
    }
    static void gin() { }
}

class Frog extends Amphibian{

    void nic(){
        System.out.println("nic  void");
    }
    static void gin() { }

    public static void  main(String[] args){

        Amphibian zaba = new Frog();
        zaba.nic();
        zaba.gin();

    }
}
