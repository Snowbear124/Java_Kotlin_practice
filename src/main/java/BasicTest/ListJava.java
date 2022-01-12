package BasicTest;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListJava {
    public static void main(String[] args) {
        ListTest();

        System.out.println("\n\n");
        LinkedListTest();
    }

    //collection集合類別介紹
    //static表示此function可以被使用
    //ArrayList是用陣列排序
    public static void ListTest() {
        ArrayList list1 = new ArrayList(); //一定要用add的方式加入元素
        list1.add(1);
        list1.add(3);
        list1.add("AAA");
        list1.add("abc");
        System.out.println("ArrayList 1 = " + list1);

        ArrayList list2 = new ArrayList();
        list2.add(2);
        list2.add(3);
        list2.add("BBB");
        list2.add("abc");
        System.out.println("ArrayList 2 = " + list2);

        list1.retainAll(list2); //保留list1與lis2相同的元素
        System.out.println("2個list的集合 = " + list1);

        System.out.println("移除list1的元素: " + list1.remove(0));
        System.out.println("ArrayList 1 = " + list1);

        System.out.println("\nArrayList 2的size = " + list2.size());
    }

    //LinkedList的資料是非線性連貫, 每個資料都是用節點連接的
    /*LinkedList方法
     * addFirst() : 加在第一位
     * addList() : 加在最後一位
     * add() : 同上
     * getFirst() : 取得第一位元素但不移除,如果集合中沒有元素,會出現NoSuchElementException
     * getLast() : 取得最後一位,其他同上
     * removeFirst() : 移除第一位元素,如果集合中沒有元素,會出現NoSuchElementException
     * removeLast() : 移除最後一位元素,其他同上
     *
     * JDK1.6的替代方法 解決集合空異常
     * offerFirst()
     * offerLast()
     * peekFirst() 取得元素但不移除 集合為空返回null
     * peekLast()
     * pollFirst() 取得元素並移除 集合為空返回null
     * pollLast()
     * */
    public static void LinkedListTest() {
        LinkedList list3 = new LinkedList();
        list3.addFirst("a");
        list3.addFirst("b");
        list3.addFirst("c");
        list3.addLast(4);
        list3.offerFirst(5);
        System.out.println("LinkedList = " + list3);

        System.out.println("取得list第一位元素 = " + list3.peekFirst() + ", 但不移除");
        System.out.println("LinkedList = " + list3);

        System.out.println("取得list第一位元素 = " + list3.pollFirst() + ", 且移除");
        System.out.println("LinkedList = " + list3);
    }
}
