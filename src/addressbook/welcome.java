package addressbook;

public class welcome {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		 details obj = new details();
	        obj.setName("sumithra");
	        obj.setSurname("Buddareddy");
	        obj.setAddress("Madanapali,Andrapradesh");
	        obj.setCity("Chittor");
	        obj.setState("Andrapradesh");
	        obj.setContactNumber("6300036180");
	        obj.setEmail("sumipavib1302@gmail.com");

	        System.out.println("Name: " + obj.getName());
	        System.out.println("Surname: " + obj.getSurname());
	        System.out.println("Address: " + obj.getAddress());
	        System.out.println("City: " + obj.getCity());
	        System.out.println("State: " + obj.getState());
	        System.out.println("ContactNumber: " + obj.getContactNumber());
	        System.out.println("Email: " + obj.getEmail());

	}

}
