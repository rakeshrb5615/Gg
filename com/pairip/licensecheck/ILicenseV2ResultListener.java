package com.pairip.licensecheck;
public interface ILicenseV2ResultListener implements android.os.IInterface {
    public static final String DESCRIPTOR = "com.android.vending.licensing.ILicenseV2ResultListener";

    public abstract void verifyLicense();
}
