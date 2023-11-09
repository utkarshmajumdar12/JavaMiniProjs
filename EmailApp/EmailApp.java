package com.SRM_projects;

public class EmailApp {
    public static void main(String[] args){
        Email em1= new Email("John", "Smith");
        em1.setAlternateEmail("utkarsh.majumdar12@gmail.com");
        em1.setMailBoxCapacity(200);
        em1.changePassword("blahblah123");
        System.out.println(em1.toString());
    }
}
