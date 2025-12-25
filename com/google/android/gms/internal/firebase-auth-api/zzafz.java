package com.google.android.gms.internal.firebase-auth-api;
public final class zzafz {
    private final com.google.firebase.auth.FirebaseAuth zza;
    private final android.app.Activity zzb;

    public zzafz(com.google.firebase.auth.FirebaseAuth p1, android.app.Activity p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void zza()
    {
        Throwable v0_1 = new android.content.Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        v0_1.setClass(this.zzb, com.google.firebase.auth.internal.RecaptchaActivity);
        v0_1.setPackage(this.zzb.getPackageName());
        String v2_1 = this.zza.a;
        v2_1.a();
        v0_1.putExtra("com.google.firebase.auth.KEY_API_KEY", v2_1.c.a);
        if (!android.text.TextUtils.isEmpty(this.zza.i)) {
            v0_1.putExtra("com.google.firebase.auth.KEY_TENANT_ID", this.zza.i);
        }
        v0_1.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", com.google.android.gms.internal.firebase-auth-api.zzafc.zza().zzb());
        String v2_10 = this.zza.a;
        v2_10.a();
        v0_1.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", v2_10.b);
        this.zza.getClass();
        v0_1.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", 0);
        this.zzb.startActivity(v0_1);
        return;
    }
}
