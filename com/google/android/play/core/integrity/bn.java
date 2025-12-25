package com.google.android.play.core.integrity;
final class bn {
    final k4.d a;
    private final k4.z b;
    private final String c;
    private final com.google.android.gms.tasks.TaskCompletionSource d;
    private final com.google.android.play.core.integrity.at e;
    private final com.google.android.play.core.integrity.k f;

    public bn(android.content.Context p9, k4.z p10, com.google.android.play.core.integrity.at p11, com.google.android.play.core.integrity.k p12)
    {
        com.google.android.gms.tasks.TaskCompletionSource v0_1 = new com.google.android.gms.tasks.TaskCompletionSource();
        this.d = v0_1;
        this.c = p9.getPackageName();
        this.b = p10;
        this.e = p11;
        this.f = p12;
        k4.d v2_1 = new k4.d(p9, p10, "ExpressIntegrityService", com.google.android.play.core.integrity.bo.a, com.google.android.play.core.integrity.bd.a);
        this.a = v2_1;
        v2_1.a().post(new com.google.android.play.core.integrity.be(this, v0_1, p9));
        return;
    }

    public static android.os.Bundle a(com.google.android.play.core.integrity.bn p1, String p2, long p3, long p5, int p7)
    {
        android.os.Bundle v7_1 = new android.os.Bundle();
        v7_1.putString("package.name", p1.c);
        v7_1.putLong("cloud.prj", p3);
        v7_1.putString("nonce", p2);
        v7_1.putLong("warm.up.sid", p5);
        v7_1.putInt("playcore.integrity.version.major", 1);
        v7_1.putInt("playcore.integrity.version.minor", 3);
        v7_1.putInt("playcore.integrity.version.patch", 0);
        v7_1.putInt("webview.request.mode", 0);
        String v1_6 = new java.util.ArrayList();
        v1_6.add(new k4.m(5, System.currentTimeMillis()));
        v7_1.putParcelableArrayList("event_timestamps", new java.util.ArrayList(a.a.b(v1_6)));
        return v7_1;
    }

    public static android.os.Bundle b(com.google.android.play.core.integrity.bn p2, long p3, int p5)
    {
        android.os.Bundle v5_1 = new android.os.Bundle();
        v5_1.putString("package.name", p2.c);
        v5_1.putLong("cloud.prj", p3);
        v5_1.putInt("playcore.integrity.version.major", 1);
        v5_1.putInt("playcore.integrity.version.minor", 3);
        v5_1.putInt("playcore.integrity.version.patch", 0);
        v5_1.putInt("webview.request.mode", 0);
        String v2_5 = new java.util.ArrayList();
        v2_5.add(new k4.m(4, System.currentTimeMillis()));
        v5_1.putParcelableArrayList("event_timestamps", new java.util.ArrayList(a.a.b(v2_5)));
        return v5_1;
    }

    public static bridge synthetic com.google.android.gms.tasks.TaskCompletionSource f(com.google.android.play.core.integrity.bn p0)
    {
        return p0.d;
    }

    public static bridge synthetic com.google.android.play.core.integrity.k g(com.google.android.play.core.integrity.bn p0)
    {
        return p0.f;
    }

    public static bridge synthetic com.google.android.play.core.integrity.at h(com.google.android.play.core.integrity.bn p0)
    {
        return p0.e;
    }

    public static bridge synthetic k4.z i(com.google.android.play.core.integrity.bn p0)
    {
        return p0.b;
    }

    public static bridge synthetic String j(com.google.android.play.core.integrity.bn p0)
    {
        return p0.c;
    }

    public static bridge synthetic boolean k(com.google.android.play.core.integrity.bn p1)
    {
        if ((!p1.d.getTask().isSuccessful()) || (((Integer) p1.d.getTask().getResult()).intValue() != 0)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.tasks.Task c(android.app.Activity p9, android.os.Bundle p10)
    {
        int v7 = p10.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s)", new Object[] {Integer.valueOf(v7)}));
        com.google.android.gms.tasks.TaskCompletionSource v3_1 = new com.google.android.gms.tasks.TaskCompletionSource();
        this.a.c(new com.google.android.play.core.integrity.bh(this, v3_1, p10, p9, v3_1, v7), v3_1);
        return v3_1.getTask();
    }

    public final com.google.android.gms.tasks.Task d(String p11, long p12, long p14, int p16)
    {
        this.b.b("requestExpressIntegrityToken(%s)", new Object[] {Long.valueOf(p14)}));
        com.google.android.gms.tasks.TaskCompletionSource v2_2 = new com.google.android.gms.tasks.TaskCompletionSource();
        this.a.c(new com.google.android.play.core.integrity.bg(this, v2_2, 0, p11, p12, p14, v2_2), v2_2);
        return v2_2.getTask();
    }

    public final com.google.android.gms.tasks.Task e(long p10, int p12)
    {
        this.b.b("warmUpIntegrityToken(%s)", new Object[] {Long.valueOf(p10)}));
        com.google.android.gms.tasks.TaskCompletionSource v4_1 = new com.google.android.gms.tasks.TaskCompletionSource();
        this.a.c(new com.google.android.play.core.integrity.bf(this, v4_1, 0, p10, v4_1), v4_1);
        return v4_1.getTask();
    }
}
