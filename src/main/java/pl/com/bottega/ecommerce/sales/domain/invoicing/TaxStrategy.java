package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface TaxStrategy {
    Tax calculate(RequestItem requestItem);
}
