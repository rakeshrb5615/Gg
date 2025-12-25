package com.google.android.gms.internal.location;
public final class zzdz extends com.google.android.gms.common.internal.GmsClient {
    public static final synthetic int zze;
    private final r.j zzf;
    private final r.j zzg;
    private final r.j zzh;
    private final r.j zzi;

    public zzdz(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.common.api.internal.ConnectionCallbacks p11, com.google.android.gms.common.api.internal.OnConnectionFailedListener p12)
    {
        com.google.android.gms.internal.location.zzdz v0_1 = super(p8, p9, 23, p10, p11, p12);
        v0_1.zzf = new r.j(0);
        v0_1.zzg = new r.j(0);
        v0_1.zzh = new r.j(0);
        v0_1.zzi = new r.j(0);
        return;
    }

    private final boolean zzG(com.google.android.gms.common.Feature p7)
    {
        com.google.android.gms.common.Feature[] v0 = this.getAvailableFeatures();
        if (v0 != null) {
            long v2_0 = 0;
            while (v2_0 < v0.length) {
                int v3_1 = v0[v2_0];
                if (!p7.getName().equals(v3_1.getName())) {
                    v2_0++;
                }
                if (v3_1 != 0) {
                    if (v3_1.getVersion() >= p7.getVersion()) {
                        return 1;
                    }
                } else {
                    return 0;
                }
            }
            v3_1 = 0;
        }
        return 0;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.internal.location.zzu v0_1 = p3.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (!(v0_1 instanceof com.google.android.gms.internal.location.zzv)) {
                return new com.google.android.gms.internal.location.zzu(p3);
            } else {
                return ((com.google.android.gms.internal.location.zzv) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.common.Feature[] getApiFeatures()
    {
        return com.google.android.gms.location.zzo.zzp;
    }

    public final int getMinApkVersion()
    {
        return 11717000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final void onConnectionSuspended(int p2)
    {
        super.onConnectionSuspended(p2);
        this.zzf.clear();
        this.zzg.clear();
        try {
            this.zzh.clear();
            return;
        } catch (Throwable v0_1) {
            throw v0_1;
        }
    }

    public final boolean usesClientTelemetry()
    {
        return 1;
    }

    public final void zzA(android.location.Location p4, com.google.android.gms.tasks.TaskCompletionSource p5)
    {
        if (!this.zzG(com.google.android.gms.location.zzo.zzh)) {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzA(p4);
            p5.setResult(0);
            return;
        } else {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzB(p4, new com.google.android.gms.internal.location.zzdj(0, p5));
            return;
        }
    }

    public final void zzB(com.google.android.gms.tasks.TaskCompletionSource p4)
    {
        ((com.google.android.gms.internal.location.zzv) this.getService()).zzC(new com.google.android.gms.internal.location.zzdn(0, p4));
        return;
    }

    public final void zzC(com.google.android.gms.common.api.internal.ListenerHolder p6, com.google.android.gms.location.DeviceOrientationRequest p7, com.google.android.gms.tasks.TaskCompletionSource p8)
    {
        com.google.android.gms.internal.location.zzh v0_0 = p6.getListenerKey();
        java.util.Objects.requireNonNull(v0_0);
        com.google.android.gms.internal.location.zzdq v2_1 = ((com.google.android.gms.internal.location.zzdq) this.zzh.get(v0_0));
        if (v2_1 != null) {
            v2_1.zzc(p6);
        } else {
            v2_1 = new com.google.android.gms.internal.location.zzdq(p6);
            this.zzh.put(v0_0, v2_1);
        }
        ((com.google.android.gms.internal.location.zzv) this.getService()).zzF(new com.google.android.gms.internal.location.zzj(1, new com.google.android.gms.internal.location.zzh(p7, com.google.android.gms.internal.location.zzh.zza, 0), v2_1, new com.google.android.gms.internal.location.zzdn(0, p8)));
        return;
    }

    public final void zzD(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey p6, com.google.android.gms.tasks.TaskCompletionSource p7)
    {
        Boolean v6_4 = ((com.google.android.gms.internal.location.zzdq) this.zzh.remove(p6));
        if (v6_4 != null) {
            v6_4.zze();
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzF(new com.google.android.gms.internal.location.zzj(2, 0, v6_4, new com.google.android.gms.internal.location.zzdn(Boolean.TRUE, p7)));
            return;
        } else {
            p7.setResult(Boolean.FALSE);
            return;
        }
    }

    public final void zzE(com.google.android.gms.location.GeofencingRequest p4, android.app.PendingIntent p5, com.google.android.gms.tasks.TaskCompletionSource p6)
    {
        if (!this.zzG(com.google.android.gms.location.zzo.zzn)) {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzd(p4, p5, new com.google.android.gms.internal.location.zzdg(p6));
            return;
        } else {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zze(p4, p5, new com.google.android.gms.internal.location.zzdj(0, p6));
            return;
        }
    }

    public final void zzF(com.google.android.gms.internal.location.zzem p4, com.google.android.gms.tasks.TaskCompletionSource p5)
    {
        if (!this.zzG(com.google.android.gms.location.zzo.zzn)) {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzf(p4, new com.google.android.gms.internal.location.zzdg(p5));
            return;
        } else {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzg(p4, new com.google.android.gms.internal.location.zzdj(0, p5));
            return;
        }
    }

    public final void zzp(com.google.android.gms.location.zzad p8, com.google.android.gms.tasks.TaskCompletionSource p9)
    {
        if (!this.zzG(com.google.android.gms.location.zzo.zzj)) {
            p9.setResult(((com.google.android.gms.internal.location.zzv) this.getService()).zzp(this.getContext().getPackageName()));
            return;
        } else {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzo(p8, new com.google.android.gms.internal.location.zzee(5, 0, new com.google.android.gms.internal.location.zzdl(p9), 0, 0));
            return;
        }
    }

    public final void zzq(com.google.android.gms.location.LastLocationRequest p3, com.google.android.gms.tasks.TaskCompletionSource p4)
    {
        if (!this.zzG(com.google.android.gms.location.zzo.zzj)) {
            if (!this.zzG(com.google.android.gms.location.zzo.zzf)) {
                p4.setResult(((com.google.android.gms.internal.location.zzv) this.getService()).zzs());
                return;
            } else {
                ((com.google.android.gms.internal.location.zzv) this.getService()).zzr(p3, new com.google.android.gms.internal.location.zzdk(p4));
                return;
            }
        } else {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzq(p3, com.google.android.gms.internal.location.zzee.zzd(new com.google.android.gms.internal.location.zzdk(p4)));
            return;
        }
    }

    public final void zzr(com.google.android.gms.location.CurrentLocationRequest p8, com.google.android.gms.tasks.CancellationToken p9, com.google.android.gms.tasks.TaskCompletionSource p10)
    {
        if (!this.zzG(com.google.android.gms.location.zzo.zzj)) {
            if (!this.zzG(com.google.android.gms.location.zzo.zze)) {
                com.google.android.gms.internal.location.zzea v0_1 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(new com.google.android.gms.internal.location.zzdh(this, p10), com.google.android.gms.internal.location.zzfc.zza(), "GetCurrentLocation");
                com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey v1_1 = v0_1.getListenerKey();
                java.util.Objects.requireNonNull(v1_1);
                com.google.android.gms.internal.location.zzdi v2_2 = new com.google.android.gms.internal.location.zzdi(this, v0_1, p10);
                com.google.android.gms.internal.location.zzea v0_4 = new com.google.android.gms.tasks.TaskCompletionSource();
                com.google.android.gms.location.LocationRequest$Builder v3_1 = new com.google.android.gms.location.LocationRequest$Builder(p8.getPriority(), 0);
                v3_1.setMinUpdateIntervalMillis(0);
                v3_1.setDurationMillis(p8.getDurationMillis());
                v3_1.setGranularity(p8.getGranularity());
                v3_1.setMaxUpdateAgeMillis(p8.getMaxUpdateAgeMillis());
                v3_1.zzb(p8.zza());
                v3_1.zza(p8.zzb());
                v3_1.setWaitForAccurateLocation(1);
                v3_1.zzc(p8.zzc());
                this.zzt(v2_2, v3_1.build(), v0_4);
                v0_4.getTask().addOnCompleteListener(new com.google.android.gms.internal.location.zzea(p10));
                if (p9 != null) {
                    p9.onCanceledRequested(new com.google.android.gms.internal.location.zzec(this, v1_1));
                }
            } else {
                com.google.android.gms.internal.location.zzec v8_6 = ((com.google.android.gms.internal.location.zzv) this.getService()).zzu(p8, new com.google.android.gms.internal.location.zzdk(p10));
                if (p9 != null) {
                    p9.onCanceledRequested(new com.google.android.gms.internal.location.zzeb(v8_6));
                    return;
                }
            }
        } else {
            com.google.android.gms.internal.location.zzec v8_7 = ((com.google.android.gms.internal.location.zzv) this.getService()).zzt(p8, com.google.android.gms.internal.location.zzee.zzd(new com.google.android.gms.internal.location.zzdk(p10)));
            if (p9 != null) {
                p9.onCanceledRequested(new com.google.android.gms.internal.location.zzed(v8_7));
                return;
            }
        }
        return;
    }

    public final void zzs(com.google.android.gms.internal.location.zzdr p18, com.google.android.gms.location.LocationRequest p19, com.google.android.gms.tasks.TaskCompletionSource p20)
    {
        com.google.android.gms.internal.location.zzv v3_4 = p18.zza();
        com.google.android.gms.internal.location.zzee v4_2 = v3_4.getListenerKey();
        java.util.Objects.requireNonNull(v4_2);
        com.google.android.gms.internal.location.zzdj v5_0 = this.zzG(com.google.android.gms.location.zzo.zzj);
        com.google.android.gms.internal.location.zzdy v12;
        int v7_2 = ((com.google.android.gms.internal.location.zzdy) this.zzf.get(v4_2));
        if (v7_2 == 0) {
            com.google.android.gms.internal.location.zzv v3_1 = new com.google.android.gms.internal.location.zzdy(p18);
            this.zzf.put(v4_2, v3_1);
            v12 = v3_1;
        } else {
            if (v5_0 == null) {
                v7_2.zzc(v3_4);
                v12 = v7_2;
                v7_2 = 0;
            } else {
            }
        }
        if (v5_0 == null) {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzv(new com.google.android.gms.internal.location.zzei(1, com.google.android.gms.internal.location.zzeg.zza(0, p19), v12, 0, 0, new com.google.android.gms.internal.location.zzdo(p20, v12), v4_2.toIdString()));
        } else {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzw(com.google.android.gms.internal.location.zzee.zza(v7_2, v12, v4_2.toIdString()), p19, new com.google.android.gms.internal.location.zzdj(0, p20));
        }
        return;
    }

    public final void zzt(com.google.android.gms.internal.location.zzdr p18, com.google.android.gms.location.LocationRequest p19, com.google.android.gms.tasks.TaskCompletionSource p20)
    {
        com.google.android.gms.internal.location.zzv v3_4 = p18.zza();
        com.google.android.gms.internal.location.zzee v4_2 = v3_4.getListenerKey();
        java.util.Objects.requireNonNull(v4_2);
        com.google.android.gms.internal.location.zzdj v5_0 = this.zzG(com.google.android.gms.location.zzo.zzj);
        com.google.android.gms.internal.location.zzdv v13;
        int v7_2 = ((com.google.android.gms.internal.location.zzdv) this.zzg.get(v4_2));
        if (v7_2 == 0) {
            com.google.android.gms.internal.location.zzv v3_1 = new com.google.android.gms.internal.location.zzdv(p18);
            this.zzg.put(v4_2, v3_1);
            v13 = v3_1;
        } else {
            if (v5_0 == null) {
                v7_2.zzc(v3_4);
                v13 = v7_2;
                v7_2 = 0;
            } else {
            }
        }
        if (v5_0 == null) {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzv(new com.google.android.gms.internal.location.zzei(1, com.google.android.gms.internal.location.zzeg.zza(0, p19), 0, v13, 0, new com.google.android.gms.internal.location.zzdd(p20, v13), v4_2.toIdString()));
        } else {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzw(com.google.android.gms.internal.location.zzee.zzb(v7_2, v13, v4_2.toIdString()), p19, new com.google.android.gms.internal.location.zzdj(0, p20));
        }
        return;
    }

    public final void zzu(android.app.PendingIntent p11, com.google.android.gms.location.LocationRequest p12, com.google.android.gms.tasks.TaskCompletionSource p13)
    {
        if (!this.zzG(com.google.android.gms.location.zzo.zzj)) {
            com.google.android.gms.internal.location.zzv v0_5 = ((com.google.android.gms.internal.location.zzv) this.getService());
            com.google.android.gms.internal.location.zzeg v4 = com.google.android.gms.internal.location.zzeg.zza(0, p12);
            com.google.android.gms.internal.location.zzdn v8_1 = new com.google.android.gms.internal.location.zzdn(0, p13);
            int v12_1 = p11.hashCode();
            v0_5.zzv(new com.google.android.gms.internal.location.zzei(1, v4, 0, 0, p11, v8_1, v1.a.m(new StringBuilder((String.valueOf(v12_1).length() + 14)), "PendingIntent@", v12_1)));
            return;
        } else {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzw(com.google.android.gms.internal.location.zzee.zzc(p11), p12, new com.google.android.gms.internal.location.zzdj(0, p13));
            return;
        }
    }

    public final void zzv(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey p11, boolean p12, com.google.android.gms.tasks.TaskCompletionSource p13)
    {
        com.google.android.gms.internal.location.zzdy v5_1 = ((com.google.android.gms.internal.location.zzdy) this.zzf.remove(p11));
        if (v5_1 != null) {
            v5_1.zzf();
            if (p12 == null) {
                p13.setResult(Boolean.TRUE);
            } else {
                if (!this.zzG(com.google.android.gms.location.zzo.zzj)) {
                    ((com.google.android.gms.internal.location.zzv) this.getService()).zzv(new com.google.android.gms.internal.location.zzei(2, 0, v5_1, 0, 0, new com.google.android.gms.internal.location.zzdn(Boolean.TRUE, p13), 0));
                } else {
                    com.google.android.gms.internal.location.zzv v11_7 = ((com.google.android.gms.internal.location.zzv) this.getService());
                    Boolean v0_1 = System.identityHashCode(v5_1);
                    int v3_2 = new StringBuilder((String.valueOf(v0_1).length() + 18));
                    v3_2.append("ILocationListener@");
                    v3_2.append(v0_1);
                    v11_7.zzx(com.google.android.gms.internal.location.zzee.zza(0, v5_1, v3_2.toString()), new com.google.android.gms.internal.location.zzdj(Boolean.TRUE, p13));
                }
            }
            return;
        } else {
            p13.setResult(Boolean.FALSE);
            return;
        }
    }

    public final void zzw(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey p11, boolean p12, com.google.android.gms.tasks.TaskCompletionSource p13)
    {
        com.google.android.gms.internal.location.zzdv v6_1 = ((com.google.android.gms.internal.location.zzdv) this.zzg.remove(p11));
        if (v6_1 != null) {
            v6_1.zzg();
            if (p12 == null) {
                p13.setResult(Boolean.TRUE);
            } else {
                if (!this.zzG(com.google.android.gms.location.zzo.zzj)) {
                    ((com.google.android.gms.internal.location.zzv) this.getService()).zzv(new com.google.android.gms.internal.location.zzei(2, 0, 0, v6_1, 0, new com.google.android.gms.internal.location.zzdn(Boolean.TRUE, p13), 0));
                } else {
                    com.google.android.gms.internal.location.zzv v11_7 = ((com.google.android.gms.internal.location.zzv) this.getService());
                    Boolean v0_1 = System.identityHashCode(v6_1);
                    int v3_2 = new StringBuilder((String.valueOf(v0_1).length() + 18));
                    v3_2.append("ILocationCallback@");
                    v3_2.append(v0_1);
                    v11_7.zzx(com.google.android.gms.internal.location.zzee.zzb(0, v6_1, v3_2.toString()), new com.google.android.gms.internal.location.zzdj(Boolean.TRUE, p13));
                }
            }
            return;
        } else {
            p13.setResult(Boolean.FALSE);
            return;
        }
    }

    public final void zzx(android.app.PendingIntent p10, com.google.android.gms.tasks.TaskCompletionSource p11, Object p12)
    {
        if (!this.zzG(com.google.android.gms.location.zzo.zzj)) {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzv(new com.google.android.gms.internal.location.zzei(2, 0, 0, 0, p10, new com.google.android.gms.internal.location.zzdn(0, p11), 0));
            return;
        } else {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzx(com.google.android.gms.internal.location.zzee.zzc(p10), new com.google.android.gms.internal.location.zzdj(0, p11));
            return;
        }
    }

    public final void zzy(com.google.android.gms.tasks.TaskCompletionSource p5)
    {
        if (!this.zzG(com.google.android.gms.location.zzo.zzg)) {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzy(1);
            p5.setResult(0);
            return;
        } else {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzz(1, new com.google.android.gms.internal.location.zzdj(0, p5));
            return;
        }
    }

    public final void zzz(com.google.android.gms.tasks.TaskCompletionSource p5)
    {
        if (!this.zzG(com.google.android.gms.location.zzo.zzg)) {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzy(0);
            p5.setResult(Boolean.TRUE);
            return;
        } else {
            ((com.google.android.gms.internal.location.zzv) this.getService()).zzz(0, new com.google.android.gms.internal.location.zzdj(Boolean.TRUE, p5));
            return;
        }
    }
}
