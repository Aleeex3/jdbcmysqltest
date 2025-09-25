package test;

import model.User;

public class Test {
	// ctrl + shift + o para importar la clase
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User(1, "Aday");
		user1.setName("Roberto");
		System.out.println(user1.name);
		
	}

}
