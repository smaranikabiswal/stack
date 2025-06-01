import java.util.*;

class simplifypath {
    public static void main(String[] args) {
        String str = "/a/./b/../../c/";
        String res = simplify(str);
        System.out.println(res);
    }

    static String simplify(String A) {
        Stack<String> st = new Stack<>();
        int len_A = A.length();

        for (int i = 0; i < len_A; i++) {
            String dir = "";

            // Skip multiple slashes
            while (i < len_A && A.charAt(i) == '/') i++;

            // Extract directory/file name
            while (i < len_A && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }

            if (dir.equals("..")) {
                if (!st.empty()) st.pop();
            } else if (dir.equals(".") || dir.isEmpty()) {
                // Do nothing (ignore current directory or empty)
                continue;
            } else {
                st.push(dir);
            }
        }

        // Build the simplified path
        StringBuilder res = new StringBuilder();
        for (String dir : st) {
            res.append("/").append(dir);
        }

        // If result is empty, return root
        return res.length() > 0 ? res.toString() : "/";
    }
}
