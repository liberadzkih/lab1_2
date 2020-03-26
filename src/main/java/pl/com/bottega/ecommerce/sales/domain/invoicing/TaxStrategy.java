package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface TaxStrategy {
    Tax calculateTax(RequestItem item);
}
