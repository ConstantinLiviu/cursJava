package TemaSesiunea19Plus20;

import java.util.ArrayList;

public class ListManager {

    ArrayList<Integer> initializeList() {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for(int i=1; i<6; i++) {
            newArrayList.add(i);
        }
        System.out.println(newArrayList);
        return newArrayList;
    }
}
