package pl.com.bottega.ecommerce;

import pl.com.bottega.ecommerce.sales.domain.invoicing.Tax;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public interface ICalculator {
        public Tax calculate(ProductType type, Money net);
}
