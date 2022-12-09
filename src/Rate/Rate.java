package Rate;

public class Rate {
    public String getDivisionName(int divisionCode) {
        return Rates.findByDivisionCode(divisionCode).getDivisionName();
    }
    public double getTelephoneCharges(int divisionCode) {
        return Rates.findByDivisionCode(divisionCode).getTelephoneCharges();
    }

    public double getTaxRate(int divisionCode) {
        return Rates.findByDivisionCode(divisionCode).getTaxRate();
    }
}