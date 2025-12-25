package com.google.android.gms.auth;
public class zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";
    public static final String[] zza;
    public static final String zzb;
    private static final android.content.ComponentName zzc;
    private static final com.google.android.gms.common.logging.Logger zzd;

    static zzl()
    {
        com.google.android.gms.auth.zzl.zza = new String[] {"com.google", "com.google.work", "cn.google"});
        com.google.android.gms.auth.zzl.zzb = "androidPackageName";
        com.google.android.gms.auth.zzl.zzc = new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        com.google.android.gms.auth.zzl.zzd = com.google.android.gms.auth.zzd.zza(new String[] {"GoogleAuthUtil"}));
        return;
    }

    public zzl()
    {
        return;
    }

    public static void clearToken(android.content.Context p2, String p3)
    {
        com.google.android.gms.auth.zzl.zze(p2, p3, 0);
        return;
    }

    public static java.util.List getAccountChangeEvents(android.content.Context p2, int p3, String p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4, "accountName must be provided");
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        com.google.android.gms.auth.zzl.zzk(p2, 8400000);
        long v0_5 = new com.google.android.gms.auth.AccountChangeEventsRequest();
        v0_5.setAccountName(p4);
        v0_5.setEventIndex(p3);
        com.google.android.gms.internal.auth.zzdc.zze(p2);
        if ((com.google.android.gms.internal.auth.zzhs.zzd()) && (com.google.android.gms.auth.zzl.zzo(p2))) {
            try {
                com.google.android.gms.common.api.ApiException v3_6 = ((com.google.android.gms.auth.AccountChangeEventsResponse) com.google.android.gms.auth.zzl.zzi(com.google.android.gms.internal.auth.zzh.zza(p2).zzb(v0_5), "account change events retrieval"));
                com.google.android.gms.auth.zzl.zzj(v3_6);
                p2 = v3_6.getEvents();
                return p2;
            } catch (com.google.android.gms.common.api.ApiException v3_7) {
                com.google.android.gms.auth.zzl.zzl(v3_7, "account change events retrieval");
            }
        }
        return ((java.util.List) com.google.android.gms.auth.zzl.zzh(p2, com.google.android.gms.auth.zzl.zzc, new com.google.android.gms.auth.zzi(v0_5), 0));
    }

    public static String getAccountId(android.content.Context p2, String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3, "accountName must be provided");
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        com.google.android.gms.auth.zzl.zzk(p2, 8400000);
        return com.google.android.gms.auth.zzl.getToken(p2, p3, "^^_account_id_^^", new android.os.Bundle());
    }

    public static String getToken(android.content.Context p1, android.accounts.Account p2, String p3)
    {
        return com.google.android.gms.auth.zzl.getToken(p1, p2, p3, new android.os.Bundle());
    }

    public static String getToken(android.content.Context p0, android.accounts.Account p1, String p2, android.os.Bundle p3)
    {
        com.google.android.gms.auth.zzl.zzn(p1);
        return com.google.android.gms.auth.zzl.zza(p0, p1, p2, p3).zza();
    }

    public static String getToken(android.content.Context p2, String p3, String p4)
    {
        return com.google.android.gms.auth.zzl.getToken(p2, new android.accounts.Account(p3, "com.google"), p4);
    }

    public static String getToken(android.content.Context p2, String p3, String p4, android.os.Bundle p5)
    {
        return com.google.android.gms.auth.zzl.getToken(p2, new android.accounts.Account(p3, "com.google"), p4, p5);
    }

    public static void invalidateToken(android.content.Context p1, String p2)
    {
        android.accounts.AccountManager.get(p1).invalidateAuthToken("com.google", p2);
        return;
    }

    public static android.os.Bundle removeAccount(android.content.Context p3, android.accounts.Account p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.auth.zzl.zzn(p4);
        com.google.android.gms.auth.zzl.zzk(p3, 8400000);
        com.google.android.gms.internal.auth.zzdc.zze(p3);
        if ((com.google.android.gms.internal.auth.zzhs.zze()) && (com.google.android.gms.auth.zzl.zzo(p3))) {
            try {
                com.google.android.gms.common.api.ApiException v0_3 = ((android.os.Bundle) com.google.android.gms.auth.zzl.zzi(com.google.android.gms.internal.auth.zzh.zza(p3).zzd(p4), "account removal"));
                com.google.android.gms.auth.zzl.zzj(v0_3);
                return v0_3;
            } catch (com.google.android.gms.common.api.ApiException v0_5) {
                com.google.android.gms.auth.zzl.zzl(v0_5, "account removal");
            }
        }
        return ((android.os.Bundle) com.google.android.gms.auth.zzl.zzh(p3, com.google.android.gms.auth.zzl.zzc, new com.google.android.gms.auth.zzg(p4), 0));
    }

    public static Boolean requestGoogleAccountsAccess(android.content.Context p7)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7);
        com.google.android.gms.auth.zzl.zzk(p7, 11400000);
        android.content.ComponentName v1_3 = p7.getApplicationInfo().packageName;
        com.google.android.gms.internal.auth.zzdc.zze(p7);
        if ((com.google.android.gms.internal.auth.zzhs.zze()) && (com.google.android.gms.auth.zzl.zzo(p7))) {
            android.content.Intent v2_4 = ((android.os.Bundle) com.google.android.gms.auth.zzl.zzi(com.google.android.gms.internal.auth.zzh.zza(p7).zze(v1_3), "google accounts access request"));
            String v4_1 = v2_4.getString("Error");
            android.content.Intent v2_6 = ((android.content.Intent) v2_4.getParcelable("userRecoveryIntent"));
            Object[] v5_1 = com.google.android.gms.internal.auth.zzby.zza(v4_1);
            if (!com.google.android.gms.internal.auth.zzby.zzc.equals(v5_1)) {
                if (!com.google.android.gms.internal.auth.zzby.zzb(v5_1)) {
                    throw new com.google.android.gms.auth.GoogleAuthException(v4_1);
                } else {
                    Object[] v5_4 = new Object[0];
                    com.google.android.gms.auth.zzl.zzd.w("isUserRecoverableError status: ".concat(String.valueOf(v5_1)), v5_4);
                    throw new com.google.android.gms.auth.UserRecoverableAuthException(v4_1, v2_6);
                }
            } else {
                p7 = Boolean.TRUE;
                return p7;
            }
        }
        return ((Boolean) com.google.android.gms.auth.zzl.zzh(p7, com.google.android.gms.auth.zzl.zzc, new com.google.android.gms.auth.zzj(v1_3), 0));
    }

    public static com.google.android.gms.auth.TokenData zza(android.content.Context p2, android.accounts.Account p3, String p4, android.os.Bundle p5)
    {
        android.os.Bundle v5_1;
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4, "Scope cannot be empty or null.");
        com.google.android.gms.auth.zzl.zzn(p3);
        com.google.android.gms.auth.zzl.zzk(p2, 8400000);
        if (p5 != null) {
            v5_1 = new android.os.Bundle(p5);
        } else {
            v5_1 = new android.os.Bundle();
        }
        com.google.android.gms.auth.zzl.zzm(p2, v5_1);
        com.google.android.gms.internal.auth.zzdc.zze(p2);
        if ((com.google.android.gms.internal.auth.zzhs.zze()) && (com.google.android.gms.auth.zzl.zzo(p2))) {
            try {
                com.google.android.gms.common.api.ApiException v0_7 = ((android.os.Bundle) com.google.android.gms.auth.zzl.zzi(com.google.android.gms.internal.auth.zzh.zza(p2).zzc(p3, p4, v5_1), "token retrieval"));
                com.google.android.gms.auth.zzl.zzj(v0_7);
                p2 = com.google.android.gms.auth.zzl.zzg(v0_7);
                return p2;
            } catch (com.google.android.gms.common.api.ApiException v0_8) {
                com.google.android.gms.auth.zzl.zzl(v0_8, "token retrieval");
            }
        }
        return ((com.google.android.gms.auth.TokenData) com.google.android.gms.auth.zzl.zzh(p2, com.google.android.gms.auth.zzl.zzc, new com.google.android.gms.auth.zzf(p3, p4, v5_1), 0));
    }

    public static synthetic com.google.android.gms.auth.TokenData zzb(android.accounts.Account p0, String p1, android.os.Bundle p2, android.os.IBinder p3)
    {
        java.io.IOException v0_2 = com.google.android.gms.internal.auth.zze.zzb(p3).zze(p0, p1, p2);
        if (v0_2 == null) {
            throw new java.io.IOException("Service call returned null");
        } else {
            return com.google.android.gms.auth.zzl.zzg(v0_2);
        }
    }

    public static bridge synthetic com.google.android.gms.common.logging.Logger zzc()
    {
        return com.google.android.gms.auth.zzl.zzd;
    }

    public static bridge synthetic Object zzd(Object p0)
    {
        com.google.android.gms.auth.zzl.zzj(p0);
        return p0;
    }

    public static void zze(android.content.Context p2, String p3, long p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        com.google.android.gms.auth.zzl.zzk(p2, 8400000);
        android.os.Bundle v4_3 = new android.os.Bundle();
        com.google.android.gms.auth.zzl.zzm(p2, v4_3);
        com.google.android.gms.internal.auth.zzdc.zze(p2);
        if ((com.google.android.gms.internal.auth.zzhs.zze()) && (com.google.android.gms.auth.zzl.zzo(p2))) {
            com.google.android.gms.common.api.ApiException v5_1 = com.google.android.gms.internal.auth.zzh.zza(p2);
            String v0_1 = new com.google.android.gms.internal.auth.zzbw();
            v0_1.zza(p3);
            try {
                com.google.android.gms.auth.zzl.zzi(v5_1.zza(v0_1), "clear token");
                return;
            } catch (com.google.android.gms.common.api.ApiException v5_3) {
                com.google.android.gms.auth.zzl.zzl(v5_3, "clear token");
            }
        }
        com.google.android.gms.auth.zzl.zzh(p2, com.google.android.gms.auth.zzl.zzc, new com.google.android.gms.auth.zzh(p3, v4_3), 0);
        return;
    }

    public static void zzf(android.content.Intent p1)
    {
        if (p1 == null) {
            throw new IllegalArgumentException("Callback cannot be null.");
        } else {
            try {
                android.content.Intent.parseUri(p1.toUri(1), 1);
                return;
            } catch (java.net.URISyntaxException) {
                throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
            }
        }
    }

    private static com.google.android.gms.auth.TokenData zzg(android.os.Bundle p4)
    {
        String v0_6 = com.google.android.gms.auth.TokenData.getClassLoader();
        if (v0_6 != null) {
            p4.setClassLoader(v0_6);
        }
        String v0_3;
        com.google.android.gms.auth.UserRecoverableAuthException v1_7 = p4.getBundle("tokenDetails");
        if (v1_7 != null) {
            if (v0_6 != null) {
                v1_7.setClassLoader(v0_6);
            }
            v0_3 = ((com.google.android.gms.auth.TokenData) v1_7.getParcelable("TokenData"));
        } else {
            v0_3 = 0;
        }
        if (v0_3 == null) {
            String v0_5 = p4.getString("Error");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_5);
            com.google.android.gms.auth.GoogleAuthException v4_2 = ((android.content.Intent) p4.getParcelable("userRecoveryIntent"));
            com.google.android.gms.auth.UserRecoverableAuthException v1_1 = com.google.android.gms.internal.auth.zzby.zza(v0_5);
            if (com.google.android.gms.internal.auth.zzby.zzb(v1_1)) {
                Object[] v3_2 = new Object[0];
                com.google.android.gms.auth.zzl.zzd.w("isUserRecoverableError status: ".concat(String.valueOf(v1_1)), v3_2);
                throw new com.google.android.gms.auth.UserRecoverableAuthException(v0_5, v4_2);
            } else {
                if ((!com.google.android.gms.internal.auth.zzby.zze.equals(v1_1)) && ((!com.google.android.gms.internal.auth.zzby.zzf.equals(v1_1)) && ((!com.google.android.gms.internal.auth.zzby.zzg.equals(v1_1)) && ((!com.google.android.gms.internal.auth.zzby.zzaf.equals(v1_1)) && (!com.google.android.gms.internal.auth.zzby.zzah.equals(v1_1)))))) {
                    throw new com.google.android.gms.auth.GoogleAuthException(v0_5);
                } else {
                    throw new java.io.IOException(v0_5);
                }
            }
        } else {
            return v0_3;
        }
    }

    private static Object zzh(android.content.Context p2, android.content.ComponentName p3, com.google.android.gms.auth.zzk p4, long p5)
    {
        com.google.android.gms.common.BlockingServiceConnection v0_1 = new com.google.android.gms.common.BlockingServiceConnection();
        java.io.IOException v2_3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(p2);
        try {
            if (!v2_3.bindService(p3, v0_1, "GoogleAuthUtil")) {
                throw new java.io.IOException("Could not bind to service.");
            } else {
                try {
                    Throwable v4_4 = p4.zza(v0_1.getService());
                    v2_3.unbindService(p3, v0_1, "GoogleAuthUtil");
                    return v4_4;
                } catch (Throwable v4_5) {
                    android.util.Log.i("GoogleAuthUtil", "Error on service connection.", v4_5);
                    throw new java.io.IOException("Error on service connection.", v4_5);
                } catch (Throwable v4_5) {
                } catch (Throwable v4_5) {
                } catch (Throwable v4_6) {
                    v2_3.unbindService(p3, v0_1, "GoogleAuthUtil");
                    throw v4_6;
                }
            }
        } catch (java.io.IOException v2_4) {
            String v3_1 = v2_4.getMessage();
            Throwable v4_2 = new StringBuilder("SecurityException while bind to auth service: ");
            v4_2.append(v3_1);
            android.util.Log.w("GoogleAuthUtil", v4_2.toString());
            throw new java.io.IOException("SecurityException while binding to Auth service.", v2_4);
        }
    }

    private static Object zzi(com.google.android.gms.tasks.Task p3, String p4)
    {
        try {
            return com.google.android.gms.tasks.Tasks.await(p3);
        } catch (java.util.concurrent.CancellationException v3_1) {
            String v4_1 = v1.a.l("Interrupted while waiting for the task of ", p4, " to finish.");
            Object[] v1_2 = new Object[0];
            com.google.android.gms.auth.zzl.zzd.w(v4_1, v1_2);
            throw new java.io.IOException(v4_1, v3_1);
        } catch (java.util.concurrent.CancellationException v3_4) {
            String v4_3 = v1.a.l("Canceled while waiting for the task of ", p4, " to finish.");
            Object[] v1_1 = new Object[0];
            com.google.android.gms.auth.zzl.zzd.w(v4_3, v1_1);
            throw new java.io.IOException(v4_3, v3_4);
        } catch (java.util.concurrent.CancellationException v3_2) {
            java.io.IOException v0_6 = v3_2.getCause();
            if (!(v0_6 instanceof com.google.android.gms.common.api.ApiException)) {
                String v4_2 = v1.a.l("Unable to get a result for ", p4, " due to ExecutionException.");
                Object[] v1_3 = new Object[0];
                com.google.android.gms.auth.zzl.zzd.w(v4_2, v1_3);
                throw new java.io.IOException(v4_2, v3_2);
            } else {
                throw ((com.google.android.gms.common.api.ApiException) v0_6);
            }
        }
    }

    private static Object zzj(Object p2)
    {
        if (p2 == null) {
            String v0_1 = new Object[0];
            com.google.android.gms.auth.zzl.zzd.w("Service call returned null.", v0_1);
            throw new java.io.IOException("Service unavailable.");
        } else {
            return p2;
        }
    }

    private static void zzk(android.content.Context p2, int p3)
    {
        try {
            com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(p2.getApplicationContext(), p3);
            return;
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException v2_2) {
            throw new com.google.android.gms.auth.GooglePlayServicesAvailabilityException(v2_2.getConnectionStatusCode(), v2_2.getMessage(), v2_2.getIntent());
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException v2_4) {
            throw new com.google.android.gms.auth.GoogleAuthException(v2_4.getMessage(), v2_4);
        }
    }

    private static void zzl(com.google.android.gms.common.api.ApiException p1, String p2)
    {
        com.google.android.gms.auth.zzl.zzd.w("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", new Object[] {p2, android.util.Log.getStackTraceString(p1)}));
        return;
    }

    private static void zzm(android.content.Context p2, android.os.Bundle p3)
    {
        String v2_3 = p2.getApplicationInfo().packageName;
        p3.putString("clientPackageName", v2_3);
        long v0_2 = com.google.android.gms.auth.zzl.zzb;
        if (android.text.TextUtils.isEmpty(p3.getString(v0_2))) {
            p3.putString(v0_2, v2_3);
        }
        p3.putLong("service_connection_start_time_millis", android.os.SystemClock.elapsedRealtime());
        return;
    }

    private static void zzn(android.accounts.Account p4)
    {
        if (p4 == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else {
            if (android.text.TextUtils.isEmpty(p4.name)) {
                throw new IllegalArgumentException("Account name cannot be empty!");
            } else {
                int v1 = 0;
                while (v1 < 3) {
                    if (!com.google.android.gms.auth.zzl.zza[v1].equals(p4.type)) {
                        v1++;
                    } else {
                        return;
                    }
                }
                throw new IllegalArgumentException("Account type not supported");
            }
        }
    }

    private static boolean zzo(android.content.Context p3)
    {
        if (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p3, 17895000) == 0) {
            int v3_2 = p3.getApplicationInfo().packageName;
            java.util.Iterator v0_2 = com.google.android.gms.internal.auth.zzhs.zzb().zzl().iterator();
            while (v0_2.hasNext()) {
                if (((String) v0_2.next()).equals(v3_2)) {
                    return 0;
                }
            }
            return 1;
        } else {
            return 0;
        }
    }
}
