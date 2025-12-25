package e4;
public final class a extends com.google.android.gms.common.api.ApiException {

    public a(int p8)
    {
        String v3_4;
        String v1_0 = java.util.Locale.getDefault();
        Object[] v2_1 = Integer.valueOf(p8);
        String v3_6 = f4.a.a;
        String v4_2 = Integer.valueOf(p8);
        if (!v3_6.containsKey(v4_2)) {
            v3_4 = "";
        } else {
            StringBuilder v5_0 = f4.a.b;
            if (v5_0.containsKey(v4_2)) {
                String v3_1 = ((String) v3_6.get(v4_2));
                String v4_1 = ((String) v5_0.get(v4_2));
                StringBuilder v5_2 = new StringBuilder();
                v5_2.append(v3_1);
                v5_2.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#");
                v5_2.append(v4_1);
                v5_2.append(")");
                v3_4 = v5_2.toString();
            }
        }
        super(new com.google.android.gms.common.api.Status(p8, String.format(v1_0, "Install Error(%d): %s", new Object[] {v2_1, v3_4}))));
        if (p8 == null) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        } else {
            return;
        }
    }
}
