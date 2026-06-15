import java.util.*;
import java.io.*;

class Addstudent{
    int id;
    String name;
    int age;
    String DateofBirth;
}
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Addstudent> student = new ArrayList<>(); 
        System.out.println("-----Student Management System-----");
        while(true){
            System.out.println("1) -----Add New Student-----");
            System.out.println("2) -----View Student Detail-----");
            System.out.println("3) -----Delete the student detail-----");
            System.out.println("4) -----Exit-----");
            System.out.println("Enter the Method:");
            int n = sc.nextInt();
            sc.nextLine();
            switch(n){
            case 1:
                Addstudent addstu = new Addstudent();
                System.out.println("Enter a Student ID:");
                addstu.id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter a Student Name:");
                addstu.name = sc.nextLine();
                System.out.println("Enter a Student Age:");
                addstu.age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter a Date of Birth:");
                addstu.DateofBirth = sc.nextLine();
                student.add(addstu);
                System.out.println("Successfully Added");
                break;
            case 2:
                int search;
                boolean flag = false;
                System.out.println("Enter Student ID:" );
                search = sc.nextInt();
                sc.nextLine();
                int length = student.size();
                for(int i = 0; i < length; i++){
                      if(student.get(i).id == search){
                        flag = true;

                        System.out.println("-----Student Detail-----:");
                        System.out.println("ID: " + student.get(i).id);
                        System.out.println("Name: " + student.get(i).name);
                        System.out.println("Age: " + student.get(i).age);
                        System.out.println("DOB: " + student.get(i).DateofBirth);

                        break;
                    }
                }

                if(!flag){
                    System.out.println("Student does not found in this id: " + search);
                }
                break;
            case 3:
                boolean found = false;
                System.out.println("Enter a student id to delete the student detail:");
                int delid = sc.nextInt();
                sc.nextLine();
                for(int i = 0; i < student.size(); i++){
                    if(student.get(i).id == delid){
                        student.remove(i);
                        found = true;
                        System.out.println("Student deleted successfully");
                        break;
                    }
                }
                if(!found){
                    System.out.println("No ID Found");
                }
                break;
    }
}
