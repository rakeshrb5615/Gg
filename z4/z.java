package z4;
public final class z {
    public static final z4.z a;
    public static z4.z b;

    static z()
    {
        z4.z.a = new z4.z();
        return;
    }

    public static android.content.SharedPreferences a(android.content.Context p2, String p3)
    {
        int v0_1 = new StringBuilder("com.google.firebase.auth.internal.browserSignInSessionStore.");
        v0_1.append(p3);
        return p2.getSharedPreferences(v0_1.toString(), 0);
    }

    public static void b(android.content.SharedPreferences p2)
    {
        android.content.SharedPreferences$Editor v0 = p2.edit();
        java.util.Iterator v2_3 = p2.getAll().keySet().iterator();
        while (v2_3.hasNext()) {
            v0.remove(((String) v2_3.next()));
        }
        v0.apply();
        return;
    }
}
