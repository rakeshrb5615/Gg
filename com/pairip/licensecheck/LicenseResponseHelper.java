package com.pairip.licensecheck;
public class LicenseResponseHelper {
    private static final String KEY_FACTORY_ALGORITHM = "RSA";
    private static final String PAYLOAD_LICENSE_DATA = "LICENSE_DATA";
    private static final String PAYLOAD_PACKAGE_NAME = "packageName";
    private static final String PAYLOAD_REPEATED_CHECK_DURATION_TO_RETRY_MILLIS = "repeatedCheckDurationToRetryMillis";
    private static final String PAYLOAD_REPEATED_CHECK_TIME_TO_RETRY_MILLIS = "repeatedCheckTimeToRetryMillis";
    private static final String SIGNATURE_ALGORITHM = "SHA256withRSA";
    private static final java.nio.charset.Charset UTF_8;

    static LicenseResponseHelper()
    {
        com.pairip.licensecheck.LicenseResponseHelper.UTF_8 = java.nio.charset.Charset.forName("UTF-8");
        return;
    }

    private LicenseResponseHelper()
    {
        return;
    }

    private static org.json.JSONObject base64ToJson(String p2)
    {
        try {
            return new org.json.JSONObject(new String(android.util.Base64.decode(p2, 8), com.pairip.licensecheck.LicenseResponseHelper.UTF_8));
        } catch (IllegalArgumentException v2_4) {
            throw new com.pairip.licensecheck.LicenseCheckException("Invalid response", v2_4);
        }
    }

    private static String[] getJwsPartsForLicenseData(android.os.Bundle p3)
    {
        com.pairip.licensecheck.LicenseCheckException v3_4 = p3.getString("LICENSE_DATA");
        if (v3_4 == null) {
            throw new com.pairip.licensecheck.LicenseCheckException("Invalid response");
        } else {
            com.pairip.licensecheck.LicenseCheckException v3_1 = v3_4.split("\\.", -1);
            if (v3_1.length != 3) {
                throw new com.pairip.licensecheck.LicenseCheckException("Invalid response");
            } else {
                return v3_1;
            }
        }
    }

    private static java.security.PublicKey getPublicKey()
    {
        try {
            java.security.spec.InvalidKeySpecException v0_1 = java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(com.pairip.licensecheck.LicenseClient.getLicensePubKey(), 0)));
            return v0_1;
        } catch (String v2_2) {
            Object[] v4_1 = new Object[1];
            v4_1[0] = v0_1;
            throw new com.pairip.licensecheck.LicenseCheckException(String.format("%s algorithm not found on device", v4_1), v2_2);
        } catch (java.security.spec.InvalidKeySpecException v0_3) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not decode public key", v0_3);
        } catch (java.security.spec.InvalidKeySpecException v0_2) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not create key specification from the public key", v0_2);
        }
    }

    public static com.pairip.licensecheck.RepeatedCheckMetadata getRepeatedCheckMetadata(android.os.Bundle p5)
    {
        try {
            com.pairip.licensecheck.RepeatedCheckMetadata v5_8 = com.pairip.licensecheck.LicenseResponseHelper.base64ToJson(com.pairip.licensecheck.LicenseResponseHelper.getJwsPartsForLicenseData(p5)[1]);
        } catch (com.pairip.licensecheck.RepeatedCheckMetadata v5_4) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not decode json", v5_4);
        } catch (com.pairip.licensecheck.RepeatedCheckMetadata v5_3) {
            throw new com.pairip.licensecheck.LicenseCheckException("Invalid repeated check payload", v5_3);
        }
        if (v5_8.has("repeatedCheckDurationToRetryMillis")) {
            if (v5_8.has("repeatedCheckTimeToRetryMillis")) {
                return new com.pairip.licensecheck.RepeatedCheckMetadata(v5_8.getLong("repeatedCheckDurationToRetryMillis"), v5_8.getLong("repeatedCheckTimeToRetryMillis"));
            } else {
            }
        }
        return 0;
    }

    public static void validateResponse(android.os.Bundle p5, String p6)
    {
        try {
            com.pairip.licensecheck.LicenseCheckException v5_1 = com.pairip.licensecheck.LicenseResponseHelper.getJwsPartsForLicenseData(p5);
            java.security.PublicKey v1_3 = com.pairip.licensecheck.LicenseResponseHelper.base64ToJson(v5_1[0]);
            org.json.JSONObject v3_1 = com.pairip.licensecheck.LicenseResponseHelper.base64ToJson(v5_1[1]);
            String v4_1 = v5_1[2];
            String v0_0 = v5_1[0];
            com.pairip.licensecheck.LicenseCheckException v5_2 = v5_1[1];
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append(v0_0);
            v2_1.append(".");
            v2_1.append(v5_2);
            com.pairip.licensecheck.LicenseCheckException v5_3 = v2_1.toString();
        } catch (com.pairip.licensecheck.LicenseCheckException v5_11) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not decode json", v5_11);
        }
        if (!v1_3.getString("alg").equals("RS256")) {
            throw new com.pairip.licensecheck.LicenseCheckException("Response must be signed with RS256 algorithm.");
        } else {
            com.pairip.licensecheck.LicenseResponseHelper.verifySignature(v5_3, v4_1, "SHA256withRSA", com.pairip.licensecheck.LicenseResponseHelper.getPublicKey());
            if (!v3_1.getString("packageName").equals(p6)) {
                throw new com.pairip.licensecheck.LicenseCheckException("Package name doesn\'t match.");
            } else {
                return;
            }
        }
    }

    private static void verifySignature(String p1, String p2, String p3, java.security.PublicKey p4)
    {
        try {
            int v0_0 = java.security.Signature.getInstance(p3);
            v0_0.initVerify(p4);
            v0_0.update(p1.getBytes(com.pairip.licensecheck.LicenseResponseHelper.UTF_8));
        } catch (com.pairip.licensecheck.LicenseCheckException v1_7) {
            Object[] v4_3 = new Object[1];
            v4_3[0] = p3;
            throw new com.pairip.licensecheck.LicenseCheckException(String.format("Could not find %s algorithm on the device", v4_3), v1_7);
        } catch (com.pairip.licensecheck.LicenseCheckException v1_6) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not sign data with the public key", v1_6);
        } catch (com.pairip.licensecheck.LicenseCheckException v1_5) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not parse returned signature.", v1_5);
        } catch (com.pairip.licensecheck.LicenseCheckException v1_4) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not base64 decode returned signature", v1_4);
        }
        if (!v0_0.verify(android.util.Base64.decode(p2, 8))) {
            throw new com.pairip.licensecheck.LicenseCheckException("Signature verification failed.");
        } else {
            return;
        }
    }
}
