package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface ITaxStrategy {
    public Tax calculate(RequestItem item);
}
