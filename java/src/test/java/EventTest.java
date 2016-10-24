import com.mcac0006.siftscience.event.domain.AddItemToCart;
import com.mcac0006.siftscience.event.domain.CreateAccount;
import com.mcac0006.siftscience.event.domain.CreateContent;
import com.mcac0006.siftscience.event.domain.CreateOrder;
import com.mcac0006.siftscience.event.domain.Custom;
import com.mcac0006.siftscience.event.domain.LinkSessionToUser;
import com.mcac0006.siftscience.event.domain.Login;
import com.mcac0006.siftscience.event.domain.Logout;
import com.mcac0006.siftscience.event.domain.RemoveItemFromCart;
import com.mcac0006.siftscience.event.domain.SendMessage;
import com.mcac0006.siftscience.event.domain.SubmitReview;
import com.mcac0006.siftscience.event.domain.Transaction;
import com.mcac0006.siftscience.event.domain.UpdateAccount;
import com.mcac0006.siftscience.types.Address;
import com.mcac0006.siftscience.types.Item;
import com.mcac0006.siftscience.types.LoginStatus;
import com.mcac0006.siftscience.types.PaymentGateway;
import com.mcac0006.siftscience.types.PaymentMethod;
import com.mcac0006.siftscience.types.PaymentType;
import com.mcac0006.siftscience.types.SocialSignOnType;
import com.mcac0006.siftscience.types.SubmissionStatus;
import com.mcac0006.siftscience.types.TransactionType;
import org.junit.Test;

import java.io.IOException;

/**
 * Sends real test events to Sift Science.
 */
public class EventTest extends SiftTest {
    private static final PaymentMethod PAYMENT_METHOD = new PaymentMethod()
            .setPaymentType(PaymentType.CREDIT_CARD)
            .setPaymentGateway(PaymentGateway.BRAINTREE)
            .setCardBIN("542486")
            .setCardLast4("4444");
    private static final PaymentMethod[] PAYMENT_METHODS = new PaymentMethod[]{PAYMENT_METHOD};
    private static final Item MICROWAVABLE_KETTLE_CORN_ORIGINAL_FLAVOR = new Item()
            .setItemId("12344321")
            .setProductTitle("Microwavable Kettle Corn: Original Flavor")
            .setPrice(4990000L)
            .setUpc("097564307560")
            .setSku("03586005")
            .setBrand("Peters Kettle Corn")
            .setManufacturer("Peters Kettle Corn")
            .setCategory("Food and Grocery")
            .setTags(new String[]{"Popcorn", "Snacks", "On Sale"})
            .setQuantity(4);
    private static final Item THE_SLANKET_BLANKET_TEXAS_TEA = new Item()
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
            .setQuantity(2);
    protected static final String USER_ID = "billy_jones_301";
    private static final String USER_EMAIL = "bill@gmail.com";
    private static final String SESSION_ID = "gigtleqddo84l8cm15qe4il";
    private static final String ORDER_ID = "ORDER-28168441";
    private static final long AMOUNT = 115940000L;
    private static final String CURRENCY_CODE = "USD";
    private static final String SELLER_USER_ID = "slinkys_emporium";
    private static final String CUSTOM_EMAIL_CONFIRMED_STATUS = "email_confirmed_status";
    private static final String CUSTOM_PHONE_CONFIRMED_STATUS = "phone_confirmed_status";
    private static final Address ADDRESS = new Address()
            .setName("Bill Jones")
            .setPhone("1-415-555-6041")
            .setAddressLine1("2100 Main Street")
            .setAddressLine2("Apt 3B")
            .setCity("New London")
            .setRegion("New Hampshire")
            .setCountry("US")
            .setZipCode("03257");
    private static final String NAME = "Bill Jones";
    private static final String PHONE = "1-415-555-6040";
    private static final String REFERRER_USER_ID = "janejane101";
    private static final String SUBJECT = "2 Bedroom Apartment for Rent";
    private static final String CONTENT = "Capitol Hill Seattle brand new condo. 2 bedrooms and 1 full bath.";
    private static final String REVIEW_TITLE = "Title of Review Goes Here";
    private static final String ITEM_ID = "V4C3D5R2Z6";
    private static final Item ITEM = new Item()
            .setItemId(ITEM_ID)
            .setProductTitle("The Slanket Blanket-Texas Tea")
            .setPrice(39990000L)
            .setCurrency("USD")
            .setUpc("67862114510011")
            .setSku("004834GQ")
            .setBrand("Slanket")
            .setManufacturer("Slanket")
            .setCategory("Blankets & Throws")
            .setTags(new String[]{"Awesome", "Wintertime specials"})
            .setColor("Texas Tea")
            .setQuantity(16);
    private static final String EVENT_MAKE_CALL = "make_call";

