package mahamed.librarymanagementsystem;

import java.util.*;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int choice = 0;
        
        while(choice !=3){
            System.out.println("Enter 1 for Module 1 \n Enter 2 for Module 2");
            choice = obj.nextInt();
            
            if (choice == 1){
                Module1 obj1 = new Module1();
                System.out.println("Enter Student's name");
                obj1.name = obj.nextLine();
                System.out.println("Enter the father's name");
                obj1.fname = obj.nextLine();
                System.out.println("Enter University ID");
                obj1.uni_id = obj.nextLine();
                System.out.println("Enter the User ID");
                obj1.uid = obj.nextLine();
                System.out.println("Which Semester do you study");
                obj1.sem = obj.nextInt();
                
                obj1.getdata(obj1.name, obj1.fname, obj1.uni_id, obj1.uid, obj1.sem);
                obj1.setdata();
            }
            
            else if(choice ==2){
                Module2 obj2 = new Module2();
                
                obj2.chemistry();
                obj2.physics();
                obj2.biology();
            }
        }
    }
}
