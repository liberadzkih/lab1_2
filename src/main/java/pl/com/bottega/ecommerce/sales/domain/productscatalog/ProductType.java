/*
 * Copyright 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package pl.com.bottega.ecommerce.sales.domain.productscatalog;

import java.math.BigDecimal;

import pl.com.bottega.ecommerce.sales.domain.invoicing.Tax;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public enum ProductType {

    DRUG {

        @Override
        public Tax computeTax(Money net) {
            return new Tax(net.multiplyBy(BigDecimal.valueOf(0.05)), "5% (f)");
        }
    },
    FOOD {

        @Override
        public Tax computeTax(Money net) {
            return new Tax(net.multiplyBy(BigDecimal.valueOf(0.07)), "7% (D)");
        }
    },
    STANDARD

    {

        @Override
        public Tax computeTax(Money net) {
            return new Tax(net.multiplyBy(BigDecimal.valueOf(0.23)), "23%");
        }
    };

    public abstract Tax computeTax(Money net);
}
