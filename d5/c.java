package d5;
public final class c {
    public final m5.c a;

    public c(m5.c p1)
    {
        this.a = p1;
        return;
    }

    public final void a(q6.d p11)
    {
        String v0_0 = this.a;
        String v11_1 = p11.a;
        int v1_7 = new java.util.ArrayList(i7.j.X(v11_1, 10));
        String v11_4 = v11_1.iterator();
        while (v11_4.hasNext()) {
            h5.c v2_9 = ((q6.c) ((q6.e) v11_4.next()));
            int v4_1 = v2_9.b;
            String v5 = v2_9.d;
            a5.i v3_2 = v2_9.e;
            String v7 = v2_9.c;
            long v8 = v2_9.f;
            if (v3_2.length() > 256) {
                v3_2 = v3_2.substring(0, 256);
            }
            v1_7.add(new i5.b(v4_1, v5, v3_2, v7, v8));
        }
        if (((h.f) v0_0.m).h(v1_7)) {
            ((h5.f) v0_0.d).b.a(new a5.i(11, v0_0, ((h.f) v0_0.m).d()));
        } else {
        }
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
            android.util.Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", 0);
        }
        return;
    }
}
