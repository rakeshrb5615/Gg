package com.google.android.gms.internal.firebase-auth-api;
final class zzacs extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final String zzv;
    private final String zzw;

    public zzacs(String p2, String p3)
    {
        super(4);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "code cannot be null or empty");
        super.zzv = p2;
        super.zzw = p3;
        return;
    }

    public final String zza()
    {
        return "checkActionCode";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.internal.firebase-auth-api.zzaeo p4)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p3);
        p4.zzd(this.zzv, this.zzw, this.zzb);
        return;
    }

    public final void zzb()
    {
        String v1_0 = this.zzm;
        z4.z v0_1 = new z4.z();
        if (!v1_0.zzg()) {
            v1_0.zzb();
        } else {
            v1_0.zzc();
        }
        v1_0.zzb();
        if (v1_0.zzh()) {
            boolean v2_1 = v1_0.zzd();
            v2_1.getClass();
            int v4 = 5;
            int v10 = -1;
            switch (v2_1.hashCode()) {
                case -1874510116:
                    if (v2_1.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                        v10 = 0;
                    } else {
                    }
                    break;
                case -1452371317:
                    if (v2_1.equals("PASSWORD_RESET")) {
                        v10 = 1;
                    } else {
                    }
                    break;
                case -1341836234:
                    if (v2_1.equals("VERIFY_EMAIL")) {
                        v10 = 2;
                    } else {
                    }
                    break;
                case -1099157829:
                    if (v2_1.equals("VERIFY_AND_CHANGE_EMAIL")) {
                        v10 = 3;
                    } else {
                    }
                    break;
                case 870738373:
                    if (v2_1.equals("EMAIL_SIGNIN")) {
                        v10 = 4;
                    } else {
                    }
                    break;
                case 970484929:
                    if (v2_1.equals("RECOVER_EMAIL")) {
                        v10 = 5;
                    } else {
                    }
                    break;
                default:
            }
            switch (v10) {
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
                if (!v1_0.zzf()) {
                    if (!v1_0.zzg()) {
                        if (v1_0.zze()) {
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v1_0.zzb());
                        }
                    } else {
                        boolean v2_12 = v1_0.zzc();
                        String v1_2 = v1_0.zzb();
                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v2_12);
                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v1_2);
                    }
                } else {
                    boolean v2_13 = v1_0.zzb();
                    String v1_4 = w3.a.i(v1_0.zza());
                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v2_13);
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_4);
                }
            }
        }
        this.zzb(v0_1);
        return;
    }
}
