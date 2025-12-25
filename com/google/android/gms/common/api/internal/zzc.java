package com.google.android.gms.common.api.internal;
final class zzc {
    private final java.util.Map zza;
    private int zzb;
    private android.os.Bundle zzc;

    public zzc()
    {
        this.zza = java.util.Collections.synchronizedMap(new r.e(0));
        this.zzb = 0;
        return;
    }

    public final com.google.android.gms.common.api.internal.LifecycleCallback zza(String p2, Class p3)
    {
        return ((com.google.android.gms.common.api.internal.LifecycleCallback) p3.cast(this.zza.get(p2)));
    }

    public final void zzb(String p4, com.google.android.gms.common.api.internal.LifecycleCallback p5)
    {
        com.google.android.gms.internal.common.zzg v0_0 = this.zza;
        if (v0_0.containsKey(p4)) {
            throw new IllegalArgumentException(v1.a.o(new StringBuilder((String.valueOf(p4).length() + 59)), "LifecycleCallback with tag ", p4, " already added to this fragment."));
        } else {
            v0_0.put(p4, p5);
            if (this.zzb > 0) {
                new com.google.android.gms.internal.common.zzg(android.os.Looper.getMainLooper()).post(new com.google.android.gms.common.api.internal.zzb(this, p5, p4));
            }
            return;
        }
    }

    public final boolean zzc()
    {
        if (this.zzb <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzd()
    {
        if (this.zzb < 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void zze(android.os.Bundle p4)
    {
        this.zzb = 1;
        this.zzc = p4;
        java.util.Iterator v0_3 = this.zza.entrySet().iterator();
        while (v0_3.hasNext()) {
            int v1_2;
            int v1_1 = ((java.util.Map$Entry) v0_3.next());
            com.google.android.gms.common.api.internal.LifecycleCallback v2_1 = ((com.google.android.gms.common.api.internal.LifecycleCallback) v1_1.getValue());
            if (p4 == null) {
                v1_2 = 0;
            } else {
                v1_2 = p4.getBundle(((String) v1_1.getKey()));
            }
            v2_1.onCreate(v1_2);
        }
        return;
    }

    public final void zzf()
    {
        this.zzb = 2;
        java.util.Iterator v0_3 = this.zza.values().iterator();
        while (v0_3.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) v0_3.next()).onStart();
        }
        return;
    }

    public final void zzg()
    {
        this.zzb = 3;
        java.util.Iterator v0_3 = this.zza.values().iterator();
        while (v0_3.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) v0_3.next()).onResume();
        }
        return;
    }

    public final void zzh(int p3, int p4, android.content.Intent p5)
    {
        java.util.Iterator v0_2 = this.zza.values().iterator();
        while (v0_2.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) v0_2.next()).onActivityResult(p3, p4, p5);
        }
        return;
    }

    public final void zzi(android.os.Bundle p5)
    {
        if (p5 != null) {
            java.util.Iterator v0_2 = this.zza.entrySet().iterator();
            while (v0_2.hasNext()) {
                String v1_1 = ((java.util.Map$Entry) v0_2.next());
                android.os.Bundle v2_1 = new android.os.Bundle();
                ((com.google.android.gms.common.api.internal.LifecycleCallback) v1_1.getValue()).onSaveInstanceState(v2_1);
                p5.putBundle(((String) v1_1.getKey()), v2_1);
            }
        }
        return;
    }

    public final void zzj()
    {
        this.zzb = 4;
        java.util.Iterator v0_3 = this.zza.values().iterator();
        while (v0_3.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) v0_3.next()).onStop();
        }
        return;
    }

    public final void zzk()
    {
        this.zzb = 5;
        java.util.Iterator v0_3 = this.zza.values().iterator();
        while (v0_3.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) v0_3.next()).onDestroy();
        }
        return;
    }

    public final void zzl(String p3, java.io.FileDescriptor p4, java.io.PrintWriter p5, String[] p6)
    {
        java.util.Iterator v0_2 = this.zza.values().iterator();
        while (v0_2.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) v0_2.next()).dump(p3, p4, p5, p6);
        }
        return;
    }

    public final synthetic int zzm()
    {
        return this.zzb;
    }

    public final synthetic android.os.Bundle zzn()
    {
        return this.zzc;
    }
}
