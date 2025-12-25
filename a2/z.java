package a2;
public final class z implements android.os.Parcelable$Creator {
    public final synthetic int a;

    public synthetic z(int p1)
    {
        this.a = p1;
        return;
    }

    public final Object createFromParcel(android.os.Parcel p18)
    {
        switch (this.a) {
            case 0:
                boolean v2_53 = new a2.a0();
                v2_53.a = p18.readInt();
                v2_53.b = p18.readInt();
                ClassLoader v3_72 = 1;
                if (p18.readInt() != 1) {
                    v3_72 = 0;
                }
                v2_53.c = v3_72;
                return v2_53;
            case 1:
                boolean v2_51 = new a2.q1();
                v2_51.a = p18.readInt();
                v2_51.b = p18.readInt();
                int v4_25 = 1;
                if (p18.readInt() != 1) {
                    v4_25 = 0;
                }
                v2_51.d = v4_25;
                ClassLoader v3_68 = p18.readInt();
                if (v3_68 > null) {
                    ClassLoader v3_69 = new int[v3_68];
                    v2_51.c = v3_69;
                    p18.readIntArray(v3_69);
                }
                return v2_51;
            case 2:
                boolean v2_49 = new a2.r1();
                v2_49.a = p18.readInt();
                v2_49.b = p18.readInt();
                ClassLoader v3_54 = p18.readInt();
                v2_49.c = v3_54;
                if (v3_54 > null) {
                    ClassLoader v3_55 = new int[v3_54];
                    v2_49.d = v3_55;
                    p18.readIntArray(v3_55);
                }
                ClassLoader v3_56 = p18.readInt();
                v2_49.e = v3_56;
                if (v3_56 > null) {
                    ClassLoader v3_57 = new int[v3_56];
                    v2_49.f = v3_57;
                    p18.readIntArray(v3_57);
                }
                ClassLoader v3_59;
                int v4_24 = 0;
                if (p18.readInt() != 1) {
                    v3_59 = 0;
                } else {
                    v3_59 = 1;
                }
                ClassLoader v3_61;
                v2_49.n = v3_59;
                if (p18.readInt() != 1) {
                    v3_61 = 0;
                } else {
                    v3_61 = 1;
                }
                v2_49.o = v3_61;
                if (p18.readInt() == 1) {
                    v4_24 = 1;
                }
                v2_49.p = v4_24;
                v2_49.m = p18.readArrayList(a2.q1.getClassLoader());
                return v2_49;
            case 3:
                return new androidx.fragment.app.b(p18);
            case 4:
                return new androidx.fragment.app.c(p18);
            case 5:
                boolean v2_42 = new androidx.fragment.app.y0();
                v2_42.a = p18.readString();
                v2_42.b = p18.readInt();
                return v2_42;
            case 6:
                boolean v2_40 = new androidx.fragment.app.d1();
                v2_40.e = 0;
                v2_40.f = new java.util.ArrayList();
                v2_40.m = new java.util.ArrayList();
                v2_40.a = p18.createStringArrayList();
                v2_40.b = p18.createStringArrayList();
                v2_40.c = ((androidx.fragment.app.b[]) p18.createTypedArray(androidx.fragment.app.b.CREATOR));
                v2_40.d = p18.readInt();
                v2_40.e = p18.readString();
                v2_40.f = p18.createStringArrayList();
                v2_40.m = p18.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                v2_40.n = p18.createTypedArrayList(androidx.fragment.app.y0.CREATOR);
                return v2_40;
            case 7:
                return new androidx.fragment.app.h1(p18);
            case 8:
                return new com.google.android.material.datepicker.b(((com.google.android.material.datepicker.s) p18.readParcelable(com.google.android.material.datepicker.s.getClassLoader())), ((com.google.android.material.datepicker.s) p18.readParcelable(com.google.android.material.datepicker.s.getClassLoader())), ((com.google.android.material.datepicker.d) p18.readParcelable(com.google.android.material.datepicker.d.getClassLoader())), ((com.google.android.material.datepicker.s) p18.readParcelable(com.google.android.material.datepicker.s.getClassLoader())), p18.readInt());
            case 9:
                return new com.google.android.material.datepicker.d(p18.readLong());
            case 10:
                return com.google.android.material.datepicker.s.a(p18.readInt(), p18.readInt());
            case 11:
                java.util.ArrayList v1_23;
                kotlin.jvm.internal.j.e(p18, "parcel");
                ClassLoader v3_28 = p18.readInt();
                if (p18.readInt() != 0) {
                    v1_23 = ((android.content.Intent) android.content.Intent.CREATOR.createFromParcel(p18));
                } else {
                    v1_23 = 0;
                }
                return new e.a(v3_28, v1_23);
            case 12:
                kotlin.jvm.internal.j.e(p18, "inParcel");
                ClassLoader v3_26 = p18.readParcelable(android.content.IntentSender.getClassLoader());
                kotlin.jvm.internal.j.b(v3_26);
                return new e.k(((android.content.IntentSender) v3_26), ((android.content.Intent) p18.readParcelable(android.content.Intent.getClassLoader())), p18.readInt(), p18.readInt());
            case 13:
                return new androidx.versionedparcelable.ParcelImpl(p18);
            case 14:
                java.util.ArrayList v1_20;
                android.os.Parcelable vtmp43 = p18.readParcelable(h4.a.getClassLoader());
                if (p18.readInt() == 0) {
                    v1_20 = 0;
                } else {
                    v1_20 = 1;
                }
                return new h4.b(((android.app.PendingIntent) vtmp43), v1_20);
            case 15:
                boolean v2_15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                ClassLoader v3_20 = 0;
                while (p18.dataPosition() < v2_15) {
                    int v4_14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_14) == 2) {
                        v3_20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(p18, v4_14);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v4_14);
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_15);
                return new j6.q(v3_20);
            case 16:
                boolean v2_14 = new k3.b(p18);
                v2_14.a = ((Integer) p18.readValue(k3.b.getClassLoader())).intValue();
                return v2_14;
            case 17:
                java.util.ArrayList v1_13;
                boolean v2_12 = new n.p0(p18);
                if (p18.readByte() == 0) {
                    v1_13 = 0;
                } else {
                    v1_13 = 1;
                }
                v2_12.a = v1_13;
                return v2_12;
            case 18:
                boolean v2_10 = new t0.g(p18);
                v2_10.a = p18.readInt();
                return v2_10;
            case 19:
                boolean v2_7 = new x3.d(p18);
                v2_7.a = p18.readFloat();
                v2_7.b = p18.readFloat();
                ClassLoader v3_14 = new java.util.ArrayList();
                v2_7.c = v3_14;
                p18.readList(v3_14, Float.getClassLoader());
                v2_7.d = p18.readFloat();
                v2_7.e = p18.createBooleanArray()[0];
                return v2_7;
            case 20:
                boolean v2_5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                String v6_6 = 0;
                long v7_7 = 0;
                String v8_4 = 0;
                String v9_2 = 0;
                com.google.android.gms.internal.firebase-auth-api.zzaiz v11_1 = 0;
                String v13 = 0;
                String v15 = 0;
                String v16 = 0;
                boolean v10_2 = 0;
                boolean v12 = 0;
                int v14 = 0;
                while (p18.dataPosition() < v2_5) {
                    ClassLoader v3_10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_10)) {
                        case 1:
                            v6_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_10);
                            break;
                        case 2:
                            v7_7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_10);
                            break;
                        case 3:
                            v8_4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_10);
                            break;
                        case 4:
                            v9_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_10);
                            break;
                        case 5:
                            v10_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p18, v3_10);
                            break;
                        case 6:
                            v11_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_10);
                            break;
                        case 7:
                            v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p18, v3_10);
                            break;
                        case 8:
                            v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_10);
                            break;
                        case 9:
                            v14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p18, v3_10);
                            break;
                        case 10:
                            v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_10);
                            break;
                        case 11:
                            v16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_10);
                            break;
                        default:
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v3_10);
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_5);
                return new y4.a(v6_6, v7_7, v8_4, v9_2, v10_2, v11_1, v12, v13, v14, v15, v16);
            case 21:
                boolean v2_4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                ClassLoader v3_6 = 0;
                while (p18.dataPosition() < v2_4) {
                    int v4_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_6) == 1) {
                        v3_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v4_6);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v4_6);
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_4);
                return new y4.m(v3_6);
            case 22:
                boolean v2_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                ClassLoader v3_5 = 0;
                int v4_4 = 0;
                while (p18.dataPosition() < v2_2) {
                    int v5_14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    String v6_4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_14);
                    if (v6_4 == 1) {
                        v3_5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v5_14);
                    } else {
                        if (v6_4 == 2) {
                            v4_4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v5_14);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v5_14);
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_2);
                return new y4.n(v3_5, v4_4);
            case 23:
                boolean v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                ClassLoader v3_4 = 0;
                int v4_3 = 0;
                int v5_12 = 0;
                while (p18.dataPosition() < v2_1) {
                    String v6_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    long v7_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v6_2);
                    if (v7_2 == 1) {
                        v3_4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v6_2);
                    } else {
                        if (v7_2 == 2) {
                            v4_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v6_2);
                        } else {
                            if (v7_2 == 3) {
                                v5_12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v6_2);
                            } else {
                                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v6_2);
                            }
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_1);
                return new y4.e0(v3_4, v4_3, v5_12);
            case 24:
                boolean v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                String v6_0 = 0;
                long v7_1 = 0;
                String v8_0 = 0;
                String v9_1 = 0;
                boolean v10_1 = 0;
                while (p18.dataPosition() < v2_0) {
                    ClassLoader v3_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    int v4_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_3);
                    if (v4_2 == 1) {
                        v6_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_3);
                    } else {
                        if (v4_2 == 2) {
                            v7_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_3);
                        } else {
                            if (v4_2 == 4) {
                                v8_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_3);
                            } else {
                                if (v4_2 == 5) {
                                    v10_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p18, v3_3);
                                } else {
                                    if (v4_2 == 6) {
                                        v9_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_3);
                                    } else {
                                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v3_3);
                                    }
                                }
                            }
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_0);
                return new y4.s(v6_0, v7_1, v8_0, v9_1, v10_1);
            case 25:
                boolean v2_57 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                String v9_0 = 0;
                boolean v10_0 = 0;
                com.google.android.gms.internal.firebase-auth-api.zzaiz v11_0 = 0;
                long v7_0 = 0;
                while (p18.dataPosition() < v2_57) {
                    ClassLoader v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_0);
                    if (v4_0 == 1) {
                        v9_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_0);
                    } else {
                        if (v4_0 == 2) {
                            v10_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_0);
                        } else {
                            if (v4_0 == 3) {
                                v7_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p18, v3_0);
                            } else {
                                if (v4_0 == 4) {
                                    v11_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_0);
                                } else {
                                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v3_0);
                                }
                            }
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_57);
                return new y4.w(v7_0, v9_0, v10_0, v11_0);
            case 26:
                boolean v2_56 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                ClassLoader v3_75 = 0;
                while (p18.dataPosition() < v2_56) {
                    int v4_29 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_29) == 1) {
                        v3_75 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v4_29);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v4_29);
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_56);
                return new y4.x(v3_75);
            case 27:
                boolean v2_8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                long v7_8 = 0;
                String v8_5 = 0;
                com.google.android.gms.internal.firebase-auth-api.zzaiz v11_2 = 0;
                String v9_3 = 0;
                while (p18.dataPosition() < v2_8) {
                    ClassLoader v3_34 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    int v4_23 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_34);
                    if (v4_23 == 1) {
                        v7_8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_34);
                    } else {
                        if (v4_23 == 2) {
                            v8_5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v3_34);
                        } else {
                            if (v4_23 == 3) {
                                v9_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p18, v3_34);
                            } else {
                                if (v4_23 == 4) {
                                    v11_2 = ((com.google.android.gms.internal.firebase-auth-api.zzaiz) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p18, v3_34, com.google.android.gms.internal.firebase-auth-api.zzaiz.CREATOR));
                                } else {
                                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v3_34);
                                }
                            }
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_8);
                return new y4.z(v7_8, v8_5, v9_3, v11_2);
            case 28:
                boolean v2_43 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                ClassLoader v3_7 = 0;
                int v4_8 = 0;
                while (p18.dataPosition() < v2_43) {
                    int v5_11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    String v6_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_11);
                    if (v6_3 == 1) {
                        v3_7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v5_11);
                    } else {
                        if (v6_3 == 2) {
                            v4_8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v5_11);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v5_11);
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_43);
                return new y4.a0(v3_7, v4_8);
            default:
                boolean v2_54 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p18);
                ClassLoader v3_73 = 0;
                int v4_26 = 0;
                String v6_12 = 0;
                long v7_11 = 0;
                int v5_27 = 0;
                while (p18.dataPosition() < v2_54) {
                    String v8_9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p18);
                    String v9_5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v8_9);
                    if (v9_5 == 2) {
                        v6_12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v8_9);
                    } else {
                        if (v9_5 == 3) {
                            v7_11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p18, v8_9);
                        } else {
                            if (v9_5 == 4) {
                                v4_26 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p18, v8_9);
                            } else {
                                if (v9_5 == 5) {
                                    v5_27 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p18, v8_9);
                                } else {
                                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p18, v8_9);
                                }
                            }
                        }
                    }
                }
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p18, v2_54);
                java.util.ArrayList v1_31 = new y4.c0();
                v1_31.a = v6_12;
                v1_31.b = v7_11;
                v1_31.c = v4_26;
                v1_31.d = v5_27;
                if (!android.text.TextUtils.isEmpty(v7_11)) {
                    v3_73 = android.net.Uri.parse(v7_11);
                }
                v1_31.e = v3_73;
                return v1_31;
        }
    }

    public final Object[] newArray(int p2)
    {
        switch (this.a) {
            case 0:
                y4.a0[] v2_27 = new a2.a0[p2];
                return v2_27;
            case 1:
                y4.a0[] v2_26 = new a2.q1[p2];
                return v2_26;
            case 2:
                y4.a0[] v2_25 = new a2.r1[p2];
                return v2_25;
            case 3:
                y4.a0[] v2_24 = new androidx.fragment.app.b[p2];
                return v2_24;
            case 4:
                y4.a0[] v2_23 = new androidx.fragment.app.c[p2];
                return v2_23;
            case 5:
                y4.a0[] v2_22 = new androidx.fragment.app.y0[p2];
                return v2_22;
            case 6:
                y4.a0[] v2_21 = new androidx.fragment.app.d1[p2];
                return v2_21;
            case 7:
                y4.a0[] v2_20 = new androidx.fragment.app.h1[p2];
                return v2_20;
            case 8:
                y4.a0[] v2_19 = new com.google.android.material.datepicker.b[p2];
                return v2_19;
            case 9:
                y4.a0[] v2_18 = new com.google.android.material.datepicker.d[p2];
                return v2_18;
            case 10:
                y4.a0[] v2_16 = new com.google.android.material.datepicker.s[p2];
                return v2_16;
            case 11:
                y4.a0[] v2_15 = new e.a[p2];
                return v2_15;
            case 12:
                y4.a0[] v2_14 = new e.k[p2];
                return v2_14;
            case 13:
                y4.a0[] v2_13 = new androidx.versionedparcelable.ParcelImpl[p2];
                return v2_13;
            case 14:
                y4.a0[] v2_12 = new h4.a[p2];
                return v2_12;
            case 15:
                y4.a0[] v2_11 = new j6.q[p2];
                return v2_11;
            case 16:
                y4.a0[] v2_10 = new k3.b[p2];
                return v2_10;
            case 17:
                y4.a0[] v2_9 = new n.p0[p2];
                return v2_9;
            case 18:
                y4.a0[] v2_8 = new t0.g[p2];
                return v2_8;
            case 19:
                y4.a0[] v2_7 = new x3.d[p2];
                return v2_7;
            case 20:
                y4.a0[] v2_5 = new y4.a[p2];
                return v2_5;
            case 21:
                y4.a0[] v2_4 = new y4.m[p2];
                return v2_4;
            case 22:
                y4.a0[] v2_3 = new y4.n[p2];
                return v2_3;
            case 23:
                y4.a0[] v2_2 = new y4.e0[p2];
                return v2_2;
            case 24:
                y4.a0[] v2_1 = new y4.s[p2];
                return v2_1;
            case 25:
                y4.a0[] v2_30 = new y4.w[p2];
                return v2_30;
            case 26:
                y4.a0[] v2_28 = new y4.x[p2];
                return v2_28;
            case 27:
                y4.a0[] v2_17 = new y4.z[p2];
                return v2_17;
            case 28:
                y4.a0[] v2_6 = new y4.a0[p2];
                return v2_6;
            default:
                y4.a0[] v2_29 = new y4.c0[p2];
                return v2_29;
        }
    }
}
