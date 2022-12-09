package Rate;

public class Rate {
    public String getDivisionName(int capitalDivisionCode) {
        return Rates.findByDivisionCode(capitalDivisionCode).getDivisionName();
    }
    public double getWaterRate(int capitalDivisionCode) {
        return Rates.findByDivisionCode(capitalDivisionCode).getWaterRate();
    }

    public double getTaxRate(int capitalDivisionCode) {
        return Rates.findByDivisionCode(capitalDivisionCode).getTaxRate();
    }
}