package com.google.android.gms.ads.identifier;
public final class zzc {

    public static final void zza(String p6)
    {
        try {
            com.google.android.gms.internal.ads_identifier.zzi.zzb(263);
            RuntimeException v2_6 = ((java.net.HttpURLConnection) new java.net.URL(p6).openConnection());
            try {
                String v3_0 = v2_6.getResponseCode();
            } catch (String v3_3) {
                v2_6.disconnect();
                throw v3_3;
            }
            if ((v3_0 < 200) || (v3_0 >= 300)) {
                StringBuilder v5_1 = new StringBuilder((String.valueOf(p6).length() + 65));
                v5_1.append("Received non-success response code ");
                v5_1.append(v3_0);
                v5_1.append(" from pinging URL: ");
                v5_1.append(p6);
                android.util.Log.w("HttpUrlPinger", v5_1.toString());
            }
            v2_6.disconnect();
            com.google.android.gms.internal.ads_identifier.zzi.zza();
            return;
        } catch (RuntimeException v2_4) {
            String v3_5 = v2_4.getMessage();
            StringBuilder v5_9 = new StringBuilder(((String.valueOf(p6).length() + 32) + String.valueOf(v3_5).length()));
            v5_9.append("Error while parsing ping URL: ");
            v5_9.append(p6);
            v5_9.append(". ");
            v5_9.append(v3_5);
            android.util.Log.w("HttpUrlPinger", v5_9.toString(), v2_4);
            com.google.android.gms.internal.ads_identifier.zzi.zza();
            return;
        } catch (RuntimeException v2_1) {
            String v3_4 = v2_1.getMessage();
            StringBuilder v5_5 = new StringBuilder(((String.valueOf(p6).length() + 27) + String.valueOf(v3_4).length()));
            v5_5.append("Error while pinging URL: ");
            v5_5.append(p6);
            v5_5.append(". ");
            v5_5.append(v3_4);
            android.util.Log.w("HttpUrlPinger", v5_5.toString(), v2_1);
            com.google.android.gms.internal.ads_identifier.zzi.zza();
            return;
        } catch (RuntimeException v2_1) {
            v3_4 = v2_1.getMessage();
            v5_5 = new StringBuilder(((String.valueOf(p6).length() + 27) + String.valueOf(v3_4).length()));
            v5_5.append("Error while pinging URL: ");
            v5_5.append(p6);
            v5_5.append(". ");
            v5_5.append(v3_4);
            android.util.Log.w("HttpUrlPinger", v5_5.toString(), v2_1);
            com.google.android.gms.internal.ads_identifier.zzi.zza();
            return;
        } catch (String v6_3) {
            com.google.android.gms.internal.ads_identifier.zzi.zza();
            throw v6_3;
        }
    }
}
