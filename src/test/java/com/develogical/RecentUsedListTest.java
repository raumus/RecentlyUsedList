package com.develogical;

import org.junit.Test;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;

public class RecentUsedListTest {

    @Test
    public void emptyListWhenInitialised() {
        RecentlyUsedList myList = new RecentlyUsedList();
        assertTrue(myList.isEmpty());
    }

    @Test
    public void canAddElmentToTheList() {
        RecentlyUsedList myList = new RecentlyUsedList();
        myList.add("Good");
        assertFalse(myList.isEmpty());
    }

    @Test
    public void canRetrieveAllItems(){
        RecentlyUsedList myList = new RecentlyUsedList();
        myList.add("Good");
        myList.add("Good2");
        myList.add("Good3");
        myList.add("Good4");
        assertEquals(myList.items(), asList("Good4", "Good3", "Good2", "Good"));
    }

    @Test
    public void canRetrieveMostRecentItem(){
        RecentlyUsedList myList = new RecentlyUsedList();
        myList.add("Good");
        myList.add("Good2");
        myList.add("Good3");
        myList.add("Good4");
        assertEquals(myList.mostRecentItem(), "Good4");
    }

    @Test
    public void isAUniqueList(){
        RecentlyUsedList myList = new RecentlyUsedList();
        myList.add("Good4");
        myList.add("Good3");
        myList.add("Good3");
        myList.add("Good2");
        assertEquals(myList.items(), asList("Good2", "Good3", "Good4"));
    }
}
