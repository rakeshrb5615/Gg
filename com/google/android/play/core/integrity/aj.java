package com.google.android.play.core.integrity;
final class aj {
    final k4.d a;
    private final k4.z b;
    private final String c;
    private final com.google.android.play.core.integrity.at d;
    private final com.google.android.play.core.integrity.k e;

    public aj(android.content.Context p7, k4.z p8, com.google.android.play.core.integrity.at p9, com.google.android.play.core.integrity.k p10)
    {
        this.c = p7.getPackageName();
        this.b = p8;
        this.d = p9;
        this.e = p10;
        if ((!p7.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) || (!k4.f.a(p7.getPackageManager().getPackageInfo("com.android.vending", 64).signatures))) {
            int v7_1 = new Object[0];
            p8.getClass();
            if (android.util.Log.isLoggable("PlayCore", 6)) {
                android.util.Log.e("PlayCore", k4.z.c(p8.a, "Phonesky is not installed.", v7_1));
            }
            this.a = 0;
            return;
        } else {
            this.a = new k4.d(p7, p8, "IntegrityService", com.google.android.play.core.integrity.ak.a, com.google.android.play.core.integrity.ae.a);
            return;
        }
    }

    public static android.os.Bundle a(com.google.android.play.core.integrity.aj p2, byte[] p3, Long p4, android.os.Parcelable p5)
    {
        android.os.Bundle v5_1 = new android.os.Bundle();
        v5_1.putString("package.name", p2.c);
        v5_1.putByteArray("nonce", p3);
        v5_1.putInt("playcore.integrity.version.major", 1);
        v5_1.putInt("playcore.integrity.version.minor", 3);
        v5_1.putInt("playcore.integrity.version.patch", 0);
        if (p4 != null) {
            v5_1.putLong("cloud.prj", p4.longValue());
        }
        String v2_5 = new java.util.ArrayList();
        v2_5.add(new k4.m(3, System.currentTimeMillis()));
        v5_1.putParcelableArrayList("event_timestamps", new java.util.ArrayList(a.a.b(v2_5)));
        return v5_1;
    }

    public static bridge synthetic com.google.android.play.core.integrity.k d(com.google.android.play.core.integrity.aj p0)
    {
        return p0.e;
    }

    public static bridge synthetic com.google.android.play.core.integrity.at e(com.google.android.play.core.integrity.aj p0)
    {
        return p0.d;
    }

    public static bridge synthetic k4.z f(com.google.android.play.core.integrity.aj p0)
    {
        return p0.b;
    }

    public static bridge synthetic String g(com.google.android.play.core.integrity.aj p0)
    {
        return p0.c;
    }

    public final com.google.android.gms.tasks.Task b(android.app.Activity p9, android.os.Bundle p10)
    {
        if (this.a != null) {
            int v7 = p10.getInt("dialog.intent.type");
            this.b.b("requestAndShowDialog(%s, %s)", new Object[] {this.c, Integer.valueOf(v7)}));
            com.google.android.gms.tasks.TaskCompletionSource v3_1 = new com.google.android.gms.tasks.TaskCompletionSource();
            this.a.c(new com.google.android.play.core.integrity.ag(this, v3_1, p10, p9, v3_1, v7), v3_1);
            return v3_1.getTask();
        } else {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.integrity.IntegrityServiceException(-2, 0));
        }
    }

    public final com.google.android.gms.tasks.Task c(com.google.android.play.core.integrity.IntegrityTokenRequest p11)
    {
        if (this.a != null) {
            try {
                byte[] v5 = android.util.Base64.decode(p11.nonce(), 10);
                Long v6 = p11.cloudProjectNumber();
            } catch (k4.d v0_1) {
                return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.integrity.IntegrityServiceException(-13, v0_1));
            }
            // Both branches of the condition point to the same code.
            // if (!(p11 instanceof com.google.android.play.core.integrity.ao)) {
                this.b.b("requestIntegrityToken(%s)", new Object[] {p11}));
                com.google.android.gms.tasks.TaskCompletionSource v4_1 = new com.google.android.gms.tasks.TaskCompletionSource();
                this.a.c(new com.google.android.play.core.integrity.af(this, v4_1, v5, v6, 0, v4_1, p11), v4_1);
                return v4_1.getTask();
            // }
        } else {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.integrity.IntegrityServiceException(-2, 0));
        }
    }
}
