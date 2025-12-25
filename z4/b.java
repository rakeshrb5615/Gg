package z4;
public final class b implements android.os.Parcelable$Creator {
    public final synthetic int a;

    public synthetic b(int p1)
    {
        this.a = p1;
        return;
    }

    public final Object createFromParcel(android.os.Parcel p18)
    {
        switch (this.a) {
            case 0:
                android.os.Parcelable v0_10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                boolean v5_3 = 0;
                java.util.ArrayList v6_6 = 0;
                z4.e v7_9 = 0;
                int v8_6 = 0;
                z4.e v9_5 = 0;
                int v10_3 = 0;
                y4.g0 v12_3 = 0;
                z4.f v11_3 = 0;
                while (p18.dataPosition() < v0_10) {
                    int v2_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_6)) {
                        case 1:
                            v5_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v2_6);
                            break;
                        case 2:
                            v6_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v2_6);
                            break;
                        case 3:
                            v9_5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v2_6);
                            break;
                        case 4:
                            v8_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v2_6);
                            break;
                        case 5:
                            v7_9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v2_6);
                            break;
                        case 6:
                            v10_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v2_6);
                            break;
                        case 7:
                            v11_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p18, v2_6);
                            break;
                        case 8:
                            v12_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v2_6);
                            break;
                        default:
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v2_6);
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v0_10);
                return new z4.c(v5_3, v6_6, v7_9, v8_6, v9_5, v10_3, v11_3, v12_3);
            case 1:
                int v2_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                String v3_7 = 0;
                boolean v5_2 = 0;
                java.util.ArrayList v6_5 = 0;
                z4.e v7_6 = 0;
                int v8_3 = 0;
                z4.e v9_4 = 0;
                int v10_2 = 0;
                z4.f v11_0 = 0;
                y4.g0 v12_0 = 0;
                z4.o v13_0 = 0;
                java.util.ArrayList v14_0 = 0;
                boolean v15 = 0;
                String v4_9 = 0;
                while (p18.dataPosition() < v2_2) {
                    android.os.Parcelable v0_4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v0_4)) {
                        case 1:
                            v3_7 = ((com.google.android.gms.internal.firebase-auth-api.zzahv) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v0_4, com.google.android.gms.internal.firebase-auth-api.zzahv.CREATOR));
                            break;
                        case 2:
                            v4_9 = ((z4.c) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v0_4, z4.c.CREATOR));
                            break;
                        case 3:
                            v5_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v0_4);
                            break;
                        case 4:
                            v6_5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v0_4);
                            break;
                        case 5:
                            v7_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p18, v0_4, z4.c.CREATOR);
                            break;
                        case 6:
                            v8_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(p18, v0_4);
                            break;
                        case 7:
                            v9_4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v0_4);
                            break;
                        case 8:
                            v10_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBooleanObject(p18, v0_4);
                            break;
                        case 9:
                            v11_0 = ((z4.f) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v0_4, z4.f.CREATOR));
                            break;
                        case 10:
                            v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p18, v0_4);
                            break;
                        case 11:
                            v12_0 = ((y4.g0) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v0_4, y4.g0.CREATOR));
                            break;
                        case 12:
                            v13_0 = ((z4.o) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v0_4, z4.o.CREATOR));
                            break;
                        case 13:
                            v14_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p18, v0_4, y4.e0.CREATOR);
                            break;
                        default:
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v0_4);
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_2);
                android.os.Parcelable v0_3 = new z4.e();
                v0_3.a = v3_7;
                v0_3.b = v4_9;
                v0_3.c = v5_2;
                v0_3.d = v6_5;
                v0_3.e = v7_6;
                v0_3.f = v8_3;
                v0_3.m = v9_4;
                v0_3.n = v10_2;
                v0_3.o = v11_0;
                v0_3.p = v15;
                v0_3.q = v12_0;
                v0_3.r = v13_0;
                v0_3.s = v14_0;
                return v0_3;
            case 2:
                int v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                String v3_6 = 0;
                boolean v5_1 = 0;
                while (p18.dataPosition() < v2_1) {
                    z4.e v7_5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    int v8_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v7_5);
                    if (v8_2 == 1) {
                        v3_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p18, v7_5);
                    } else {
                        if (v8_2 == 2) {
                            v5_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p18, v7_5);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v7_5);
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_1);
                return new z4.f(v3_6, v5_1);
            case 3:
                int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                boolean v5_0 = 0;
                java.util.ArrayList v6_2 = 0;
                z4.e v7_3 = 0;
                int v8_0 = 0;
                z4.e v9_0 = 0;
                int v10_1 = 0;
                while (p18.dataPosition() < v2_0) {
                    String v3_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_2)) {
                        case 1:
                            v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p18, v3_2, y4.w.CREATOR);
                            break;
                        case 2:
                            v6_2 = ((z4.h) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v3_2, z4.h.CREATOR));
                            break;
                        case 3:
                            v7_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_2);
                            break;
                        case 4:
                            v8_0 = ((y4.g0) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v3_2, y4.g0.CREATOR));
                            break;
                        case 5:
                            v9_0 = ((z4.e) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v3_2, z4.e.CREATOR));
                            break;
                        case 6:
                            v10_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p18, v3_2, y4.z.CREATOR);
                            break;
                        default:
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v3_2);
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_0);
                return new z4.g(v5_0, v6_2, v7_3, v8_0, v9_0, v10_1);
            case 4:
                int v2_10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                String v3_18 = 0;
                String v4_20 = 0;
                boolean v5_10 = 0;
                java.util.ArrayList v6_0 = 0;
                z4.e v7_2 = 0;
                while (p18.dataPosition() < v2_10) {
                    int v8_12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    z4.e v9_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v8_12);
                    if (v9_6 == 1) {
                        v3_18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v8_12);
                    } else {
                        if (v9_6 == 2) {
                            v4_20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v8_12);
                        } else {
                            if (v9_6 == 3) {
                                v5_10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p18, v8_12, y4.w.CREATOR);
                            } else {
                                if (v9_6 == 4) {
                                    v6_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p18, v8_12, y4.z.CREATOR);
                                } else {
                                    if (v9_6 == 5) {
                                        v7_2 = ((z4.e) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v8_12, z4.e.CREATOR));
                                    } else {
                                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v8_12);
                                    }
                                }
                            }
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_10);
                z4.c0 v1_10 = new z4.h();
                v1_10.a = v3_18;
                v1_10.b = v4_20;
                v1_10.c = v5_10;
                v1_10.d = v6_0;
                v1_10.e = v7_2;
                return v1_10;
            case 5:
                int v2_8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                String v3_16 = 0;
                String v4_18 = 0;
                while (p18.dataPosition() < v2_8) {
                    boolean v5_9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    java.util.ArrayList v6_9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_9);
                    if (v6_9 == 1) {
                        v3_16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p18, v5_9, y4.w.CREATOR);
                    } else {
                        if (v6_9 == 2) {
                            v4_18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p18, v5_9, y4.z.CREATOR);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v5_9);
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_8);
                return new z4.o(v3_16, v4_18);
            case 6:
                int v2_9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                String v3_8 = 0;
                boolean v5_5 = 0;
                String v4_14 = 0;
                while (p18.dataPosition() < v2_9) {
                    java.util.ArrayList v6_4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    z4.e v7_7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v6_4);
                    if (v7_7 == 1) {
                        v3_8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v6_4);
                    } else {
                        if (v7_7 == 2) {
                            v4_14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v6_4);
                        } else {
                            if (v7_7 == 3) {
                                v5_5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p18, v6_4);
                            } else {
                                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v6_4);
                            }
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_9);
                return new z4.c0(v3_8, v4_14, v5_5);
            default:
                int v2_7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                String v3_13 = 0;
                String v4_15 = 0;
                boolean v5_4 = 0;
                while (p18.dataPosition() < v2_7) {
                    java.util.ArrayList v6_8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    z4.e v7_10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v6_8);
                    if (v7_10 == 1) {
                        v3_13 = ((z4.e) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v6_8, z4.e.CREATOR));
                    } else {
                        if (v7_10 == 2) {
                            v4_15 = ((z4.c0) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v6_8, z4.c0.CREATOR));
                        } else {
                            if (v7_10 == 3) {
                                v5_4 = ((y4.g0) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v6_8, y4.g0.CREATOR));
                            } else {
                                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v6_8);
                            }
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_7);
                z4.c0 v1_6 = new z4.d0();
                v1_6.a = v3_13;
                v1_6.b = v4_15;
                v1_6.c = v5_4;
                return v1_6;
        }
    }

    public final synthetic Object[] newArray(int p2)
    {
        switch (this.a) {
            case 0:
                z4.c0[] v2_3 = new z4.c[p2];
                return v2_3;
            case 1:
                z4.c0[] v2_2 = new z4.e[p2];
                return v2_2;
            case 2:
                z4.c0[] v2_1 = new z4.f[p2];
                return v2_1;
            case 3:
                z4.c0[] v2_8 = new z4.g[p2];
                return v2_8;
            case 4:
                z4.c0[] v2_7 = new z4.h[p2];
                return v2_7;
            case 5:
                z4.c0[] v2_6 = new z4.o[p2];
                return v2_6;
            case 6:
                z4.c0[] v2_5 = new z4.c0[p2];
                return v2_5;
            default:
                z4.c0[] v2_4 = new z4.d0[p2];
                return v2_4;
        }
    }
}
