package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int [] cointType = {1, 3};
        int goal = 8;


    }

    private static List<int[]> memoization (int[] coinType, int goal){
        List<int[]> combinations = new ArrayList<>();
        int remaing = goal;
        Map<TreeBranch, Integer> memoizationMap = new HashMap<>();

        return combinations;
    }

    private int execute(int[] coinType, Map<TreeBranch, Integer> memoization,
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
                TreeBranch treeBranch = new TreeBranch(coin, branch.getRemaining());
                int branchResult = execute(coinType, memoization, treeBranch, goal);

            }
        }


        return 0;
    }


}
