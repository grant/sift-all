# Sample $update_account event
curl -X POST -d '{
  "$type"       : "$update_account",
  "$api_key"    : "'$(cat ../.api_key)'",
  "$user_id"    : "billy_jones_301",

  "$changed_password" : true,
  "$user_email"       : "bill@gmail.com",
  "$name"             : "Bill Jones",
  "$phone"            : "1-415-555-6040",
  "$referrer_user_id" : "janejane102",
  "$payment_methods"  : [
      {
          "$payment_type"    : "$credit_card",
          "$card_bin"        : "542486",
          "$card_last4"      : "4444"
      }
  ],
  "$billing_address"  :
  {
      "$name"         : "Bill Jones",
      "$phone"        : "1-415-555-6041",
      "$address_1"    : "2100 Main Street",
      "$address_2"    : "Apt 3B",
      "$city"         : "New London",
      "$region"       : "New Hampshire",
      "$country"      : "US",
      "$zipcode"      : "03257"
  },
  "$shipping_address" : {
      "$name"         : "Bill Jones",
      "$phone"        : "1-415-555-6041",
      "$address_1"    : "2100 Main Street",
      "$address_2"    : "Apt 3B",
      "$city"         : "New London",
      "$region"       : "New Hampshire",
      "$country"      : "US",
      "$zipcode"      : "03257"
  },

  "$social_sign_on_type"   : "$twitter",

  "email_confirmed_status"   : "$success",
  "phone_confirmed_status"   : "$success"
}' https://api.siftscience.com/v204/events