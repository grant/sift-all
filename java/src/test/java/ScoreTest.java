import com.mcac0006.siftscience.score.domain.SiftScienceScore;
import org.junit.Test;

import java.io.IOException;

/**
 * Sends real test score requests to Sift Science.
 */
public class ScoreTest  extends SiftTest {
    private static final String USER_ID = "user_id";

    public ScoreTest() throws IOException {
        super();
    }

    @Test
    public void testScore() {
        SiftScienceScore siftScienceScore = new SiftScienceScore();
        siftScienceScore.setUserId(USER_ID);
        // The class isn't complete enough to actually request a score.
    }
}
