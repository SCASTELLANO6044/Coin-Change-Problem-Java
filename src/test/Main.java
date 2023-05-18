package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int [] cointType = {1, 3};
        int goal = 8;
        memoization(cointType, 5);
    }

    private static List<int[]> memoization (int[] coinType, int goal){
        List<int[]> combinations = new ArrayList<>();
        int remaing = goal;
        Map<TreeBranch, Integer> memoizationMap = new HashMap<>();
        execute(coinType, memoizationMap, new TreeBranch(coinType[0], goal), goal);
        return combinations;
    }

    private static int execute(int[] coinType, Map<TreeBranch, Integer> memoization,
                        TreeBranch branch, int goal){

        if (memoization.containsKey(branch)){
            return memoization.get(branch);
        }

        if (branch.getRemaining() - branch.getCoinValue() < 0){
            return -1;
        } else if (branch.getRemaining() - branch.getCoinValue() == 0) {
            return 0;
        }else {
            for (int coin : coinType){
                TreeBranch treeBranch = new TreeBranch(coin, branch.getRemaining()- branch.getCoinValue());
                int branchResult = execute(coinType, memoization, treeBranch, goal);
                memoization.put(treeBranch, branchResult);
            }
            return memoization.get(branch);
        }
    }


}
