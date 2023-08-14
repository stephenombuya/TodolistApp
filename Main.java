package todolistApp;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		   TaskList taskList = new TaskList();
		    Scanner scanner = new Scanner(System.in);

		    while (true) {
		        System.out.println("1. Add Task");
		        System.out.println("2. Remove Task");
		        System.out.println("3. View Tasks");
		        System.out.println("4. Exit");
		        System.out.print("Choose an option: ");
		        int choice = scanner.nextInt();
		        scanner.nextLine(); // Consume the newline character

		        switch (choice) {
		            case 1:
		                taskList.addTask();
		                break;
		            case 2:
		                taskList.removeTask();
		                break;
		            case 3:
		                taskList.viewTasks();
		                break;
		            case 4:
		                System.out.println("Exiting...");
		                scanner.close();
		                System.exit(0);
		                break;
		            default:
		                System.out.println("Invalid choice. Please choose again.");
		        }
		    }
		}
}
