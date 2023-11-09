package com.SRM_projects;
import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity=500;
    private String email;
    private String alternateEmail;
    private String companySuffix="aeycompany.com";


    //Constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName=lastName;
        System.out.println("EMAIL CREATED:"+this.firstName+" "+ this.lastName);

        //Call a method asking for the department - return the department
        this.department=setDepartment();
        System.out.println("Department: "+this.department);

        //Call a method that generates random password
        this.password= randomPassword(8);
        System.out.println("Your Password is: "+this.password);

        //Combine Elements to generate email
        email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println("Your Email is: "+email);
    }

    //Ask for department
    private String setDepartment(){
        System.out.print("Enter the Department \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \nEnter Department Code");

        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice==1){
            return "Sales";
        }
        else if(depChoice==2){
            return "Development";
        }
        else if(depChoice==3){
            return "Accounting";
        }
        else if(depChoice==0){
            return "None";
        }
        else return " ";
    }


    //Generate Random Password
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
           int rand= (int)(Math.random() * passwordSet.length());
           password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity=capacity;
    }
    //Get mailbox capacity
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    //set alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
    }
    //get alt email
    public String getAlternateEmail(){
        return alternateEmail;
    }

    //change the password
    public void changePassword(String password){
        this.password=password;
    }
    //get Password
    public String getPassword(){
        return password;
    }

    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", mailBoxCapacity=" + mailBoxCapacity +
                ", email='" + email + '\'' +
                ", alternateEmail='" + alternateEmail + '\'' +
                '}';
    }
}
