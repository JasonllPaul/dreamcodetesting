package tests.category;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FurnitureTest {
    protected ArrayList<String> keywords;
    private int level = 1;

    public FurnitureTest() {
        this.keywords = new ArrayList<>();
    }

    @Test
    void testGetKeywords() {
        assertNotNull(keywords);
    }

    @Test
    void getLevel() {
        assertNotEquals(0, level);
    }
}