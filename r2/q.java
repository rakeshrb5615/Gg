package r2;
public final synthetic class q implements o2.h, a5.f, o2.e, y2.f, y6.p, z3.z {
    public final synthetic int a;

    public synthetic q(int p1)
    {
        this.a = p1;
        return;
    }

    public synthetic q(r6.l p1)
    {
        this.a = 4;
        return;
    }

    public static bridge synthetic int b(android.content.res.Configuration p0)
    {
        return p0.fontWeightAdjustment;
    }

    public void a(Exception p1)
    {
        return;
    }

    public Object apply(Object p5)
    {
        switch (this.a) {
            case 4:
                Throwable v0_4 = r6.o0.b.q(((r6.n0) p5));
                kotlin.jvm.internal.j.d(v0_4, "encode(...)");
                ((r6.n0) p5).getClass();
                android.util.Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] v5_3 = v0_4.getBytes(b8.a.a);
                kotlin.jvm.internal.j.d(v5_3, "getBytes(...)");
                return v5_3;
            default:
                java.util.ArrayList v1_1 = new String[0];
                byte[] v5_6 = ((android.database.sqlite.SQLiteDatabase) p5).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", v1_1);
                try {
                    java.util.ArrayList v1_3 = new java.util.ArrayList();
                } catch (Throwable v0_5) {
                    v5_6.close();
                    throw v0_5;
                }
                while (v5_6.moveToNext()) {
                    byte[] v3_7;
                    r2.j v2_2 = r2.j.a();
                    v2_2.t(v5_6.getString(1));
                    v2_2.d = b3.a.b(v5_6.getInt(2));
                    byte[] v3_6 = v5_6.getString(3);
                    if (v3_6 != null) {
                        v3_7 = android.util.Base64.decode(v3_6, 0);
                    } else {
                        v3_7 = 0;
                    }
                    v2_2.c = v3_7;
                    v1_3.add(v2_2.a());
                }
                v5_6.close();
                return v1_3;
        }
    }

    public Object c()
    {
        switch (this.a) {
            case 15:
                return new java.util.LinkedHashMap();
            case 16:
                return new java.util.TreeMap();
            case 17:
                return new java.util.concurrent.ConcurrentHashMap();
            case 18:
                return new java.util.concurrent.ConcurrentSkipListMap();
            case 19:
                return new java.util.ArrayList();
            case 20:
                return new java.util.LinkedHashSet();
            case 21:
                return new java.util.TreeSet();
            case 22:
                return new java.util.ArrayDeque();
            default:
                return new y6.o(1);
        }
    }

    public Object e(a5.z p2)
    {
        switch (this.a) {
            case 1:
                return com.google.firebase.datatransport.TransportRegistrar.c(p2);
            case 2:
                return com.google.firebase.datatransport.TransportRegistrar.b(p2);
            case 3:
                return com.google.firebase.datatransport.TransportRegistrar.a(p2);
            case 4:
            case 5:
            case 8:
            default:
                return com.google.firebase.firestore.FirestoreRegistrar.a(p2);
            case 6:
                return com.google.firebase.sessions.FirebaseSessionsRegistrar.b(p2);
            case 7:
                return com.google.firebase.sessions.FirebaseSessionsRegistrar.a(p2);
            case 9:
                return com.google.firebase.abt.component.AbtRegistrar.a(p2);
        }
    }
}
