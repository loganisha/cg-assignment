class Test
 {
 void meth(int i, int j)
 {
 i *=2;
 j /=2;
 }
}
class CallByValue
 {
 public static void main (String args[])
 {
 Test ob = new Test();
 int a =15, b = 20;
 System.out.println (“Before call :a = “+ a +”b = “ + b);
 ob.meth (a, b );
 System.out.println (“After call :a = “ + a+” b = “ + b );
 }
}
class Test
 {
 int a, b;
 Test(int i, int j)
 {
 a = i;
 b = j;
 }
void meth(Test o) 
 {
 o.a *=2;
 o.b /= 2;
 }
}
class CallByRef
 {
 public static void (String args[])
 {
 Test ob = new Test(15,20);
 System.out.println(“Before call :ob.a = “+ob.a+” ob.b “+ob.b);
 ob.meth (ob);
 System.out.println(“After call :ob.a = “+ob.a+” ob.b “+ ob.b);
 }
} 