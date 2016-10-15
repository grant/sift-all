# Improvements I'd suggest (as an external developer) for Sift Science.

- Looking at the API Logs, I'm not given a great experience.
  - I believe I have already verified my email.
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