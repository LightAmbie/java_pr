package mirea.ru.lazarev_pavel.kvbo0121.pr_spiski;

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(6);
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(1);

        System.out.println(list);

        list.remove(1);

        System.out.println(list);


    }
}