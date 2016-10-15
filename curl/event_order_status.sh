# Sample $order_status event
curl -X POST -d '{
  "$type"             : "$order_status",
  "$api_key"          : "'$(cat ../.api_key)'",
  "$user_id"          : "billy_jones_301",
  "$order_id"         : "ORDER-28168441",
  "$order_status"     : "$canceled",

  "$reason"           : "$payment_risk",
  "$source"           : "$manual_review",
  "$analyst"          : "someone@your-site.com",
  "$webhook_id"       : "3ff1082a4aea8d0c58e3643ddb7a5bb87ffffeb2492dca33",
  "$description"      : "Canceling because multiple fraudulent users on device"
}' https://api.siftscience.com/v204/events