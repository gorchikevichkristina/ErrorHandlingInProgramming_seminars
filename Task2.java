public class Task2 {
    /*Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
            Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
            1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
            2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
            3. если вместо массива пришел null, метод вернет -3
            4.Напишите метод, в котором реализуйте взаимодействие с пользователем.
            То есть, этот метод запросит искомое число у пользователя, вызовет первый,
            обработает возвращенное значение и покажет читаемый результат пользователю.
            Например, если вернулся -2, пользователь увидит сообщение: “Искомый элемент не найден”.
     */
    public static void main(String[] args) {
        searchIndexFromArray(new int[]{1, 3, 7, 9, 8, 4, 1}, 9, 7);
    }

    public static int searchIndexFromArray(int[] array, int num, int minLength) {
        if (array == null) {
            System.out.println("массив не может быть null");
            return -3;
        } else if (array.length < minLength) {
            System.out.println("длина массива не может быть меньше " + minLength);
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println("искомый элемент не найден");
        return -2;
    }
}