package _3_inheritance;
/*problem 1) Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle
and Square. Use Quadrilateral as the super class of the hierarchy. Specify the instance
variables and methods for each class. The private instance variables of Quadrilateral should
be the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that
instantiates objects of your classes and outputs each object's area (except Quadrilateral).
*/

class Quadrilateral{
      int x1,x2,x3,x4,y1,y2,y3,y4;
      void setCoordinate(int a,int b,int c,int d,int e,int f,int g, int h){
        x1=a; x2=b; x3=c; x4=d; y1=e; y2=f; y3=g; y4=h;
    }
}
class Trapezoid extends Quadrilateral{
    private int height;
    Trapezoid(int a,int b,int c,int d,int e,int f,int g, int h,int height){
        setCoordinate(a,b,c,d,e,f,g,h);
        this.height=height;
    }
    int area(){
    int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    int d2=(int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
    return (int)((d1+d2)*height)/2;
    }
}
class Parallelogram extends Quadrilateral{
    private int height;
    Parallelogram(int a,int b,int c,int d,int e,int f,int g, int h,int height){
        setCoordinate(a,b,c,d,e,f,g,h);
        this.height=height;
    }
    int area(){
        int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return (int)d1*height;
    }
}
class Rectangle extends Quadrilateral{
//    private int height;
    Rectangle(int a,int b,int c,int d,int e,int f,int g, int h){
        setCoordinate(a,b,c,d,e,f,g,h);
    }
    int area(){
        int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        int d2=(int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
        return d1*d2;
    }
}
class Square extends Quadrilateral{
//    private int height;
    Square(int a,int b,int c,int d,int e,int f,int g, int h){
        setCoordinate(a,b,c,d,e,f,g,h);
    }
    int area(){
        int d=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d*d;
    }
}


public class Problem1 {
    public static void main(String[] args) {
        Square sq = new Square(40,10,30,10,50,10,40,20);
        System.out.println("Area of the Square is "+sq.area());
        Rectangle rec = new Rectangle(40,10,30,10,30,20,40,20);
        System.out.println("Area of the Rectangle is "+rec.area());
        Parallelogram p = new Parallelogram(20,10,30,10,20,20,0,20,8);
        System.out.println("Area of the Parallelogram is "+p.area());
        Trapezoid t = new Trapezoid(20,10,30,10,40,20,0,20,8);
        System.out.println("Area of the Trapezoid is "+t.area());

    }
}

/*
 OUTPUT:
 ---------
Area of the Square is 2500
Area of the Rectangle is 961
Area of the Parallelogram is 80
Area of the Trapezoid is 200
 */