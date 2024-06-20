package baitap.bai1;

import java.util.Scanner;
import java.util.Stack;

public class dao_nguoc {
    public static void main(String[] args) {
        Stack<String> textStack = new Stack<>();

        // B2: Nhập số lượng từ cần nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng từ cần nhập: ");
        int numWords = Integer.parseInt(scanner.nextLine());

        // B3: Tạo 1 vòng lặp for với số lần lặp bằng số lượng từ vừa nhập,
        // mỗi vòng lặp cho nhập 1 từ, rồi push vào stack.
        for (int i = 0; i < numWords; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.nextLine();
            textStack.push(word);
        }

        // B4: Tạo vòng lặp rồi in các từ trong stack ra bằng phương thức pop()
        System.out.println("Các từ trong stack:");
        while (!textStack.isEmpty()) {
            System.out.println(textStack.pop());
            System.out.println(textStack.size() + " size");
        }

    }
}
