package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class InstantiateInvoice {
    public static Invoice instantiate(Id invoiceId, ClientData client) {
        return new Invoice(invoiceId, client);
    }
}
