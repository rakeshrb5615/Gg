package f4;
public abstract class a {
    public static final java.util.HashMap a;
    public static final java.util.HashMap b;

    static a()
    {
        String v0_1 = new java.util.HashMap();
        f4.a.a = v0_1;
        java.util.HashMap v1_1 = new java.util.HashMap();
        f4.a.b = v1_1;
        String v2_3 = Integer.valueOf(-2);
        v0_1.put(v2_3, "An unknown error occurred.");
        Integer v3_1 = Integer.valueOf(-3);
        v0_1.put(v3_1, "The API is not available on this device.");
        Integer v4_2 = Integer.valueOf(-4);
        v0_1.put(v4_2, "The request that was sent by the app is malformed.");
        Integer v5_2 = Integer.valueOf(-5);
        v0_1.put(v5_2, "The install is unavailable to this user or device.");
        Integer v6_2 = Integer.valueOf(-6);
        v0_1.put(v6_2, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        Integer v7_2 = Integer.valueOf(-7);
        v0_1.put(v7_2, "The install/update has not been (fully) downloaded yet.");
        Integer v8_2 = Integer.valueOf(-8);
        v0_1.put(v8_2, "The install is already in progress and there is no UI flow to resume.");
        Integer v9_2 = Integer.valueOf(-9);
        v0_1.put(v9_2, "The Play Store app is either not installed or not the official version.");
        Integer v10_2 = Integer.valueOf(-10);
        v0_1.put(v10_2, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        Integer v11_2 = Integer.valueOf(-100);
        v0_1.put(v11_2, "An internal error happened in the Play Store.");
        v1_1.put(v2_3, "ERROR_UNKNOWN");
        v1_1.put(v3_1, "ERROR_API_NOT_AVAILABLE");
        v1_1.put(v4_2, "ERROR_INVALID_REQUEST");
        v1_1.put(v5_2, "ERROR_INSTALL_UNAVAILABLE");
        v1_1.put(v6_2, "ERROR_INSTALL_NOT_ALLOWED");
        v1_1.put(v7_2, "ERROR_DOWNLOAD_NOT_PRESENT");
        v1_1.put(v8_2, "ERROR_INSTALL_IN_PROGRESS");
        v1_1.put(v11_2, "ERROR_INTERNAL_ERROR");
        v1_1.put(v9_2, "ERROR_PLAY_STORE_NOT_FOUND");
        v1_1.put(v10_2, "ERROR_APP_NOT_OWNED");
        v1_1.put(v11_2, "ERROR_INTERNAL_ERROR");
        return;
    }
}
