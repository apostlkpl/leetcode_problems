class P28NeedleHaystack {
    public static int strStr(String haystack, String needle) {
        int i = 0;
        while (i < haystack.length() - needle.length() + 1) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                 if (needle.equals(haystack.substring(i, i + needle.length()))) {return i;}
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
            // Check with two Strings
            String haystack = "billyboopblep";
            String needle = "blep";
            System.out.print("Result: ");
            System.out.println(strStr(haystack, needle));
    }
}
