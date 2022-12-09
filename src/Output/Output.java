package Output;

import Customer.Customer;
import Rate.Rate;

import java.text.DecimalFormat;

public class Output {
    private void line() {
        line('-', 70);
    }
    private void line(char ch, int length) {
        for (int i = 0; i < length; i++)
            System.out.printf("%c", ch);
        System.out.println();
    }
    public void output(Customer[] customers) {
        System.out.println("                              수도요  사용양                ");
        line();
        System.out.println("    번호구분   이름비고도   구분   사용양   사용금액   tax    납부액    비고    ");
        line();

        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            output(customer);
            System.out.println();
        }

        line();
    }

    public void output(Customer customer) {
        DecimalFormat df = new DecimalFormat("#,###");

        System.out.printf("%s  %s   %s    %s    %s  %s   %s  %s",
                customer.getNumber(),
                customer.getName(),
                new Rate().getDivisionName(customer.getDivision()),
                String.format("%3.0f", customer.getUsage()),
                String.format("%6s", df.format(customer.getAmount())),
                String.format("%5s", df.format(customer.getTax())),
                String.format("%6s", df.format(customer.getTotal())),
                customer.getNote()
        );
    }
}