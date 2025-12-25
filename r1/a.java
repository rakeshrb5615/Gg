package r1;
public final class a {
    public static final Object e;
    public static r1.a f;
    public final android.content.Context a;
    public final java.util.HashMap b;
    public final java.util.HashMap c;
    public final java.util.ArrayList d;

    static a()
    {
        r1.a.e = new Object();
        return;
    }

    public a(android.content.Context p2)
    {
        this.b = new java.util.HashMap();
        this.c = new java.util.HashMap();
        this.d = new java.util.ArrayList();
        this.a = p2;
        new h.c(this, p2.getMainLooper());
        return;
    }

    public static r1.a a(androidx.fragment.app.j0 p2)
    {
        if (r1.a.f == null) {
            r1.a.f = new r1.a(p2.getApplicationContext());
        }
        return r1.a.f;
    }

    public final void b(android.content.Intent p10)
    {
        int v5_2;
        p10.getAction();
        StringBuilder v3_4 = p10.resolveTypeIfNeeded(this.a.getContentResolver());
        p10.getData();
        String v4 = p10.getScheme();
        p10.getCategories();
        if ((p10.getFlags() & 8) == 0) {
            v5_2 = 0;
        } else {
            v5_2 = 1;
        }
        if (v5_2 != 0) {
            StringBuilder v8_1 = new StringBuilder("Resolving type ");
            v8_1.append(v3_4);
            v8_1.append(" scheme ");
            v8_1.append(v4);
            v8_1.append(" of intent ");
            v8_1.append(p10);
            android.util.Log.v("LocalBroadcastManager", v8_1.toString());
        }
        ClassCastException v10_3 = ((java.util.ArrayList) this.c.get(p10.getAction()));
        if (v10_3 != null) {
            if (v5_2 != 0) {
                StringBuilder v3_2 = new StringBuilder("Action list: ");
                v3_2.append(v10_3);
                android.util.Log.v("LocalBroadcastManager", v3_2.toString());
            }
            if (v10_3.size() > 0) {
                if (v10_3.get(0) != null) {
                    throw new ClassCastException();
                } else {
                    if (v5_2 == 0) {
                        throw 0;
                    } else {
                        throw 0;
                    }
                }
            }
        }
        return;
    }
}
