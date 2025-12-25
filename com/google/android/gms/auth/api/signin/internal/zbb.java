package com.google.android.gms.auth.api.signin.internal;
public final class zbb implements java.lang.Runnable {
    private static final com.google.android.gms.common.logging.Logger zba;
    private final String zbb;
    private final com.google.android.gms.common.api.internal.StatusPendingResult zbc;

    static zbb()
    {
        String[] v1_1 = new String[0];
        com.google.android.gms.auth.api.signin.internal.zbb.zba = new com.google.android.gms.common.logging.Logger("RevokeAccessOperation", v1_1);
        return;
    }

    public zbb(String p2)
    {
        this.zbb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zbc = new com.google.android.gms.common.api.internal.StatusPendingResult(0);
        return;
    }

    public static com.google.android.gms.common.api.PendingResult zba(String p1)
    {
        if (p1 != null) {
            com.google.android.gms.auth.api.signin.internal.zbb v0_2 = new com.google.android.gms.auth.api.signin.internal.zbb(p1);
            new Thread(v0_2).start();
            return v0_2.zbc;
        } else {
            return com.google.android.gms.common.api.PendingResults.immediateFailedResult(new com.google.android.gms.common.api.Status(4), 0);
        }
    }

    public final void run()
    {
        com.google.android.gms.common.api.Status v2 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR;
        try {
            StringBuilder v5_2 = this.zbb;
            Object[] v6_2 = new StringBuilder("https://accounts.google.com/o/oauth2/revoke?token=");
            v6_2.append(v5_2);
            Object[] v1_3 = ((java.net.HttpURLConnection) new java.net.URL(v6_2.toString()).openConnection());
            v1_3.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            Object[] v1_4 = v1_3.getResponseCode();
        } catch (com.google.android.gms.common.api.internal.StatusPendingResult v0_5) {
            Object[] v3_2 = new Object[0];
            com.google.android.gms.auth.api.signin.internal.zbb.zba.e("IOException when revoking access: ".concat(String.valueOf(v0_5.toString())), v3_2);
            this.zbc.setResult(v2);
            return;
        } catch (com.google.android.gms.common.api.internal.StatusPendingResult v0_1) {
            Object[] v3_1 = new Object[0];
            com.google.android.gms.auth.api.signin.internal.zbb.zba.e("Exception when revoking access: ".concat(String.valueOf(v0_1.toString())), v3_1);
            this.zbc.setResult(v2);
            return;
        }
        if (v1_4 != 200) {
            Object[] v6_0 = new Object[0];
            com.google.android.gms.auth.api.signin.internal.zbb.zba.e("Unable to revoke access!", v6_0);
        } else {
            v2 = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
        StringBuilder v5_4 = new StringBuilder("Response Code: ");
        v5_4.append(v1_4);
        Object[] v1_7 = new Object[0];
        com.google.android.gms.auth.api.signin.internal.zbb.zba.d(v5_4.toString(), v1_7);
        this.zbc.setResult(v2);
        return;
    }
}
