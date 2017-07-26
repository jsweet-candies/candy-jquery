package def.jquery;
@jsweet.lang.Interface
public abstract class JQueryParam extends def.js.Object {
    /**
     * Create a serialized representation of an array or object, suitable for use in a URL query string or Ajax request.
     * 
     * @param obj An array or object to serialize.
     */
    native public String $apply(Object obj);
    /**
     * Create a serialized representation of an array or object, suitable for use in a URL query string or Ajax request.
     * 
     * @param obj An array or object to serialize.
     * @param traditional A Boolean indicating whether to perform a traditional "shallow" serialization.
     */
    native public String $apply(Object obj, Boolean traditional);
}

