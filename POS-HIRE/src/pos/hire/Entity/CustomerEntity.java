/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.hire.Entity;

/**
 *
 * @author BIMSARA
 */
public class CustomerEntity {

    private String Id;
    private String address;
    private String contactNo;
    private String name;
    private String nic;

    public CustomerEntity() {
    }

    public CustomerEntity(String Id, String address, String contactNo, String name, String nic) {
        this.Id = Id;
        this.address = address;
        this.contactNo = contactNo;
        this.name = name;
        this.nic = nic;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" + "Id=" + Id + ", address=" + address + ", contactNo=" + contactNo + ", name=" + name + ", nic=" + nic + '}';
    }

}
