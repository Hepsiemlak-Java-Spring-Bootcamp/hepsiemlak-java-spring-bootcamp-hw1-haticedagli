package emlakOOP.model;

import emlakOOP.enums.Currency;

public class Price {
    private Integer value;
    private Currency currency;

    public Price(
            Integer value,
            Currency currency
    ){
        this.value = value;
        this.currency = currency;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Price{" +
                "value=" + value +
                ", currency=" + currency +
                '}';
    }
}
