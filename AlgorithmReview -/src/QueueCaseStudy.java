import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("P001");
        queue.add("P002");
        queue.add("P003");
        queue.add("P004");
        queue.add("P005");

        System.out.println("เรียกผู้ป่วยออก 2 คน");

        if (!queue.isEmpty()) {
            System.out.println("รับบริการ : " + queue.remove());
        }

        if (!queue.isEmpty()) {
            System.out.println("รับบริการ : " + queue.remove());
        }

        queue.add("P006");
        queue.add("P007");

        System.out.println("\nผู้ป่วยคนถัดไป");
        System.out.println(queue.peek());

        System.out.println("\nจำนวนผู้ป่วยที่รอ");
        System.out.println(queue.size());

        System.out.println("\nสถานะ Queue");
        System.out.println(queue);

        if (!queue.isEmpty()) {
            System.out.println("\nQueue ไม่ว่าง สามารถ remove() ได้");
        } else {
            System.out.println("\nQueue ว่าง");
        }

        System.out.println("\nหลักการ FIFO");
        System.out.println("First In First Out คือ ผู้ที่เข้าคิวก่อน จะได้รับบริการก่อน");
    }
}