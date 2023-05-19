package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MemoizationTest {
    public static int execute(int[] coinTypeList, int coinTypeIndex, int target, Map<TreeBranch, Integer> memoizationDictionary) {
        if (target == 0) {
            return 1;
        }

        if (target < 0 || coinTypeIndex < 0) {
            return 0;
        }

        TreeBranch key = new TreeBranch(coinTypeList[coinTypeIndex], target);

        if (!memoizationDictionary.containsKey(key)) {
            int include = execute(coinTypeList, coinTypeIndex, target - coinTypeList[coinTypeIndex], memoizationDictionary);

            int exclude = execute(coinTypeList, coinTypeIndex - 1, target, memoizationDictionary);

            memoizationDictionary.put(key, include+exclude);
        }

        return memoizationDictionary.get(key);
    }

    public static String findChosenPath(Map<TreeBranch, Integer> memoizationDictionary, int[]coinTypeList, int target){
//        TreeBranch index = new TreeBranch(coinTypeList[coinTypeList.length-1], target);
//        int pathAmount = memoizationDictionary.get(index);
//        List<List<Integer>> pathList = new ArrayList<>(pathAmount);
//        List<Integer> path = new ArrayList<>();

//        for (int i = 0; i < memoizationDictionary.get(index); i++){
//            TreeBranch nextIncludeIndex = new TreeBranch(index.getCoinValue(), index.getRemaining()- index.getCoinValue());
//            if (memoizationDictionary.containsKey(nextIncludeIndex)){
//                path.add(nextIncludeIndex.getCoinValue());
//            }
//        }
        return "null";
    }
}
