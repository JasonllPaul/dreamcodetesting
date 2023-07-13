package tests.category;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HomeAppliancesTest {

    protected ArrayList<String> keywords;
    private int level = 1;

    public HomeAppliancesTest() {
        this.keywords = new ArrayList<>();
    }

    @Test
    void getKeywords() {
        assertNotNull(keywords);
    }

    @Test
    void getLevel() {
        assertNotEquals(0, level);
    }
}