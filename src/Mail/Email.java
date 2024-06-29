
package Mail;
import java.util.Scanner;
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength =8;
	private String alternateEmail;
	private String companySuffix = "abccompany.com";
	//Constructor to receive the first name and last name
	
	public Email(String firstName,String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email is created : "+this.firstName+" "+this.lastName);
		this.department = department();
		//System.out.println("Department is :" + this.department);
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : "+this.password);
		
		//combine elements to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your email is: "+email);
	}
	
	//Ask for department
	private String department()
	{
		System.out.print("New Worker: "+firstName+"\nDepartment Codes:\n for 1 : sales \n for 2 : development \n for 3 : Accounting\n for 0 : none \n enter the code : ");
		Scanner sc = new Scanner(System.in);
		int choice  = sc.nextInt();
		
		if(choice==1) {return "sales" ; }
		else if (choice ==2 ) {return "development" ;}
		else if(choice==3)  {return "accounting" ;}
		else {return "none" ;}
		
		
	}
	
	// Random Password Generator
	
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$";
		char[] password  = new char[length];
		for(int i=0;i<length;i++)
		{
			int rand  = (int)(Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
				
	}

	// Email capacity
	public void setMailBoxCapacity(int capacity)
	{
		this.mailboxCapacity = capacity;
	}
	
	//Alternate Email
    public void setAlternateEmail(String alternate)
    {
    	this.alternateEmail = alternate;
    }
    
    //change Password
    public void changePassword(String password)
    {
    	this.password = password;
    }

	public int getMailBoxCapacity()
	{
		return mailboxCapacity;
	}
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	public String getPassword()
	{
		return password;
	}
	
	public String show()
	{
		return "Display Info: "+firstName+" "+lastName
				+"\nCompany Email: "+email
				+" "+
				"\nMailBoxCapacity: "+mailboxCapacity+"mb";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
