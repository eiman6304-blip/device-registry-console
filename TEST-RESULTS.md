# Test Results

I tested the application using the IntelliJ console to make sure everything works correctly.

The tests I performed:

- Added a new device successfully.
- Displayed all registered devices.
- Searched for a device using its ID.
- Tested searching with uppercase and lowercase letters.
- Tried adding a device with an existing ID, and the application rejected it.
- Entered an unsupported device type, and the application showed an error.
- Tried leaving the device ID empty, and it was rejected.
- Tried leaving the device name empty, and it was rejected.
- Tried leaving the device type empty, and it was rejected.
- Entered a letter instead of a number in the menu, and the application handled it.
- Searched for a device that does not exist, and the application showed that the device was not found.

All the manual tests above worked as expected.

I also ran the following Maven commands successfully:

- `mvn clean compile`
- `mvn test`
- `mvn package`
- `mvn clean package`

Note: I tested the application manually. I did not create automated JUnit tests.