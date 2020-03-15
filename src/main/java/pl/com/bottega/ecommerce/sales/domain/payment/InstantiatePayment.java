package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class InstantiatePayment {
    static Payment instantiate(ClientData clientData, Money amount) {
        return new Payment(Id.generate(), clientData, amount);
    }
}