    public EventTest() throws IOException {
        super();
    }

    @Test
    public void testCreateOrder() {
        CreateOrder createOrder = new CreateOrder()
                .setUserId(USER_ID)
                .setSessionId(SESSION_ID)
                .setOrderId(ORDER_ID)
                .setUserEmail(USER_EMAIL)
                .setAmount(AMOUNT)
                .setCurrencyCode(CURRENCY_CODE)
                .setBillingAddress(ADDRESS)
                .setPaymentMethods(new PaymentMethod[]{PAYMENT_METHOD})
                .setShippingAddress(ADDRESS)
                .setExpeditedShipping(true)
                // Unsupported:
                //.setShippingMethod(ShippingMethod.PHYSICAL)
                .setItems(new Item[]{
                        MICROWAVABLE_KETTLE_CORN_ORIGINAL_FLAVOR,
                        THE_SLANKET_BLANKET_TEXAS_TEA
                }).setSellerUserId(SELLER_USER_ID);
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
        createOrder.addCustomField("digital_wallet", "apple_pay");
        createOrder.addCustomField("coupon_code", "dollarMadness");
        createOrder.addCustomField("shipping_choice", "FedEx Ground Courier");
        createOrder.addCustomField("is_first_time_buyer", false);

        assertEventSuccessful(createOrder);
    }

    @Test
    public void testUpdateOrder() {
        // Update order is not supported
    }

    @Test
    public void testTransaction() {
        Transaction transaction = new Transaction()
                .setUserId(USER_ID)
                .setAmount(506790000L)
                .setCurrencyCode("USD")
                .setUserEmail(USER_EMAIL)
                .setTransactionType(TransactionType.SALE)
                .setOrderId(ORDER_ID)
                .setTransactionId("719637215")
                .setBillingAddress(ADDRESS)
                .setPaymentMethod(PAYMENT_METHOD)
                .setShippingAddress(ADDRESS)
                .setSessionId(SESSION_ID)
                .setSellerUserId("slinkys_emporium");

        transaction.addCustomField("digital_wallet", "apple_pay");
        transaction.addCustomField("coupon_code", "dollarMadness");
        transaction.addCustomField("shipping_choice", "FedEx Ground Courier");
        transaction.addCustomField("is_first_time_buyer", false);

        assertEventSuccessful(transaction);
    }

    @Test
    public void testCreateAccount() {
        CreateAccount createAccount = new CreateAccount()
                .setUserId(USER_ID)
                .setSessionId(SESSION_ID)
                .setUserEmail(USER_EMAIL)
                .setName(NAME)
                .setPhone(PHONE)
                .setReferrerUserId(REFERRER_USER_ID)
                .setPaymentMethods(PAYMENT_METHODS)
                .setBillingAddress(ADDRESS)
                // Unsupported
                // .setShippingAddress()
                // .setPromotions()
                .setSocialSignOnType(SocialSignOnType.TWITTER);

        createAccount.addCustomField("twitter_handle", "billyjones");
        createAccount.addCustomField("work_phone", "1-347-555-5921");
        createAccount.addCustomField("location", "New London, NH");
        createAccount.addCustomField("referral_code", "MIKEFRIENDS");
        createAccount.addCustomField(CUSTOM_EMAIL_CONFIRMED_STATUS, "$pending");
        createAccount.addCustomField(CUSTOM_PHONE_CONFIRMED_STATUS, "$pending");

        assertEventSuccessful(createAccount);
    }

