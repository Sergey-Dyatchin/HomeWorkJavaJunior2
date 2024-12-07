import java.lang.reflect.Method;

/**
 * Используя Reflection API, напишите программу, которая выводит на экран все методы класса String.
 */

public class Main {
    public static void main(String[] args) {
        String string = "Строка";
        Class<?> clazz = string.getClass();
        Method[] methods = clazz.getDeclaredMethods(); // Вариант без Object методов
        Method[] methodsObject = clazz.getMethods(); // Вариант с Object методами
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}