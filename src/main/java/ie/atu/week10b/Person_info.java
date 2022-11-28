package ie.atu.week10b;

public class Person_info {
    private String name;
    private String Address;
    private String Telephone;

    public Person_info() {
    }

    public Person_info(String name, String Address, String Telephone) {
        this.name = name;
        this.Telephone = Telephone;
        this.Address = Address;
    }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getAddress () {
        return Address;
    }

    public void setAddress (String address){
        this.Address = address;
    }

    public String getTelephone () {
        return Telephone;
    }

    public void setTelephone (String telephone){
        this.Telephone  = telephone;
    }

    @Override
    public String toString() {
        return "Person_info{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", Telephone='" + Telephone + '\'' +
                '}';
    }
}


