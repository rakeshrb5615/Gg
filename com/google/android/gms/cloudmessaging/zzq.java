package com.google.android.gms.cloudmessaging;
final class zzq {
    private final android.os.Messenger zza;
    private final com.google.android.gms.cloudmessaging.zzd zzb;

    public zzq(android.os.IBinder p4)
    {
        String v0_1 = p4.getInterfaceDescriptor();
        if (!java.util.Objects.equals(v0_1, "android.os.IMessenger")) {
            if (!java.util.Objects.equals(v0_1, "com.google.android.gms.iid.IMessengerCompat")) {
                android.util.Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(v0_1)));
                throw new android.os.RemoteException();
            } else {
                this.zzb = new com.google.android.gms.cloudmessaging.zzd(p4);
                this.zza = 0;
                return;
            }
        } else {
            this.zza = new android.os.Messenger(p4);
            this.zzb = 0;
            return;
        }
    }

    public final void zza(android.os.Message p2)
    {
        String v0_0 = this.zza;
        if (v0_0 == null) {
            String v0_1 = this.zzb;
            if (v0_1 == null) {
                throw new IllegalStateException("Both messengers are null");
            } else {
                v0_1.zzb(p2);
                return;
            }
        } else {
            v0_0.send(p2);
            return;
        }
    }
}
