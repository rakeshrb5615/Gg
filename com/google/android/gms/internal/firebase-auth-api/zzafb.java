package com.google.android.gms.internal.firebase-auth-api;
public final class zzafb extends com.google.android.gms.internal.firebase-auth-api.zzaft implements com.google.android.gms.internal.firebase-auth-api.zzagn {
    private com.google.android.gms.internal.firebase-auth-api.zzaev zza;
    private com.google.android.gms.internal.firebase-auth-api.zzaey zzb;
    private com.google.android.gms.internal.firebase-auth-api.zzafy zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzafc zzd;
    private final q4.f zze;
    private String zzf;
    private com.google.android.gms.internal.firebase-auth-api.zzafe zzg;

    public zzafb(q4.f p8, com.google.android.gms.internal.firebase-auth-api.zzafc p9)
    {
        this(p8, p9, 0, 0, 0, 0);
        return;
    }

    private zzafb(q4.f p1, com.google.android.gms.internal.firebase-auth-api.zzafc p2, com.google.android.gms.internal.firebase-auth-api.zzafy p3, com.google.android.gms.internal.firebase-auth-api.zzaev p4, com.google.android.gms.internal.firebase-auth-api.zzaey p5, com.google.android.gms.internal.firebase-auth-api.zzaew p6)
    {
        this.zze = p1;
        p1.a();
        p3 = p1.c;
        this.zzf = p3.a;
        p1.a();
        p3.getClass();
        this.zzd = ((com.google.android.gms.internal.firebase-auth-api.zzafc) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zza(0, 0, 0, 0);
        com.google.android.gms.internal.firebase-auth-api.zzagl.zza(this.zzf, this);
        return;
    }

    private final void zza(com.google.android.gms.internal.firebase-auth-api.zzafy p1, com.google.android.gms.internal.firebase-auth-api.zzaev p2, com.google.android.gms.internal.firebase-auth-api.zzaey p3, com.google.android.gms.internal.firebase-auth-api.zzaew p4)
    {
        this.zzc = 0;
        this.zza = 0;
        this.zzb = 0;
        String v1_2 = com.google.android.gms.internal.firebase-auth-api.zzagi.zza("firebear.secureToken");
        if (!android.text.TextUtils.isEmpty(v1_2)) {
            com.google.android.gms.internal.firebase-auth-api.zzaey v2_1 = new StringBuilder("Found hermetic configuration for secureToken URL: ");
            v2_1.append(v1_2);
            android.util.Log.e("LocalClient", v2_1.toString());
        } else {
            v1_2 = com.google.android.gms.internal.firebase-auth-api.zzagl.zzd(this.zzf);
        }
        if (this.zzc == null) {
            this.zzc = new com.google.android.gms.internal.firebase-auth-api.zzafy(v1_2, this.zzb());
        }
        String v1_4 = com.google.android.gms.internal.firebase-auth-api.zzagi.zza("firebear.identityToolkit");
        if (!android.text.TextUtils.isEmpty(v1_4)) {
            com.google.android.gms.internal.firebase-auth-api.zzaey v2_8 = new StringBuilder("Found hermetic configuration for identityToolkit URL: ");
            v2_8.append(v1_4);
            android.util.Log.e("LocalClient", v2_8.toString());
        } else {
            v1_4 = com.google.android.gms.internal.firebase-auth-api.zzagl.zzb(this.zzf);
        }
        if (this.zza == null) {
            this.zza = new com.google.android.gms.internal.firebase-auth-api.zzaev(v1_4, this.zzb());
        }
        String v1_8 = com.google.android.gms.internal.firebase-auth-api.zzagi.zza("firebear.identityToolkitV2");
        if (!android.text.TextUtils.isEmpty(v1_8)) {
            com.google.android.gms.internal.firebase-auth-api.zzaey v2_15 = new StringBuilder("Found hermetic configuration for identityToolkitV2 URL: ");
            v2_15.append(v1_8);
            android.util.Log.e("LocalClient", v2_15.toString());
        } else {
            v1_8 = com.google.android.gms.internal.firebase-auth-api.zzagl.zzc(this.zzf);
        }
        if (this.zzb == null) {
            this.zzb = new com.google.android.gms.internal.firebase-auth-api.zzaey(v1_8, this.zzb());
        }
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzafe zzb()
    {
        if (this.zzg == null) {
            this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafe(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    public final void zza()
    {
        this.zza(0, 0, 0, 0);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzags p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/createAuthUri", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzagv, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzagu p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/deleteAccount", this.zzf), p4, p5, Void, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzagx p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/emailLinkSignin", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzagw, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzagz p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zzb;
        com.google.android.gms.internal.firebase-auth-api.zzaey.zza(v0_0.zza("/accounts/mfaEnrollment:finalize", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzagy, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahb p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zzb;
        com.google.android.gms.internal.firebase-auth-api.zzaey.zza(v0_0.zza("/accounts/mfaSignIn:finalize", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzaha, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahi p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/getAccountInfo", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzahl, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahj p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zzc;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/token", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzahv, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahm p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        if (p4.zzb() != null) {
            this.zzb().zzb(p4.zzb().n);
        }
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/getOobConfirmationCode", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzahp, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaho p3, com.google.android.gms.internal.firebase-auth-api.zzafv p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.internal.firebase-auth-api.zzafe v3_1 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v3_1.zza("/getRecaptchaParam", this.zzf), p4, com.google.android.gms.internal.firebase-auth-api.zzahr, v3_1.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaht p6, com.google.android.gms.internal.firebase-auth-api.zzafv p7)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zzb;
        String v1_4 = v0_0.zza("/recaptchaConfig", this.zzf);
        String v2_4 = p6.zzb();
        String v3 = p6.zzc();
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append(v1_4);
        v4_1.append("&clientType=");
        v4_1.append(v2_4);
        v4_1.append("&version=");
        v4_1.append(v3);
        String v1_2 = v4_1.toString();
        if (!com.google.android.gms.internal.firebase-auth-api.zzac.zzc(p6.zzd())) {
            v1_2 = g2.g.e(v1_2, "&tenantId=", p6.zzd());
        }
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v1_2, p7, com.google.android.gms.internal.firebase-auth-api.zzahs, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaic p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/resetPassword", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzaif, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaie p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zzb;
        com.google.android.gms.internal.firebase-auth-api.zzaey.zza(v0_0.zza("/accounts:revokeToken", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzaig, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaij p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        if (!android.text.TextUtils.isEmpty(p4.zzc())) {
            this.zzb().zzb(p4.zzc());
        }
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/sendVerificationCode", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzaii, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzail p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/setAccountInfo", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzaik, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaim p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/signupNewUser", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzaip, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaio p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        if (((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzais)) && (!android.text.TextUtils.isEmpty(((com.google.android.gms.internal.firebase-auth-api.zzais) p4).zzb()))) {
            this.zzb().zzb(((com.google.android.gms.internal.firebase-auth-api.zzais) p4).zzb());
        }
        String v0_1 = this.zzb;
        com.google.android.gms.internal.firebase-auth-api.zzaey.zza(v0_1.zza("/accounts/mfaEnrollment:start", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzair, v0_1.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaiq p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        if (!android.text.TextUtils.isEmpty(p4.zzb())) {
            this.zzb().zzb(p4.zzb());
        }
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zzb;
        com.google.android.gms.internal.firebase-auth-api.zzaey.zza(v0_0.zza("/accounts/mfaSignIn:start", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzait, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzajb p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/verifyAssertion", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzajd, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzajc p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/verifyCustomToken", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzajf, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaje p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/verifyPassword", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzajh, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzajg p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zza;
        com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0.zza("/verifyPhoneNumber", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzajj, v0_0.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaji p4, com.google.android.gms.internal.firebase-auth-api.zzafv p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.internal.firebase-auth-api.zzafe v0_0 = this.zzb;
        com.google.android.gms.internal.firebase-auth-api.zzaey.zza(v0_0.zza("/accounts/mfaEnrollment:withdraw", this.zzf), p4, p5, com.google.android.gms.internal.firebase-auth-api.zzajl, v0_0.zza);
        return;
    }

    public final void zza(String p2, com.google.android.gms.internal.firebase-auth-api.zzafv p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        this.zzb().zza(p2);
        p3.zza(0);
        return;
    }
}
