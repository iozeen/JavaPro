package lec1_1.task2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Illya on 16.11.2016.
 * 2. Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
 * 1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
 * который сохранит поле класса TextContainer в указанный файл.
 *
 * @SaveTo(path=“c:\\file.txt”) class Container {
 * String text = “…”;
 * @Saver public void save(..) {…}
 * }
 */
public class Task2Runner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TextContainer tc = new TextContainer();
        Class<?> cls = tc.getClass();
        if(!cls.isAnnotationPresent(SaveTo.class)){
            System.out.println("Nope.");
            return;
        }
        SaveTo saveTo = cls.getAnnotation(SaveTo.class);
        String path = saveTo.path();
        Method[] methods = cls.getDeclaredMethods();

        for(Method method: methods){
            if(method.isAnnotationPresent(Saver.class)){
                method.invoke(tc, path);
                break;
            }
        }
        System.out.println("Done.");
    }
}
