package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface ITax {
    public Tax compute(RequestItem requestItem);
}
