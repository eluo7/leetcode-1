package _140_WordBreakII;

import static com.leetcode.Test.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _140_WordBreakII.Solution } */
    Solution solution;
    
    @Rule
    public Timeout globalTimeout = new Timeout(500);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        String s = "catsanddog";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        List<String> actual = solution.wordBreak(s, wordDict);
        List<String> expected = new ArrayList<>();
        expected.add("cats and dog");
        expected.add("cat sand dog");
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "haha";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        List<String> actual = solution.wordBreak(s, wordDict);
        List<String> expected = new ArrayList<>();
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "catscatanddog";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        List<String> actual = solution.wordBreak(s, wordDict);
        List<String> expected = new ArrayList<>();
        expected.add("cats cat and dog");
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "dogcat";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("dogcat");
        wordDict.add("dogcat");
        List<String> actual = solution.wordBreak(s, wordDict);
        List<String> expected = new ArrayList<>();
        expected.add("dogcat");
        expected.add("dog cat");
        assertEqualsIgnoreOrder(expected, actual);
    }

}
