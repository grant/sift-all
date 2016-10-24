import com.mcac0006.siftscience.SiftScienceHelper;
import com.mcac0006.siftscience.event.domain.CreateOrder;
import com.mcac0006.siftscience.result.domain.SiftScienceResponse;
import com.mcac0006.siftscience.types.Address;
import com.mcac0006.siftscience.types.Item;
import com.mcac0006.siftscience.types.PaymentGateway;
import com.mcac0006.siftscience.types.PaymentMethod;
import com.mcac0006.siftscience.types.PaymentType;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Sends real test events to Sift Science.
 */
public class EventsTest extends TestCase {

    @Test
    public void testCreateOrder() throws IOException {
        final String API_KEY = new String(Files.readAllBytes(Paths.get(Utils.API_KEY_FILE)));

        CreateOrder createOrder = new CreateOrder()
                .setUserId("billy_jones_301")
                .setSessionId("gigtleqddo84l8cm15qe4il")
                .setOrderId("ORDER-28168441")
                .setUserEmail("bill@gmail.com")
                .setAmount(115940000L)
                .setCurrencyCode("USD")
                .setBillingAddress(new Address()
                        .setName("Bill Jones")
                        .setPhone("1-415-555-6041")
                        .setAddressLine1("2100 Main Street")
                        .setAddressLine2("Apt 3B")
                        .setCity("New London")
                        .setRegion("New Hampshire")
                        .setCountry("US")
                        .setZipCode("03257")
                ).setPaymentMethods(new PaymentMethod[]{
                                new PaymentMethod()
                                        .setPaymentType(PaymentType.CREDIT_CARD)
                                        .setPaymentGateway(PaymentGateway.BRAINTREE)
                                        .setCardBIN("542486")
                                        .setCardLast4("4444")
                        }
                ).setShippingAddress(new Address()
                        .setName("Bill Jones")
                        .setPhone("1-415-555-6041")
                        .setAddressLine1("2100 Main Street")
                        .setAddressLine2("Apt 3B")
                        .setCity("New London")
                        .setRegion("New Hampshire")
                        .setCountry("US")
                        .setZipCode("03257")
                ).setExpeditedShipping(true)
                // Unsupported:
                //.setShippingMethod(ShippingMethod.PHYSICAL)
                .setItems(new Item[]{
                        new Item()
                                .setItemId("12344321")
                                .setProductTitle("Microwavable Kettle Corn: Original Flavor")
                                .setPrice(4990000L)
                                .setUpc("097564307560")
                                .setSku("03586005")
                                .setBrand("Peters Kettle Corn")
                                .setManufacturer("Peters Kettle Corn")
                                .setCategory("Food and Grocery")
                                .setTags(new String[]{"Popcorn", "Snacks", "On Sale"})
                                .setQuantity(4),
                        new Item()
                                .setItemId("B004834GQO")
                                .setProductTitle("The Slanket Blanket-Texas Tea")
                                .setPrice(39990000L)
                                .setUpc("67862114510011")
                                .setSku("004834GQ")
                                .setBrand("Slanket")
                                .setManufacturer("Slanket")
                                .setCategory("Blankets & Throws")
                                .setTags(new String[]{"Awesome", "Wintertime specials"})
                                .setColor("Texas Tea")
                                .setQuantity(2)
                }).setSellerUserId("slinkys_emporium");
        // Unsupported:
//        "$promotions":[
//        {
//            "$promotion_id":"FirstTimeBuyer",
//                "$status":"$success",
//                "$description":"$5 off",
//                "$discount":{
//            "$amount":5000000,  // $5.00
//                    "$currency_code":"USD",
//                    "$minimum_purchase_amount":25000000  // $25.00
//        }
//        }
//        ],

        // these return void, so they can't be chained
        createOrder.setApiKey(API_KEY);
        createOrder.addCustomField("digital_wallet", "apple_pay");
        createOrder.addCustomField("coupon_code", "dollarMadness");
        createOrder.addCustomField("shipping_choice", "FedEx Ground Courier");
        createOrder.addCustomField("is_first_time_buyer", false);

        SiftScienceResponse response = SiftScienceHelper.send(createOrder);
        assertEquals(response.getStatus().intValue(), ErrorCodes.SUCCESS);
    }
}
