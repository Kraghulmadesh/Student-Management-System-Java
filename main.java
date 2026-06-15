import java.util.*;

class AddStudent {
    int id;
    String name;
    int age;
    String dateOfBirth;
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<AddStudent> students = new ArrayList<>();

        System.out.println("----- Student Management System -----");

        while (true) {

            System.out.println("\n1) Add New Student");
            System.out.println("2) View Student Detail");
            System.out.println("3) Delete Student Detail");
            System.out.println("4) Exit");
            System.out.print("Enter the Method: ");

            int n = sc.nextInt();
            sc.nextLine();

            switch (n) {

                case 1:
                    AddStudent addStu = new AddStudent();

                    System.out.print("Enter Student ID: ");
                    addStu.id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    addStu.name = sc.nextLine();

                    System.out.print("Enter Student Age: ");
                    addStu.age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Date of Birth: ");
                    addStu.dateOfBirth = sc.nextLine();

                    students.add(addStu);

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    boolean flag = false;

                    System.out.print("Enter Student ID: ");
                    int search = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).id == search) {

                            flag = true;

                            System.out.println("\n----- Student Detail -----");
                            System.out.println("ID: " + students.get(i).id);
                            System.out.println("Name: " + students.get(i).name);
                            System.out.println("Age: " + students.get(i).age);
                            System.out.println("DOB: " + students.get(i).dateOfBirth);

                            break;
                        }
                    }

                    if (!flag) {
                        System.out.println("Student not found with ID: " + search);
                    }

                    break;

                case 3:
                    boolean found = false;

                    System.out.print("Enter Student ID to delete: ");
                    int delId = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).id == delId) {

                            students.remove(i);
                            found = true;

                            System.out.println("Student deleted successfully!");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("No ID Found");
                    }

                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please Enter a Valid Method");
            }
        }
    }
}
