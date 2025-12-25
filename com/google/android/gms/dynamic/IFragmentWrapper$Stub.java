package com.google.android.gms.dynamic;
public abstract class IFragmentWrapper$Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IFragmentWrapper {

    public IFragmentWrapper$Stub()
    {
        super("com.google.android.gms.dynamic.IFragmentWrapper");
        return;
    }

    public static com.google.android.gms.dynamic.IFragmentWrapper asInterface(android.os.IBinder p2)
    {
        if (p2 != 0) {
            com.google.android.gms.dynamic.zza v0_1 = p2.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (!(v0_1 instanceof com.google.android.gms.dynamic.IFragmentWrapper)) {
                return new com.google.android.gms.dynamic.zza(p2);
            } else {
                return ((com.google.android.gms.dynamic.IFragmentWrapper) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        switch (p1) {
            case 2:
                int v1_10 = this.zzb();
                p3.writeNoException();
                com.google.android.gms.internal.common.zzc.zze(p3, v1_10);
                break;
            case 3:
                int v1_9 = this.zzc();
                p3.writeNoException();
                com.google.android.gms.internal.common.zzc.zzd(p3, v1_9);
                break;
            case 4:
                int v1_8 = this.zzd();
                p3.writeNoException();
                p3.writeInt(v1_8);
                break;
            case 5:
                int v1_7 = this.zze();
                p3.writeNoException();
                com.google.android.gms.internal.common.zzc.zze(p3, v1_7);
                break;
            case 6:
                int v1_6 = this.zzf();
                p3.writeNoException();
                com.google.android.gms.internal.common.zzc.zze(p3, v1_6);
                break;
            case 7:
                int v1_4 = this.zzg();
                p3.writeNoException();
                p3.writeInt(v1_4);
                break;
            case 8:
                int v1_3 = this.zzh();
                p3.writeNoException();
                p3.writeString(v1_3);
                break;
            case 9:
                int v1_2 = this.zzi();
                p3.writeNoException();
                com.google.android.gms.internal.common.zzc.zze(p3, v1_2);
                break;
            case 10:
                int v1_34 = this.zzj();
                p3.writeNoException();
                p3.writeInt(v1_34);
                break;
            case 11:
                int v1_33 = this.zzk();
                p3.writeNoException();
                p3.writeInt(v1_33);
                break;
            case 12:
                int v1_32 = this.zzl();
                p3.writeNoException();
                com.google.android.gms.internal.common.zzc.zze(p3, v1_32);
                break;
            case 13:
                int v1_31 = this.zzm();
                p3.writeNoException();
                p3.writeInt(v1_31);
                break;
            case 14:
                int v1_29 = this.zzn();
                p3.writeNoException();
                p3.writeInt(v1_29);
                break;
            case 15:
                int v1_28 = this.zzo();
                p3.writeNoException();
                p3.writeInt(v1_28);
                break;
            case 16:
                int v1_27 = this.zzp();
                p3.writeNoException();
                p3.writeInt(v1_27);
                break;
            case 17:
                int v1_26 = this.zzq();
                p3.writeNoException();
                p3.writeInt(v1_26);
                break;
            case 18:
                int v1_25 = this.zzr();
                p3.writeNoException();
                p3.writeInt(v1_25);
                break;
            case 19:
                int v1_24 = this.zzs();
                p3.writeNoException();
                p3.writeInt(v1_24);
                break;
            case 20:
                int v1_23 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p2.readStrongBinder());
                com.google.android.gms.internal.common.zzc.zzf(p2);
                this.zzt(v1_23);
                p3.writeNoException();
                break;
            case 21:
                int v1_21 = com.google.android.gms.internal.common.zzc.zza(p2);
                com.google.android.gms.internal.common.zzc.zzf(p2);
                this.zzu(v1_21);
                p3.writeNoException();
                break;
            case 22:
                int v1_19 = com.google.android.gms.internal.common.zzc.zza(p2);
                com.google.android.gms.internal.common.zzc.zzf(p2);
                this.zzv(v1_19);
                p3.writeNoException();
                break;
            case 23:
                int v1_18 = com.google.android.gms.internal.common.zzc.zza(p2);
                com.google.android.gms.internal.common.zzc.zzf(p2);
                this.zzw(v1_18);
                p3.writeNoException();
                break;
            case 24:
                int v1_17 = com.google.android.gms.internal.common.zzc.zza(p2);
                com.google.android.gms.internal.common.zzc.zzf(p2);
                this.zzx(v1_17);
                p3.writeNoException();
                break;
            case 25:
                int v1_16 = ((android.content.Intent) com.google.android.gms.internal.common.zzc.zzb(p2, android.content.Intent.CREATOR));
                com.google.android.gms.internal.common.zzc.zzf(p2);
                this.zzy(v1_16);
                p3.writeNoException();
                break;
            case 26:
                int v1_5 = ((android.content.Intent) com.google.android.gms.internal.common.zzc.zzb(p2, android.content.Intent.CREATOR));
                p4 = p2.readInt();
                com.google.android.gms.internal.common.zzc.zzf(p2);
                this.zzz(v1_5, p4);
                p3.writeNoException();
                break;
            case 27:
                int v1_20 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p2.readStrongBinder());
                com.google.android.gms.internal.common.zzc.zzf(p2);
                this.zzA(v1_20);
                p3.writeNoException();
                break;
            default:
                return 0;
        }
        return 1;
    }
}
