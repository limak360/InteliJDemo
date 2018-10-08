import interfejs.Pola;

public class PolaInterfejsuSaStatyczneiGlobalne implements Pola {
    int b=0;
    void zmieniam_pole(){
      //   pole+=3;   <- finalne
    }
    public static void main(String[] args){
        System.out.println(pole);
        PolaInterfejsuSaStatyczneiGlobalne kamil = new PolaInterfejsuSaStatyczneiGlobalne();
        kamil.zmieniam_pole();
    }
}
