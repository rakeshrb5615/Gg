package r6;
public abstract class e0 {

    public static java.util.ArrayList a(android.content.Context p9)
    {
        java.util.ArrayList v9_2;
        kotlin.jvm.internal.j.e(p9, "context");
        java.util.ArrayList v0_4 = p9.getApplicationInfo().uid;
        String v1_1 = p9.getApplicationInfo().processName;
        java.util.ArrayList v9_1 = p9.getSystemService("activity");
        if (!(v9_1 instanceof android.app.ActivityManager)) {
            v9_2 = 0;
        } else {
            v9_2 = ((android.app.ActivityManager) v9_1);
        }
        java.util.ArrayList v9_3;
        if (v9_2 == null) {
            v9_3 = i7.n.a;
        } else {
            v9_3 = v9_2.getRunningAppProcesses();
            if (v9_3 == null) {
            }
        }
        int v2_2 = new java.util.ArrayList();
        java.util.ArrayList v9_4 = v9_3.iterator();
        while (v9_4.hasNext()) {
            boolean v3_6 = v9_4.next();
            if (v3_6) {
                v2_2.add(v3_6);
            }
        }
        java.util.ArrayList v9_6 = new java.util.ArrayList();
        boolean v3_1 = v2_2.size();
        int v4 = 0;
        r6.d0 v5_0 = 0;
        while (v5_0 < v3_1) {
            String v6_1 = v2_2.get(v5_0);
            v5_0++;
            if (((android.app.ActivityManager$RunningAppProcessInfo) v6_1).uid == v0_4) {
                v9_6.add(v6_1);
            }
        }
        java.util.ArrayList v0_3 = new java.util.ArrayList(i7.j.X(v9_6, 10));
        int v2_5 = v9_6.size();
        while (v4 < v2_5) {
            boolean v3_2 = v9_6.get(v4);
            v4++;
            boolean v3_3 = ((android.app.ActivityManager$RunningAppProcessInfo) v3_2);
            String v6_0 = v3_3.processName;
            kotlin.jvm.internal.j.d(v6_0, "processName");
            v0_3.add(new r6.d0(v6_0, v3_3.pid, v3_3.importance, kotlin.jvm.internal.j.a(v3_3.processName, v1_1)));
        }
        return v0_3;
    }

    public static r6.d0 b(android.content.Context p6)
    {
        kotlin.jvm.internal.j.e(p6, "context");
        int v0_1 = android.os.Process.myPid();
        r6.d0 v6_3 = r6.e0.a(p6);
        String v1_2 = v6_3.size();
        int v3_0 = 0;
        while (v3_0 < v1_2) {
            r6.d0 v4_0 = v6_3.get(v3_0);
            v3_0++;
            if (((r6.d0) v4_0).b == v0_1) {
            }
            r6.d0 v4_1 = ((r6.d0) v4_0);
            if (v4_1 != null) {
                return v4_1;
            } else {
                String v1_1;
                String v1_0 = android.os.Build$VERSION.SDK_INT;
                if (v1_0 <= 33) {
                    if (v1_0 >= 28) {
                        v1_1 = android.app.Application.getProcessName();
                        if (v1_1 != null) {
                            return new r6.d0(v1_1, v0_1, 0, 0);
                        }
                    }
                    v1_1 = com.google.android.gms.common.util.ProcessUtils.getMyProcessName();
                    if (v1_1 == null) {
                        v1_1 = "";
                    }
                } else {
                    v1_1 = android.os.Process.myProcessName();
                    kotlin.jvm.internal.j.d(v1_1, "myProcessName(...)");
                }
                return new r6.d0(v1_1, v0_1, 0, 0);
            }
        }
        v4_0 = 0;
    }
}
