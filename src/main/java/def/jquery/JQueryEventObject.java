package def.jquery;
@jsweet.lang.Interface
@jsweet.lang.Extends({JQueryInputEventObject.class,JQueryMouseEventObject.class,JQueryKeyEventObject.class})
public abstract class JQueryEventObject extends BaseJQueryEventObject {
    public Boolean altKey;
    public Boolean ctrlKey;
    public Boolean metaKey;
    public Boolean shiftKey;
    public double button;
    public double clientX;
    public double clientY;
    public double offsetX;
    public double offsetY;
    public double pageX;
    public double pageY;
    public double screenX;
    public double screenY;
    @jsweet.lang.Name("char")
    public Object Char;
    public double charCode;
    public Object key;
    public double keyCode;
}

