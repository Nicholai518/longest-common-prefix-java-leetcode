public class Main {
    public static void main(String[] args) {
        String[] arrayOne = new String[]{"flower", "flow", "flight"};
        String[] arrayTwo = new String[]{"dog", "racecar", "car"};
        String[] arrayThree = new String[]{"alligator", "alphabetical", "altogether", "allocations", "allowance"};

        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(arrayOne));
        System.out.println(solution.longestCommonPrefix(arrayTwo));
        System.out.println(solution.longestCommonPrefix(arrayThree));
    }
}
