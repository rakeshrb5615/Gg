package com.google.android.recaptcha.internal;
public final class zzik extends android.webkit.WebViewClient {
    final synthetic com.google.android.recaptcha.internal.zzja zza;

    public zzik(com.google.android.recaptcha.internal.zzja p1)
    {
        this.zza = p1;
        return;
    }

    public final void onLoadResource(android.webkit.WebView p1, String p2)
    {
        System.currentTimeMillis();
        return;
    }

    public final void onPageFinished(android.webkit.WebView p2, String p3)
    {
        com.google.android.recaptcha.internal.zzbk.zza(com.google.android.recaptcha.internal.zzbl.zzg.zza(), com.google.android.recaptcha.internal.zzja.zzr(this.zza).zza(java.util.concurrent.TimeUnit.MICROSECONDS));
        return;
    }

    public final void onReceivedError(android.webkit.WebView p1, int p2, String p3, String p4)
    {
        super.onReceivedError(p1, p2, p3, p4);
        d8.u v2_1 = ((com.google.android.recaptcha.internal.zzba) com.google.android.recaptcha.internal.zzja.zzy(this.zza).get(Integer.valueOf(p2)));
        if (v2_1 == null) {
            v2_1 = com.google.android.recaptcha.internal.zzba.zzM;
        }
        com.google.android.recaptcha.internal.zzbd v1_2 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, v2_1, 0);
        this.zza.zzA().hashCode();
        v1_2.getMessage();
        ((d8.u) this.zza.zzA()).O(v1_2);
        return;
    }

    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView p4, String p5)
    {
        String v0_0 = this.zza;
        String v1_0 = android.net.Uri.parse(p5);
        com.google.android.recaptcha.internal.zzja.zzp(v0_0);
        kotlin.jvm.internal.j.b(v1_0);
        if ((!com.google.android.recaptcha.internal.zzfk.zzc(v1_0)) || (com.google.android.recaptcha.internal.zzja.zzp(this.zza).zza(v1_0))) {
            return super.shouldInterceptRequest(p4, p5);
        } else {
            android.webkit.WebResourceResponse v4_3 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzQ, 0);
            this.zza.zzA().hashCode();
            v1_0.toString();
            ((d8.u) this.zza.zzA()).O(v4_3);
            String v0_5 = new byte[0];
            return new android.webkit.WebResourceResponse("text/plain", "UTF-8", new java.io.ByteArrayInputStream(v0_5));
        }
    }
}
