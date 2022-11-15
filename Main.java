public class Main {
    public static void main(String[] args) {
        OptimalCost o = new OptimalCost();
        // test case 1:
        int arr[] = { 10, 12, 20 };
        int cost[] = { 34, 8, 50 };
        int n = arr.length;
        System.out.println("Test Case 1: ");
        System.out.println("Cost of the tree is: ");
        System.out.println(o.OptimalBinarySearchTree(arr, cost, n));
        // test case 2:
        int arr1[] = { 12, 13, 23, 14, 5 };
        int cost1[] = { 3, 2, 34, 12, 45 };
        int n1 = arr1.length;
        System.out.println("Test Case 2: ");
        System.out.println("Cost of the tree is: ");
        System.out.println(o.OptimalBinarySearchTree(arr1, cost1, n1));
        // test case 3:
        int arr2[] = { 10, 12, 90, 45, 34, 23 };
        int cost2[] = { 1, 2, 3, 4, 5, 6 };
        int n2 = arr2.length;
        System.out.println("Test Case 3: ");
        System.out.println("Cost of the tree is: ");
        System.out.println(o.OptimalBinarySearchTree(arr2, cost2, n2));

    }

}
