package com.google.android.gms.common.api;
public final class Status extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result, com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final com.google.android.gms.common.api.Status RESULT_API_NOT_CONNECTED;
    public static final com.google.android.gms.common.api.Status RESULT_CANCELED;
    public static final com.google.android.gms.common.api.Status RESULT_DEAD_CLIENT;
    public static final com.google.android.gms.common.api.Status RESULT_INTERNAL_ERROR;
    public static final com.google.android.gms.common.api.Status RESULT_INTERRUPTED;
    public static final com.google.android.gms.common.api.Status RESULT_SUCCESS;
    public static final com.google.android.gms.common.api.Status RESULT_SUCCESS_CACHE;
    public static final com.google.android.gms.common.api.Status RESULT_TIMEOUT;
    private final int zza;
    private final String zzb;
    private final android.app.PendingIntent zzc;
    private final com.google.android.gms.common.ConnectionResult zzd;

    static Status()
    {
        com.google.android.gms.common.api.Status.RESULT_SUCCESS_CACHE = new com.google.android.gms.common.api.Status(-1);
        com.google.android.gms.common.api.Status.RESULT_SUCCESS = new com.google.android.gms.common.api.Status(0);
        com.google.android.gms.common.api.Status.RESULT_INTERRUPTED = new com.google.android.gms.common.api.Status(14);
        com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR = new com.google.android.gms.common.api.Status(8);
        com.google.android.gms.common.api.Status.RESULT_TIMEOUT = new com.google.android.gms.common.api.Status(15);
        com.google.android.gms.common.api.Status.RESULT_CANCELED = new com.google.android.gms.common.api.Status(16);
        com.google.android.gms.common.api.Status.RESULT_API_NOT_CONNECTED = new com.google.android.gms.common.api.Status(17);
        com.google.android.gms.common.api.Status.RESULT_DEAD_CLIENT = new com.google.android.gms.common.api.Status(18);
        com.google.android.gms.common.api.Status.CREATOR = new com.google.android.gms.common.api.zze();
        return;
    }

    public Status(int p2)
    {
        this(p2, 0);
        return;
    }

    public Status(int p2, String p3)
    {
        this(p2, p3, 0);
        return;
    }

    public Status(int p2, String p3, android.app.PendingIntent p4)
    {
        this(p2, p3, p4, 0);
        return;
    }

    public Status(int p1, String p2, android.app.PendingIntent p3, com.google.android.gms.common.ConnectionResult p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public Status(com.google.android.gms.common.ConnectionResult p2, String p3)
    {
        this(p2, p3, 17);
        return;
    }

    public Status(com.google.android.gms.common.ConnectionResult p2, String p3, int p4)
    {
        this(p4, p3, p2.getResolution(), p2);
        return;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.common.api.Status)) {
            if ((this.zza != ((com.google.android.gms.common.api.Status) p4).zza) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.common.api.Status) p4).zzb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.common.api.Status) p4).zzc)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzd, ((com.google.android.gms.common.api.Status) p4).zzd))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult()
    {
        return this.zzd;
    }

    public android.app.PendingIntent getResolution()
    {
        return this.zzc;
    }

    public com.google.android.gms.common.api.Status getStatus()
    {
        return this;
    }

    public int getStatusCode()
    {
        return this.zza;
    }

    public String getStatusMessage()
    {
        return this.zzb;
    }

    public boolean hasResolution()
    {
        if (this.zzc == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd}));
    }

    public boolean isCanceled()
    {
        if (this.zza != 16) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean isInterrupted()
    {
        if (this.zza != 14) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean isSuccess()
    {
        if (this.zza > 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public void startResolutionForResult(android.app.Activity p10, int p11)
    {
        if (this.hasResolution()) {
            android.app.PendingIntent v0_2;
            if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastU()) {
                v0_2 = 0;
            } else {
                v0_2 = android.app.ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
            }
            int v8 = v0_2;
            android.app.PendingIntent v0_3 = this.zzc;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_3);
            p10.startIntentSenderForResult(v0_3.getIntentSender(), p11, 0, 0, 0, 0, v8);
            return;
        } else {
            return;
        }
    }

    public void startResolutionForResult(e.c p5)
    {
        if (this.hasResolution()) {
            android.content.IntentSender v0_1 = this.zzc;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1);
            android.content.IntentSender v0_2 = v0_1.getIntentSender();
            kotlin.jvm.internal.j.e(v0_2, "intentSender");
            p5.a(new e.k(v0_2, 0, 0, 0));
            return;
        } else {
            return;
        }
    }

    public String toString()
    {
        String v0_0 = com.google.android.gms.common.internal.Objects.toStringHelper(this);
        v0_0.add("statusCode", this.zza());
        v0_0.add("resolution", this.zzc);
        return v0_0.toString();
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, this.getStatusCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.getStatusMessage(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.zzc, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.getConnectionResult(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final String zza()
    {
        String v0_0 = this.zzb;
        if (v0_0 == null) {
            return com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(this.zza);
        } else {
            return v0_0;
        }
    }
}
