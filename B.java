 class B {
    void add()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void add( int x,int y)
    {

        int c;
        c=x+y;
        System.out.println(c);
        
    }
    void add(  double y ,int x)
    {
        double c;
        c=x+y;
        System.out.println(c);
    }

public static void main(String[] args) {
    B r=new B();
    r.add();
    r.add( 12 ,20);
    r.add(15.1,200);
}
    
}
