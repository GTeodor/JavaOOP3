package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        System.out.println("Samsung Galaxy S6");
        Phone p = new SamsungGalaxyS6("blue", "plastic");
        p.addContact("1","0730890212", "Teodor", "Muresan");
        p.addContact("2","0730554121", "Ana", "Muresan");
        p.listContacts();
        p.sendMessage("0730890212","Hello how are you?");
        System.out.println("Messages sent to the number 0730890212 are: ");
        p.listMessages("0730890212");
        p.call("0730554121");
        p.viewHistory();


        System.out.println("\n\nSamsung Galaxy A40");
        Phone p2 = new SamsungGalaxyA40("white", "metal");
        p2.addContact("1","0721655121", "Ovidiu", "Oaida");
        p2.addContact("2","0729778541", "Carmel", "Marcu");
        p2.listContacts();
        p2.sendMessage("0721655121","Come outside");
        System.out.println("Messages sent to the number 0721655121 are: ");
        p2.listMessages("0721655121");
        p2.call("0729778541");
        p2 .viewHistory();


        System.out.println("\n\nNokia230");
        Phone p3 = new Nokia230("blue", "metal");
        p3.addContact("1","0765778958", "Alina", "Avram");
        p3.addContact("2","0753564125", "Bianca", "Rosu");
        p3.listContacts();
        p3.sendMessage("0765778958","You are not alone");
        System.out.println("Messages sent to the number 0765778958 are: ");
        p3.listMessages("0765778958");
        p3.call("0753564125");
        p3.viewHistory();

        System.out.println("\n\nNokia3310");
        Phone p4 = new Nokia3310("green", "plastic");
        p4.addContact("1","0721658778", "Remus", "Alb");
        p4.addContact("2","0735665895", "Mirela", "Ros");
        p4.listContacts();
        p4.sendMessage("0721658778","Did you buy meat ?");
        System.out.println("Messages sent to the number 0721658778 are: ");
        p4.listMessages("0721658778");
        p4.call("0735665895");
        p4.viewHistory();


    }
}
