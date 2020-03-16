package pl.com.bottega.ecommerce.sales.domain.invoicing;

public abstract class TaxStrategy {
    public abstract Tax computeTax(RequestItem requestItem);
}
