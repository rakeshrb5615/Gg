package com.google.android.play.core.integrity.model;
public final class a {
    private static final java.util.Map a;
    private static final java.util.Map b;

    static a()
    {
        String v0_1 = new java.util.HashMap();
        com.google.android.play.core.integrity.model.a.a = v0_1;
        java.util.HashMap v1_1 = new java.util.HashMap();
        com.google.android.play.core.integrity.model.a.b = v1_1;
        Integer v2_6 = Integer.valueOf(-1);
        v0_1.put(v2_6, "Integrity API is not available.\nIntegrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure that Integrity API is enabled in Google Play Console.\n2) Ask the user to update Play Store.\n");
        Integer v3_1 = Integer.valueOf(-2);
        v0_1.put(v3_1, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
        Integer v4_2 = Integer.valueOf(-3);
        v0_1.put(v4_2, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n");
        Integer v5_2 = Integer.valueOf(-4);
        v0_1.put(v5_2, "No active account found in the Play Store app. Note that the Play Integrity API now supports unauthenticated requests. This error code is used only for older Play Store versions that lack support.\nAsk the user to authenticate in Play Store.\n");
        Integer v6_2 = Integer.valueOf(-5);
        v0_1.put(v6_2, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        Integer v7_2 = Integer.valueOf(-6);
        v0_1.put(v7_2, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n");
        Integer v8_2 = Integer.valueOf(-7);
        v0_1.put(v8_2, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        Integer v9_2 = Integer.valueOf(-8);
        v0_1.put(v9_2, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n");
        Integer v10_2 = Integer.valueOf(-9);
        v0_1.put(v10_2, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
        Integer v11_2 = Integer.valueOf(-10);
        v0_1.put(v11_2, "Nonce length is too short. The nonce must be a minimum of 16 bytes (before base64 encoding) to allow for a better security.\nRetry with a longer nonce.\n");
        String v12_2 = Integer.valueOf(-11);
        v0_1.put(v12_2, "Nonce length is too long. The nonce must be less than 500 bytes before base64 encoding.\nRetry with a shorter nonce.\n");
        Integer v13_2 = Integer.valueOf(-12);
        v0_1.put(v13_2, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        Integer v14_2 = Integer.valueOf(-13);
        v0_1.put(v14_2, "Nonce is not encoded as a base64 web-safe no-wrap string.\nRetry with correct nonce format.\n");
        Integer v15_2 = Integer.valueOf(-14);
        Integer v16 = v13_2;
        v0_1.put(v15_2, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
        Integer v13_5 = Integer.valueOf(-15);
        Integer v17 = v14_2;
        v0_1.put(v13_5, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n");
        Integer v14_5 = Integer.valueOf(-16);
        Integer v18 = v12_2;
        v0_1.put(v14_5, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
        String v12_5 = Integer.valueOf(-100);
        Integer v19 = v14_5;
        v0_1.put(v12_5, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        Integer v14_8 = Integer.valueOf(-17);
        Integer v20 = v12_5;
        v0_1.put(v14_8, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
        v1_1.put(v2_6, "API_NOT_AVAILABLE");
        v1_1.put(v4_2, "NETWORK_ERROR");
        v1_1.put(v3_1, "PLAY_STORE_NOT_FOUND");
        v1_1.put(v5_2, "PLAY_STORE_ACCOUNT_NOT_FOUND");
        v1_1.put(v15_2, "PLAY_STORE_VERSION_OUTDATED");
        v1_1.put(v6_2, "APP_NOT_INSTALLED");
        v1_1.put(v7_2, "PLAY_SERVICES_NOT_FOUND");
        v1_1.put(v13_5, "PLAY_SERVICES_VERSION_OUTDATED");
        v1_1.put(v8_2, "APP_UID_MISMATCH");
        v1_1.put(v9_2, "TOO_MANY_REQUESTS");
        v1_1.put(v10_2, "CANNOT_BIND_TO_SERVICE");
        v1_1.put(v11_2, "NONCE_TOO_SHORT");
        v1_1.put(v18, "NONCE_TOO_LONG");
        v1_1.put(v17, "NONCE_IS_NOT_BASE64");
        v1_1.put(v19, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        v1_1.put(v16, "GOOGLE_SERVER_UNAVAILABLE");
        v1_1.put(v20, "INTERNAL_ERROR");
        v1_1.put(v14_8, "CLIENT_TRANSIENT_ERROR");
        return;
    }

    public static String a(int p3)
    {
        String v0_0 = com.google.android.play.core.integrity.model.a.a;
        String v3_3 = Integer.valueOf(p3);
        if (v0_0.containsKey(v3_3)) {
            StringBuilder v1_3 = com.google.android.play.core.integrity.model.a.b;
            if (v1_3.containsKey(v3_3)) {
                String v0_2 = ((String) v0_0.get(v3_3));
                String v3_2 = ((String) v1_3.get(v3_3));
                StringBuilder v1_1 = new StringBuilder();
                v1_1.append(v0_2);
                v1_1.append(" (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#");
                v1_1.append(v3_2);
                v1_1.append(")");
                return v1_1.toString();
            }
        }
        return "";
    }
}
