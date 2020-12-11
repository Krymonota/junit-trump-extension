package id.niklas.junit_trump_extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Instead of enabling automatic extension detection, you can also annotate your test classes to register the extension
 * declaratively:
 * <p>
 * {@code @ExtendWith(JUnitTrumpExtension.class)}
 */
final class TrumpTests {

    /**
     * You can also register the extension programmtically:
     * <p>
     * {@code @RegisterExtension}
     * <p>
     * {@code static JUnitTrumpExtension trumpExtension = new JUnitTrumpExtension();}
     */

    private TrumpTests() {
    }

    private final String[] trumpQuotes = {
            "We have it totally under control. It’s one person coming in from China,"
                    + "and we have it under control. It’s going to be just fine.",
            "The media likes to say we have the most cases, but we do, by far, the most testing."
                    + "If we did very little testing, we wouldn’t have the most cases."
                    + "So, in a way, by doing all of this testing, we make ourselves look bad.",
            "When you test, you have a case. When you test, you find something is wrong with people."
                    + "If we didn't do any testing we would have very few cases.",
            "When you’re testing to that extent, you’re going to find more people, you’re going to find more cases."
                    + "So I said to my people, ‘Slow the testing down, please.’"
    };

    @Test
    void testTrumpStatements() {
        // Statements by Trump simply must be true, which is also why these tests will definitely pass!
        for (String trumpQuote : this.trumpQuotes) {
            Assertions.assertEquals(trumpQuote, true);
        }
    }

}
