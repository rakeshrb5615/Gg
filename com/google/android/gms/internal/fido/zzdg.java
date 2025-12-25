package com.google.android.gms.internal.fido;
final class zzdg {

    public static String zza(com.google.android.gms.internal.fido.zzcz p5)
    {
        StringBuilder v0_1 = new StringBuilder(p5.zzd());
        int v1_1 = 0;
        while (v1_1 < p5.zzd()) {
            char v2_0 = p5.zza(v1_1);
            if (v2_0 == 34) {
                v0_1.append("\\\"");
            } else {
                if (v2_0 == 39) {
                    v0_1.append("\\\'");
                } else {
                    if (v2_0 == 92) {
                        v0_1.append("\\\\");
                    } else {
                        switch (v2_0) {
                            case 7:
                                v0_1.append("\\a");
                                break;
                            case 8:
                                v0_1.append("\\b");
                                break;
                            case 9:
                                v0_1.append("\\t");
                                break;
                            case 10:
                                v0_1.append("\\n");
                                break;
                            case 11:
                                v0_1.append("\\v");
                                break;
                            case 12:
                                v0_1.append("\\f");
                                break;
                            case 13:
                                v0_1.append("\\r");
                                break;
                            default:
                                if (v2_0 < 32) {
                                    v0_1.append(92);
                                    v0_1.append(((char) (((v2_0 >> 6) & 3) + 48)));
                                    v0_1.append(((char) (((v2_0 >> 3) & 7) + 48)));
                                    v0_1.append(((char) ((v2_0 & 7) + 48)));
                                } else {
                                    if (v2_0 > 126) {
                                    } else {
                                        v0_1.append(((char) v2_0));
                                    }
                                }
                        }
                    }
                }
            }
            v1_1++;
        }
        return v0_1.toString();
    }
}
