import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
	
	@Test
	public void testLevenshteinDistance() {
		StringUtils myStringUtils = new StringUtils();
		int distance;
		
		distance = myStringUtils.levenshteinDistance("chat", "chats");
		assertEquals(1, distance);
		
		distance = myStringUtils.levenshteinDistance("Chien", "Chine");
		assertEquals(2, distance);
		
		distance = myStringUtils.levenshteinDistance("lourd", "");
		assertEquals(5, distance);
		
		distance = myStringUtils.levenshteinDistance("", "");
		assertEquals(0, distance);
		
		distance = myStringUtils.levenshteinDistance("", "");
		assertEquals(0, distance);
	}

}
