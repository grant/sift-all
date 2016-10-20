curl -XPUT 'https://api3.siftscience.com/v3/accounts/54fdb264e4b0743fd540888a/devices/0ef840778p8q3j3jfs654q0vvk/label' \
  -H 'Content-Type: application/json' \
  -u "$(cat ../.api_key)" \
  -d '{
  "label" : "bad"
}'