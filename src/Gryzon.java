public abstract class Gryzon {
 abstract  void kimJest();
   abstract void CoRobi();
}
class Mysz extends Gryzon{
    void kimJest(){
        System.out.println("Mysz");
    }
    void CoRobi(){
        System.out.println("myszuje");
    }
}
class Chomik extends Gryzon{
    void kimJest(){
        System.out.println("Chomik");
    }
    void CoRobi(){
        System.out.println("chomikuje");
    }
}
class SwinkaMorska extends Gryzon{
    void kimJest(){
        System.out.println("SwinkaMorska");
    }
    void CoRobi(){
        System.out.println("swini");
    }
}
class Gryzonie{
    public static void main(String[] args){
        Gryzon[] tabGryz ={
             new Mysz(),
             new Chomik(),
             new SwinkaMorska()
        };
        for(int i=0;i<tabGryz.length;i++){
            tabGryz[i].kimJest();
            tabGryz[i].CoRobi();
        }
    }
}




