package Compute;

import Customer.Customer;
import Rate.Rate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Compute {
    public void computeCustomerAmount (Customer customer) {
        double rate = new Rate().getTelephoneCharges(customer.getDivision());
        double usage = customer.getUsage();

        int basic = 3200;

        customer.setAmount(basic + (int) Math.floor(rate * usage));
    }
    public void computeCustomerTax(Customer customer) {
        double rate = new Rate().getTaxRate(customer.getDivision());

        customer.setTax((int) Math.floor((rate * customer.getAmount()) / 10) * 10);
    }

    public void computeCostumer(Customer customer) {
        computeCustomerAmount(customer);
        computeCustomerTax(customer);

        customer.setTotal();
    }

    public Compute computeCostumer(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            computeCostumer(customers[i]);
        }

        return this;
    }

    public void sortByTotal(Customer[] customers) {
        Arrays.sort(customers, Comparator.comparing(Customer::getTotal));
        Collections.reverse(Arrays.asList(customers));
    }
}