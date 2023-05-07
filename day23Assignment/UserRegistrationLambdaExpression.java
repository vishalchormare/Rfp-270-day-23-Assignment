package day23Assignment;

import java.util.regex.Pattern;

public class UserRegistrationLambdaExpression {

	@FunctionalInterface
	interface UserDeatailsValdationFI {
		boolean userDetails(String regex, String details);

		static void result(UserDeatailsValdationFI ref, String regex, String details) {
			if (ref.userDetails(regex, details)) {
				System.out.println(details + " is Valid Details");
			} else {
				System.out.println(details + "is Invalid Details");
			}
		}
	}

	public static void main(String[] args) {
		UserDeatailsValdationFI userDeatailsValdationFI = (regex, detail) -> Pattern.matches(regex, detail);

		System.out.println("first name : ");
		UserDeatailsValdationFI.result(userDeatailsValdationFI, "^[A-Z][a-zA-Z]{2,}$", "Vishal");
		UserDeatailsValdationFI.result(userDeatailsValdationFI, "^[A-Z][a-zA-Z]{2,}$", "Vishal.1");
		System.out.println("Last Name: ");
		UserDeatailsValdationFI.result(userDeatailsValdationFI, "^[A-Z][a-zA-Z]{2,}$", "Chormare");
		UserDeatailsValdationFI.result(userDeatailsValdationFI, "^[A-Z][a-zA-Z]{2,}$", "Chormare.1");
		System.out.println("Phone No: ");
		UserDeatailsValdationFI.result(userDeatailsValdationFI, "^[0-9]{1,2} \\d{10}$", "91 9876543210");
		UserDeatailsValdationFI.result(userDeatailsValdationFI, "^[0-9]{1,2} \\d{10}$", "91 9876543");
		System.out.println("Email Address: ");
		UserDeatailsValdationFI.result(userDeatailsValdationFI,
				"^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?",
				"vishalmj8080@gmail.com");
		UserDeatailsValdationFI.result(userDeatailsValdationFI,
				"^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?",
				"vihsal.chormare@.gmail.com");
		System.out.println("Password: ");
		UserDeatailsValdationFI.result(userDeatailsValdationFI, "^[A-Z][a-zA-Z1-9]{5,}[@$^][1-9]+$", "Vishal@123");
		UserDeatailsValdationFI.result(userDeatailsValdationFI, "^[A-Z][a-zA-Z1-9]{5,}[@$^][1-9]+$", "vishalchormare");
	}
}
