package uk.ac.ebi.mdk.io;

import uk.ac.ebi.caf.utility.version.Version;
import uk.ac.ebi.caf.utility.version.VersionMap;
import uk.ac.ebi.caf.utility.version.annotation.CompatibleSince;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * MarshalManager - 09.03.2012 <br/>
 * <p/>
 * Class descriptions.
 *
 * @author johnmay
 * @author $Author$ (this version)
 * @version $Rev$
 */
public class MarshalManager<T> {

    public Map<Class, VersionMap<T>> marshals = new HashMap<Class, VersionMap<T>>();
    private Map<Class, T> marshalCache = new HashMap<Class, T>(80);

    private final Version version;

    public MarshalManager(Version version) {
        this.version = version;
    }

    public Map<Class, VersionMap<T>> getMarshals() {
        return marshals;
    }

    public Version getVersion() {
        return version;
    }

    private static Version getVersion(Class<?> c) {

        CompatibleSince annotation = c.getAnnotation(CompatibleSince.class);

        if (annotation == null)
            throw new InvalidParameterException("Marshaller must have a version: @CompatibleSince not found on " + c.getSimpleName());

        String value = annotation.value().toLowerCase(Locale.ENGLISH);
        return new Version(value);

    }

    public T add(Class c, T marshal) {

        Version version = getVersion(marshal.getClass());

        return add(c, marshal, version);

    }


    public T add(Class c, T marshal, Version v) {

        if (marshals.containsKey(c)) {
            marshals.get(c).put(v, marshal);
            return marshal;
        }

        marshals.put(c, new VersionMap<T>());
        marshals.get(c).put(v, marshal);

        return marshal;

    }

    public boolean hasMarshaller(Class c, Version v) {

        if (marshalCache.containsKey(c)) {
            return true;
        }

        if (marshals.containsKey(c)) {
            return marshals.get(c).has(v);
        }
        return false;
    }

    public T getMarshaller(Class c, Version v) {

        if (marshalCache.containsKey(c)) {
            return marshalCache.get(c);
        }


        if (marshals.containsKey(c)) {
            T marshal = marshals.get(c).get(v);
            marshalCache.put(c, marshal);
            return marshal;
        }

        throw new InvalidParameterException("No valid marshaller found for " + c.getSimpleName());
    }

    /**
     * Clears the marshal version cache, needed if you intend to use the same
     * reader/write for different versions
     */
    public void clear() {
        marshalCache.clear();
    }

}
