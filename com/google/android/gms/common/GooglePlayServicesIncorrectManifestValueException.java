package com.google.android.gms.common;
public final class GooglePlayServicesIncorrectManifestValueException extends com.google.android.gms.common.GooglePlayServicesManifestException {

    public GooglePlayServicesIncorrectManifestValueException(int p4)
    {
        String v0_0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        StringBuilder v2_1 = new StringBuilder((((String.valueOf(v0_0).length() + 104) + String.valueOf(p4).length()) + 194));
        v2_1.append("The meta-data tag in your app\'s AndroidManifest.xml does not have the right value.  Expected ");
        v2_1.append(v0_0);
        v2_1.append(" but found ");
        v2_1.append(p4);
        v2_1.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(p4, v2_1.toString());
        return;
    }
}
