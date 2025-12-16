//polymorphism type 1 is method overloading

class A {

void add()
{
int a=30,b=20,c;
c=a+b;
System.out.println(c);
}  
void add ( int x, double y)
{
double c;
c=x+y;
System.out.println(c);
}  
void add( int y, int x)
{
    int c;
    c=x+y;
    System.out.println(c);
}
public static void main(String[] args) {
    A r=new A();
    r.add();r.add( 5,6);r.add(3,6.4);
}
}