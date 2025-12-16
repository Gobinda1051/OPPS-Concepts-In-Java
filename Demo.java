// type 2 of poltmorphism  Overriding

class square {
   void draw()
   {
    System.out.println("Can't shape of square");

   }
}
class shape extends square
{
    @Override

    void draw()
    {
        super.draw();
System.out.println("shape of Square");
    }
}
 class Demo {
    public static void main(String[] args) {
       square r=new shape();
       r.draw(); 
    }

    
}
