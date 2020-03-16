package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface StrategyTax {
    Tax createTax(RequestItem item);
}
