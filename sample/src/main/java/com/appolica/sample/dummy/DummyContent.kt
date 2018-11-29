package com.appolica.sample.dummy

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    var ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    var ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    init {
        // Add 3 sample items.
        addItem(DummyItem("1", "Item 1"))
        addItem(DummyItem("2", "Item 2"))
        addItem(DummyItem("3", "Item 3"))
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP[item.id] = item
    }

    /**
     * A dummy item representing a piece of content.
     */
    class DummyItem(var id: String, var content: String) {

        override fun toString(): String {
            return content
        }
    }
}
