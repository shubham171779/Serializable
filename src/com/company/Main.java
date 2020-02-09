package com.company;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main
{
    public static void main(String[] args) {
        SerialClass emp=new SerialClass();
        emp.setName("Shubham");
        emp.setAddress("123,Chandigarh");
        emp.setSsn(12345677);
        emp.setPassword(101);
        SerialClass emp1=new SerialClass();
        emp1.setName("Rawat");
        emp1.setAddress("345,jalandhar");
        emp1.setSsn(1212);
        emp1.setPassword(101);
        try
        {
            FileOutputStream fileout=new FileOutputStream("C:\\Users\\shubham\\Desktop\\Serial.txt");
            ObjectOutputStream objout=new ObjectOutputStream(fileout);
            objout.writeObject(emp);
            objout.writeObject(emp1);
            objout.close();
            fileout.close();
            System.out.println("Serialized data is saved");


        }
        catch(IOException e){e.printStackTrace();}


    }
}
