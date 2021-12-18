class Hillstations{
	void location(){
      System.out.println("Location is:");
     }  
    void famousfor(){
     System.out.println("Famous for:");
    }  
 
}  
class Manali extends Hillstations {  
  void location(){
    System.out.println("It is in Himachal Pradesh");
   }  
  void famousfor(){
    System.out.println("It is Famous for Hadimba Temple ");
   }  
}
class Mussoorie extends Hillstations {  
  void location(){
    System.out.println("It is in Uttarakhand");
   }  
  void famousfor(){
    System.out.println("It is Famous for Tiny hill ");
   }  
}
class Gulmarg extends Hillstations {  
  void location(){
    System.out.println("It is in Jammu and Kashmir");
   }  
   void famousfor(){
    System.out.println("It is Famous for Alpather Lake ");
   }  
}
public class Places {

	public static void main(String[] args) {
	
		//Hillstations t= new Hillstations();
	    //t.location();
	    //t.famousfor();
	    Hillstations M = new Manali();
	    M.location();
     	M.famousfor();
     	Hillstations MU= new Mussoorie();
     	MU.location();
		MU.famousfor();
		Hillstations G= new Gulmarg();
		G.location();
		G.famousfor();
		
	}


}