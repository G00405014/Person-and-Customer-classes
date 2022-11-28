package ie.atu.week10b;

public class customer extends Person_info{
    private String CustomerNumber;
    private boolean mailingList;



    public customer() {
        {
             public Customer(String name, String Address, String Telephone, String CustomerNumber, boolean mailingList){
            super(name, Address, Telephone);
            this.CustomerNumber = customerNumber;
            this.mailingList = mailingList;
        }

            @Override
            public String toString() {
            return "Customer{" + super.toString() + "" +
                    "CustomerNumber='" + CustomerNumber + '\'' +
                    ", mailingList=" + mailingList +
                    '}';

    }
}


