import com.mcac0006.siftscience.SiftScienceHelper;
import com.mcac0006.siftscience.event.domain.Event;
import com.mcac0006.siftscience.label.domain.Label;
import com.mcac0006.siftscience.result.domain.SiftScienceResponse;
import junit.framework.TestCase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Super class for all sift tests.
 */
public class SiftTest extends TestCase {
    private String API_KEY;
    public SiftTest() throws IOException {
        API_KEY = new String(Files.readAllBytes(Paths.get("../.api_key")));
    }

    /**
     * Asserts that the response is successful.
     *
     * @param event The sift event
     */
    protected void assertEventSuccessful(Event event) {
        event.setApiKey(API_KEY);
        SiftScienceResponse response = SiftScienceHelper.send(event);
        assertEquals(response.getStatus().intValue(), ErrorCodes.SUCCESS);
    }

    /**
     * Asserts that the response is successful.
     * @param userId The user to label
     * @param label The new label
     */
    protected void assertLabelSuccessful(String userId, Label label) {
        label.setApiKey(API_KEY);
        SiftScienceResponse response = SiftScienceHelper.send(userId, label);
        System.out.println(response.getRequest());
        assertEquals(response.getStatus().intValue(), ErrorCodes.SUCCESS);
    }
}
