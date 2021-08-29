package AdressBook;

public class AdressBookUC1 {
//Declaration part
	String FirstName;
	String LastName;
	String Adress;
	String City;
	String State;
	int Zip;
	int PhoneNumber;
	String Email;
	//constructor is created
	 public AdressBookUC1(String FirstName, String LastName, String Adress, String City, int Zip,
             String State, int PhoneNumber, String Email) {
	
		 
		    this.FirstName = FirstName;
		    
		    
	        this.LastName = LastName;
	       
	        
	        this.Adress = Adress;
	        
	        
	        this.City = City;
	        
	        
	        this.Zip = Zip;
	        
	        
	        this.State = State;
	        
	        
	        this.PhoneNumber = PhoneNumber;
	        
	        
	        this.Email = Email;
	        
	 }
	 //function Declare
	    public void details(){
	        System.out.println("FirstName : " + FirstName);
	        System.out.println("Lastame : " + LastName);
	        System.out.println("Adress : " + Adress);
	        System.out.println("City : " + City);
	        System.out.println("Zip : " + Zip);
	        System.out.println("State : " + State);
	        System.out.println("PhoneNumber : " + PhoneNumber);
	        System.out.println("Email : " + Email);
	    }
	 //main function
	 
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Address Book");
        AdressBookUC1 contacts = new AdressBookUC1("Rushikesh","Bhosle","Gokulnager",
        "Latur",413518,"Maharastra",1234567890,"rushikeshbhosle@gmail.com");
       contacts.details();

     }
	

}
