/**
 * Sift Science error codes
 * TODO This should be moved to `sift-java`
 * @see <a href="https://siftscience.com/developers/docs/curl/events-api/error-codes">Error Codes</a>
 */
public class ErrorCodes {
    public static final int SERVICE_UNAVAILABLE = -4; // Service currently unavailable. Please try again later.
    public static final int SERVER_TIMEOUT = -3; // Server-side timeout processing request. Please try again later.
    public static final int SERVER_ERROR_2 = -2; // Unexpected server-side error
    public static final int SERVER_ERROR_1 = -1; // Unexpected server-side error
    public static final int SUCCESS = 0; // Success
    public static final int INVALID_API_KEY = 51; // Invalid API key
    public static final int INVALID_CHARACTERS_IN_FIELD_NAME = 52; // Invalid characters in field name
    public static final int INVALID_CHARACTERS_IN_FIELD_VALUE = 53; // Invalid characters in field value
    public static final int MISSING_REQUIRED_FIELDS = 55; // Missing required field
    public static final int INVALID_JSON_REQUEST = 56; // Invalid JSON in request
    public static final int INVALID_HTTP_BODY = 57; // Invalid HTTP body
    public static final int RATE_LIMITED = 60; // Rate limited
    public static final int INVALID_API_VERSION = 104; // Invalid API version
    public static final int NOT_A_VALID_RESERVED_FIELD = 105; // Not a valid reserved field
}
