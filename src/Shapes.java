import java.util.Random;

class Shape {
    void draw(){}
    void erase(){}
    void nowaMetoda(){
        System.out.println("wypisuje wiadomosc");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Circle.draw()");
    }
    void erase(){
        System.out.println("Circle.erase()");
    }
    void nowaMetoda(){
        System.out.println("wypisuje wiadomosc w Circle");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Square.draw()");
    }
    void erase(){
        System.out.println("Square.erase()");
    }
    void nowaMetoda(){
        System.out.println("wypisuje wiadomosc w Square");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("triangle.draw()");
    }
    void erase(){
        System.out.println("triangle.erase()");
    }
    void nowaMetoda(){
        System.out.println("wypisuje wiadomosc w Triangle");
        }
        }


class Quadrangle extends Shape{
    void draw(){
        System.out.println("quadr.draw()");
    }
    void erase(){
        System.out.println("quadr.erase()");
    }
    void nowaMetoda(){
        System.out.println("wypisuje wiadomosc w quadr");
    }
}

class RandomShapeGenerator{
    private Random rand = new Random(); //losowanie
    public Shape next() {
        switch (rand.nextInt(4)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 3:
                return new Quadrangle();
        }
    }
}

public class Shapes {
    private static RandomShapeGenerator gen=new RandomShapeGenerator();
    public static void main(String[] args){
        Shape[] s=new Shape[9];
        for(int i=0;i<s.length;i++)
            s[i]= gen.next();

      //  for(int i=0;i<s.length;i++)
        //    s[i].nowaMetoda();
    }
}
