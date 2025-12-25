package k4;
public final class z {
    public final String a;

    public z(String p5)
    {
        String v0_2 = android.os.Process.myUid();
        int v1 = android.os.Process.myPid();
        StringBuilder v2_1 = new StringBuilder("UID: [");
        v2_1.append(v0_2);
        v2_1.append("]  PID: [");
        v2_1.append(v1);
        v2_1.append("] ");
        this.a = v2_1.toString().concat(p5);
        return;
    }

    public static varargs String c(String p3, String p4, Object[] p5)
    {
        if (p5.length > 0) {
            try {
                p4 = String.format(java.util.Locale.US, p4, p5);
            } catch (StringBuilder v0_5) {
                android.util.Log.e("PlayCore", "Unable to format ".concat(p4), v0_5);
                String v5_1 = android.text.TextUtils.join(", ", p5);
                StringBuilder v0_3 = new StringBuilder();
                v0_3.append(p4);
                v0_3.append(" [");
                v0_3.append(v5_1);
                v0_3.append("]");
                p4 = v0_3.toString();
            }
        }
        return g2.g.e(p3, " : ", p4);
    }

    public final varargs void a(android.os.RemoteException p3, String p4, Object[] p5)
    {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            android.util.Log.e("PlayCore", k4.z.c(this.a, p4, p5), p3);
        }
        return;
    }

    public final varargs void b(String p3, Object[] p4)
    {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            android.util.Log.i("PlayCore", k4.z.c(this.a, p3, p4));
        }
        return;
    }
}
