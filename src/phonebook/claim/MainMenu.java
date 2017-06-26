package phonebook.claim;

import java.util.ArrayList;
import java.util.Scanner;
import phonebook.claim.Address;
import phonebook.claim.Contact;

public class MainMenu extends Contact {

	static ArrayList<Contact> ContactList = new ArrayList();
	public static void main(String[] args) {
		displayMenu();
	}

	public static void Contact (String fullName, Address myAddress, long telephone)  {

	}


	public static void displayMenu() {
		Scanner input = new Scanner(System.in);
		/* This is the menu that displays for the user
		 */

		System.out.println("Select opition 1,2,3,4,5,6,7,8");
		System.out.println("1. Add New Record");
		System.out.println("2. Delete Record");
		System.out.println("3. Find record by Phone Number");
		System.out.println("4. Find Record by First Name");
		System.out.println("5. Find Record by Last Name");
		System.out.println("6. Update a record");
		System.out.println("7. Show all recors in asc order");
		System.out.println("8. Exit");

		int select = input.nextInt();


		switch(select) {
		case 1:
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Add Record in this order Will Alexander Collier, 114 Market St, St Louis, MO, 63403, 6366435698");
			String contact = sc1.nextLine(); //Contact entered by the user
			String[] record = contact.split(","); //Split contact by ,(comma) and equal it to String array record
			String[] fullName = record[0].split(" "); //full name splitting by space
			FullName myFullName = new FullName(); //Creating object from fullName class
			Contact myContact = new Contact(); //Creating object from Contact class
			String middleName = ""; //set middle name to empty string
			for(int i = 1; i<fullName.length-1; i++){ //for loop for middle name in fullName
				middleName +=" "+fullName[i]; //middle name equals to position of i
			}
			myFullName.setMiddleName(middleName); //call FullName class and set middle name to position of the for loop
			myFullName.setFirstName(fullName[0]);
			myFullName.setLastName(fullName[fullName.length-1]);
			myContact.setFullName(myFullName);

			Address a = new Address();
			a.setStreet(record[1]);
			a.setState(record[2]);
			a.setCity(record[3]);
			a.setZipcode(Long.parseLong(record[4].trim()));
			myContact.setMyAddress(a);
			myContact.setTelephone(Long.parseLong(record[5].trim()));

			ContactList.add(myContact);

			System.out.println("Contact Added: "+myContact.getFullName().getFirstName()+ "" +myContact.getFullName().getMiddleName()+" " +myContact.getFullName().getLastName());

			displayMenu();
			break;

		case 2:

			Scanner sc2 = new Scanner(System.in);

			System.out.println("Enter phone to be deleted ");
			Long telephone = sc2.nextLong();
			boolean flag = true;
			for(int i = 0; i < ContactList.size();i++){
				if(ContactList.get(i).getTelephone() == telephone){
					System.out.println("Person Deleted: " +ContactList.get(i).getFullName().getFirstName()+" "+ContactList.get(i).getFullName().getLastName());
					ContactList.remove(i);
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("No record found.");
			}

			displayMenu();
			break;


		case 3:


			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter phone number to find contact");
			Long telephone1 = sc3.nextLong();
			boolean flag1 = true;
			for(int i = 0; i < ContactList.size();i++){
				if(ContactList.get(i).getTelephone() == telephone1){
					System.out.println("Contact found: " +ContactList.get(i).getFullName().getFirstName() + " " + ContactList.get(i).getFullName().getLastName());
					flag1 = false;
					break;
				}
			}
			if(flag1)
			{
				System.out.println("No Contact found");
			}

			displayMenu();
			break;

		case 4:

			Scanner sc4 = new Scanner(System.in);
			System.out.println("Enter First Name to be found in Phone Book");
			String firstName = sc4.nextLine();
			boolean flag2 = true;
			for(int i = 0; i < ContactList.size();i++){
				if(ContactList.get(i).getFullName().getFirstName() == firstName){
					System.out.println("Contact found: " +ContactList.get(i).getFullName().getFirstName() + " " + ContactList.get(i).getFullName().getLastName());
					flag2 = false;
					break;
				}
			}
			if(flag2)
			{
				System.out.println("No Contact found.");
			}

			displayMenu();
			break;

		case 5:

			System.out.println("Enter Last Name");
			Scanner sc5 = new Scanner(System.in);
			System.out.println("Enter Last Name to be found in Phone Book");
			String lastName = sc5.nextLine();
			boolean flag3 = true;
			for(int i = 0; i < ContactList.size();i++){
				if(ContactList.get(i).getFullName().getLastName() == lastName){
					System.out.println("Contact found: " +ContactList.get(i).getFullName().getFirstName() + " " + ContactList.get(i).getFullName().getLastName());
					flag3 = false;
					break;
				}
			}
			if(flag3)
			{
				System.out.println("No Contact found.");
			}
			displayMenu();
			break;

		case 6:
			Scanner sc6 = new Scanner(System.in);
			System.out.println("Enter phone number to Update contact");
			Long telephone2 = sc6.nextLong();
			boolean flag4 = true;
			for(int i = 0; i < ContactList.size();i++){
				if(ContactList.get(i).getTelephone() == telephone2){
					System.out.println("Contact found: " +ContactList.get(i).getFullName().getFirstName() + " " + ContactList.get(i).getFullName().getLastName());
					Scanner updateInput = new Scanner(System.in);

					System.out.println("Select opition 1,2,3,4,5,6,7,8");
					System.out.println("1. Update First Name");
					System.out.println("2. Update Middle Name");
					System.out.println("3. Update Last Name");
					System.out.println("4. Update Phone Number");
					System.out.println("5. Update Street");
					System.out.println("6. Update City");
					System.out.println("7. Update Zipcode");

					int select1 = updateInput.nextInt();

					switch (select1) {
					case 1:
						System.out.println("Enter the correct First Name");
						String updatedfirstName = "";
						Scanner sc7 = new Scanner(System.in);
						updatedfirstName = sc7.nextLine();
						if(ContactList.get(i).getTelephone() == telephone2){
							ContactList.get(i).getFullName().setFirstName(updatedfirstName);
							System.out.println("New Updated First Name: " +updatedfirstName);
							displayMenu();
						}
						break;
					case 2:
						System.out.println("Enter the correct Middle Name");
						String updatedmiddleName = "";
						Scanner sc9 = new Scanner(System.in);
						updatedmiddleName = sc9.nextLine();
						if(ContactList.get(i).getTelephone() == telephone2){
							ContactList.get(i).getFullName().setMiddleName(updatedmiddleName);
							System.out.println("New Updated Middle Name: " +updatedmiddleName);
							displayMenu();
						}
						break;
					case 3:
						System.out.println("Enter the correct Last Name");
						String updatedlastName = "";
						Scanner sc8 = new Scanner(System.in);
						updatedlastName = sc8.nextLine();
						if(ContactList.get(i).getTelephone() == telephone2){
							ContactList.get(i).getFullName().setLastName(updatedlastName);
							System.out.println("New Updated Last Name: " +updatedlastName);
							displayMenu();
						}
						break;
					case 4:
						System.out.println("Enter the correct Phone Number");
						Long updatedPhoneNumber;
						Scanner sc10 = new Scanner(System.in);
						updatedPhoneNumber = sc10.nextLong();
						if(ContactList.get(i).getTelephone() == telephone2){
							ContactList.get(i).setTelephone(updatedPhoneNumber);
							System.out.println("New Updated Phone Number: " +updatedPhoneNumber);
							displayMenu();
						}
						break;
					case 5:
						System.out.println("Enter the correct Street Address");
						String updatedStreetAddress = "";
						Scanner sc11 = new Scanner(System.in);
						updatedStreetAddress = sc11.nextLine();
						if(ContactList.get(i).getTelephone() == telephone2){
							ContactList.get(i).getMyaddress().setStreet(updatedStreetAddress);
							System.out.println("New Updated Street Address: " +updatedStreetAddress);
							displayMenu();
						}
						break;
					case 6:
						System.out.println("Enter the correct City");
						String updatedCity = "";
						Scanner sc12 = new Scanner(System.in);
						updatedCity = sc12.nextLine();
						if(ContactList.get(i).getTelephone() == telephone2){
							ContactList.get(i).getMyaddress().setCity(updatedCity);
							System.out.println("New Updated City: " +updatedCity);
							displayMenu();
						}
						break;
					case 7:
						System.out.println("Enter the correct Zipcode");
						Long updatedZipcode;
						Scanner sc13 = new Scanner(System.in);
						updatedZipcode = sc13.nextLong();
						if(ContactList.get(i).getTelephone() == telephone2){
							ContactList.get(i).getMyaddress().setZipcode(updatedZipcode);
							System.out.println("New Updated Zipcode: " +updatedZipcode);
							displayMenu();
						}
						break;
					}
				}
			}
			break;

		case 7:

			System.out.println("Showing all records in phone book");
			for(int i = 0; i < ContactList.size(); i++) {
				System.out.println(ContactList.get(i).getFullName().getFirstName()+" "+ContactList.get(i).getFullName().getMiddleName()+" "+ContactList.get(i).getFullName().getLastName()+" "+ContactList.get(i).getMyaddress().getStreet()+" "+ContactList.get(i).getMyaddress().getCity()+" "+ContactList.get(i).getMyaddress().getState()+" "+ContactList.get(i).getMyaddress().getZipcode()+" "+ContactList.get(i).getTelephone());
			
			}

			break;

		case 8:
			System.out.println("Exiting Phone Book");

			break;

		}
	}
}

