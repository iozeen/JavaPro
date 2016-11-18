package lec1_1.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Illya on 16.11.2016.
 * 1. Создать аннотацию, которая принимает параметры для метода. Написать код, который вызовет метод,
 * помеченный этой аннотацией, и передаст параметры аннотации в вызываемый метод.
 *
 * @Test(a=2, b=5)
 * public void test(int a, int b) {…}
 */
public class Task1Runner {
    public static void main(String[] args) {
        Class<?> cls = Tested.class;
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                try {
                    Test an = method.getAnnotation(Test.class);
                    method.invoke(cls.newInstance(), an.a(), an.b());
                } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
