package test;

import java.util.Map;

public class MemoizationTest {
    public static int execute(int[] S, int n, int target, Map<String, Integer> lookup)
    {
        // if the total is 0, return 1 (solution found)
        if (target == 0) {
            return 1;
        }

        // return 0 (solution does not exist) if total becomes negative,
        // no elements are left
        if (target < 0 || n < 0) {
            return 0;
        }

        // construct a unique map key from dynamic elements of the input
        String key = n + "|" + target;

        // if the subproblem is seen for the first time, solve it and
        // store its result in a map
        if (!lookup.containsKey(key))
        {
            // Case 1. Include current coin `S[n]` in solution and recur
            // with remaining change `target-S[n]` with the same number of coins
            int include = execute(S, n, target - S[n], lookup);

            // Case 2. Exclude current coin `S[n]` from solution and recur
            // for remaining coins `n-1`
            int exclude = execute(S, n - 1, target, lookup);

            // assign total ways by including or excluding current coin
            lookup.put(key, include + exclude);
        }

        // return solution to the current subproblem
        return lookup.get(key);
    }
}
