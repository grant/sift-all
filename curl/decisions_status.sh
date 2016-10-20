# Example curl request to remove a payment abuse label:
curl -XGET https://api3.siftscience.com/v3/accounts/54fdb264e4b0743fd540888a/users/billy_jones_301/decisions \
-H 'Content-Type: application/json' \
-u "$(cat ../.api_key)"