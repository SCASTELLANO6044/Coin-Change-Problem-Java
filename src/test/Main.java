package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] coinTypeList = { 1, 3 };

        int target = 5;

        Map<TreeBranch, Integer> memoizationDictionary = new HashMap<>();

        int coinTypeIndex = coinTypeList.length - 1;

        System.out.print("The total number of ways to get the desired change is "
                + MemoizationTest.execute(coinTypeList, coinTypeIndex, target, memoizationDictionary));
        System.out.println(MemoizationTest.findChosenPath(memoizationDictionary, coinTypeList, target));
    }


}
