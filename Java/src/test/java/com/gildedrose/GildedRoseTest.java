package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    // generate test data
    @Test
    void generateData() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        // TODO
    }

    // test value changes / no changes
    @Test
    void valueChanges() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        Item[] prevItems = app.items;
        int days = 3;
        for (int i = 0; i < days; i++) {
            app.updateQuality();
            for (int j = 0; j < items.length; j++) { // iterate through items
                assertEquals(prevItems[j].name, items[j].name); // stays the same
                assertEquals(prevItems[j].sellIn - 1, items[j].sellIn); // -1 every day
                assertEquals(prevItems[j].quality, items[j].quality); // stays the same
            }
        }
    }

    // test last day result
    @Test
    void updateQuality() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        Item[] prevItems = app.items;
        app.updateQuality();
        for (int i = 0; i < items.length; i++) { // iterate through items
            assertEquals(prevItems[i].name, items[i].name); // stays the same
            assertEquals(prevItems[i].sellIn - 1, items[i].sellIn); // -1 every day
            assertEquals(prevItems[i].quality, items[i].quality); // stays the same
        }
    }
}
