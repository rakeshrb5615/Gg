package com.pairip.licensecheck;
public final enum class LicenseActivity$ActivityType extends java.lang.Enum {
    private static final synthetic com.pairip.licensecheck.LicenseActivity$ActivityType[] $VALUES;
    public static final enum com.pairip.licensecheck.LicenseActivity$ActivityType ERROR_DIALOG;
    public static final enum com.pairip.licensecheck.LicenseActivity$ActivityType PAYWALL;

    private static synthetic com.pairip.licensecheck.LicenseActivity$ActivityType[] $values()
    {
        com.pairip.licensecheck.LicenseActivity$ActivityType[] v0_1 = new com.pairip.licensecheck.LicenseActivity$ActivityType[2];
        v0_1[0] = com.pairip.licensecheck.LicenseActivity$ActivityType.PAYWALL;
        v0_1[1] = com.pairip.licensecheck.LicenseActivity$ActivityType.ERROR_DIALOG;
        return v0_1;
    }

    static LicenseActivity$ActivityType()
    {
        com.pairip.licensecheck.LicenseActivity$ActivityType.PAYWALL = new com.pairip.licensecheck.LicenseActivity$ActivityType("PAYWALL", 0);
        com.pairip.licensecheck.LicenseActivity$ActivityType.ERROR_DIALOG = new com.pairip.licensecheck.LicenseActivity$ActivityType("ERROR_DIALOG", 1);
        com.pairip.licensecheck.LicenseActivity$ActivityType.$VALUES = com.pairip.licensecheck.LicenseActivity$ActivityType.$values();
        return;
    }

    private LicenseActivity$ActivityType(String p1, int p2)
    {
        super(p1, p2);
        return;
    }

    public static com.pairip.licensecheck.LicenseActivity$ActivityType valueOf(String p1)
    {
        return ((com.pairip.licensecheck.LicenseActivity$ActivityType) Enum.valueOf(com.pairip.licensecheck.LicenseActivity$ActivityType, p1));
    }

    public static com.pairip.licensecheck.LicenseActivity$ActivityType[] values()
    {
        return ((com.pairip.licensecheck.LicenseActivity$ActivityType[]) com.pairip.licensecheck.LicenseActivity$ActivityType.$VALUES.clone());
    }
}
