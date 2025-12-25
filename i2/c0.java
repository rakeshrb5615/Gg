package i2;
public final synthetic class c0 implements android.content.SharedPreferences$OnSharedPreferenceChangeListener {

    public final void onSharedPreferenceChanged(android.content.SharedPreferences p1, String p2)
    {
        String v1_1;
        switch (p2.hashCode()) {
            case -1980407683:
                v1_1 = "cloudCoverKey";
                break;
            case 338844318:
                v1_1 = "weatherCodeKey";
                break;
            case 1369998646:
                v1_1 = "windStrengthKey";
                break;
            case 2109709988:
                v1_1 = "precipitationAmountKey";
                break;
            default:
                return;
        }
        p2.equals(v1_1);
        return;
    }
}
