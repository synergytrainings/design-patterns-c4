package designPatterns.creational.factoryMethod.utilities;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Siranush.Avetisyan
 * @since 11/9/2017
 */
public class ReverseEnumMap<K, V extends Enum<V> & ConvertibleEnum<K>> {

    private Map<K, V> map = new HashMap<>();

    public ReverseEnumMap(Class<V> enumClass) {
        for (V value : enumClass.getEnumConstants()) {
            map.put(value.convert(), value);
        }
    }

    public V findInstance(K key) {
        return map.get(key);
    }
}