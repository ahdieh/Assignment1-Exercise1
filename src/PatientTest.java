import java.util.Scanner;


public  class PatientTest  {
	public static Patient patient; // reference to the Patient class
	public static void main(String[] args) {
		System.out.println("Program Started...");
		
		Scanner input = new Scanner(System.in);

		// Prompt user for Patient Id
	    System.out.print("Enter your Patient Id: ");
		String myPatientId = input.nextLine();
		
		// Prompt user for First Name
		System.out.print("Enter your First Name: ");
		String myFirstName = input.nextLine();
		System.out.print("Enter your Last Name: ");
		String myLastName = input.nextLine();
		
		// Prompt user for Address
		System.out.print("Enter your Address: ");
		String myAddress = input.nextLine();
		
		// Prompt user for City
		System.out.print("Enter your City: ");
		String myCity = input.nextLine();
				
		// Prompt user for Province
		System.out.print("Enter your Province: ");
	    String myProvince = input.nextLine();
				
		// Prompt user for Postal Code
		System.out.print("Enter your Postal Code: ");
		String myPostalCode = input.nextLine();
				
		
		
		patient = new Patient();
		
		patient.setPatientId(myPatientId);
		patient.setFirstName(myFirstName);
		patient.setLastName(myLastName);
		patient.setAddress(myAddress);
		patient.setCity(myCity);
		patient.setProvince(myProvince);
		patient.setPostalCode(myPostalCode);
		
		patient.getPatientInfo();
		
		System.out.printf("The patient \" %s %s \" with ID#%s lives in %s , %s ,%s and the postal code is %s.", patient.getFirstName(), patient.getLastName(), patient.getPatientId(), patient.getAddress(), patient.getCity(), patient.getProvince(), patient.getPostalCode());
		
	}

}