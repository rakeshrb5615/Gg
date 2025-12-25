package com.google.android.play.core.integrity;
final class be extends k4.a0 {
    final synthetic android.content.Context a;
    final synthetic com.google.android.play.core.integrity.bn b;

    public be(com.google.android.play.core.integrity.bn p1, com.google.android.gms.tasks.TaskCompletionSource p2, android.content.Context p3)
    {
        this.b = p1;
        this.a = p3;
        super(p2);
        return;
    }

    public final void b()
    {
        int v0_0 = this.a;
        com.google.android.gms.tasks.TaskCompletionSource v1_1 = com.google.android.play.core.integrity.bn.f(this.b);
        try {
            int v0_1 = v0_0.getPackageManager().getPackageInfo("com.android.vending", 64);
            boolean v2_0 = v0_1.applicationInfo;
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            int v0_2 = 0;
            v1_1.trySetResult(Integer.valueOf(v0_2));
            return;
        }
        if ((v2_0) && ((v2_0.enabled) && (k4.f.a(v0_1.signatures)))) {
            v0_2 = v0_1.versionCode;
            v1_1.trySetResult(Integer.valueOf(v0_2));
            return;
        } else {
        }
    }
}
