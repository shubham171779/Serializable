package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserialClass {
    public static void main(String []args)
    {
        SerialClass emp=null;
        SerialClass emp1=null;
        try
        {
            FileInputStream fileIn=new FileInputStream("C:\\Users\\shubham\\Desktop\\Serial.txt");
            ObjectInputStream in=new ObjectInputStream(fileIn);
            emp=(SerialClass)in.readObject();
            emp1=(SerialClass)in.readObject();
            in.close();
            fileIn.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException c){c.printStackTrace();}
        System.out.println("Deserialized employee data");
        System.out.println("Name"+emp.Name);
        System.out.println("Address"+emp.Address);
        System.out.println("SSn"+emp.Ssn);
        System.out.println("Password"+emp.Password);
        System.out.println("Deserialized employee data");
        System.out.println("Name"+emp1.Name);
        System.out.println("Address"+emp1.Address);
        System.out.println("SSn"+emp1.Ssn);
        System.out.println("Password"+emp1.Password);

    }
}
