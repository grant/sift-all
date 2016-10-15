# Example curl request to label a user:
curl -X POST https://api.siftscience.com/v204/users/billy_jones_301/labels -d \
'{
  "$api_key"     : "'$(cat ../.api_key)'",
  "$is_bad"      : true,
  "$abuse_type"  : "payment_abuse",
  "$description" : "The user was testing cards repeatedly for a valid card",
  "$source"      : "manual review",
  "$analyst"     : "someone@your-site.com"
}'