package lec6_testing;

//The line below means we can just say "Test" and
//our code will automatically know it refers to org.junit.Test
import org.junit.jupiter.api.Test;
import static com.google.common.truth.Truth.assertThat;

/** Tests the Sort class. */
public class TestSort {
    /** Tests Sort.sort */
    @Test
    public void testSort() {
        String[] input = {"they", "changed", "the", "system"};
        String[] expected = {"changed", "system", "the", "they"};

        Sort.sort(input);
        // If our code works, input will equal expected

        assertThat(input).isEqualTo(expected);
    }

    /** Tests Sort.findSmallest.
     *  Note: The "smallest" string is the earliest alphabetical string.
     *  So "aardvark" comes before "zebra". */
    @Test
    public void testFindSmallest() {
        String[] input = {"they", "changed", "the", "system"};
        String expected = "changed";

        String actual = input[Sort.findSmallest(input, 0)];
        // If our code works, actual will equal expected

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testSwap() {
        String[] input = {"they", "changed", "the", "system"};
        String[] expected = {"they", "system", "the", "changed"};

        Sort.swap(input, 1, 3);
        assertThat(input).isEqualTo(expected);
    }
}
