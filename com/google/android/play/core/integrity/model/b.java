package com.google.android.play.core.integrity.model;
public final class b {
    private static final java.util.Map a;
    private static final java.util.Map b;

    static b()
    {
        String v0_1 = new java.util.HashMap();
        com.google.android.play.core.integrity.model.b.a = v0_1;
        java.util.HashMap v1_1 = new java.util.HashMap();
        com.google.android.play.core.integrity.model.b.b = v1_1;
        Integer v2_4 = Integer.valueOf(-1);
        v0_1.put(v2_4, "Standard Integrity API is not available.\nStandard Integrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure to be allowlisted to use Standard Integrity API.\n2) Make sure that Integrity API is enabled in Google Play Console.\n3) Ask the user to update Play Store.\n");
        Integer v3_1 = Integer.valueOf(-2);
        v0_1.put(v3_1, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
        Integer v4_2 = Integer.valueOf(-3);
        v0_1.put(v4_2, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n");
        Integer v5_2 = Integer.valueOf(-5);
        v0_1.put(v5_2, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        Integer v6_2 = Integer.valueOf(-6);
        v0_1.put(v6_2, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n");
        Integer v7_2 = Integer.valueOf(-7);
        v0_1.put(v7_2, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        Integer v8_2 = Integer.valueOf(-8);
        v0_1.put(v8_2, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n");
        Integer v9_2 = Integer.valueOf(-9);
        v0_1.put(v9_2, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
        String v10_2 = Integer.valueOf(-12);
        v0_1.put(v10_2, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        Integer v11_2 = Integer.valueOf(-14);
        v0_1.put(v11_2, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
        Integer v12_2 = Integer.valueOf(-15);
        v0_1.put(v12_2, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n");
        Integer v13_2 = Integer.valueOf(-16);
        v0_1.put(v13_2, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
        Integer v14_2 = Integer.valueOf(-17);
        v0_1.put(v14_2, "The provided request hash is too long. The request hash length must be less than 500 bytes.\nRetry with a shorter request hash.");
        Integer v15_2 = Integer.valueOf(-18);
        Integer v16 = v10_2;
        v0_1.put(v15_2, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
        String v10_5 = Integer.valueOf(-19);
        Integer v17 = v15_2;
        v0_1.put(v10_5, "The StandardIntegrityTokenProvider is invalid (e.g. it is outdated).\nRequest a new integrity token provider by calling StandardIntegrityManager#prepareIntegrityToken.");
        Integer v15_5 = Integer.valueOf(-100);
        Integer v18 = v10_5;
        v0_1.put(v15_5, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        v1_1.put(v2_4, "API_NOT_AVAILABLE");
        v1_1.put(v4_2, "NETWORK_ERROR");
        v1_1.put(v3_1, "PLAY_STORE_NOT_FOUND");
        v1_1.put(v11_2, "PLAY_STORE_VERSION_OUTDATED");
        v1_1.put(v5_2, "APP_NOT_INSTALLED");
        v1_1.put(v6_2, "PLAY_SERVICES_NOT_FOUND");
        v1_1.put(v12_2, "PLAY_SERVICES_VERSION_OUTDATED");
        v1_1.put(v7_2, "APP_UID_MISMATCH");
        v1_1.put(v8_2, "TOO_MANY_REQUESTS");
        v1_1.put(v9_2, "CANNOT_BIND_TO_SERVICE");
        v1_1.put(v13_2, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        v1_1.put(v14_2, "REQUEST_HASH_TOO_LONG");
        v1_1.put(v16, "GOOGLE_SERVER_UNAVAILABLE");
        v1_1.put(v17, "CLIENT_TRANSIENT_ERROR");
        v1_1.put(v18, "INTEGRITY_TOKEN_PROVIDER_INVALID");
        v1_1.put(v15_5, "INTERNAL_ERROR");
        return;
    }

    public static String a(int p3)
    {
        String v0_0 = com.google.android.play.core.integrity.model.b.a;
        String v3_3 = Integer.valueOf(p3);
        if (v0_0.containsKey(v3_3)) {
            StringBuilder v1_3 = com.google.android.play.core.integrity.model.b.b;
            if (v1_3.containsKey(v3_3)) {
                String v0_2 = ((String) v0_0.get(v3_3));
                String v3_2 = ((String) v1_3.get(v3_3));
                StringBuilder v1_1 = new StringBuilder();
                v1_1.append(v0_2);
                v1_1.append(" (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#");
                v1_1.append(v3_2);
                v1_1.append(")");
                return v1_1.toString();
            }
        }
        return "";
    }
}
