package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface TaxSchemeStrategy {
    public Tax compute(RequestItem requestItem);
}
