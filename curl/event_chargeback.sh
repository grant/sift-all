# Sample $chargeback event
curl -X POST -d '{
  "$type"              : "$chargeback",
  "$api_key"           : "'$(cat ../.api_key)'",
  "$user_id"           : "billy_jones_301",
  "$order_id"          : "ORDER-123124124",
  "$transaction_id"    : "719637215",

  "$chargeback_state"  : "$lost",
  "$chargeback_reason" : "$duplicate"
}' https://api.siftscience.com/v204/events