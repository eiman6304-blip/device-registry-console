

package org.example;

/**
 * Represents a device in the device registry.
 * Each device has an ID, name, and type.
 */
public class device {
    private String id;
    private String name;
    private DeviceType type;

    /**
     Creates a device with an ID, name, and type.
     **/
    public device(String id,String name,DeviceType type){
        this.id=id;
        this.name=name;
        this.type=type;

    }
    /**
     * Returns the device ID.
     * @return the device ID
     */
    public String getId(){
        return id;
    }




    /**
     * Returns the device name.
     * @return the device name
     */
    public String getName(){
        return name;
    }



    /**
     * Returns the device type.
     * @return the device type
     */
    public DeviceType getType(){
        return type;
    }
}
