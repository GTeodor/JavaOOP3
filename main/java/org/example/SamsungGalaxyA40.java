package org.example;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.HashMap;

public class SamsungGalaxyA40 extends Samsung{



    public  String color;
    public  String material;
    public  String imei = System.currentTimeMillis() + "";
    private int batteryLifeGalaxyA40; // The battery life is put in hours
    HashMap<String, Contact> contacts = new HashMap<>();
    public  Multimap<String, String> historyOfMessagesList = ArrayListMultimap.create();
    public  ArrayList<String> historyOfCalls = new ArrayList<>();


    public SamsungGalaxyA40(String color, String material) {
        this.color = color;
        this.material = material;
        this.batteryLifeGalaxyA40 =14;

    }

    @Override
    void listMessages(String phoneNumber){
        System.out.println(historyOfMessagesList.get(phoneNumber));
    }

    @Override
    void listContacts() {
        for (HashMap.Entry<String, Contact> entry : contacts.entrySet()) {
            System.out.println(  " " + entry.getValue());
        }
    }

    @Override
    void addContact(String number, String phoneNumber, String firstName, String lastName) {
        contacts.put(number,new Contact(phoneNumber, firstName, lastName));

    }
    void sendMessage(String phoneNumber, String messageContent) {
       if (batteryLifeGalaxyA40 > 1) {
           try {
               if (messageContent.length() > 501) throw new Exception("message not valid, greater than 500 characters");
               System.out.println("\nSending a message to Phone Number " + phoneNumber);
               System.out.println("The message is: " + messageContent);
               historyOfMessagesList.put(phoneNumber, messageContent);
               batteryLifeGalaxyA40 = batteryLifeGalaxyA40 - 1;

           } catch (Exception e) {
               System.out.println("You have enter a message greater than 500 characters");
           }

       } else {
           System.out.println("The phone is off. You can't make the call.");
       }
    }

    @Override
    void call(String phoneNumber) {
        if (batteryLifeGalaxyA40 > 2) {
            System.out.println("Calling " + phoneNumber);
            historyOfCalls.add(phoneNumber);
            batteryLifeGalaxyA40 = batteryLifeGalaxyA40 - 2;
        }
        else {
            System.out.println("The phone is off. You can't make the call.");
        }
    }
    public void viewHistory(){
        System.out.println(historyOfCalls);
    }
}