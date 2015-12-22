package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class ReflectionExample {
    public static void main(String[] args) {
        Class rental = RentCar.class;
        try {
            String rentalClassPackage = rental.getName();
            System.out.println("Class Name is : " + rentalClassPackage);

            String rentalClassName = rental.getSimpleName();
            System.out.println("Class Simple Name is : " + rentalClassName);

            Package rentalPackage = rental.getPackage();
            System.out.println("Package Name is : " + rentalPackage);

            Constructor constructor = rental.getConstructor(Integer.TYPE);
            RentCar rent = (RentCar) constructor.newInstance(495);

            Method[] allMethods = rental.getMethods();
            System.out.println("Methods are : " + Arrays.toString(allMethods));
            for (Method method : allMethods) {
                System.out.println("Method: " + method.getName());
            }

            Method[] declaredMethods = rental.getDeclaredMethods();
            System.out.println("Declared Methods are : " + Arrays.toString(declaredMethods));
            for (Method declaredMethod : declaredMethods) {
                System.out.println("Declared Method : " + declaredMethod.getName());
            }

            Method oneMethod = rental.getMethod("computeRentalCost",
                    new Class[]{Integer.TYPE});
            System.out.println("One Method : " + oneMethod);
            oneMethod.invoke(rent, 4);

            Class[] parameterTypes = oneMethod.getParameterTypes();
            System.out.println("Class Parameter Types : " + parameterTypes);

            Class returnType = oneMethod.getReturnType();
            System.out.println("Return Type + " + returnType);

            Field[] fields = rental.getFields();
            System.out.println("Fields are : ");
            for (Field oneField : fields) {
                Field field = rental.getField(oneField.getName());
                String fieldName = field.getName();
                System.out.println("Field Name is : " + fieldName);

                Object fieldType = field.getType();
                System.out.println("Field Type is : " + fieldType);

                Object value = field.get(rent);
                System.out.println("Field value is : " + value);
            }

            Field privateField = RentCar.class.getDeclaredField("type");
            String name = privateField.getName();
            System.out.println("Private Field Name : " + name);

            privateField.setAccessible(true);
            String fieldValue = (String) privateField.get(rent);
            System.out.println("Field value = : " + fieldValue);


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
