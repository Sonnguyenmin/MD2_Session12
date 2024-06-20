package baitap.bai2;

import java.util.Stack;

public class Stack_Rong {
    public static boolean isBalanced (String input) {
        //Kiểm tra xem một chuỗi đầu vào có đủ cặp dấu ngoặc mở đóng.

        //B1: Tạo một Stack rỗng để lưu trữ các dấu ngoặc.
        Stack<Character> charStack = new Stack<>();

        //B2 Duyệt từng ký tự trong chuỗi đầu vào.
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            //B3: Nếu ký tự đang xét là một dấu ngoặc mở (như (, {, [), đưa nó vào stack.
            if (ch == '(' || ch == '{' || ch == '[' ) {
                charStack.push(ch);
            }
            // B4: Nếu ký tự đang xét là một dấu ngoặc đóng
            else if (ch == ')' || ch == '}' || ch == ']' ) {
                if (charStack.isEmpty()) {
                    return false;
                }

                // Lấy phần tử trên cùng của stack
                char top = charStack.pop();

                // Kiểm tra xem dấu ngoặc đóng có khớp với dấu ngoặc mở không
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }

        }
        // B5: Nếu đã duyệt hết chuỗi và Stack vẫn còn phần tử, chuỗi không đúng
        return charStack.isEmpty();
    }
    public static void main(String[] args) {
        String input1 = "([{}])";
        String input2 = "([{)}]";

        System.out.println("Chuỗi " + input1 + " là " + (isBalanced(input1) ? "đúng" : "sai"));
        System.out.println("Chuỗi " + input2 + " là " + (isBalanced(input2) ? "đúng" : "sai"));
    }
}
