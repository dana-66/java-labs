
import java.util.Scanner;


public class PhoneBook {
    public static void main (String[]args){
        printMenu();
       
        
    }
  
   
  public static void printMenu() {
    Scanner input = new Scanner (System.in);
    String name;
        int choice;
        
    System.out.println(" welcome to myPhoneBook program\nplease Enter your choice according to the following menu:");
    System.out.println("1-Add Record.\n2-Find a Record.\n3-delete a Record.\n4-display All.\n5-Quit.");
    System.out.println(" your choice is :  ");
     choice = input.nextInt();
    String[] names = new String[100]; 
        long[] phones = new long[100];
        int currentSize = 0;
         for (int i = 0; i < 7; i++) {
            currentSize = addRecord(names, phones, currentSize);
            dissplayAll(names, phones, currentSize);
        }
    while (choice != 5){
        switch (choice) {
            case 1:
                
                addRecord(names, phones, currentSize);
                break;
                
            case 2:
                System.out.println("Enter the number of the record your searching for:  ");
                long phoneNumToFind = input.nextLong();
                findRecord(phones,currentSize,phoneNumToFind);
                break;
            case 3:
                deleteRecord();
                break;
            case 4:
                dissplayAll(names, phones, currentSize);
                break;
            default:
                break;
        }
  
}}
  public static int addRecord(String[] names, long[] phones, int currentSize) 
    {
        Scanner scan = new Scanner(System.in); 

        System.out.println("Enter the name of the reacord that you want to add:  "); 
        String name = scan.nextLine();

         System.out.println("\nEnter the number of the record that you want add:  ");
        
        int phoneNumber = scan.nextInt();
        System.out.println("the record is sucsessfully saved...");
        
        if (findRecord(phones, currentSize, phoneNumber) == true) 
        {
            System.out.println("\n\nThe phoneNumber already exists in the phonebook."); 
            return currentSize; 
        }

        names[currentSize] = name; 
        phones[currentSize] = phoneNumber;

        currentSize++; 

        System.out.println("\n\nThe record " + name + " " + phoneNumber + " was succesfully saved"); 
        return currentSize; 
    }

  
 public static boolean findRecord(long[] phones, int currentSize, long phoneNumberToSearch) 
    {
        for (int i = 0; i < currentSize; i++) 
        {
            if (phones[i] == phoneNumberToSearch) 
            {
                return true; 
            }
        }

        return false; 
    }
 public static void dissplayAll(String[] names, long phones[], int currentSize) 
    {
        System.out.println("\n\n\nThe items currently in the phonebook are :-\n\n");

        for (int i = 0; i < currentSize; i++) 
        {
            System.out.println(names[i] + "\t" + phones[i]); 
        }

        System.out.println("\n\n");
    }
        }
    
    
    

