package Kieu_queue;

import java.util.PriorityQueue;

public class Kieu_queue_co_san {
    public static void main(String[] args) {
        PriorityQueue<Integer> dsQueue = new PriorityQueue<>();

        dsQueue.add(1);
        dsQueue.add(2);
        dsQueue.add(3);
        dsQueue.add(4);
        dsQueue.add(5);
        dsQueue.add(6);

        //Lay phan tu dau tien nhung khong xoa phan tu khoi danh sach
        System.out.println(dsQueue.peek());
        System.out.println(dsQueue.peek());
        //Lay phan tu dau tien va xoa khoi danh sach
        System.out.println(dsQueue.poll());
        while (!dsQueue.isEmpty()) {
            System.out.println(dsQueue.poll());
        }

//        poll()


        //Lay phan tu dau tien va, nhung neu khong co du lieu thi neu ra ngoai le


    }
}
