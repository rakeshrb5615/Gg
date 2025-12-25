package com.pairip.licensecheck;
public final enum class LicenseClient$LicenseCheckState extends java.lang.Enum {
    private static final synthetic com.pairip.licensecheck.LicenseClient$LicenseCheckState[] $VALUES;
    public static final enum com.pairip.licensecheck.LicenseClient$LicenseCheckState CHECK_REQUIRED;
    public static final enum com.pairip.licensecheck.LicenseClient$LicenseCheckState FULL_CHECK_OK;
    public static final enum com.pairip.licensecheck.LicenseClient$LicenseCheckState LOCAL_CHECK_OK;
    public static final enum com.pairip.licensecheck.LicenseClient$LicenseCheckState LOCAL_CHECK_REPORTED;
    public static final enum com.pairip.licensecheck.LicenseClient$LicenseCheckState REPEATED_CHECK_REQUIRED;

    private static synthetic com.pairip.licensecheck.LicenseClient$LicenseCheckState[] $values()
    {
        com.pairip.licensecheck.LicenseClient$LicenseCheckState[] v0_1 = new com.pairip.licensecheck.LicenseClient$LicenseCheckState[5];
        v0_1[0] = com.pairip.licensecheck.LicenseClient$LicenseCheckState.CHECK_REQUIRED;
        v0_1[1] = com.pairip.licensecheck.LicenseClient$LicenseCheckState.FULL_CHECK_OK;
        v0_1[2] = com.pairip.licensecheck.LicenseClient$LicenseCheckState.LOCAL_CHECK_OK;
        v0_1[3] = com.pairip.licensecheck.LicenseClient$LicenseCheckState.LOCAL_CHECK_REPORTED;
        v0_1[4] = com.pairip.licensecheck.LicenseClient$LicenseCheckState.REPEATED_CHECK_REQUIRED;
        return v0_1;
    }

    static LicenseClient$LicenseCheckState()
    {
        com.pairip.licensecheck.LicenseClient$LicenseCheckState.CHECK_REQUIRED = new com.pairip.licensecheck.LicenseClient$LicenseCheckState("CHECK_REQUIRED", 0);
        com.pairip.licensecheck.LicenseClient$LicenseCheckState.FULL_CHECK_OK = new com.pairip.licensecheck.LicenseClient$LicenseCheckState("FULL_CHECK_OK", 1);
        com.pairip.licensecheck.LicenseClient$LicenseCheckState.LOCAL_CHECK_OK = new com.pairip.licensecheck.LicenseClient$LicenseCheckState("LOCAL_CHECK_OK", 2);
        com.pairip.licensecheck.LicenseClient$LicenseCheckState.LOCAL_CHECK_REPORTED = new com.pairip.licensecheck.LicenseClient$LicenseCheckState("LOCAL_CHECK_REPORTED", 3);
        com.pairip.licensecheck.LicenseClient$LicenseCheckState.REPEATED_CHECK_REQUIRED = new com.pairip.licensecheck.LicenseClient$LicenseCheckState("REPEATED_CHECK_REQUIRED", 4);
        com.pairip.licensecheck.LicenseClient$LicenseCheckState.$VALUES = com.pairip.licensecheck.LicenseClient$LicenseCheckState.$values();
        return;
    }

    private LicenseClient$LicenseCheckState(String p1, int p2)
    {
        super(p1, p2);
        return;
    }

    public static com.pairip.licensecheck.LicenseClient$LicenseCheckState valueOf(String p1)
    {
        return ((com.pairip.licensecheck.LicenseClient$LicenseCheckState) Enum.valueOf(com.pairip.licensecheck.LicenseClient$LicenseCheckState, p1));
    }

    public static com.pairip.licensecheck.LicenseClient$LicenseCheckState[] values()
    {
        return ((com.pairip.licensecheck.LicenseClient$LicenseCheckState[]) com.pairip.licensecheck.LicenseClient$LicenseCheckState.$VALUES.clone());
    }
}
