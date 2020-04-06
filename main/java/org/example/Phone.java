package org.example;

public abstract class Phone {



    abstract void addContact(String number, String phoneNumber, String firstName, String lastName);
    abstract void listContacts();
    abstract void sendMessage(String phoneNumber, String messageContent);
    abstract void listMessages(String phoneNumber);
    abstract void call(String phoneNumber);
    abstract void viewHistory();





}

