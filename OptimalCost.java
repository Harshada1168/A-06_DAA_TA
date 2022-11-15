public class OptimalCost {
    public int costOfTree(int cost[], int i, int j) {
        // no element in tha array
        if (j < i) {
            return 0;
        }
        // only one elememt in the array
        if (j == i) {
            return cost[i];
        }
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += cost[k];
        }
        int sumFinal = sum;
        int minimum = Integer.MAX_VALUE;
        for (int m = i; m <= j; m++) {
            int costTree = costOfTree(cost, i, m - 1) + costOfTree(cost, m + 1, j);
            if (costTree < minimum) {
                minimum = costTree;
            }
        }
        return minimum + sumFinal;
    }

    public int OptimalBinarySearchTree(int arr[], int cost[], int n) {
        return costOfTree(cost, 0, n - 1);

    }
}
