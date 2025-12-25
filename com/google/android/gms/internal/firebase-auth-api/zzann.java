package com.google.android.gms.internal.firebase-auth-api;
final class zzann {

    public static String zza(com.google.android.gms.internal.firebase-auth-api.zzajv p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanq v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzanq(p5);
        String v5_3 = new StringBuilder(v0_1.zza());
        int v1_1 = 0;
        while (v1_1 < v0_1.zza()) {
            char v2_0 = v0_1.zza(v1_1);
            if (v2_0 == 34) {
                v5_3.append("\\\"");
            } else {
                if (v2_0 == 39) {
                    v5_3.append("\\\'");
                } else {
                    if (v2_0 == 92) {
                        v5_3.append("\\\\");
                    } else {
                        switch (v2_0) {
                            case 7:
                                v5_3.append("\\a");
                                break;
                            case 8:
                                v5_3.append("\\b");
                                break;
                            case 9:
                                v5_3.append("\\t");
                                break;
                            case 10:
                                v5_3.append("\\n");
                                break;
                            case 11:
                                v5_3.append("\\v");
                                break;
                            case 12:
                                v5_3.append("\\f");
                                break;
                            case 13:
                                v5_3.append("\\r");
                                break;
                            default:
                                if (v2_0 < 32) {
                                    v5_3.append(92);
                                    v5_3.append(((char) (((v2_0 >> 6) & 3) + 48)));
                                    v5_3.append(((char) (((v2_0 >> 3) & 7) + 48)));
                                    v5_3.append(((char) ((v2_0 & 7) + 48)));
                                } else {
                                    if (v2_0 > 126) {
                                    } else {
                                        v5_3.append(((char) v2_0));
                                    }
                                }
                        }
                    }
                }
            }
            v1_1++;
        }
        return v5_3.toString();
    }
}
