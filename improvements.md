# Improvements I'd suggest (as an external developer) for Sift Science.
 
- The filter has overlapping times (in hours).
- I made some API calls, but the logs only say they show an hour.
  - ![](https://cloud.githubusercontent.com/assets/744973/19218806/3fdabd86-8db8-11e6-8dc5-4e2801092be2.png)
- I can't copy-and-paste actual code (cURL) unlike for Stripe.
- The URL schema is weird and excessively long
  - https://siftscience.com/developers/docs/curl/apis-overview
  - https://stripe.com/docs/api?lang=cur
- Some documentation files have tailing spaces.
- https://siftscience.com/developers/docs/curl/events-api/reserved-events/remove-item-from-cart is cut off from the column on the left
- cURL doesn't support comments like in docs, it should change.
- Labelling
  - Labeling doesn't show in API logs, but works.
  - Unlabel user doesn't seem to work: https://siftscience.com/developers/docs/curl/labels-api/unlabel-user
- Why does decision status have a different auth curl command?
  - https://siftscience.com/developers/docs/curl/decisions-api/decision-status
  - Why does it prompt you with a password that it doesn't use?
- The command for cURL is different per example (using quotes in URL, tabs)
- Synchronous scoring example shouldn't isn't formatted properly (see example)
- "Score API > Score API" is redundant and unlike other pages
- user/account is very confusing and inconsistant in the API
- couldn't get dicision status to work
- device fingerprinting has a typo (colon)
- Hardcoded account ids: (i.e. device_fingerprinting_label_a_device.sh)
- device fingerprinting api said feature disabled (in my sift science account)
- using a colon instead of a semicolon to terminate curl requests
- I can't test the device fingerprinting or partner APIs

---

- > Done with cURL API examples
- > Worked a bit on Go examples
- > Working on Java examples

- Error codes are really weird.
- Sample events are verbose, and don't exactly match each other (i.e. example properties are not all the same in each example)
- Why does removing items from cart require so many fields. Can't you just remove using the "$item_id"?

- > Done with Java examples
| Working on PHP examples
