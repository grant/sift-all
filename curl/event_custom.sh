# Sample custom make_call event
curl -X POST -d '{
  "$type"              : "make_call",
  "$api_key"           : "'$(cat ../.api_key)'",
  "$user_id"           : "billy_jones_301",
  "recipient_user_id"  : "marylee819",
  "call_duration"      : 4428
}' https://api.siftscience.com/v204/events