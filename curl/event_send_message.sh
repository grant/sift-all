# Sample $send_message event
curl -X POST -d '{
  "$type"       : "$send_message",
  "$api_key"    : "'$(cat ../.api_key)'",
  "$user_id"    : "billy_jones_301",

  "$recipient_user_id" : "512924123",
  "$subject"    : "Subject line of the message.",
  "$content"    : "Text content of message."
}' https://api.siftscience.com/v204/events