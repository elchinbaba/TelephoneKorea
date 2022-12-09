package Rate;

import java.util.*;

public enum Rates {
    HOUSEHOLD(1, "홍길동", 80, 0.052),
    BUSINESS(2, "이대한", 45, 0.025),
    FACTORIES(3, "이으뜸", 60, 0.035),
    OFFICES(4, "나이쁨", 40, 0.015),
    MILITARY(5, "한국민", 20, 0.0);

    private final int divisionCode;
    private final String divisionName;
    private final double telephoneCharges;
    private final double taxRate;
    Rates(int divisionCode, String divisionName, double waterRate, double taxRate) {
        this.divisionCode = divisionCode;
        this.divisionName = divisionName;
        this.telephoneCharges = waterRate;
        this.taxRate = taxRate;
    }

    private static final Map<Integer, Rates> map;
    static {
        map = new HashMap<>();
        for (Rates v : Rates.values()) {
            map.put(v.divisionCode, v);
        }
    }
    public static Rates findByDivisionCode(int i) {
        return map.get(i);
    }

    public String getDivisionName() {
        return divisionName;
    }
    public double getTelephoneCharges() {
        return telephoneCharges;
    }
    public double getTaxRate() {
        return taxRate;
    }
}