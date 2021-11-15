public class Retangle{
    int length = 0;
    int width = 0;
    
   //Overloading Constructors
    public Retangle(){
    }
    public Retangle(int length, int width){
        this.length = length>0?length:0;
        this.width = width;
    }
    @Override
    public String toString(){
        return "[" + length + ", " + width+"]";
    }
    public int area() {
        return length * width;
    }
}

    class Box extends Retangle{
        int height;
        public Box(){}
        public Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
        }
        
        public String toString(){
            return "[" + length+", " + width + ", "+height+"]";
        }
        public int area(){
            return 2*(length+width)*height + 2*length*width;
        }
    }
class UsingRect extends Object{
    public static void main(String[] args) {
        Retangle rect = new Retangle();
        Box b = new Box();
        if(rect instanceof Retangle) 
            System.out.println("True");
            else System.out.println("False");      
        System.out.println(b instanceof Box? "True":"False") ;
        System.out.println(b instanceof Retangle? "True":"False") ;
        System.out.println(rect instanceof Box? "True":"False") ;
    }
}