package j4;
public abstract class a {
    public static final java.util.HashMap a;
    public static final java.util.HashMap b;

    static a()
    {
        String v0_1 = new java.util.HashMap();
        j4.a.a = v0_1;
        java.util.HashMap v1_1 = new java.util.HashMap();
        j4.a.b = v1_1;
        Integer v2_1 = Integer.valueOf(-1);
        v0_1.put(v2_1, "The Play Store app is either not installed or not the official version.");
        Integer v3_1 = Integer.valueOf(-2);
        v0_1.put(v3_1, "Call first requestReviewFlow to get the ReviewInfo.");
        Integer v4_2 = Integer.valueOf(-100);
        v0_1.put(v4_2, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        v1_1.put(v2_1, "PLAY_STORE_NOT_FOUND");
        v1_1.put(v3_1, "INVALID_REQUEST");
        v1_1.put(v4_2, "INTERNAL_ERROR");
        return;
    }
}
