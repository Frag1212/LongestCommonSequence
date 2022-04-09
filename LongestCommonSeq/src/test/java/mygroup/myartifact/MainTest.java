package mygroup.myartifact;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testLongestCommonSequence() {
		assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
			assertEquals("", Main.longestCommonSequence(null, null));
			assertEquals("", Main.longestCommonSequence("abc", null));
			assertEquals("", Main.longestCommonSequence(null, "bc"));
			assertEquals("", Main.longestCommonSequence("", null));
			assertEquals("", Main.longestCommonSequence(null, ""));
			assertEquals("", Main.longestCommonSequence("", ""));
			assertEquals("", Main.longestCommonSequence("abc", ""));
			assertEquals("", Main.longestCommonSequence("", "bc"));
			assertEquals("", Main.longestCommonSequence("abc", "def"));
			assertEquals("t", Main.longestCommonSequence("t", "t"));
			assertEquals("t", Main.longestCommonSequence("t", "tbc"));
			assertEquals("t", Main.longestCommonSequence("tbc", "t"));
			assertEquals("t", Main.longestCommonSequence("t", "btc"));
			assertEquals("t", Main.longestCommonSequence("btc", "t"));
			assertEquals("t", Main.longestCommonSequence("t", "bct"));
			assertEquals("t", Main.longestCommonSequence("bct", "t"));
			assertEquals("bc", Main.longestCommonSequence("abc", "bc"));
			assertEquals("bc", Main.longestCommonSequence("bc", "abc"));
			assertEquals("cd", Main.longestCommonSequence("abcdef", "acdf"));
			assertEquals("lol", Main.longestCommonSequence("lolm", "gloglolgm"));
			assertEquals("cdef", Main.longestCommonSequence("abcdef", "bcdgfcdef"));
			assertEquals("cdef", Main.longestCommonSequence("bcdgfcdef", "abcdef"));
			assertEquals("cdef", Main.longestCommonSequence("bcdgfcdeff", "abcdefa"));
		});
	}

}
