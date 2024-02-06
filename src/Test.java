import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        initStorage();

    }
    public static void initStorage(){
        ArrayList<Customer> customers = new ArrayList<>();
        Customer emil = new Customer("Emil","Apel",23);
        Customer william = new Customer("Emil","Apel",22);

        customers.add(emil);
        customers.add(william);
        Collections.sort(customers);
        for (Customer customer : customers) {
            System.out.println(customer.getFornavn() + " " + customer.getEfternavn() + " " + customer.getAlder());
        }
    }
}
