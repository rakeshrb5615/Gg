package com.google.android.gms.internal.firebase-auth-api;
final class zzaek extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final String zzv;
    private final String zzw;

    public zzaek(String p2, String p3)
    {
        super(4);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "code cannot be null or empty");
        super.zzv = p2;
        super.zzw = p3;
        return;
    }

    public final String zza()
    {
        return "verifyPasswordResetCode";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.internal.firebase-auth-api.zzaeo p4)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p3);
        p4.zzd(this.zzv, this.zzw, this.zzb);
        return;
    }

    public final void zzb()
    {
        String v0_0 = this.zzm;
        if (!v0_0.zzg()) {
            v0_0.zzb();
        } else {
            v0_0.zzc();
        }
        v0_0.zzb();
        int v2 = 3;
        if (v0_0.zzh()) {
            boolean v1_0 = v0_0.zzd();
            v1_0.getClass();
            int v4 = 5;
            int v9 = -1;
            switch (v1_0.hashCode()) {
                case -1874510116:
                    if (v1_0.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                        v9 = 0;
                    } else {
                    }
                    break;
                case -1452371317:
                    if (v1_0.equals("PASSWORD_RESET")) {
                        v9 = 1;
                    } else {
                    }
                    break;
                case -1341836234:
                    if (v1_0.equals("VERIFY_EMAIL")) {
                        v9 = 2;
                    } else {
                    }
                    break;
                case -1099157829:
                    if (v1_0.equals("VERIFY_AND_CHANGE_EMAIL")) {
                        v9 = 3;
                    } else {
                    }
                    break;
                case 870738373:
                    if (v1_0.equals("EMAIL_SIGNIN")) {
                        v9 = 4;
                    } else {
                    }
                    break;
                case 970484929:
                    if (v1_0.equals("RECOVER_EMAIL")) {
                        v9 = 5;
                    } else {
                    }
                    break;
                default:
            }
            switch (v9) {
                case 0:
                    v4 = 6;
                    break;
                case 1:
                    v4 = 0;
                    break;
                case 2:
                    v4 = 1;
                case 3:
                    break;
                case 4:
                    v4 = 4;
                    break;
                case 5:
                    v4 = 2;
                    break;
                default:
                    v4 = 3;
            }
            if ((v4 != 4) && (v4 != 3)) {
                if (!v0_0.zzf()) {
                    if (!v0_0.zzg()) {
                        if (v0_0.zze()) {
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_0.zzb());
                        }
                    } else {
                        boolean v1_11 = v0_0.zzc();
                        String v0_2 = v0_0.zzb();
                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v1_11);
                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_2);
                    }
                } else {
                    boolean v1_13 = v0_0.zzb();
                    String v0_4 = w3.a.i(v0_0.zza());
                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v1_13);
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_4);
                }
            }
            v2 = v4;
        }
        if (v2 == 0) {
            this.zzb(this.zzm.zzb());
            return;
        } else {
            this.zza(new com.google.android.gms.common.api.Status(17499));
            return;
        }
    }
}
