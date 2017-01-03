package def.jquery;
@jsweet.lang.Interface
public abstract class JQueryEasingFunctions extends def.js.Object {
    native public JQueryEasingFunction $get(String name);
    public JQueryEasingFunction linear;
    public JQueryEasingFunction swing;
    native public double linear(double percent);
    native public double swing(double percent);
}

