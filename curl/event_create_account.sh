# Sample $create_account event
curl -X POST -d '{
  "$type"       : "$create_account",
  "$api_key"    : "'$(cat ../.api_key)'",
  "$user_id"    : "billy_jones_301",

  "$session_id"       : "gigtleqddo84l8cm15qe4il",
  "$user_email"       : "bill@gmail.com",
  "$name"             : "Bill Jones",
  "$phone"            : "1-415-555-6040",
  "$referrer_user_id" : "janejane101",
  "$payment_methods"  : [
      {
          "$payment_type"    : "$credit_card",
          "$card_bin"        : "542486",
          "$card_last4"      : "4444"
      }
  ],
  "$billing_address"  : {
      "$name"         : "Bill Jones",
      "$phone"        : "1-415-555-6040",
      "$address_1"    : "2100 Main Street",
      "$address_2"    : "Apt 3B",
      "$city"         : "New London",
      "$region"       : "New Hampshire",
      "$country"      : "US",
      "$zipcode"      : "03257"
  },
  "$shipping_address"  : {
      "$name"          : "Bill Jones",
      "$phone"         : "1-415-555-6041",
      "$address_1"     : "2100 Main Street",
      "$address_2"     : "Apt 3B",
      "$city"          : "New London",
      "$region"        : "New Hampshire",
      "$country"       : "US",
      "$zipcode"       : "03257"
  },
  "$promotions"       : [
    {
      "$promotion_id"     : "FriendReferral",
      "$status"           : "$success",
      "$referrer_user_id" : "janejane102",
      "$credit_point"     : {
        "$amount"             : 100,
        "$credit_point_type"  : "account karma"
      }
    }
  ],

  "$social_sign_on_type"   : "$twitter",

  "twitter_handle"          : "billyjones",
  "work_phone"              : "1-347-555-5921",
  "location"                : "New London, NH",
  "referral_code"           : "MIKEFRIENDS",
  "email_confirmed_status"  : "$pending",
  "phone_confirmed_status"  : "$pending"
}' https://api.siftscience.com/v204/events