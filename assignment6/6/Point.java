class Point {
 int x;
 int y;
 point ( int x, int y)
{
 x = x;
 y = y;
}
void displayPoint ( ) {
 System.out.println (“The x value is” + x);
 System.out.println (“The y value is” + y);
 }
public static void main ( String arg [ ] ) {
 Point point = new point (10,20);
 point. displayPoint ( );
 }
}
class ThisReturn
 {
 private int i = 0;
ThisReturn increment()
 {
 i++;
 return this ;
 }
void print() 
 {
 System.out.println (“The i value is” + i);
 }
public static void main (String arg[])
 {
 ThisReturn tr = new ThisReturn();
 tr.increment().increment().increment().increment().print();
 }
} 