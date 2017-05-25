package ds.stack;

public class App {

	public static void main(String[] args) {

		System.out.println(ReverseString("hello"));
System.out.println(BalancedParenthesis("({})"));
	}

	private static String ReverseString(String str) {
		int maxSize = str.length();
		String strr = "";
		Stack st = new Stack(maxSize);
		for (int i = 0; i < maxSize; i++) {
			st.push(str.charAt(i));
		}
		while (!st.isEmpty()) {
			strr += st.pop();
		}
		return strr;
	}

	private static boolean BalancedParenthesis(String str) {
		Stack st = new Stack(str.length());
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				st.push(c);
			} else if (c == ')') {
				if (st.isEmpty())
					return false;
				if (st.pop() != '(')
					return false;
			} else if (c == '}') {
				if (st.isEmpty())
					return false;
				if (st.pop() != '{')
					return false;
			} else if (c == ']') {
				if (st.isEmpty())
					return false;
				if (st.pop() != ']')
					return false;
			}

		}
		return st.isEmpty();
	}
}
