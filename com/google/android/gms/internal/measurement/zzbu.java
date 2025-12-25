package com.google.android.gms.internal.measurement;
final class zzbu extends com.google.android.gms.internal.measurement.zzca {
    private final String zzc;
    private final int zzd;
    private final int zze;

    public synthetic zzbu(String p1, boolean p2, int p3, com.google.android.gms.internal.measurement.zzbr p4, com.google.android.gms.internal.measurement.zzbs p5, int p6, byte[] p7)
    {
        this.zzc = p1;
        this.zzd = p3;
        this.zze = p6;
        return;
    }

    public final boolean equals(Object p6)
    {
        if (p6 != this) {
            if (((p6 instanceof com.google.android.gms.internal.measurement.zzca)) && (this.zzc.equals(((com.google.android.gms.internal.measurement.zzca) p6).zza()))) {
                ((com.google.android.gms.internal.measurement.zzca) p6).zzb();
                int v1_1 = this.zzd;
                int v3_0 = ((com.google.android.gms.internal.measurement.zzca) p6).zze();
                if (v1_1 == 0) {
                    throw 0;
                } else {
                    if (v1_1 == v3_0) {
                        ((com.google.android.gms.internal.measurement.zzca) p6).zzc();
                        ((com.google.android.gms.internal.measurement.zzca) p6).zzd();
                        int v1_3 = this.zze;
                        int v6_1 = ((com.google.android.gms.internal.measurement.zzca) p6).zzf();
                        if (v1_3 == 0) {
                            throw 0;
                        } else {
                            if (v6_1 == 1) {
                                return 1;
                            }
                        }
                    }
                }
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int vtmp1 = this.zzc.hashCode();
        int v2 = this.zzd;
        if (v2 == 0) {
            throw 0;
        } else {
            if (this.zze == 0) {
                throw 0;
            } else {
                return (((((((vtmp1 ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ v2) * 583896283) ^ 1);
            }
        }
    }

    public final String toString()
    {
        String v0_1;
        String v0_0 = this.zzd;
        String v1 = "null";
        if (v0_0 == 1) {
            v0_1 = "ALL_CHECKS";
        } else {
            if (v0_0 == 2) {
                v0_1 = "SKIP_COMPLIANCE_CHECK";
            } else {
                if (v0_0 == 3) {
                    v0_1 = "SKIP_SECURITY_CHECK";
                } else {
                    if (v0_0 == 4) {
                        v0_1 = "NO_CHECKS";
                    } else {
                        v0_1 = "null";
                    }
                }
            }
        }
        if (this.zze == 1) {
            v1 = "READ_AND_WRITE";
        }
        String v3_2 = this.zzc;
        StringBuilder v5_4 = new StringBuilder(((v1.length() + ((v0_1.length() + (String.valueOf(v3_2).length() + 73)) + 91)) + 1));
        v5_4.append("FileComplianceOptions{fileOwner=");
        v5_4.append(v3_2);
        v5_4.append(", hasDifferentDmaOwner=false, fileChecks=");
        v5_4.append(v0_1);
        return v1.a.o(v5_4, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", v1, "}");
    }

    public final String zza()
    {
        return this.zzc;
    }

    public final boolean zzb()
    {
        return 0;
    }

    public final com.google.android.gms.internal.measurement.zzbr zzc()
    {
        return 0;
    }

    public final com.google.android.gms.internal.measurement.zzbs zzd()
    {
        return 0;
    }

    public final int zze()
    {
        return this.zzd;
    }

    public final int zzf()
    {
        return this.zze;
    }
}
