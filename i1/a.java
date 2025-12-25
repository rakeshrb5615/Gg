package i1;
public final class a extends android.text.Editable$Factory {
    public static final Object a;
    public static volatile i1.a b;
    public static Class c;

    static a()
    {
        i1.a.a = new Object();
        return;
    }

    public final android.text.Editable newEditable(CharSequence p3)
    {
        Class v0 = i1.a.c;
        if (v0 == null) {
            return super.newEditable(p3);
        } else {
            return new g1.t(v0, p3);
        }
    }
}
