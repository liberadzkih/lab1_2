package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class InvoiceLineFactory {
    public static InvoiceLine createInvoiceLine(ProductData product, int quantity, Money net, Tax tax) {
        return new InvoiceLine(product, quantity, net, tax);
    }
}
