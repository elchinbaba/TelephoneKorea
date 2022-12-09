package Customer;

import Rate.Rates;

public class Customer {
    private String number;
    private String name;
    private int division;
    private double usage;
    private int amount;
    private int tax;
    private int total;
    private String note;
    Customer (String number, String name, int division, double usage) {
        this.number = number;
        this.name = name;
        this.division = division;
        this.usage = usage;

        if (Rates.findByDivisionCode(division) == Rates.MILITARY) {
            this.note = "일괄징수";
        } else {
            this.note = "";
        }
    }
    public String getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }

    public int getDivision() {
        return division;
    }

    public double getUsage() {
        return usage;
    }

    public int getAmount() {
        return amount;
    }

    public int getTax() {
        return tax;
    }

    public int getTotal() {
        return total;
    }

    public String getNote() {
        return note;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setTax(int value) {
        this.tax = value;
    }

    public void setTotal() {
        this.total = this.amount + this.tax;
    }

    public static Customer convertInputToCustomer(String[] input) {
        String customerNumber = input[0];
        String customerName = input[1];
        int customerDivision = Integer.parseInt(input[2]);
        double customerUsage = Double.parseDouble(input[3]);

        return new Customer(customerNumber, customerName, customerDivision, customerUsage);
    }

    public static Customer[] convertInputToCustomer(String[][] input) {
        Customer[] customers = new Customer[input.length];
        for (int i = 0; i < input.length; i++) {
            customers[i] = Customer.convertInputToCustomer(input[i]);
        }

        return customers;
    }
}