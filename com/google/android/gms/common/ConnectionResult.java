package com.google.android.gms.common;
public final class ConnectionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final int DEVELOPER_ERROR = 10;
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    public static final com.google.android.gms.common.ConnectionResult RESULT_SUCCESS = None;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    public static final int UNKNOWN = 255;
    final int zza;
    private final int zzb;
    private final android.app.PendingIntent zzc;
    private final String zzd;

    static ConnectionResult()
    {
        com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS = new com.google.android.gms.common.ConnectionResult(0);
        com.google.android.gms.common.ConnectionResult.CREATOR = new com.google.android.gms.common.zza();
        return;
    }

    public ConnectionResult(int p2)
    {
        this(p2, 0, 0);
        return;
    }

    public ConnectionResult(int p1, int p2, android.app.PendingIntent p3, String p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public ConnectionResult(int p2, android.app.PendingIntent p3)
    {
        this(p2, p3, 0);
        return;
    }

    public ConnectionResult(int p2, android.app.PendingIntent p3, String p4)
    {
        this(1, p2, p3, p4);
        return;
    }

    public static String zza(int p2)
    {
        if (p2 == 99) {
            return "UNFINISHED";
        } else {
            if (p2 == 1500) {
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            } else {
                switch (p2) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (p2) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            case 25:
                                return "API_INSTALL_REQUIRED";
                            default:
                                StringBuilder v1_1 = new StringBuilder((String.valueOf(p2).length() + 20));
                                v1_1.append("UNKNOWN_ERROR_CODE(");
                                v1_1.append(p2);
                                v1_1.append(")");
                                return v1_1.toString();
                        }
                }
            }
        }
    }

    public boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof com.google.android.gms.common.ConnectionResult)) {
                if ((this.zzb != ((com.google.android.gms.common.ConnectionResult) p5).zzb) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.common.ConnectionResult) p5).zzc)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzd, ((com.google.android.gms.common.ConnectionResult) p5).zzd)))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public int getErrorCode()
    {
        return this.zzb;
    }

    public String getErrorMessage()
    {
        return this.zzd;
    }

    public android.app.PendingIntent getResolution()
    {
        return this.zzc;
    }

    public boolean hasResolution()
    {
        if ((this.zzb == 0) || (this.zzc == null)) {
            return 0;
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zzb), this.zzc, this.zzd}));
    }

    public boolean isSuccess()
    {
        if (this.zzb != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public void startResolutionForResult(android.app.Activity p9, int p10)
    {
        if (this.hasResolution()) {
            android.app.PendingIntent v0_1 = this.zzc;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1);
            p9.startIntentSenderForResult(v0_1.getIntentSender(), p10, 0, 0, 0, 0);
            return;
        } else {
            return;
        }
    }

    public String toString()
    {
        String v0_0 = com.google.android.gms.common.internal.Objects.toStringHelper(this);
        v0_0.add("statusCode", com.google.android.gms.common.ConnectionResult.zza(this.zzb));
        v0_0.add("resolution", this.zzc);
        v0_0.add("message", this.zzd);
        return v0_0.toString();
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        String v0_0 = this.zza;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 2, this.getErrorCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.getResolution(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 4, this.getErrorMessage(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }
}
