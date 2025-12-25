package c1;
public abstract class b {

    public static final boolean a(android.content.Context p1, String p2)
    {
        kotlin.jvm.internal.j.e(p1, "context");
        kotlin.jvm.internal.j.e(p2, "name");
        return p1.deleteSharedPreferences(p2);
    }
}
