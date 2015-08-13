/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.beans.Transient;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import org.apache.commons.beanutils.PropertyUtils;

/**
 *
 * @author Anselmo Pool <anselmo_pool@alfmensajeria.com.mx>
 * 
 */
public class Cloner {
    
    public static <T> T clone(T object) throws IllegalAccessException, 
            InvocationTargetException, NoSuchMethodException, 
            InstantiationException {
        
        Field[] fields = object.getClass().getDeclaredFields();
        T copy = (T) object.getClass().newInstance();
        
        for (Field field : fields) {
            if (!Modifier.isStatic(field.getModifiers())) {
                Transient annotation = field.getAnnotation(Transient.class);
                if (annotation == null) {
                    PropertyUtils.setProperty(copy,
                            field.getName(), 
                            PropertyUtils.getProperty(object, field.getName()));
                }
            }
        }
        return copy;
    }
    
}
