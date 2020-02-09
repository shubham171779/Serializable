package com.company;

import java.io.Serializable;

public class SerialClass implements Serializable {
        String Name;
        String Address;
        static int Ssn;
        transient int Password;
        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public static int getSsn() {
            return Ssn;
        }

        public static void setSsn(int ssn) {
            Ssn = ssn;
        }

        public int getPassword() {
            return Password;
        }

        public void setPassword(int password) {
            Password = password;
        }


    }
