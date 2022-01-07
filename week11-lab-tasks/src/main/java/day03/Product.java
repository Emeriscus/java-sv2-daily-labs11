package day03;

import java.time.LocalDate;

public class Product extends Item {

    public Product(String name, int price) {
        super(name, price);
    }

    @Override
    public void setExpiryDate(LocalDate sellDate) {
//        super.setExpiryDate(sellDate.plusMonths(3));
        expiryDate = sellDate.plusMonths(3);
    }

    public void extendExpiryDate() {
//       super.setExpiryDate(getExpiryDate().plusMonths(33));
        expiryDate = expiryDate.plusMonths(33);
    }
}
