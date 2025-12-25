package com.google.android.gms.internal.firebase-auth-api;
public class zzael implements com.google.android.gms.internal.firebase-auth-api.zzaem {
    private final com.google.android.gms.internal.firebase-auth-api.zzaem zza;
    private final com.google.android.gms.common.logging.Logger zzb;

    public zzael(com.google.android.gms.internal.firebase-auth-api.zzael p2)
    {
        this(p2.zza, p2.zzb);
        return;
    }

    public zzael(com.google.android.gms.internal.firebase-auth-api.zzaem p1, com.google.android.gms.common.logging.Logger p2)
    {
        this.zza = ((com.google.android.gms.internal.firebase-auth-api.zzaem) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zzb = ((com.google.android.gms.common.logging.Logger) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        return;
    }

    public final void zza()
    {
        try {
            this.zza.zza();
            return;
        } catch (android.os.RemoteException v0_1) {
            Object[] v2_1 = new Object[0];
            this.zzb.e("RemoteException when sending delete account response.", v0_1, v2_1);
            return;
        }
    }

    public void zza(com.google.android.gms.common.api.Status p4)
    {
        try {
            this.zza.zza(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending failure result.", v4_1, v1_1);
            return;
        }
    }

    public final void zza(com.google.android.gms.common.api.Status p3, y4.s p4)
    {
        try {
            this.zza.zza(p3, p4);
            return;
        } catch (android.os.RemoteException v3_1) {
            Object[] v0_2 = new Object[0];
            this.zzb.e("RemoteException when sending failure result.", v3_1, v0_2);
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaap p4)
    {
        try {
            this.zza.zza(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending failure result with credential", v4_1, v1_1);
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaas p4)
    {
        try {
            this.zza.zza(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending failure result for mfa", v4_1, v1_1);
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzagv p4)
    {
        try {
            this.zza.zza(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending create auth uri response.", v4_1, v1_1);
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahr p4)
    {
        try {
            this.zza.zza(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending Play Integrity Producer project response.", v4_1, v1_1);
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahs p4)
    {
        try {
            this.zza.zza(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending get recaptcha config response.", v4_1, v1_1);
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahv p4)
    {
        try {
            this.zza.zza(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending token result.", v4_1, v1_1);
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahv p3, com.google.android.gms.internal.firebase-auth-api.zzahk p4)
    {
        try {
            this.zza.zza(p3, p4);
            return;
        } catch (android.os.RemoteException v3_1) {
            Object[] v0_2 = new Object[0];
            this.zzb.e("RemoteException when sending get token and account info user response", v3_1, v0_2);
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaif p4)
    {
        try {
            this.zza.zza(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending password reset response.", v4_1, v1_1);
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaig p4)
    {
        try {
            this.zza.zza(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending revoke token response.", v4_1, v1_1);
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzair p4)
    {
        try {
            this.zza.zza(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending start mfa enrollment response.", v4_1, v1_1);
            return;
        }
    }

    public final void zza(String p4)
    {
        try {
            this.zza.zza(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending auto retrieval timeout response.", v4_1, v1_1);
            return;
        }
    }

    public final void zza(y4.s p4)
    {
        try {
            this.zza.zza(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending verification completed response.", v4_1, v1_1);
            return;
        }
    }

    public final void zzb()
    {
        try {
            this.zza.zzb();
            return;
        } catch (android.os.RemoteException v0_1) {
            Object[] v2_1 = new Object[0];
            this.zzb.e("RemoteException when sending email verification response.", v0_1, v2_1);
            return;
        }
    }

    public void zzb(String p4)
    {
        try {
            this.zza.zzb(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending send verification code response.", v4_1, v1_1);
            return;
        }
    }

    public final void zzc()
    {
        try {
            this.zza.zzc();
            return;
        } catch (android.os.RemoteException v0_1) {
            Object[] v2_1 = new Object[0];
            this.zzb.e("RemoteException when setting FirebaseUI Version", v0_1, v2_1);
            return;
        }
    }

    public final void zzc(String p4)
    {
        try {
            this.zza.zzc(p4);
            return;
        } catch (android.os.RemoteException v4_1) {
            Object[] v1_1 = new Object[0];
            this.zzb.e("RemoteException when sending set account info response.", v4_1, v1_1);
            return;
        }
    }
}
