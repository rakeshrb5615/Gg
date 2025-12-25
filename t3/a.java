package t3;
public abstract class a {
    public static final int[] a;
    public static final String b;

    static a()
    {
        t3.a.a = new int[] {16842910, 16842919});
        t3.a.b = t3.a.getSimpleName();
        return;
    }

    public static android.content.res.ColorStateList a(android.content.res.ColorStateList p3)
    {
        if (p3 == null) {
            return android.content.res.ColorStateList.valueOf(0);
        } else {
            if ((android.os.Build$VERSION.SDK_INT <= 27) && ((android.graphics.Color.alpha(p3.getDefaultColor()) == 0) && (android.graphics.Color.alpha(p3.getColorForState(t3.a.a, 0)) != 0))) {
                android.util.Log.w(t3.a.b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return p3;
        }
    }
}
