package Test;

import LeetCode.Singleton;

public class SingletonCheck {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();

        // Attempt to create another instance
        Singleton instance2 = Singleton.getInstance();


        // Check if both instances are the same
        System.out.println("Instance 1 address: " + instance1);
        System.out.println("Instance 2 address: " + instance2);

        // Since it's a singleton, the addresses should be the same
        if (instance1 == instance2) {
            System.out.println("Both instances are the same (Singleton works)");
        } else {
            System.out.println("Singleton pattern failed");
        }
    }
}
