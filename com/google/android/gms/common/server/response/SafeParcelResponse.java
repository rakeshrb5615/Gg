package com.google.android.gms.common.server.response;
public class SafeParcelResponse extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zaa;
    private final android.os.Parcel zab;
    private final int zac;
    private final com.google.android.gms.common.server.response.zan zad;
    private final String zae;
    private int zaf;
    private int zag;

    static SafeParcelResponse()
    {
        com.google.android.gms.common.server.response.SafeParcelResponse.CREATOR = new com.google.android.gms.common.server.response.zaq();
        return;
    }

    public SafeParcelResponse(int p1, android.os.Parcel p2, com.google.android.gms.common.server.response.zan p3)
    {
        String v2_1;
        this.zaa = p1;
        this.zab = ((android.os.Parcel) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zac = 2;
        this.zad = p3;
        if (p3 != null) {
            v2_1 = p3.zaa();
        } else {
            v2_1 = 0;
        }
        this.zae = v2_1;
        this.zaf = 2;
        return;
    }

    private SafeParcelResponse(com.google.android.gms.common.internal.safeparcel.SafeParcelable p4, com.google.android.gms.common.server.response.zan p5, String p6)
    {
        this.zaa = 1;
        android.os.Parcel v1 = android.os.Parcel.obtain();
        this.zab = v1;
        p4.writeToParcel(v1, 0);
        this.zac = 1;
        this.zad = ((com.google.android.gms.common.server.response.zan) com.google.android.gms.common.internal.Preconditions.checkNotNull(p5));
        this.zae = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6));
        this.zaf = 2;
        return;
    }

    public SafeParcelResponse(com.google.android.gms.common.server.response.zan p2, String p3)
    {
        this.zaa = 1;
        this.zab = android.os.Parcel.obtain();
        this.zac = 0;
        this.zad = ((com.google.android.gms.common.server.response.zan) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zae = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        this.zaf = 0;
        return;
    }

    public static com.google.android.gms.common.server.response.SafeParcelResponse from(com.google.android.gms.common.server.response.FastJsonResponse p3)
    {
        String v0_3 = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3.getClass().getCanonicalName()));
        com.google.android.gms.common.server.response.zan v1_0 = new com.google.android.gms.common.server.response.zan(p3.getClass());
        com.google.android.gms.common.server.response.SafeParcelResponse.zaF(v1_0, p3);
        v1_0.zac();
        v1_0.zad();
        return new com.google.android.gms.common.server.response.SafeParcelResponse(((com.google.android.gms.common.internal.safeparcel.SafeParcelable) p3), v1_0, v0_3);
    }

    private static void zaF(com.google.android.gms.common.server.response.zan p3, com.google.android.gms.common.server.response.FastJsonResponse p4)
    {
        IllegalStateException v0_0 = p4.getClass();
        if (!p3.zaf(v0_0)) {
            String v4_13 = p4.getFieldMappings();
            p3.zae(v0_0, v4_13);
            IllegalStateException v0_1 = v4_13.keySet().iterator();
            while (v0_1.hasNext()) {
                String v1_4 = ((com.google.android.gms.common.server.response.FastJsonResponse$Field) v4_13.get(((String) v0_1.next())));
                com.google.android.gms.common.server.response.FastJsonResponse v2_0 = v1_4.zag;
                if (v2_0 != null) {
                    try {
                        com.google.android.gms.common.server.response.SafeParcelResponse.zaF(p3, ((com.google.android.gms.common.server.response.FastJsonResponse) v2_0.newInstance()));
                    } catch (IllegalAccessException v3_2) {
                        throw new IllegalStateException("Could not instantiate an object of type ".concat(String.valueOf(((Class) com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_4.zag)).getCanonicalName())), v3_2);
                    } catch (IllegalAccessException v3_1) {
                        throw new IllegalStateException("Could not access object of type ".concat(String.valueOf(((Class) com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_4.zag)).getCanonicalName())), v3_1);
                    }
                }
            }
        }
        return;
    }

    private final void zaG(com.google.android.gms.common.server.response.FastJsonResponse$Field p3)
    {
        if (p3.zaf == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        } else {
            IllegalStateException v3_8 = this.zab;
            if (v3_8 == null) {
                throw new IllegalStateException("Internal Parcel object is null.");
            } else {
                String v0_2 = this.zaf;
                if (v0_2 == null) {
                    this.zag = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(v3_8);
                    this.zaf = 1;
                    return;
                } else {
                    if (v0_2 != 1) {
                        throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private final void zaH(StringBuilder p11, java.util.Map p12, android.os.Parcel p13)
    {
        String v0_1 = new android.util.SparseArray();
        String v12_11 = p12.entrySet().iterator();
        while (v12_11.hasNext()) {
            int v1_2 = ((java.util.Map$Entry) v12_11.next());
            v0_1.put(((com.google.android.gms.common.server.response.FastJsonResponse$Field) v1_2.getValue()).getSafeParcelableFieldId(), v1_2);
        }
        p11.append(123);
        String v12_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p13);
        String v2_12 = 0;
        while (p13.dataPosition() < v12_1) {
            java.util.Map v3_4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p13);
            int v4_2 = ((java.util.Map$Entry) v0_1.get(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_4)));
            if (v4_2 != 0) {
                if (v2_12 != null) {
                    p11.append(",");
                }
                String v2_55 = ((String) v4_2.getKey());
                int v4_4 = ((com.google.android.gms.common.server.response.FastJsonResponse$Field) v4_2.getValue());
                p11.append("\"");
                p11.append(v2_55);
                p11.append("\":");
                if (!v4_4.zaj()) {
                    if (!v4_4.zad) {
                        switch (v4_4.zac) {
                            case 0:
                                p11.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v3_4));
                                break;
                            case 1:
                                p11.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(p13, v3_4));
                                break;
                            case 2:
                                p11.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p13, v3_4));
                                break;
                            case 3:
                                p11.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(p13, v3_4));
                                break;
                            case 4:
                                p11.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(p13, v3_4));
                                break;
                            case 5:
                                p11.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(p13, v3_4));
                                break;
                            case 6:
                                p11.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p13, v3_4));
                                break;
                            case 7:
                                String v2_3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v3_4);
                                p11.append("\"");
                                p11.append(com.google.android.gms.common.util.JsonUtils.escapeString(v2_3));
                                p11.append("\"");
                                break;
                            case 8:
                                String v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p13, v3_4);
                                p11.append("\"");
                                p11.append(com.google.android.gms.common.util.Base64Utils.encode(v2_1));
                                p11.append("\"");
                                break;
                            case 9:
                                String v2_63 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p13, v3_4);
                                p11.append("\"");
                                p11.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(v2_63));
                                p11.append("\"");
                                break;
                            case 10:
                                String v2_61 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(p13, v3_4);
                                java.util.Map v3_6 = v2_61.keySet();
                                p11.append("{");
                                java.util.Map v3_7 = v3_6.iterator();
                                int v4_6 = 1;
                                while (v3_7.hasNext()) {
                                    java.util.Map v8_7 = ((String) v3_7.next());
                                    if (v4_6 == 0) {
                                        p11.append(",");
                                    }
                                    p11.append("\"");
                                    p11.append(v8_7);
                                    p11.append("\":\"");
                                    p11.append(com.google.android.gms.common.util.JsonUtils.escapeString(v2_61.getString(v8_7)));
                                    p11.append("\"");
                                    v4_6 = 0;
                                }
                                p11.append("}");
                                break;
                            case 11:
                                String v2_60 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcel(p13, v3_4);
                                v2_60.setDataPosition(0);
                                this.zaH(p11, v4_4.zah(), v2_60);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    } else {
                        p11.append("[");
                        switch (v4_4.zac) {
                            case 0:
                                com.google.android.gms.common.util.ArrayUtils.writeArray(p11, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(p13, v3_4));
                                break;
                            case 1:
                                com.google.android.gms.common.util.ArrayUtils.writeArray(p11, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigIntegerArray(p13, v3_4));
                                break;
                            case 2:
                                com.google.android.gms.common.util.ArrayUtils.writeArray(p11, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createLongArray(p13, v3_4));
                                break;
                            case 3:
                                com.google.android.gms.common.util.ArrayUtils.writeArray(p11, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createFloatArray(p13, v3_4));
                                break;
                            case 4:
                                com.google.android.gms.common.util.ArrayUtils.writeArray(p11, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createDoubleArray(p13, v3_4));
                                break;
                            case 5:
                                com.google.android.gms.common.util.ArrayUtils.writeArray(p11, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimalArray(p13, v3_4));
                                break;
                            case 6:
                                com.google.android.gms.common.util.ArrayUtils.writeArray(p11, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBooleanArray(p13, v3_4));
                                break;
                            case 7:
                                com.google.android.gms.common.util.ArrayUtils.writeStringArray(p11, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(p13, v3_4));
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                                break;
                            case 11:
                                String v2_15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelArray(p13, v3_4);
                                java.util.Map v3_0 = v2_15.length;
                                int v6_0 = 0;
                                while (v6_0 < v3_0) {
                                    if (v6_0 > 0) {
                                        p11.append(",");
                                    }
                                    v2_15[v6_0].setDataPosition(0);
                                    this.zaH(p11, v4_4.zah(), v2_15[v6_0]);
                                    v6_0++;
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        p11.append("]");
                    }
                } else {
                    String v2_25 = v4_4.zac;
                    switch (v2_25) {
                        case 0:
                            com.google.android.gms.common.server.response.SafeParcelResponse.zaJ(p11, v4_4, com.google.android.gms.common.server.response.FastJsonResponse.zaD(v4_4, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v3_4))));
                            break;
                        case 1:
                            com.google.android.gms.common.server.response.SafeParcelResponse.zaJ(p11, v4_4, com.google.android.gms.common.server.response.FastJsonResponse.zaD(v4_4, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(p13, v3_4)));
                            break;
                        case 2:
                            com.google.android.gms.common.server.response.SafeParcelResponse.zaJ(p11, v4_4, com.google.android.gms.common.server.response.FastJsonResponse.zaD(v4_4, Long.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p13, v3_4))));
                            break;
                        case 3:
                            com.google.android.gms.common.server.response.SafeParcelResponse.zaJ(p11, v4_4, com.google.android.gms.common.server.response.FastJsonResponse.zaD(v4_4, Float.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(p13, v3_4))));
                            break;
                        case 4:
                            com.google.android.gms.common.server.response.SafeParcelResponse.zaJ(p11, v4_4, com.google.android.gms.common.server.response.FastJsonResponse.zaD(v4_4, Double.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(p13, v3_4))));
                            break;
                        case 5:
                            com.google.android.gms.common.server.response.SafeParcelResponse.zaJ(p11, v4_4, com.google.android.gms.common.server.response.FastJsonResponse.zaD(v4_4, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(p13, v3_4)));
                            break;
                        case 6:
                            com.google.android.gms.common.server.response.SafeParcelResponse.zaJ(p11, v4_4, com.google.android.gms.common.server.response.FastJsonResponse.zaD(v4_4, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p13, v3_4))));
                            break;
                        case 7:
                            com.google.android.gms.common.server.response.SafeParcelResponse.zaJ(p11, v4_4, com.google.android.gms.common.server.response.FastJsonResponse.zaD(v4_4, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v3_4)));
                            break;
                        case 8:
                        case 9:
                            com.google.android.gms.common.server.response.SafeParcelResponse.zaJ(p11, v4_4, com.google.android.gms.common.server.response.FastJsonResponse.zaD(v4_4, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p13, v3_4)));
                            break;
                        case 10:
                            String v2_26 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(p13, v3_4);
                            java.util.Map v3_3 = new java.util.HashMap();
                            java.util.Iterator v5_1 = v2_26.keySet().iterator();
                            while (v5_1.hasNext()) {
                                int v6_3 = ((String) v5_1.next());
                                v3_3.put(v6_3, ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_26.getString(v6_3))));
                            }
                            com.google.android.gms.common.server.response.SafeParcelResponse.zaJ(p11, v4_4, com.google.android.gms.common.server.response.FastJsonResponse.zaD(v4_4, v3_3));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                            break;
                        default:
                            throw new IllegalArgumentException(g2.g.c(v2_25, "Unknown field out type = "));
                    }
                }
                v2_12 = 1;
            }
        }
        if (p13.dataPosition() != v12_1) {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException(g2.g.c(v12_1, "Overread allowed size end="), p13);
        } else {
            p11.append(125);
            return;
        }
    }

    private static final void zaI(StringBuilder p1, int p2, Object p3)
    {
        switch (p2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                p1.append(p3);
                return;
            case 7:
                p1.append("\"");
                p1.append(com.google.android.gms.common.util.JsonUtils.escapeString(com.google.android.gms.common.internal.Preconditions.checkNotNull(p3).toString()));
                p1.append("\"");
                return;
            case 8:
                p1.append("\"");
                p1.append(com.google.android.gms.common.util.Base64Utils.encode(((byte[]) p3)));
                p1.append("\"");
                return;
            case 9:
                p1.append("\"");
                p1.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(((byte[]) p3)));
                p1.append("\"");
                return;
            case 10:
                com.google.android.gms.common.util.MapUtils.writeStringMapToJson(p1, ((java.util.HashMap) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3)));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
                break;
            default:
                throw new IllegalArgumentException(g2.g.c(p2, "Unknown type = "));
        }
    }

    private static final void zaJ(StringBuilder p4, com.google.android.gms.common.server.response.FastJsonResponse$Field p5, Object p6)
    {
        if (!p5.zab) {
            com.google.android.gms.common.server.response.SafeParcelResponse.zaI(p4, p5.zaa, p6);
            return;
        } else {
            p4.append("[");
            int v0_2 = ((java.util.ArrayList) p6).size();
            int v1 = 0;
            while (v1 < v0_2) {
                if (v1 != 0) {
                    p4.append(",");
                }
                com.google.android.gms.common.server.response.SafeParcelResponse.zaI(p4, p5.zaa, ((java.util.ArrayList) p6).get(v1));
                v1++;
            }
            p4.append("]");
            return;
        }
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p4, String p5, java.util.ArrayList p6)
    {
        this.zaG(p4);
        java.util.ArrayList v5_1 = new java.util.ArrayList();
        ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6)).size();
        int v0_3 = p6.size();
        int v1 = 0;
        while (v1 < v0_3) {
            v5_1.add(((com.google.android.gms.common.server.response.SafeParcelResponse) ((com.google.android.gms.common.server.response.FastJsonResponse) p6.get(v1))).zaE());
            v1++;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelList(this.zab, p4.getSafeParcelableFieldId(), v5_1, 1);
        return;
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, String p3, com.google.android.gms.common.server.response.FastJsonResponse p4)
    {
        this.zaG(p2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(this.zab, p2.getSafeParcelableFieldId(), ((com.google.android.gms.common.server.response.SafeParcelResponse) p4).zaE(), 1);
        return;
    }

    public final java.util.Map getFieldMappings()
    {
        java.util.Map v0_0 = this.zad;
        if (v0_0 != null) {
            return v0_0.zab(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zae)));
        } else {
            return 0;
        }
    }

    public final Object getValueObject(String p2)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final boolean isPrimitiveFieldSet(String p2)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, boolean p3)
    {
        this.zaG(p1);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(this.zab, p1.getSafeParcelableFieldId(), p3);
        return;
    }

    public final void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, String p3, byte[] p4)
    {
        this.zaG(p2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(this.zab, p2.getSafeParcelableFieldId(), p4, 1);
        return;
    }

    public final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, int p3)
    {
        this.zaG(p1);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(this.zab, p1.getSafeParcelableFieldId(), p3);
        return;
    }

    public final void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, long p3)
    {
        this.zaG(p1);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(this.zab, p1.getSafeParcelableFieldId(), p3);
        return;
    }

    public final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, String p3, String p4)
    {
        this.zaG(p2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(this.zab, p2.getSafeParcelableFieldId(), p4, 1);
        return;
    }

    public final void setStringMapInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p4, String p5, java.util.Map p6)
    {
        this.zaG(p4);
        android.os.Bundle v5_1 = new android.os.Bundle();
        int v0_4 = ((java.util.Map) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6)).keySet().iterator();
        while (v0_4.hasNext()) {
            String v1_2 = ((String) v0_4.next());
            v5_1.putString(v1_2, ((String) p6.get(v1_2)));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(this.zab, p4.getSafeParcelableFieldId(), v5_1, 1);
        return;
    }

    public final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p4, String p5, java.util.ArrayList p6)
    {
        this.zaG(p4);
        android.os.Parcel v5_2 = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6)).size();
        String[] v0 = new String[v5_2];
        int v1 = 0;
        while (v1 < v5_2) {
            v0[v1] = ((String) p6.get(v1));
            v1++;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(this.zab, p4.getSafeParcelableFieldId(), v0, 1);
        return;
    }

    public final String toString()
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        String v0_2 = this.zaE();
        v0_2.setDataPosition(0);
        StringBuilder v1_3 = new StringBuilder(100);
        this.zaH(v1_3, ((java.util.Map) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad.zab(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zae))))), v0_2);
        return v1_3.toString();
    }

    public final void writeToParcel(android.os.Parcel p6, int p7)
    {
        com.google.android.gms.common.server.response.zan v0_2;
        com.google.android.gms.common.server.response.zan v0_0 = this.zaa;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(p6, 2, this.zaE(), 0);
        com.google.android.gms.common.server.response.zan v0_1 = this.zac;
        if (v0_1 == null) {
            v0_2 = 0;
        } else {
            if (v0_1 == 1) {
                v0_2 = this.zad;
            } else {
                v0_2 = this.zad;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p6, 3, v0_2, p7, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, v1);
        return;
    }

    public final android.os.Parcel zaE()
    {
        android.os.Parcel v0_0 = this.zaf;
        if (v0_0 == null) {
            android.os.Parcel v0_4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(this.zab);
            this.zag = v0_4;
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(this.zab, v0_4);
            this.zaf = 2;
        } else {
            if (v0_0 == 1) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
                this.zaf = 2;
            }
        }
        return this.zab;
    }

    public final void zab(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, String p3, java.math.BigDecimal p4)
    {
        this.zaG(p2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimal(this.zab, p2.getSafeParcelableFieldId(), p4, 1);
        return;
    }

    public final void zad(com.google.android.gms.common.server.response.FastJsonResponse$Field p4, String p5, java.util.ArrayList p6)
    {
        this.zaG(p4);
        android.os.Parcel v5_2 = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6)).size();
        java.math.BigDecimal[] v0 = new java.math.BigDecimal[v5_2];
        int v1 = 0;
        while (v1 < v5_2) {
            v0[v1] = ((java.math.BigDecimal) p6.get(v1));
            v1++;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimalArray(this.zab, p4.getSafeParcelableFieldId(), v0, 1);
        return;
    }

    public final void zaf(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, String p3, java.math.BigInteger p4)
    {
        this.zaG(p2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigInteger(this.zab, p2.getSafeParcelableFieldId(), p4, 1);
        return;
    }

    public final void zah(com.google.android.gms.common.server.response.FastJsonResponse$Field p4, String p5, java.util.ArrayList p6)
    {
        this.zaG(p4);
        android.os.Parcel v5_2 = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6)).size();
        java.math.BigInteger[] v0 = new java.math.BigInteger[v5_2];
        int v1 = 0;
        while (v1 < v5_2) {
            v0[v1] = ((java.math.BigInteger) p6.get(v1));
            v1++;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigIntegerArray(this.zab, p4.getSafeParcelableFieldId(), v0, 1);
        return;
    }

    public final void zak(com.google.android.gms.common.server.response.FastJsonResponse$Field p4, String p5, java.util.ArrayList p6)
    {
        this.zaG(p4);
        android.os.Parcel v5_2 = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6)).size();
        boolean[] v0 = new boolean[v5_2];
        int v1 = 0;
        while (v1 < v5_2) {
            v0[v1] = ((Boolean) p6.get(v1)).booleanValue();
            v1++;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanArray(this.zab, p4.getSafeParcelableFieldId(), v0, 1);
        return;
    }

    public final void zan(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, double p3)
    {
        this.zaG(p1);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(this.zab, p1.getSafeParcelableFieldId(), p3);
        return;
    }

    public final void zap(com.google.android.gms.common.server.response.FastJsonResponse$Field p5, String p6, java.util.ArrayList p7)
    {
        this.zaG(p5);
        android.os.Parcel v6_2 = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(p7)).size();
        double[] v0 = new double[v6_2];
        int v1 = 0;
        while (v1 < v6_2) {
            v0[v1] = ((Double) p7.get(v1)).doubleValue();
            v1++;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleArray(this.zab, p5.getSafeParcelableFieldId(), v0, 1);
        return;
    }

    public final void zar(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, float p3)
    {
        this.zaG(p1);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(this.zab, p1.getSafeParcelableFieldId(), p3);
        return;
    }

    public final void zat(com.google.android.gms.common.server.response.FastJsonResponse$Field p4, String p5, java.util.ArrayList p6)
    {
        this.zaG(p4);
        android.os.Parcel v5_2 = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6)).size();
        float[] v0 = new float[v5_2];
        int v1 = 0;
        while (v1 < v5_2) {
            v0[v1] = ((Float) p6.get(v1)).floatValue();
            v1++;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatArray(this.zab, p4.getSafeParcelableFieldId(), v0, 1);
        return;
    }

    public final void zaw(com.google.android.gms.common.server.response.FastJsonResponse$Field p4, String p5, java.util.ArrayList p6)
    {
        this.zaG(p4);
        android.os.Parcel v5_2 = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6)).size();
        int[] v0 = new int[v5_2];
        int v1 = 0;
        while (v1 < v5_2) {
            v0[v1] = ((Integer) p6.get(v1)).intValue();
            v1++;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(this.zab, p4.getSafeParcelableFieldId(), v0, 1);
        return;
    }

    public final void zaz(com.google.android.gms.common.server.response.FastJsonResponse$Field p5, String p6, java.util.ArrayList p7)
    {
        this.zaG(p5);
        android.os.Parcel v6_2 = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(p7)).size();
        long[] v0 = new long[v6_2];
        int v1 = 0;
        while (v1 < v6_2) {
            v0[v1] = ((Long) p7.get(v1)).longValue();
            v1++;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongArray(this.zab, p5.getSafeParcelableFieldId(), v0, 1);
        return;
    }
}
