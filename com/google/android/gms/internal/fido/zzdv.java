package com.google.android.gms.internal.fido;
final class zzdv {
    private final java.util.Deque zza;

    private zzdv(boolean p2)
    {
        this.zza = new java.util.ArrayDeque(16);
        return;
    }

    public static com.google.android.gms.internal.fido.zzdv zza()
    {
        return new com.google.android.gms.internal.fido.zzdv(0);
    }

    private final long zzh()
    {
        if (!this.zza.isEmpty()) {
            return ((Long) this.zza.peek()).longValue();
        } else {
            return 0;
        }
    }

    private final void zzi(long p2)
    {
        this.zza.pop();
        this.zza.push(Long.valueOf(p2));
        return;
    }

    public final void zzb()
    {
        if (!this.zza.isEmpty()) {
            String v0_5 = this.zza.size();
            java.io.IOException v1_2 = this.zzh();
            StringBuilder v3_0 = new StringBuilder("data item not completed, stackSize: ");
            v3_0.append(v0_5);
            v3_0.append(" scope: ");
            v3_0.append(v1_2);
            throw new java.io.IOException(v3_0.toString());
        } else {
            return;
        }
    }

    public final void zzc()
    {
        java.io.IOException v0_0 = this.zzh();
        if (v0_0 >= 0) {
            throw new java.io.IOException(v1.a.g(v0_0, "expected indefinite length scope but found "));
        } else {
            if (v0_0 == -5) {
                throw new java.io.IOException("expected a value for dangling key in indefinite-length map");
            } else {
                this.zza.pop();
                return;
            }
        }
    }

    public final void zzd()
    {
        String v0_0 = this.zzh();
        if (v0_0 != -1) {
            if (v0_0 == -2) {
                v0_0 = -2;
            } else {
                return;
            }
        }
        throw new java.io.IOException(v1.a.g(v0_0, "expected non-string scope but found "));
    }

    public final void zze(long p5)
    {
        StringBuilder v0_0 = this.zzh();
        if (v0_0 != p5) {
            if (v0_0 != -1) {
                if (v0_0 == -2) {
                    v0_0 = -2;
                } else {
                    return;
                }
            }
            StringBuilder v2_1 = new StringBuilder("expected non-string scope or scope ");
            v2_1.append(p5);
            v2_1.append(" but found ");
            v2_1.append(v0_0);
            throw new java.io.IOException(v2_1.toString());
        }
        return;
    }

    public final void zzf()
    {
        long v0_0 = this.zzh();
        long v2_2 = v0_0 cmp 1;
        if (v2_2 != 0) {
            if (v2_2 <= 0) {
                if (v0_0 != -4) {
                    if (v0_0 == -5) {
                        this.zzi(-4);
                    }
                    return;
                } else {
                    this.zzi(-5);
                    return;
                }
            } else {
                this.zzi((v0_0 + -1));
                return;
            }
        } else {
            this.zza.pop();
            return;
        }
    }

    public final void zzg(long p2)
    {
        this.zza.push(Long.valueOf(p2));
        return;
    }
}
