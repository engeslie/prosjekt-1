package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String email;
    private String name;
    private int customer_id;
    private PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.email = email;
        this.name = name;
        this.customer_id = customer_id;
        this.agreement = agreement;

    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getCustomer_id(){
        return customer_id;
    }
    public PowerAgreementType getAgrement(){
        return agreement;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCustomer_id(int customer_id){
        this.customer_id = customer_id;
    }
    public void setAgrement(PowerAgreementType agrement){
        this.agreement = agrement;
    }
    public String toString() {
        String string =  "customer id " + customer_id +
                         "\nname " + name +
                         "\nemail " + email +
                         "\nagrement " + agreement;


        return string;
    }




    // TODO - getter/setter methods for all objectvariables

    // TODO - toString method

}
