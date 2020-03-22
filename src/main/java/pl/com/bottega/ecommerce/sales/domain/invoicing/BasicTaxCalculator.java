package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.math.BigDecimal;

public class BasicTaxCalculator implements TaxStartegy {

    @Override
    public Tax calculateTax(ProductType productType, Money money) {
        BigDecimal ratio = null;
        String desc = null;
        Money taxValue = null;
        switch (productType) {
            case DRUG:
                ratio = BigDecimal.valueOf(0.05);
                desc = "5% (D)";

                taxValue = money;
                return new Tax(taxValue, desc);
            case FOOD:
                ratio = BigDecimal.valueOf(0.07);
                desc = "7% (F)";

                taxValue = money;
                return new Tax(taxValue, desc);
            case STANDARD:
                ratio = BigDecimal.valueOf(0.23);
                desc = "23%";

                taxValue = money;
                return new Tax(taxValue, desc);

            default:
                throw new IllegalArgumentException(productType + " not handled");
        }

    }
}
