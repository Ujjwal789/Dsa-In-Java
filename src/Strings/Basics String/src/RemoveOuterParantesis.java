public class RemoveOuterParantesis {
    public static void main(String[] args) {
        String s = "()(()())(())";
        String result = removeOuterParentheses(s);
        System.out.println(result);
    }
    public static String removeOuterParentheses(String s) {
        // Your code goes here
        StringBuilder result = new StringBuilder();
        int level = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if (level>0) result.append(ch);
                level++;
            }else if(ch == ')'){
                level--;
                if (level>0) result.append(ch);
            }
        }

        return result.toString();

    }
}
