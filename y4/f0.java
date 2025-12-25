package y4;
public final class f0 implements android.os.Parcelable$Creator {
    public final synthetic int a;

    public synthetic f0(int p1)
    {
        this.a = p1;
        return;
    }

    public final Object createFromParcel(android.os.Parcel p11)
    {
        switch (this.a) {
            case 0:
                int v0_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
                while (p11.dataPosition() < v0_3) {
                    android.os.Parcelable v1_9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_9);
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_9);
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0_3);
                return new y4.t();
            case 1:
                int v0_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
                int v3_8 = 0;
                String v4_2 = 0;
                String v5_1 = 0;
                String v6_1 = 0;
                String v7_1 = 0;
                boolean v8_1 = 0;
                String v9 = 0;
                while (p11.dataPosition() < v0_2) {
                    android.os.Parcelable v1_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
                    switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_6)) {
                        case 1:
                            v3_8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_6);
                            break;
                        case 2:
                            v4_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_6);
                            break;
                        case 3:
                            v5_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_6);
                            break;
                        case 4:
                            v6_1 = ((com.google.android.gms.internal.firebase-auth-api.zzajb) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p11, v1_6, com.google.android.gms.internal.firebase-auth-api.zzajb.CREATOR));
                            break;
                        case 5:
                            v7_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_6);
                            break;
                        case 6:
                            v8_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_6);
                            break;
                        case 7:
                            v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_6);
                            break;
                        default:
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_6);
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0_2);
                return new y4.g0(v3_8, v4_2, v5_1, v6_1, v7_1, v8_1, v9);
            case 2:
                int v0_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
                String v4_1 = 0;
                String v5_0 = 0;
                String v6_0 = 0;
                String v7_0 = 0;
                boolean v8_0 = 0;
                while (p11.dataPosition() < v0_1) {
                    android.os.Parcelable v1_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
                    android.os.Parcelable$Creator v2_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_2);
                    if (v2_2 == 1) {
                        v4_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_2);
                    } else {
                        if (v2_2 == 2) {
                            v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_2);
                        } else {
                            if (v2_2 == 3) {
                                v6_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_2);
                            } else {
                                if (v2_2 == 4) {
                                    v7_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_2);
                                } else {
                                    if (v2_2 == 5) {
                                        v8_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p11, v1_2);
                                    } else {
                                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_2);
                                    }
                                }
                            }
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0_1);
                return new y4.d(v4_1, v5_0, v6_0, v7_0, v8_0);
            default:
                int v0_4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
                android.os.Parcelable v1_0 = 0;
                while (p11.dataPosition() < v0_4) {
                    android.os.Parcelable$Creator v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
                    if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1) == 1) {
                        v1_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v2_1);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v2_1);
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0_4);
                return new y4.e(v1_0);
        }
    }

    public final synthetic Object[] newArray(int p2)
    {
        switch (this.a) {
            case 0:
                y4.d[] v2_3 = new y4.t[p2];
                return v2_3;
            case 1:
                y4.d[] v2_2 = new y4.g0[p2];
                return v2_2;
            case 2:
                y4.d[] v2_1 = new y4.d[p2];
                return v2_1;
            default:
                y4.d[] v2_4 = new y4.e[p2];
                return v2_4;
        }
    }
}
