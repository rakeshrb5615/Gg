package com.google.android.gms.cloudmessaging;
final class zzp implements android.content.ServiceConnection {
    int zza;
    final android.os.Messenger zzb;
    com.google.android.gms.cloudmessaging.zzq zzc;
    final java.util.Queue zzd;
    final android.util.SparseArray zze;
    final synthetic com.google.android.gms.cloudmessaging.zzv zzf;

    public synthetic zzp(com.google.android.gms.cloudmessaging.zzv p3, com.google.android.gms.cloudmessaging.zzo p4)
    {
        this.zzf = p3;
        this.zza = 0;
        this.zzb = new android.os.Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(android.os.Looper.getMainLooper(), new com.google.android.gms.cloudmessaging.zzm(this)));
        this.zzd = new java.util.ArrayDeque();
        this.zze = new android.util.SparseArray();
        return;
    }

    public final void onServiceConnected(android.content.ComponentName p2, android.os.IBinder p3)
    {
        if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
            android.util.Log.v("MessengerIpcClient", "Service connected");
        }
        com.google.android.gms.cloudmessaging.zzv.zze(this.zzf).execute(new com.google.android.gms.cloudmessaging.zzi(this, p3));
        return;
    }

    public final void onServiceDisconnected(android.content.ComponentName p2)
    {
        if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
            android.util.Log.v("MessengerIpcClient", "Service disconnected");
        }
        com.google.android.gms.cloudmessaging.zzv.zze(this.zzf).execute(new com.google.android.gms.cloudmessaging.zzl(this));
        return;
    }

    public final declared_synchronized void zza(int p2, String p3)
    {
        this.zzb(p2, p3, 0);
        return;
    }

    public final declared_synchronized void zzb(int p6, String p7, Throwable p8)
    {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            android.util.Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(p7)));
        }
        com.google.android.gms.cloudmessaging.zzt v0_2 = this.zza;
        if (v0_2 == null) {
            throw new IllegalStateException();
        } else {
            if ((v0_2 == 1) || (v0_2 == 2)) {
                if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
                    android.util.Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.zza = 4;
                com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(com.google.android.gms.cloudmessaging.zzv.zza(this.zzf), this);
                com.google.android.gms.cloudmessaging.zzt v0_10 = new com.google.android.gms.cloudmessaging.zzt(p6, p7, p8);
                android.util.SparseArray v6_4 = this.zzd.iterator();
                while (v6_4.hasNext()) {
                    ((com.google.android.gms.cloudmessaging.zzs) v6_4.next()).zzc(v0_10);
                }
                this.zzd.clear();
                android.util.SparseArray v6_6 = 0;
                while (v6_6 < this.zze.size()) {
                    ((com.google.android.gms.cloudmessaging.zzs) this.zze.valueAt(v6_6)).zzc(v0_10);
                    v6_6++;
                }
                this.zze.clear();
                return;
            } else {
                if (v0_2 == 3) {
                    this.zza = 4;
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzc()
    {
        com.google.android.gms.cloudmessaging.zzv.zze(this.zzf).execute(new com.google.android.gms.cloudmessaging.zzj(this));
        return;
    }

    public final declared_synchronized void zzd()
    {
        if (this.zza != 1) {
            return;
        } else {
            this.zza(1, "Timed out while binding");
            return;
        }
    }

    public final declared_synchronized void zze(int p5)
    {
        com.google.android.gms.cloudmessaging.zzs v1_2 = ((com.google.android.gms.cloudmessaging.zzs) this.zze.get(p5));
        if (v1_2 == null) {
            return;
        } else {
            int v2_0 = new StringBuilder("Timing out request: ");
            v2_0.append(p5);
            android.util.Log.w("MessengerIpcClient", v2_0.toString());
            this.zze.remove(p5);
            v1_2.zzc(new com.google.android.gms.cloudmessaging.zzt(3, "Timed out waiting for response", 0));
            this.zzf();
            return;
        }
    }

    public final declared_synchronized void zzf()
    {
        if ((this.zza != 2) || ((!this.zzd.isEmpty()) || (this.zze.size() != 0))) {
            return;
        } else {
            if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
                android.util.Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.zza = 3;
            com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(com.google.android.gms.cloudmessaging.zzv.zza(this.zzf), this);
            return;
        }
    }

    public final declared_synchronized boolean zzg(com.google.android.gms.cloudmessaging.zzs p7)
    {
        String v0_0 = this.zza;
        if (v0_0 == null) {
            java.util.concurrent.ScheduledExecutorService v7_1;
            this.zzd.add(p7);
            if (this.zza != 0) {
                v7_1 = 0;
            } else {
                v7_1 = 1;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(v7_1);
            if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
                android.util.Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.zza = 1;
            java.util.concurrent.ScheduledExecutorService v7_6 = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
            v7_6.setPackage("com.google.android.gms");
            try {
                if (com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(com.google.android.gms.cloudmessaging.zzv.zza(this.zzf), v7_6, this, 1)) {
                    com.google.android.gms.cloudmessaging.zzv.zze(this.zzf).schedule(new com.google.android.gms.cloudmessaging.zzk(this), 30, java.util.concurrent.TimeUnit.SECONDS);
                } else {
                    this.zza(0, "Unable to bind to service");
                }
            } catch (java.util.concurrent.ScheduledExecutorService v7_8) {
                this.zzb(0, "Unable to bind to service", v7_8);
            }
            return 1;
        } else {
            if (v0_0 == 1) {
                this.zzd.add(p7);
                return 1;
            } else {
                if (v0_0 == 2) {
                    this.zzd.add(p7);
                    this.zzc();
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
