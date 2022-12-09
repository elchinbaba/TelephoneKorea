import Input.Input;
import Compute.Compute;
import Output.Output;
import Customer.Customer;
public class Main {
    public static void main(String[] args) {
        Customer[] customers = Customer.convertInputToCustomer(Input.CUSTOMERS);

        new Compute().computeCostumer(customers).sortByTotal(customers);

        new Output().output(customers);
    }
}