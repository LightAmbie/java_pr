package mirea.ru.lazarev_pavel.kvbo0121.pr10;

public class Tester {
    private Student[] idNumber;

    public void setArray(Student[] array){
        for (int i = 0; i < array.length; i++) {
            Student student = new Student(3, "Pasha", "Lazarev", 2, "KVBO-01-21");
            array[i] = student;
        }
    }

//    public void quickSort(Student[] array, int low, int high){
//        if (array.length == 0)
//            return;
//
//        if (low >= high)
//            return;
//
//        // выбрать опорный элемент
//        int middle = low + (high - low) / 2;
//        int opora = array[middle];
//
//        // разделить на подмассивы, который больше и меньше опорного элемента
//        int i = low, j = high;
//        while (i <= j) {
//            while (array[i] < opora) {
//                i++;
//            }
//
//            while (array[j] > opora) {
//                j--;
//            }
//
//            if (i <= j) {//меняем местами
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//                i++;
//                j--;
//            }
//        }
//
//        // вызов рекурсии для сортировки левой и правой части
//        if (low < j)
//            quickSort(array, low, j);
//
//        if (high > i)
//            quickSort(array, i, high);
//    }
//    }
    public static void main(String[] args) {

    }
}