    @Test
    public void testUpdateAccount() {
        UpdateAccount updateAccount = new UpdateAccount()
                .setUserId(USER_ID)
                .setChangedPassword(true)
                .setUserEmail(USER_EMAIL)
                .setName(NAME)
                .setPhone(PHONE)
                .setReferrerUserId(REFERRER_USER_ID)
                .setPaymentMethods(PAYMENT_METHODS)
                .setBillingAddress(ADDRESS)
                // Unsupported
                // .setShippingAddress()
                .setSocialSignOnType(SocialSignOnType.TWITTER);

        updateAccount.addCustomField(CUSTOM_EMAIL_CONFIRMED_STATUS, "$success");
        updateAccount.addCustomField(CUSTOM_PHONE_CONFIRMED_STATUS, "$success");

        assertEventSuccessful(updateAccount);
    }

    @Test
    public void testCreateContent() {
        // We could send these fields as "custom fields" with dollar signs if we really needed to.
        CreateContent createContent = new CreateContent()
                .setUserId(USER_ID)
                .setContactEmail(USER_EMAIL)
                .setContactPhone(PHONE)
                //.setContentId
                .setSubject(SUBJECT)
                .setContent(CONTENT);
        // .setAmount
        // .setCurrencyCode
        // .setCategories
        // .setLocations
        // .setImageHashes
        // .setExpirationTime
        // .setStatus
        assertEventSuccessful(createContent);
    }

    @Test
    public void testUpdateContent() {
        // Update content is not supported.
    }

    @Test
    public void testContentStatus() {
        // Content status is not supported.
    }

    @Test
    public void testFlagContent() {
        // Flag content is not supported.
    }

    @Test
    public void testAddPromotion() {
        // Add promotion is not supported
    }

    @Test
    public void testAddItemToCart() {
        AddItemToCart addItemToCart = new AddItemToCart()
                .setUserId(USER_ID)
                .setSessionId(SESSION_ID)
                .setItem(ITEM);
        assertEventSuccessful(addItemToCart);
    }

    @Test
    public void testRemoveItemFromCart() {
        RemoveItemFromCart removeItemFromCart = new RemoveItemFromCart()
                .setUserId(USER_ID)
                .setSessionId(SESSION_ID)
                .setItem(ITEM);
        assertEventSuccessful(removeItemFromCart);
    }

    @Test
    public void testSubmitReview() {
        SubmitReview submitReview = new SubmitReview()
                .setUserId(USER_ID)
                .setContent(CONTENT)
                .setReviewTitle(REVIEW_TITLE)
                .setItemId(ITEM_ID)
                .setReviewedUserId(USER_ID)
                .setSubmissionStatus(SubmissionStatus.SUCCESS);
        submitReview.addCustomField("rating", "5");
        assertEventSuccessful(submitReview);
    }

    @Test
    public void testSendMessage() {
        SendMessage sendMessage = new SendMessage()
                .setUserId(USER_ID)
                .setRecipientUserId(USER_ID)
                .setSubject(SUBJECT)
                .setContent(CONTENT);
        assertEventSuccessful(sendMessage);
    }

    @Test
    public void testLogin() {
        Login login = new Login()
                .setUserId(USER_ID)
                .setSessionId(SESSION_ID)
                .setLoginStatus(LoginStatus.SUCCESS);
        assertEventSuccessful(login);
    }

    @Test
    public void testLogout() {
        Logout logout = new Logout()
                .setUserId(USER_ID);
        assertEventSuccessful(logout);
    }

    @Test
    public void testLinkSessionToUser() {
        LinkSessionToUser linkSessionToUser = new LinkSessionToUser()
                .setUserId(USER_ID)
                .setSessionId(SESSION_ID);
        assertEventSuccessful(linkSessionToUser);
    }

    @Test
    public void testChargeback() {
        // Chargeback is not supported
    }

    @Test
    public void testOrderStatus() {
        // Order status is not supported
    }

    @Test
    public void testCustom() {
        Custom customEvent = new Custom(EVENT_MAKE_CALL);
        customEvent.addCustomField("$user_id", USER_ID);
        customEvent.addCustomField("recipient_user_id", "marylee819");
        customEvent.addCustomField("call_duration", 4428);
    }
}
