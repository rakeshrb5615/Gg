package com.google.android.play.core.integrity;
abstract class y {
    private final k4.z a;
    private final String b;
    private final long c;
    private final Object d;
    private boolean e;

    public y(String p3, long p4)
    {
        this.a = new k4.z("IntegrityDialogWrapper");
        this.d = new Object();
        this.b = p3;
        this.c = p4;
        return;
    }

    public final com.google.android.gms.tasks.Task a(android.app.Activity p9, int p10)
    {
        if (!this.e) {
            this.e = 1;
            android.os.Bundle v0_4 = this.a;
            String v3_0 = new Object[] {Integer.valueOf(p10)});
            v0_4.getClass();
            if (android.util.Log.isLoggable("PlayCore", 3)) {
                android.util.Log.d("PlayCore", k4.z.c(v0_4.a, "checkAndShowDialog(%s)", v3_0));
            }
            android.os.Bundle v0_3 = new android.os.Bundle();
            v0_3.putInt("dialog.intent.type", p10);
            v0_3.putString("package.name", this.b);
            v0_3.putInt("playcore.integrity.version.major", 1);
            v0_3.putInt("playcore.integrity.version.minor", 3);
            v0_3.putInt("playcore.integrity.version.patch", 0);
            v0_3.putLong("request.token.sid", this.c);
            return this.b(p9, v0_3);
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(Integer.valueOf(0));
        }
    }

    public abstract com.google.android.gms.tasks.Task b();
}
