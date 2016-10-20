curl -XPOST 'https://api3.siftscience.com/v3/partners/54fdb264e4b0743fd540888a/accounts' \
  -H 'Content-Type: application/json' \
  -u "$(cat ../.api_key)": \
  -d '{
  "site_url" : "merchant123.com",
  "site_email" : "owner@merchant123.com",
  "analyst_email" : "john.doe@merchant123.com",
  "password" : "s0mepA55word"
}'