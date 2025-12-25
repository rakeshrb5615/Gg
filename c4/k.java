package c4;
public final class k extends c4.i {
    public final synthetic c4.l e;

    public k(c4.l p3, com.google.android.gms.tasks.TaskCompletionSource p4, String p5)
    {
        this.e = p3;
        super(p3, new d4.l("OnRequestInstallCallback", 0), p4);
        return;
    }

    public final void a(android.os.Bundle p20)
    {
        super.a(p20);
        com.google.android.gms.tasks.TaskCompletionSource v5 = this.c;
        if (p20.getInt("error.code", -2) == 0) {
            p20.getInt("version.code", -1);
            int v7_0 = p20.getInt("update.availability");
            p20.getInt("install.status", 0);
            if (p20.getInt("client.version.staleness", -1) != -1) {
                p20.getInt("client.version.staleness");
            }
            p20.getInt("in.app.update.priority", 0);
            p20.getLong("bytes.downloaded");
            p20.getLong("total.bytes.to.download");
            long v8_1 = p20.getLong("additional.size.required");
            java.util.HashSet v2_9 = this.e.d;
            v2_9.getClass();
            long v10 = c4.m.a(new java.io.File(v2_9.a.getFilesDir(), "assetpacks"));
            android.app.PendingIntent v12_1 = ((android.app.PendingIntent) p20.getParcelable("blocking.intent"));
            android.app.PendingIntent v13_1 = ((android.app.PendingIntent) p20.getParcelable("nonblocking.intent"));
            android.app.PendingIntent v14_1 = ((android.app.PendingIntent) p20.getParcelable("blocking.destructive.intent"));
            android.app.PendingIntent v15_1 = ((android.app.PendingIntent) p20.getParcelable("nonblocking.destructive.intent"));
            java.util.HashMap v0_2 = new java.util.HashMap();
            int v16 = v7_0;
            int v7_2 = p20.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
            long v17 = v8_1;
            long v8_3 = new java.util.HashSet();
            if (v7_2 != 0) {
                v8_3.addAll(v7_2);
            }
            v0_2.put("blocking.destructive.intent", v8_3);
            java.util.ArrayList v4_8 = p20.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
            int v7_4 = new java.util.HashSet();
            if (v4_8 != null) {
                v7_4.addAll(v4_8);
            }
            v0_2.put("nonblocking.destructive.intent", v7_4);
            java.util.ArrayList v4_10 = p20.getIntegerArrayList("update.precondition.failures:blocking.intent");
            c4.a v6_5 = new java.util.HashSet();
            if (v4_10 != null) {
                v6_5.addAll(v4_10);
            }
            v0_2.put("blocking.intent", v6_5);
            java.util.ArrayList v1_2 = p20.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
            java.util.HashSet v2_16 = new java.util.HashSet();
            if (v1_2 != null) {
                v2_16.addAll(v1_2);
            }
            v0_2.put("nonblocking.intent", v2_16);
            v5.trySetResult(new c4.a(v16, v17, v10, v12_1, v13_1, v14_1, v15_1));
            return;
        } else {
            v5.trySetException(new e4.a(p20.getInt("error.code", -2)));
            return;
        }
    }
}
