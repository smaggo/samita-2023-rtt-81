package jpa.mainrunner;

import java.util.List;
import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.service.*;

public class SMSRunner {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Are you a(n)");
		System.out.println("       1. Student");
		System.out.println("       2. quit");
		System.out.println("Please enter 1 or 2");

		String input = myObj.nextLine(); // Read user input

		if (input.equals("2")) {

			System.out.println("Exiting, Have a good day/night!");
		} else if (input.equals("1")) {
			System.out.println("Enter your Email:");
			String inEmail = myObj.nextLine(); // Read user input

			System.out.println("Enter your Pasword:");
			String inPwd = myObj.nextLine(); // Read user input

			StudentService sService = new StudentService();

			boolean valStudent = sService.validateStudent(inEmail, inPwd);

			if (valStudent) {

				List<Course> studCourses = sService.getStudentCourses(inEmail);
				System.out.println("My Classes:\n");
				System.out.println("# COURSE NAME INSTRUCTOR NAME\n");

				for (Course course : studCourses) {

					System.out
							.println(course.getId() + " " + course.getcName() + "     " + course.getcInstructorName());
				}

				System.out.println("     1. Register to Class");
				System.out.println("     2. Logout");

				String inRegister = myObj.nextLine(); // Read user input

				if (inRegister.equals("1")) {

					CourseService cService = new CourseService();
					List<Course> courseList = cService.getAllCourses();

					System.out.println("All Courses:\n");
					System.out.println(String.format("%-5s %-28s %-20s", "ID", "COURSE NAME", "INSTRUCTOR NAME"));

					for (Course course : courseList) {

						System.out.println(String.format("%-5s %-28s %-20s", course.getId(), course.getcName(),
								course.getcInstructorName()));
					}

					System.out.println("Which Course:\n");

					int inCourseid = myObj.nextInt(); // Read user input

					studCourses = sService.getStudentCourses(inEmail);

					boolean alreadyRegistered = false;

					for (Course course : studCourses) {

						if (inCourseid == course.getId()) {
							alreadyRegistered = true;
							break;
						}
					}
					if (alreadyRegistered) {

						System.out.println("You are already registered in that course!");
					} else {
						sService.registerStudentToCourse(inEmail, inCourseid);

						System.out.println("My Classes:\n");
						System.out.println("COURSE NAME INSTRUCTOR NAME\n");

						List<Course> studMyCourses = sService.getStudentCourses(inEmail);

						for (Course course : studMyCourses) {

							System.out.println(
									course.getId() + " " + course.getcName() + "     " + course.getcInstructorName());
						}

						System.out.println("You have been signed out.\n");

					}

				}

				else if (inRegister.equals("2")) {
					System.out.println("You have been signed out.\n");
				}

			} else {
				System.out.println("Invalid user/pwd, exiting !");

			}

		}

	}

}
