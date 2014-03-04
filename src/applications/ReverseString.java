package applications;

import java.util.Stack;

/**
 * Question: Reverse a string
 * 
 * sol1: classic, convert the string to char array, swap front and rear by a for
 * loop ----O(n) time and O(1) space. Not a good idea to assign string by
 * string, since in Java string is immutable, it will copy and create a new one,
 * wasting time and space
 * 
 * sol2: recursion ----O(n) time and O(n) space recursion usually takes O(n)
 * space
 * 
 * sol3: use a stack ----O(n) time and O(n) space push all characters first,
 * then pop
 * 
 * @author haozheng
 * 
 */

public class ReverseString {

	// classic
	public String reverse_String(String a) {

		if (!validLength(a.length()))
			return null;

		char[] tmp = a.toCharArray();
		for (int i = 0; i < tmp.length / 2; i++) {
			swap(tmp, i, tmp.length - 1 - i);
		}
		return new String(tmp);
	}

	// recursion
	public String reverse_String_recursion(String a) {

		if (!validLength(a.length()))
			return null;

		char[] tmp = a.toCharArray();
		reversingRurcur(tmp, 0, tmp.length - 1);
		return new String(tmp);
	}

	private void reversingRurcur(char[] tmp, int i, int j) {

		if (i < j) {
			swap(tmp, i, j);
			reversingRurcur(tmp, ++i, --j);
		}
	}

	// stack+stringbuilder
	public String reverse_String_stack(String a) {

		if (!validLength(a.length()))
			return null;

		Stack<Object> mystack = new Stack<Object>();
		for (int i = 0; i < a.length(); i++) {
			mystack.push(a.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		while (!mystack.isEmpty()) {
			sb.append(mystack.pop());
		}
		return sb.toString();

	}

	// stack+array
	public String reverse_String_stack2(String a) {

		if (!validLength(a.length()))
			return null;

		Stack<Character> mystack = new Stack<Character>();
		char[] tmp = a.toCharArray();

		for (int i = 0; i < a.length(); i++) {
			mystack.push(tmp[i]);
		}
		for (int i = 0; i < a.length(); i++) {
			tmp[i] = mystack.pop();
		}
		return new String(tmp);
	}

	/**
	 * shared methods
	 */

	private void swap(char[] tmp, int i, int j) {
		char tmpC = tmp[i];
		tmp[i] = tmp[j];
		tmp[j] = tmpC;
	}

	private boolean validLength(int len) {
		return len > 0;
	}

}
