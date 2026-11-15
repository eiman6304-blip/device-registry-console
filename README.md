Device Registry Console

Project Description
A simple Java console application for managing devices.

The application allows users to:
Add new devices
Display all registered devices
Search for a device by ID
Exit the application

Device Types

The supported device types are:

RFID
IO
CAMERA

Requirements
JDK 21
Apache Maven
Java IDE

Run the Application
Open Main.java in IntelliJ IDEA and run the main method.

Validation

The application checks:

Empty device IDs, names, and types.
Duplicate device IDs (case-insensitive)
Unsupported device types.
Invalid menu input

Data Storage

Devices are stored in memory using an ArrayList. Data is not saved after the application exits

Project Structure

device-registry-console/
├── pom.xml
└── src/
├── main/java/org/example/
└── test/java/
