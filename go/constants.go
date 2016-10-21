package main

// Field names
const FIELD_TRANSACTION_ID string = "$transaction_id"
const FIELD_USER_ID string = "$user_id"
const FIELD_CURRENCY_CODE string = "$currency_code"
const FIELD_AMOUNT string = "$amount"
const FIELD_TIME string = "$time"
const FIELD_ORDER_ID string = "$order_id"
const FIELD_SESSION_ID string = "$session_id"
const FIELD_USER_EMAIL string = "$user_email"
const FIELD_BILLING_ADDRESS string = "$billing_address"
const FIELD_PAYMENT_METHODS string = "$payment_methods"
const FIELD_ITEMS string = "$items";
const FIELD_SHIPPING_ADDRESS string = "$shipping_address";
const FIELD_EXPEDITED_SHIPPING string = "$expedited_shipping";
const FIELD_SHIPPING_METHOD string = "$shipping_method";

// Subfield names
const FIELD_BILLING_ADDRESS_NAME string = "$name"
const FIELD_BILLING_ADDRESS_PHONE string = "$phone"
const FIELD_BILLING_ADDRESS_ADDRESS_1 string = "$address_1"
const FIELD_BILLING_ADDRESS_ADDRESS_2 string = "$address_2"
const FIELD_BILLING_ADDRESS_CITY string = "$city"
const FIELD_BILLING_ADDRESS_REGION string = "$region"
const FIELD_BILLING_ADDRESS_COUNTRY string = "US"
const FIELD_BILLING_ADDRESS_ZIPCODE string = "03257"
const FIELD_PAYMENT_METHODS_PAYMENT_TYPE string = "$payment_type";
const FIELD_PAYMENT_METHODS_PAYMENT_GATEWAY string = "$payment_gateway";
const FIELD_PAYMENT_METHODS_CARD_BIN string = "$card_bin";
const FIELD_PAYMENT_METHODS_CARD_LAST4 string = "$card_last4";
const FIELD_SHIPPING_ADDRESS_NAME string = "$name";
const FIELD_SHIPPING_ADDRESS_PHONE string = "$phone";
const FIELD_SHIPPING_ADDRESS_ADDRESS_1 string = "$address_1";
const FIELD_SHIPPING_ADDRESS_ADDRESS_2 string = "$address_2";
const FIELD_SHIPPING_ADDRESS_CITY string = "$city";
const FIELD_SHIPPING_ADDRESS_REGION string = "$region";
const FIELD_SHIPPING_ADDRESS_COUNTRY string = "$country";
const FIELD_SHIPPING_ADDRESS_ZIPCODE string = "$zipcode";
const FIELD_ITEMS_ITEM_ID string = "$item_id";
const FIELD_ITEMS_PRODUCT_TITLE string = "$product_title";
const FIELD_ITEMS_PRICE string = "$price";
const FIELD_ITEMS_UPC string = "$upc";
const FIELD_ITEMS_SKU string = "$sku";
const FIELD_ITEMS_BRAND string = "$brand";
const FIELD_ITEMS_MANUFACTURER string = "$manufacturer";
const FIELD_ITEMS_CATEGORY string = "$category";
const FIELD_ITEMS_TAGS string = "$tags";
const FIELD_ITEMS_QUANTITY string = "$quantity";


// Events
const EVENT_CREATE_ORDER string = "$create_order"
const EVENT_TRANSACTION string = "$transaction"
