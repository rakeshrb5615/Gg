package com.google.android.gms.internal.firebase-auth-api;
final class zzafh implements com.google.android.gms.internal.firebase-auth-api.zzaem {
    final synthetic com.google.android.gms.internal.firebase-auth-api.zzaff zza;

    public zzafh(com.google.android.gms.internal.firebase-auth-api.zzaff p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    private final void zza(com.google.android.gms.common.api.Status p2, y4.c p3, String p4, String p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(this.zza, p2);
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_1 = this.zza;
        v0_1.zzn = p3;
        v0_1.zzo = p4;
        v0_1.zzp = p5;
        com.google.android.gms.internal.firebase-auth-api.zzaff v3_1 = v0_1.zzf;
        if (v3_1 != null) {
            v3_1.zza(p2);
        }
        this.zza.zza(p2);
        return;
    }

    private final void zza(com.google.android.gms.internal.firebase-auth-api.zzafm p3)
    {
        this.zza.zzi.execute(new com.google.android.gms.internal.firebase-auth-api.zzafn(this, p3));
        return;
    }

    public final void zza()
    {
        int v1_1;
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_1 = this.zza.zza;
        if (v0_1 != 5) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        StringBuilder v2_1 = new StringBuilder("Unexpected response type ");
        v2_1.append(v0_1);
        com.google.android.gms.common.internal.Preconditions.checkState(v1_1, v2_1.toString());
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(this.zza);
        return;
    }

    public final void zza(com.google.android.gms.common.api.Status p4)
    {
        int v0_0 = p4.getStatusMessage();
        if (v0_0 != 0) {
            if (!v0_0.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                if (!v0_0.contains("MISSING_MFA_ENROLLMENT_ID")) {
                    if (!v0_0.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                        if (!v0_0.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                            if (!v0_0.contains("ADMIN_ONLY_OPERATION")) {
                                if (!v0_0.contains("UNVERIFIED_EMAIL")) {
                                    if (!v0_0.contains("SECOND_FACTOR_EXISTS")) {
                                        if (!v0_0.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                                            if (!v0_0.contains("UNSUPPORTED_FIRST_FACTOR")) {
                                                if (v0_0.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                                                    p4 = new com.google.android.gms.common.api.Status(17090);
                                                }
                                            } else {
                                                p4 = new com.google.android.gms.common.api.Status(17089);
                                            }
                                        } else {
                                            p4 = new com.google.android.gms.common.api.Status(17088);
                                        }
                                    } else {
                                        p4 = new com.google.android.gms.common.api.Status(17087);
                                    }
                                } else {
                                    p4 = new com.google.android.gms.common.api.Status(17086);
                                }
                            } else {
                                p4 = new com.google.android.gms.common.api.Status(17085);
                            }
                        } else {
                            p4 = new com.google.android.gms.common.api.Status(17084);
                        }
                    } else {
                        p4 = new com.google.android.gms.common.api.Status(17083);
                    }
                } else {
                    p4 = new com.google.android.gms.common.api.Status(17082);
                }
            } else {
                p4 = new com.google.android.gms.common.api.Status(17081);
            }
        }
        int v0_12 = this.zza;
        if (v0_12.zza != 8) {
            com.google.android.gms.internal.firebase-auth-api.zzaff.zza(v0_12, p4);
            this.zza.zza(p4);
            return;
        } else {
            v0_12.zzu = 1;
            this.zza(new com.google.android.gms.internal.firebase-auth-api.zzafk(this, p4));
            return;
        }
    }

    public final void zza(com.google.android.gms.common.api.Status p5, y4.s p6)
    {
        int v1_1;
        int v0_1 = this.zza.zza;
        if (v0_1 != 2) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        StringBuilder v2_1 = new StringBuilder("Unexpected response type ");
        v2_1.append(v0_1);
        com.google.android.gms.common.internal.Preconditions.checkState(v1_1, v2_1.toString());
        this.zza(p5, p6, 0, 0);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaap p4)
    {
        this.zza(p4.zza(), p4.zzb(), p4.zzc(), p4.zzd());
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaas p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaff v0 = this.zza;
        v0.zzq = p2;
        v0.zza(w0.a.k("REQUIRES_SECOND_FACTOR_AUTH"));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzagv p5)
    {
        int v1_1;
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_1 = this.zza.zza;
        if (v0_1 != 3) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        StringBuilder v2_1 = new StringBuilder("Unexpected response type ");
        v2_1.append(v0_1);
        com.google.android.gms.common.internal.Preconditions.checkState(v1_1, v2_1.toString());
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_3 = this.zza;
        v0_3.zzl = p5;
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(v0_3);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahr p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaff v0 = this.zza;
        v0.zzs = p2;
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(v0);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahs p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaff v0 = this.zza;
        v0.zzr = p2;
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(v0);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahv p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_1 = this.zza.zza;
        int v1 = 1;
        if (v0_1 != 1) {
            v1 = 0;
        }
        StringBuilder v2_1 = new StringBuilder("Unexpected response type: ");
        v2_1.append(v0_1);
        com.google.android.gms.common.internal.Preconditions.checkState(v1, v2_1.toString());
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_3 = this.zza;
        v0_3.zzj = p5;
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(v0_3);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahv p5, com.google.android.gms.internal.firebase-auth-api.zzahk p6)
    {
        int v1_1;
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_1 = this.zza.zza;
        if (v0_1 != 2) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        StringBuilder v2_1 = new StringBuilder("Unexpected response type: ");
        v2_1.append(v0_1);
        com.google.android.gms.common.internal.Preconditions.checkState(v1_1, v2_1.toString());
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_3 = this.zza;
        v0_3.zzj = p5;
        v0_3.zzk = p6;
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(v0_3);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaif p5)
    {
        int v1_1;
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_1 = this.zza.zza;
        if (v0_1 != 4) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        StringBuilder v2_1 = new StringBuilder("Unexpected response type ");
        v2_1.append(v0_1);
        com.google.android.gms.common.internal.Preconditions.checkState(v1_1, v2_1.toString());
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_3 = this.zza;
        v0_3.zzm = p5;
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(v0_3);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaig p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(this.zza);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzair p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaff v0 = this.zza;
        v0.zzt = p2;
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(v0);
        return;
    }

    public final void zza(String p6)
    {
        int v1_1;
        com.google.android.gms.internal.firebase-auth-api.zzafl v0_1 = this.zza.zza;
        if (v0_1 != 8) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        StringBuilder v3_1 = new StringBuilder("Unexpected response type ");
        v3_1.append(v0_1);
        com.google.android.gms.common.internal.Preconditions.checkState(v1_1, v3_1.toString());
        this.zza.zzu = 1;
        this.zza(new com.google.android.gms.internal.firebase-auth-api.zzafl(this, p6));
        return;
    }

    public final void zza(y4.s p6)
    {
        int v1_1;
        com.google.android.gms.internal.firebase-auth-api.zzafi v0_1 = this.zza.zza;
        if (v0_1 != 8) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        StringBuilder v3_1 = new StringBuilder("Unexpected response type ");
        v3_1.append(v0_1);
        com.google.android.gms.common.internal.Preconditions.checkState(v1_1, v3_1.toString());
        this.zza.zzu = 1;
        this.zza(new com.google.android.gms.internal.firebase-auth-api.zzafi(this, p6));
        return;
    }

    public final void zzb()
    {
        int v1_1;
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_1 = this.zza.zza;
        if (v0_1 != 6) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        StringBuilder v2_1 = new StringBuilder("Unexpected response type ");
        v2_1.append(v0_1);
        com.google.android.gms.common.internal.Preconditions.checkState(v1_1, v2_1.toString());
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(this.zza);
        return;
    }

    public final void zzb(String p5)
    {
        int v1_1;
        com.google.android.gms.internal.firebase-auth-api.zzafj v0_1 = this.zza.zza;
        if (v0_1 != 8) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        StringBuilder v2_1 = new StringBuilder("Unexpected response type ");
        v2_1.append(v0_1);
        com.google.android.gms.common.internal.Preconditions.checkState(v1_1, v2_1.toString());
        this.zza(new com.google.android.gms.internal.firebase-auth-api.zzafj(this, p5));
        return;
    }

    public final void zzc()
    {
        int v1_1;
        com.google.android.gms.internal.firebase-auth-api.zzaff v0_1 = this.zza.zza;
        if (v0_1 != 9) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        StringBuilder v2_1 = new StringBuilder("Unexpected response type ");
        v2_1.append(v0_1);
        com.google.android.gms.common.internal.Preconditions.checkState(v1_1, v2_1.toString());
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(this.zza);
        return;
    }

    public final void zzc(String p4)
    {
        int v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzaff v4_1 = this.zza.zza;
        if (v4_1 != 7) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        StringBuilder v1_1 = new StringBuilder("Unexpected response type ");
        v1_1.append(v4_1);
        com.google.android.gms.common.internal.Preconditions.checkState(v0_1, v1_1.toString());
        com.google.android.gms.internal.firebase-auth-api.zzaff.zza(this.zza);
        return;
    }
}
