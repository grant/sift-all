import com.mcac0006.siftscience.label.domain.Label;
import org.junit.Test;

import java.io.IOException;

/**
 * Send real labels to Sift Science.
 */
public class LabelTests extends SiftTest {
    public LabelTests() throws IOException {
        super();
    }

    @Test
    public void testLabelUser() {
        Label label = new Label()
                .setIsBad(true)
                // .setAbuseType()
                .setDescription("The user was testing cards repeatedly for a valid card");
                // .setSource()
                // .setAnalyst()
        assertLabelSuccessful(EventTest.USER_ID, label);
    }

    @Test
    public void testUnlabelUser() {

        // Unlabel is not supported.
    }
}
