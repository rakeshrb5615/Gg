package d5;
public final class e {
    public static final d5.e a;

    static e()
    {
        d5.e.a = new d5.e();
        return;
    }

    public static java.util.ArrayList a(android.content.Context p8)
    {
        NullPointerException v8_2;
        kotlin.jvm.internal.j.e(p8, "context");
        String v0_4 = p8.getApplicationInfo().uid;
        String v1_1 = p8.getApplicationInfo().processName;
        NullPointerException v8_1 = p8.getSystemService("activity");
        if (!(v8_1 instanceof android.app.ActivityManager)) {
            v8_2 = 0;
        } else {
            v8_2 = ((android.app.ActivityManager) v8_1);
        }
        NullPointerException v8_3;
        if (v8_2 == null) {
            v8_3 = i7.n.a;
        } else {
            v8_3 = v8_2.getRunningAppProcesses();
            if (v8_3 == null) {
            }
        }
        int v2_2 = new java.util.ArrayList();
        NullPointerException v8_4 = v8_3.iterator();
        while (v8_4.hasNext()) {
            j5.z0 v3_12 = v8_4.next();
            if (v3_12 != null) {
                v2_2.add(v3_12);
            }
        }
        NullPointerException v8_6 = new java.util.ArrayList();
        j5.z0 v3_1 = v2_2.size();
        int v4 = 0;
        j5.y0 v5_0 = 0;
        while (v5_0 < v3_1) {
            String v6_1 = v2_2.get(v5_0);
            v5_0++;
            if (((android.app.ActivityManager$RunningAppProcessInfo) v6_1).uid == v0_4) {
                v8_6.add(v6_1);
            }
        }
        String v0_3 = new java.util.ArrayList(i7.j.X(v8_6, 10));
        int v2_5 = v8_6.size();
        while (v4 < v2_5) {
            j5.z0 v3_2 = v8_6.get(v4);
            v4++;
            j5.z0 v3_3 = ((android.app.ActivityManager$RunningAppProcessInfo) v3_2);
            j5.y0 v5_2 = new j5.y0();
            String v6_0 = v3_3.processName;
            if (v6_0 == null) {
                throw new NullPointerException("Null processName");
            } else {
                v5_2.a = v6_0;
                v5_2.b = v3_3.pid;
                byte v7_3 = ((byte) (v5_2.e | 1));
                v5_2.c = v3_3.importance;
                v5_2.e = ((byte) (v7_3 | 2));
                v5_2.d = kotlin.jvm.internal.j.a(v6_0, v1_1);
                v5_2.e = ((byte) (v5_2.e | 4));
                v0_3.add(v5_2.a());
            }
        }
        return v0_3;
    }

    public final j5.c2 b(android.content.Context p6)
    {
        kotlin.jvm.internal.j.e(p6, "context");
        int v0_1 = android.os.Process.myPid();
        j5.y0 v6_9 = d5.e.a(p6);
        int v1_3 = v6_9.size();
        j5.y0 v2_0 = 0;
        while (v2_0 < v1_3) {
            j5.c2 v3_0 = v6_9.get(v2_0);
            v2_0++;
            if (((j5.z0) ((j5.c2) v3_0)).b == v0_1) {
            }
            j5.c2 v3_1 = ((j5.c2) v3_0);
            if (v3_1 != null) {
                return v3_1;
            } else {
                j5.y0 v6_2;
                j5.y0 v6_1 = android.os.Build$VERSION.SDK_INT;
                if (v6_1 <= 33) {
                    if (v6_1 >= 28) {
                        v6_2 = android.app.Application.getProcessName();
                        if (v6_2 != null) {
                            kotlin.jvm.internal.j.e(v6_2, "processName");
                            j5.y0 v2_4 = new j5.y0();
                            v2_4.a = v6_2;
                            v2_4.b = v0_1;
                            j5.y0 v6_5 = ((byte) (v2_4.e | 1));
                            v2_4.c = 0;
                            j5.y0 v6_7 = ((byte) (v6_5 | 2));
                            v2_4.d = 0;
                            v2_4.e = ((byte) (v6_7 | 4));
                            return v2_4.a();
                        }
                    }
                    v6_2 = "";
                } else {
                    v6_2 = android.os.Process.myProcessName();
                    kotlin.jvm.internal.j.b(v6_2);
                }
                kotlin.jvm.internal.j.e(v6_2, "processName");
                v2_4 = new j5.y0();
                v2_4.a = v6_2;
                v2_4.b = v0_1;
                v6_5 = ((byte) (v2_4.e | 1));
                v2_4.c = 0;
                v6_7 = ((byte) (v6_5 | 2));
                v2_4.d = 0;
                v2_4.e = ((byte) (v6_7 | 4));
                return v2_4.a();
            }
        }
        v3_0 = 0;
    }
}
