package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface TaxCalculateStrategy {
    public Tax calculateTax(RequestItem item);
}
