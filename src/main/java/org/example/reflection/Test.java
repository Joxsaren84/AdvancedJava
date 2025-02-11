package org.example.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

        Person person = new Person();

        Class personClass = Person.class;
        Class personClass2 = person.getClass();
        Class personClass3 = Class.forName("org.example.reflection.Person");

        Method [] methods = personClass.getMethods();


        for(Method m : methods){
            System.out.println(m.getName() + " , "
                    + m.getReturnType() + " , "
                    + Arrays.toString(m.getParameterTypes()));
        }

        Field [] fields = personClass2.getDeclaredFields();

        for (Field f : fields){
            System.out.println(f.getName() + " , " + f.getType());
        }

        Annotation [] annotations = personClass3.getAnnotations();

        for(Annotation a : annotations){
            if(a instanceof Author)
                System.out.println("Yes");
        }
    }
}
