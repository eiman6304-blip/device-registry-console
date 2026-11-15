
package org.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Runs the Device Registry Console application.
 */
public class Main {

    /**
     * Starts the application and handles user menu choices.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<device> devices = new ArrayList<>();

        while (true) {

            System.out.println("===== Device Registry =====");
            System.out.println("1. Add Device");
            System.out.println("2. List Devices");
            System.out.println("3. Search Device");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String choiceInput = scanner.nextLine().trim();

            int choice;

            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number from 1 to 4.");
                continue;
            }

            switch (choice) {


                case 1:
                    System.out.print("Enter Device ID: ");
                    String id = scanner.nextLine().trim();

                    if (id.isEmpty()) {
                        System.out.println("Device ID cannot be empty.");
                        break;
                    }

                    // Check for duplicate ID
                    boolean duplicateId = false;

                    for (int i = 0; i < devices.size(); i++) {
                        if (devices.get(i).getId().equalsIgnoreCase(id)) {
                            duplicateId = true;
                            break;
                        }
                    }


                    if (duplicateId) {
                        System.out.println("Device ID already exists!");
                        break;
                    }

                    System.out.print("Enter Device Name: ");
                    String name = scanner.nextLine().trim();

                    if (name.isEmpty()) {
                        System.out.println("Device name cannot be empty.");
                        break;
                    }

                    System.out.print("Enter Device Type (RFID, IO, CAMERA): ");
                    String typeInput = scanner.nextLine().trim();

                    if (typeInput.isEmpty()) {
                        System.out.println("Device type cannot be empty.");
                        break;
                    }

                    DeviceType type;

                    try {
                        type = DeviceType.valueOf(typeInput.toUpperCase());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid device type. Please use RFID, IO, or CAMERA.");
                        break;
                    }

                    device newDevice = new device(id, name, type);
                    devices.add(newDevice);

                    System.out.println("Device added successfully!");
                    break;


                case 2:
                    if (devices.isEmpty()) {
                        System.out.println("No devices found.");
                    } else {
                        for (int i = 0; i < devices.size(); i++) {
                            System.out.println("ID: " + devices.get(i).getId());
                            System.out.println("Name: " + devices.get(i).getName());
                            System.out.println("Type: " + devices.get(i).getType());
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Device ID to search: ");
                    String searchId = scanner.next();

                    boolean found = false;

                    for (int i = 0; i < devices.size(); i++) {
                        if (devices.get(i).getId().equalsIgnoreCase(searchId)) {
                            System.out.println("Device found!");
                            System.out.println("ID: " + devices.get(i).getId());
                            System.out.println("Name: " + devices.get(i).getName());
                            System.out.println("Type: " + devices.get(i).getType());

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Device not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exit selected");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
