package mirea.ru.lazarev_pavel.kvbo0121.pr30;


public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree2 = new Tree();

        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        tree2.add(6);
        tree2.add(4);
        tree2.add(8);
        tree2.add(3);
        tree2.add(5);
        tree2.add(7);
        tree2.add(69);

        System.out.println(tree.equals(tree2));
        System.out.println(tree.equals(new Tree()));
        System.out.println(new Tree().equals(new Tree()));
    }
}
