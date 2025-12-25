package com.google.android.gms.measurement.internal;
public abstract class zzga extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.measurement.internal.zzgb {

    public zzga()
    {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        return;
    }

    public final boolean zza(int p9, android.os.Parcel p10, android.os.Parcel p11, int p12)
    {
        com.google.android.gms.measurement.internal.zzgc v12_0 = 0;
        switch (p9) {
            case 1:
                com.google.android.gms.measurement.internal.zzr v9_53 = ((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzbg.CREATOR));
                com.google.android.gms.measurement.internal.zzgc v12_22 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zze(v9_53, v12_22);
                p11.writeNoException();
                break;
            case 2:
                com.google.android.gms.measurement.internal.zzr v9_48 = ((com.google.android.gms.measurement.internal.zzpl) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzpl.CREATOR));
                com.google.android.gms.measurement.internal.zzgc v12_19 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzf(v9_48, v12_19);
                p11.writeNoException();
                break;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return 0;
            case 4:
                com.google.android.gms.measurement.internal.zzr v9_45 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzg(v9_45);
                p11.writeNoException();
                break;
            case 5:
                com.google.android.gms.measurement.internal.zzr v9_41 = ((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzbg.CREATOR));
                com.google.android.gms.measurement.internal.zzgc v12_16 = p10.readString();
                android.os.Bundle v0_9 = p10.readString();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzh(v9_41, v12_16, v0_9);
                p11.writeNoException();
                break;
            case 6:
                com.google.android.gms.measurement.internal.zzr v9_38 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzi(v9_38);
                p11.writeNoException();
                break;
            case 7:
                com.google.android.gms.measurement.internal.zzr v9_34 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.measurement.internal.zzgc v12_15 = com.google.android.gms.internal.measurement.zzbn.zza(p10);
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                com.google.android.gms.measurement.internal.zzr v9_35 = this.zzj(v9_34, v12_15);
                p11.writeNoException();
                p11.writeTypedList(v9_35);
                break;
            case 9:
                com.google.android.gms.measurement.internal.zzr v9_30 = ((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzbg.CREATOR));
                com.google.android.gms.measurement.internal.zzgc v12_14 = p10.readString();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                com.google.android.gms.measurement.internal.zzr v9_31 = this.zzk(v9_30, v12_14);
                p11.writeNoException();
                p11.writeByteArray(v9_31);
                break;
            case 10:
                boolean v3_1 = p10.readLong();
                String v5 = p10.readString();
                String v6 = p10.readString();
                String v7 = p10.readString();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzl(v3_1, v5, v6, v7);
                p11.writeNoException();
                break;
            case 11:
                com.google.android.gms.measurement.internal.zzr v9_26 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                com.google.android.gms.measurement.internal.zzr v9_27 = this.zzm(v9_26);
                p11.writeNoException();
                p11.writeString(v9_27);
                break;
            case 12:
                com.google.android.gms.measurement.internal.zzr v9_23 = ((com.google.android.gms.measurement.internal.zzah) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzah.CREATOR));
                com.google.android.gms.measurement.internal.zzgc v12_12 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzn(v9_23, v12_12);
                p11.writeNoException();
                break;
            case 13:
                com.google.android.gms.measurement.internal.zzr v9_20 = ((com.google.android.gms.measurement.internal.zzah) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzah.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzo(v9_20);
                p11.writeNoException();
                break;
            case 14:
                com.google.android.gms.measurement.internal.zzr v9_16 = p10.readString();
                com.google.android.gms.measurement.internal.zzgc v12_9 = p10.readString();
                android.os.Bundle v0_8 = com.google.android.gms.internal.measurement.zzbn.zza(p10);
                com.google.android.gms.measurement.internal.zzga v2_4 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                com.google.android.gms.measurement.internal.zzr v9_17 = this.zzp(v9_16, v12_9, v0_8, v2_4);
                p11.writeNoException();
                p11.writeTypedList(v9_17);
                break;
            case 15:
                com.google.android.gms.measurement.internal.zzr v9_14 = p10.readString();
                com.google.android.gms.measurement.internal.zzgc v12_7 = p10.readString();
                android.os.Bundle v0_7 = p10.readString();
                com.google.android.gms.measurement.internal.zzga v2_1 = com.google.android.gms.internal.measurement.zzbn.zza(p10);
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                com.google.android.gms.measurement.internal.zzr v9_15 = this.zzq(v9_14, v12_7, v0_7, v2_1);
                p11.writeNoException();
                p11.writeTypedList(v9_15);
                break;
            case 16:
                com.google.android.gms.measurement.internal.zzr v9_12 = p10.readString();
                com.google.android.gms.measurement.internal.zzgc v12_5 = p10.readString();
                android.os.Bundle v0_6 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                com.google.android.gms.measurement.internal.zzr v9_13 = this.zzr(v9_12, v12_5, v0_6);
                p11.writeNoException();
                p11.writeTypedList(v9_13);
                break;
            case 17:
                com.google.android.gms.measurement.internal.zzr v9_10 = p10.readString();
                com.google.android.gms.measurement.internal.zzgc v12_4 = p10.readString();
                android.os.Bundle v0_3 = p10.readString();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                com.google.android.gms.measurement.internal.zzr v9_11 = this.zzs(v9_10, v12_4, v0_3);
                p11.writeNoException();
                p11.writeTypedList(v9_11);
                break;
            case 18:
                com.google.android.gms.measurement.internal.zzr v9_9 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzt(v9_9);
                p11.writeNoException();
                break;
            case 19:
                com.google.android.gms.measurement.internal.zzr v9_6 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                com.google.android.gms.measurement.internal.zzgc v12_3 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzu(v9_6, v12_3);
                p11.writeNoException();
                break;
            case 20:
                com.google.android.gms.measurement.internal.zzr v9_3 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzv(v9_3);
                p11.writeNoException();
                break;
            case 21:
                com.google.android.gms.measurement.internal.zzr v9_75 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                com.google.android.gms.measurement.internal.zzr v9_76 = this.zzw(v9_75);
                p11.writeNoException();
                if (v9_76 != null) {
                    p11.writeInt(1);
                    v9_76.writeToParcel(p11, 1);
                } else {
                    p11.writeInt(0);
                }
                break;
            case 24:
                com.google.android.gms.measurement.internal.zzr v9_71 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.measurement.internal.zzgc v12_31 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                com.google.android.gms.measurement.internal.zzr v9_72 = this.zzx(v9_71, v12_31);
                p11.writeNoException();
                p11.writeTypedList(v9_72);
                break;
            case 25:
                com.google.android.gms.measurement.internal.zzr v9_68 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzy(v9_68);
                p11.writeNoException();
                break;
            case 26:
                com.google.android.gms.measurement.internal.zzr v9_64 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzz(v9_64);
                p11.writeNoException();
                break;
            case 27:
                com.google.android.gms.measurement.internal.zzr v9_61 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzA(v9_61);
                p11.writeNoException();
                break;
            case 29:
                com.google.android.gms.measurement.internal.zzr v9_57 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                android.os.Bundle v0_12 = ((com.google.android.gms.measurement.internal.zzoo) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzoo.CREATOR));
                com.google.android.gms.measurement.internal.zzga v2_6 = p10.readStrongBinder();
                if (v2_6 != null) {
                    com.google.android.gms.measurement.internal.zzgc v12_27 = v2_6.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    if (!(v12_27 instanceof com.google.android.gms.measurement.internal.zzgh)) {
                        v12_0 = new com.google.android.gms.measurement.internal.zzgf(v2_6);
                    } else {
                        v12_0 = ((com.google.android.gms.measurement.internal.zzgh) v12_27);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzB(v9_57, v0_12, v12_0);
                p11.writeNoException();
                break;
            case 30:
                com.google.android.gms.measurement.internal.zzr v9_52 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                com.google.android.gms.measurement.internal.zzgc v12_25 = ((com.google.android.gms.measurement.internal.zzaf) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzaf.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzC(v9_52, v12_25);
                p11.writeNoException();
                break;
            case 31:
                com.google.android.gms.measurement.internal.zzr v9_65 = ((com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.measurement.internal.zzr.CREATOR));
                android.os.Bundle v0_2 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                com.google.android.gms.measurement.internal.zzga v2_0 = p10.readStrongBinder();
                if (v2_0 != null) {
                    com.google.android.gms.measurement.internal.zzgc v12_8 = v2_0.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    if (!(v12_8 instanceof com.google.android.gms.measurement.internal.zzge)) {
                        v12_0 = new com.google.android.gms.measurement.internal.zzgc(v2_0);
                    } else {
                        v12_0 = ((com.google.android.gms.measurement.internal.zzge) v12_8);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.zzD(v9_65, v0_2, v12_0);
                p11.writeNoException();
                break;
        }
        return 1;
    }
}
