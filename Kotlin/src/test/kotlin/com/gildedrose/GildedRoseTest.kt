package com.gildedrose

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GildedRoseTest {

    @Test
    fun foo() {
        val items = listOf(
            Item("Aged Brie", 2, 0),
            Item("Aged Brie", 2, 50),
            Item("Aged Brie", 1, 0),
            Item("Aged Brie", 0, 50),
            Item("Aged Brie", -1, 50),
            Item("Elixir of the Mongoose", 5, 7),
            Item("Elixir of the Mongoose", 0, 0),
            Item("Sulfuras, Hand of Ragnaros", -1, 80),
            Item("Sulfuras, Hand of Ragnaros", 0, 80),
            Item("Sulfuras, Hand of Ragnaros", 0, 40),
            Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            Item("Backstage passes to a TAFKAL80ETC concert", 0, 20),
            Item("Elixir of the Mongoose", -1, 50),
            Item("Aged Brie", -1, 5),


            )
        val app = GildedRose(items)
        app.updateQuality()

        val assertions = listOf(
            assertEquals(Item("Aged Brie", 1, 1), app.items[0]),
            assertEquals(Item("Aged Brie", 1, 50), app.items[1]),
            assertEquals(Item("Aged Brie", 0, 1), app.items[2]),
            assertEquals(Item("Aged Brie", -1, 50), app.items[3]),
            assertEquals(Item("Aged Brie", -2, 50), app.items[4]),
            assertEquals(Item("Elixir of the Mongoose", 4, 6), app.items[5]),
            assertEquals(Item("Elixir of the Mongoose", -1, 0), app.items[6]),
            assertEquals(Item("Sulfuras, Hand of Ragnaros", -1, 80), app.items[7]),
            assertEquals(Item("Sulfuras, Hand of Ragnaros", 0, 80), app.items[8]),
            assertEquals(Item("Sulfuras, Hand of Ragnaros", 0, 40), app.items[9]),
            assertEquals(Item("Backstage passes to a TAFKAL80ETC concert", 14, 21), app.items[10]),
            assertEquals(Item("Backstage passes to a TAFKAL80ETC concert", -1, 0), app.items[11]),
            assertEquals(Item("Elixir of the Mongoose", -2, 48), app.items[12]),
            Assertion(Item("Aged Brie", -2, 7), app.items[13]),

            )


        for (assertion in assertions) assertion.assert()


    }

}