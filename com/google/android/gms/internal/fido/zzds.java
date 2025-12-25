package com.google.android.gms.internal.fido;
final class zzds {

    public static final com.google.android.gms.internal.fido.zzdr zza(java.io.InputStream p0, com.google.android.gms.internal.fido.zzdu p1)
    {
        try {
            Throwable v0_1 = com.google.android.gms.internal.fido.zzds.zzb(p0, p1);
            try {
                p1.close();
            } catch (java.io.IOException) {
            }
            return v0_1;
        } catch (Throwable v0_2) {
            try {
                p1.close();
            } catch (java.io.IOException) {
            }
            throw v0_2;
        }
    }

    private static final com.google.android.gms.internal.fido.zzdr zzb(java.io.InputStream p11, com.google.android.gms.internal.fido.zzdu p12)
    {
        try {
            StringBuilder v2_4 = p12.zzd();
        } catch (com.google.android.gms.internal.fido.zzdh v11_19) {
            throw new com.google.android.gms.internal.fido.zzdl("Error in decoding CborValue from bytes", v11_19);
        }
        if (v2_4 == null) {
            throw new com.google.android.gms.internal.fido.zzdl("Parser being asked to parse an empty input stream");
        } else {
            String v3_0 = v2_4.zza();
            long v4_4 = v2_4.zzb();
            int v8 = 0;
            if (v4_4 == -128) {
                com.google.android.gms.internal.fido.zzdr v1_4 = p12.zza();
                if (v1_4 > 1000) {
                    throw new com.google.android.gms.internal.fido.zzdl("Parser being asked to read a large CBOR array");
                } else {
                    com.google.android.gms.internal.fido.zzds.zzc(v3_0, v1_4, p11, p12);
                    String v3_2 = new com.google.android.gms.internal.fido.zzdr[((int) v1_4)];
                    while (((long) v8) < v1_4) {
                        v3_2[v8] = com.google.android.gms.internal.fido.zzds.zzb(p11, p12);
                        v8++;
                    }
                    return new com.google.android.gms.internal.fido.zzdi(com.google.android.gms.internal.fido.zzaz.zzi(v3_2));
                }
            } else {
                if (v4_4 == -96) {
                    com.google.android.gms.internal.fido.zzdr v1_5 = p12.zzc();
                    if (v1_5 > 1000) {
                        throw new com.google.android.gms.internal.fido.zzdl("Parser being asked to read a large CBOR map");
                    } else {
                        com.google.android.gms.internal.fido.zzds.zzc(v3_0, v1_5, p11, p12);
                        String v3_3 = ((int) v1_5);
                        long v4_11 = new com.google.android.gms.internal.fido.zzdn[v3_3];
                        int v5_2 = 0;
                        int v6_0 = 0;
                        while (((long) v6_0) < v1_5) {
                            com.google.android.gms.internal.fido.zzdr v7_1 = com.google.android.gms.internal.fido.zzds.zzb(p11, p12);
                            if (v5_2 != 0) {
                                if (v7_1.compareTo(v5_2) <= 0) {
                                    String v12_22 = v5_2.toString();
                                    com.google.android.gms.internal.fido.zzdr v1_9 = v7_1.toString();
                                    StringBuilder v2_6 = new StringBuilder();
                                    v2_6.append("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: ");
                                    v2_6.append(v12_22);
                                    v2_6.append("\nCurrent key: ");
                                    v2_6.append(v1_9);
                                    throw new com.google.android.gms.internal.fido.zzdh(v2_6.toString());
                                } else {
                                }
                            }
                            v4_11[v6_0] = new com.google.android.gms.internal.fido.zzdn(v7_1, com.google.android.gms.internal.fido.zzds.zzb(p11, p12));
                            v6_0++;
                            v5_2 = v7_1;
                        }
                        com.google.android.gms.internal.fido.zzdh v11_23 = new java.util.TreeMap();
                        while (v8 < v3_3) {
                            String v12_19 = v4_11[v8];
                            if (v11_23.containsKey(v12_19.zza())) {
                                throw new com.google.android.gms.internal.fido.zzdh("Attempted to add duplicate key to canonical CBOR Map.");
                            } else {
                                v11_23.put(v12_19.zza(), v12_19.zzb());
                                v8++;
                            }
                        }
                        return new com.google.android.gms.internal.fido.zzdo(com.google.android.gms.internal.fido.zzbg.zzf(v11_23));
                    }
                } else {
                    if (v4_4 == -64) {
                        throw new com.google.android.gms.internal.fido.zzdl("Tags are currently unsupported");
                    } else {
                        if (v4_4 == -32) {
                            return new com.google.android.gms.internal.fido.zzdj(p12.zzf());
                        } else {
                            if ((v4_4 == 0) || (v4_4 == 32)) {
                                long v4_2;
                                com.google.android.gms.internal.fido.zzdr v1_1 = p12.zzb();
                                if (v1_1 <= 0) {
                                    v4_2 = (~ v1_1);
                                } else {
                                    v4_2 = v1_1;
                                }
                                com.google.android.gms.internal.fido.zzds.zzc(v3_0, v4_2, p11, p12);
                                return new com.google.android.gms.internal.fido.zzdm(v1_1);
                            } else {
                                if (v4_4 == 64) {
                                    com.google.android.gms.internal.fido.zzdr v1_2 = p12.zzg();
                                    StringBuilder v2_0 = v1_2.length;
                                    com.google.android.gms.internal.fido.zzds.zzc(v3_0, ((long) v2_0), p11, p12);
                                    return new com.google.android.gms.internal.fido.zzdk(com.google.android.gms.internal.fido.zzcz.zzl(v1_2, 0, v2_0));
                                } else {
                                    if (v4_4 != 96) {
                                        String v12_8 = v2_4.zzc();
                                        StringBuilder v2_2 = new StringBuilder("Unidentifiable major type: ");
                                        v2_2.append(v12_8);
                                        throw new com.google.android.gms.internal.fido.zzdl(v2_2.toString());
                                    } else {
                                        com.google.android.gms.internal.fido.zzdr v1_3 = p12.zze();
                                        com.google.android.gms.internal.fido.zzds.zzc(v3_0, ((long) v1_3.length()), p11, p12);
                                        return new com.google.android.gms.internal.fido.zzdp(v1_3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static final void zzc(byte p2, long p3, java.io.InputStream p5, com.google.android.gms.internal.fido.zzdu p6)
    {
        switch (p2) {
            case 24:
                if (p3 < 24) {
                    StringBuilder v6_5 = new StringBuilder("Integer value ");
                    v6_5.append(p3);
                    v6_5.append(" after add info could have been represented in 0 additional bytes, but used 1");
                    throw new com.google.android.gms.internal.fido.zzdh(v6_5.toString());
                } else {
                }
                break;
            case 25:
                if (p3 < 256) {
                    StringBuilder v6_3 = new StringBuilder("Integer value ");
                    v6_3.append(p3);
                    v6_3.append(" after add info could have been represented in 0-1 additional bytes, but used 2");
                    throw new com.google.android.gms.internal.fido.zzdh(v6_3.toString());
                } else {
                }
                break;
            case 26:
                if (p3 < 65536) {
                    StringBuilder v6_1 = new StringBuilder("Integer value ");
                    v6_1.append(p3);
                    v6_1.append(" after add info could have been represented in 0-2 additional bytes, but used 4");
                    throw new com.google.android.gms.internal.fido.zzdh(v6_1.toString());
                } else {
                }
                break;
            case 27:
                if (p3 < 4294967296) {
                    StringBuilder v6_7 = new StringBuilder("Integer value ");
                    v6_7.append(p3);
                    v6_7.append(" after add info could have been represented in 0-4 additional bytes, but used 8");
                    throw new com.google.android.gms.internal.fido.zzdh(v6_7.toString());
                } else {
                }
                break;
            default:
        }
        return;
    }
}
