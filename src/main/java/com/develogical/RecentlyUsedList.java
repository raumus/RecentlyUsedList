package com.develogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecentlyUsedList {

    List<String> myList;

    public RecentlyUsedList() {
        myList = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return myList.isEmpty();
    }

    public void add(String newItem) {
        myList.remove(newItem);
        myList.add(0, newItem);
    }

    public List<String> items() {
        return myList;
    }

    public String mostRecentItem() {
        return myList.get(0);
    }
}
