package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;

public class InvoiceFactory {

    public static Invoice createInvoice(ClientData client) {
        Invoice invoice = new Invoice(Id.generate(), client);

        return invoice;
    }
}