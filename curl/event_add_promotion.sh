# Sample $add_promotion event
curl -X POST -d '{
  "$type"       : "$add_promotion",
  "$api_key"    : "'$(cat ../.api_key)'",
  "$user_id"    : "billy_jones_301",

  "$promotions" : [
    {
      "$promotion_id"     : "NewRideDiscountMay2016",
      "$status"           : "$success",
      "$description"      : "$5 off your first 5 rides",
      "$referrer_user_id" : "elon-m93903",
      "$discount"         : {
        "$amount"         : 5000000,
        "$currency_code"  : "USD"
      }
    }
  ]
}' https://api.siftscience.com/v204/events