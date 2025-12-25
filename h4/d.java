package h4;
public final class d extends i4.e {
    public final synthetic int b;
    public final synthetic Object c;
    public final synthetic Object d;

    public d(d4.q p2, android.os.IBinder p3)
    {
        this.b = 1;
        this.c = p3;
        this.d = p2;
        return;
    }

    public d(h4.f p2, com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.tasks.TaskCompletionSource p4)
    {
        this.b = 0;
        this.c = p4;
        this.d = p2;
        super(p3);
        return;
    }

    public final void a()
    {
        int v2_4 = 0;
        int v3_0 = 0;
        switch (this.b) {
            case 0:
                Throwable v0_8 = ((h4.f) this.d);
                Runnable v4_11 = v0_8.a.m;
                Throwable v0_12 = v0_8.b;
                Object[] v5_1 = new android.os.Bundle();
                h4.e v6 = h4.g;
                android.os.Parcel v7_1 = h4.g.a;
                v7_1.put("java", Integer.valueOf(20002));
                v5_1.putInt("playcore_version_code", ((Integer) v7_1.get("java")).intValue());
                if (v7_1.containsKey("native")) {
                    v5_1.putInt("playcore_native_version", ((Integer) v7_1.get("native")).intValue());
                }
                if (v7_1.containsKey("unity")) {
                    v5_1.putInt("playcore_unity_version", ((Integer) v7_1.get("unity")).intValue());
                }
                h4.e v6_9 = new h4.e(((h4.f) this.d), ((com.google.android.gms.tasks.TaskCompletionSource) this.c));
                Runnable v4_8 = ((i4.b) v4_11);
                v4_8.getClass();
                android.os.Parcel v7_7 = android.os.Parcel.obtain();
                v7_7.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                v7_7.writeString(v0_12);
                v7_7.writeInt(1);
                v5_1.writeToParcel(v7_7, 0);
                v7_7.writeStrongBinder(v6_9);
                v4_8.a.transact(2, v7_7, 0, 1);
                v7_7.recycle();
                return;
            default:
                Throwable v0_4 = ((i4.h) ((d4.q) this.d).b);
                Runnable v4_1 = ((android.os.IBinder) this.c);
                if (v4_1 != null) {
                    int v2_2 = v4_1.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    if (!(v2_2 instanceof i4.d)) {
                        v2_4 = new i4.b(v4_1);
                    } else {
                        v2_4 = ((i4.d) v2_2);
                    }
                }
                v0_4.m = v2_4;
                int v2_5 = v0_4.b;
                Object[] v5_3 = new Object[0];
                v2_5.g("linkToDeath", v5_3);
                try {
                    v0_4.m.asBinder().linkToDeath(v0_4.j, 0);
                } catch (Runnable v4_5) {
                    Object[] v5_5 = new Object[0];
                    v2_5.getClass();
                    if (!android.util.Log.isLoggable("PlayCore", 6)) {
                    } else {
                        android.util.Log.e("PlayCore", d4.l.i(v2_5.b, "linkToDeath failed", v5_5), v4_5);
                    }
                }
                v0_4.g = 0;
                String v1_4 = v0_4.d;
                int v2_6 = v1_4.size();
                while (v3_0 < v2_6) {
                    Runnable v4_6 = v1_4.get(v3_0);
                    v3_0++;
                    ((Runnable) v4_6).run();
                }
                v0_4.d.clear();
                return;
        }
    }
}
