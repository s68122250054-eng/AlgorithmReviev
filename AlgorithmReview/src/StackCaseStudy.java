import java.util.Stack;

public class StackCaseStudy {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Type Data");
        stack.push("Type Structure");
        stack.push("Delete Structure");
        stack.push("Type Algorithm");
        stack.push("Type Java");

        System.out.println("ข้อมูลใน Stack");
        System.out.println(stack);

        System.out.println("\nUndo 2 ครั้ง");

        if (!stack.isEmpty()) {
            System.out.println("Undo : " + stack.pop());
        }

        if (!stack.isEmpty()) {
            System.out.println("Undo : " + stack.pop());
        }

        System.out.println("\nStack หลัง Undo");
        System.out.println(stack);

        if (!stack.isEmpty()) {
            System.out.println("\nStack ยังไม่ว่าง");
        } else {
            System.out.println("\nStack ว่าง");
        }

        System.out.println("\nหลักการ LIFO");
        System.out.println("Last In First Out คือ ข้อมูลที่เข้าเป็นตัวสุดท้าย จะถูกนำออกก่อน");
    }
}