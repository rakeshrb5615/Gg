package com.pairip.licensecheck;
 class LicenseClient$2 extends com.pairip.licensecheck.ILicenseV2ResultListener$Stub {
    final synthetic com.pairip.licensecheck.LicenseClient val$client;

    LicenseClient$2(com.pairip.licensecheck.LicenseClient p1)
    {
        this.val$client = p1;
        return;
    }

    public void verifyLicense(int p2, android.os.Bundle p3)
    {
        com.pairip.licensecheck.LicenseClient.-$$Nest$mprocessResponse(this.val$client, p2, p3);
        return;
    }
}
