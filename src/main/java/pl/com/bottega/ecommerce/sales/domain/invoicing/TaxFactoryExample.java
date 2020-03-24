package pl.com.bottega.ecommerce.sales.domain.invoicing;

public class TaxFactoryExample implements TaxFactory {
    @Override
    public Tax getTax(RequestItem item) {
        return TaxFactory.super.getTax(item);
    }
}
