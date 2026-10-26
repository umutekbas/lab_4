public class BalancedBrackets {

    public static boolean isBalanced(String s) {


        BracketStack stack = new BracketStack();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);


            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }


            if (c == ')' || c == '}' || c == ']') {


                if (stack.isEmpty()) {
                    return false;
                }


                char poppedChar = stack.pop();


                boolean matchResult = isMatchingPair(poppedChar, c);
                if (matchResult == false) {
                    return false;
                }
            }
        }


        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isMatchingPair(char opening, char closing) {


        if (opening == '(' && closing == ')') {
            return true;
        }


        if (opening == '[' && closing == ']') {
            return true;
        }


        if (opening == '{' && closing == '}') {
            return true;
        }


        return false;
    }
}