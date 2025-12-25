package com.google.android.gms.common.server.response;
public abstract class FastJsonResponse {

    public FastJsonResponse()
    {
        return;
    }

    public static final Object zaD(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, Object p2)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p1) == null) {
            return p2;
        } else {
            return p1.zaf(p2);
        }
    }

    private final void zaE(com.google.android.gms.common.server.response.FastJsonResponse$Field p5, Object p6)
    {
        int v0 = p5.zac;
        byte[] v6_4 = p5.zae(p6);
        String v1 = p5.zae;
        switch (v0) {
            case 0:
                if (v6_4 == null) {
                    com.google.android.gms.common.server.response.FastJsonResponse.zaG(v1);
                    return;
                } else {
                    this.setIntegerInternal(p5, v1, ((Integer) v6_4).intValue());
                    return;
                }
            case 1:
                this.zaf(p5, v1, ((java.math.BigInteger) v6_4));
                return;
            case 2:
                if (v6_4 == null) {
                    com.google.android.gms.common.server.response.FastJsonResponse.zaG(v1);
                    return;
                } else {
                    this.setLongInternal(p5, v1, ((Long) v6_4).longValue());
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException(g2.g.c(v0, "Unsupported type for conversion: "));
                break;
            case 4:
                if (v6_4 == null) {
                    com.google.android.gms.common.server.response.FastJsonResponse.zaG(v1);
                    return;
                } else {
                    this.zan(p5, v1, ((Double) v6_4).doubleValue());
                    return;
                }
            case 5:
                this.zab(p5, v1, ((java.math.BigDecimal) v6_4));
                return;
            case 6:
                if (v6_4 == null) {
                    com.google.android.gms.common.server.response.FastJsonResponse.zaG(v1);
                    return;
                } else {
                    this.setBooleanInternal(p5, v1, ((Boolean) v6_4).booleanValue());
                    return;
                }
            case 7:
                this.setStringInternal(p5, v1, ((String) v6_4));
                return;
            case 8:
            case 9:
                if (v6_4 == null) {
                    com.google.android.gms.common.server.response.FastJsonResponse.zaG(v1);
                    return;
                } else {
                    this.setDecodedBytesInternal(p5, v1, ((byte[]) v6_4));
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder p2, com.google.android.gms.common.server.response.FastJsonResponse$Field p3, Object p4)
    {
        int v0 = p3.zaa;
        if (v0 == 11) {
            String v3_3 = p3.zag;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_3);
            p2.append(((com.google.android.gms.common.server.response.FastJsonResponse) v3_3.cast(p4)).toString());
            return;
        } else {
            if (v0 != 7) {
                p2.append(p4);
                return;
            } else {
                p2.append("\"");
                p2.append(com.google.android.gms.common.util.JsonUtils.escapeString(((String) p4)));
                p2.append("\"");
                return;
            }
        }
    }

    private static final void zaG(String p3)
    {
        if (android.util.Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder v0_3 = new StringBuilder("Output field (");
            v0_3.append(p3);
            v0_3.append(") has a null value, but expected a primitive");
            android.util.Log.e("FastJsonResponse", v0_3.toString());
        }
        return;
    }

    public void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.util.ArrayList p3)
    {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, com.google.android.gms.common.server.response.FastJsonResponse p3)
    {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract java.util.Map getFieldMappings();

    public Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse$Field p7)
    {
        int v1_0 = p7.zae;
        if (p7.zag == null) {
            return this.getValueObject(v1_0);
        } else {
            StringBuilder v2_0;
            if (this.getValueObject(v1_0) != null) {
                v2_0 = 0;
            } else {
                v2_0 = 1;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(v2_0, "Concrete field shouldn\'t be value object: %s", new Object[] {p7.zae}));
            try {
                Exception v7_4 = Character.toUpperCase(v1_0.charAt(0));
                int v1_1 = v1_0.substring(1);
                StringBuilder v2_3 = new StringBuilder("get");
                v2_3.append(v7_4);
                v2_3.append(v1_1);
                return this.getClass().getMethod(v2_3.toString(), 0).invoke(this, 0);
            } catch (Exception v7_8) {
                throw new RuntimeException(v7_8);
            }
        }
    }

    public abstract Object getValueObject();

    public boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse$Field p3)
    {
        if (p3.zac != 11) {
            return this.isPrimitiveFieldSet(p3.zae);
        } else {
            if (!p3.zad) {
                throw new UnsupportedOperationException("Concrete types not supported");
            } else {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
        }
    }

    public abstract boolean isPrimitiveFieldSet();

    public void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, boolean p3)
    {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, byte[] p3)
    {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, int p3)
    {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, long p3)
    {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, String p3)
    {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.util.Map p3)
    {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.util.ArrayList p3)
    {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString()
    {
        String v0_0 = this.getFieldMappings();
        StringBuilder v1_1 = new StringBuilder(100);
        java.util.Iterator v2_2 = v0_0.keySet().iterator();
        while (v2_2.hasNext()) {
            String v3_2 = ((String) v2_2.next());
            com.google.android.gms.common.server.response.FastJsonResponse$Field v4_1 = ((com.google.android.gms.common.server.response.FastJsonResponse$Field) v0_0.get(v3_2));
            if (this.isFieldSet(v4_1)) {
                java.util.ArrayList v5_2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(v4_1, this.getFieldValue(v4_1));
                if (v1_1.length() != 0) {
                    v1_1.append(",");
                } else {
                    v1_1.append("{");
                }
                v1_1.append("\"");
                v1_1.append(v3_2);
                v1_1.append("\":");
                if (v5_2 != null) {
                    switch (v4_1.zac) {
                        case 8:
                            v1_1.append("\"");
                            v1_1.append(com.google.android.gms.common.util.Base64Utils.encode(((byte[]) v5_2)));
                            v1_1.append("\"");
                            break;
                        case 9:
                            v1_1.append("\"");
                            v1_1.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(((byte[]) v5_2)));
                            v1_1.append("\"");
                            break;
                        case 10:
                            com.google.android.gms.common.util.MapUtils.writeStringMapToJson(v1_1, ((java.util.HashMap) v5_2));
                            break;
                        default:
                            if (!v4_1.zab) {
                                com.google.android.gms.common.server.response.FastJsonResponse.zaF(v1_1, v4_1, v5_2);
                            } else {
                                java.util.ArrayList v5_6 = ((java.util.ArrayList) v5_2);
                                v1_1.append("[");
                                String v3_9 = v5_6.size();
                                int v6_3 = 0;
                                while (v6_3 < v3_9) {
                                    if (v6_3 > 0) {
                                        v1_1.append(",");
                                    }
                                    Object v8 = v5_6.get(v6_3);
                                    if (v8 != null) {
                                        com.google.android.gms.common.server.response.FastJsonResponse.zaF(v1_1, v4_1, v8);
                                    }
                                    v6_3++;
                                }
                                v1_1.append("]");
                            }
                    }
                } else {
                    v1_1.append("null");
                }
            }
        }
        if (v1_1.length() <= 0) {
            v1_1.append("{}");
        } else {
            v1_1.append("}");
        }
        return v1_1.toString();
    }

    public final void zaA(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, String p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.setStringInternal(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public final void zaB(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, java.util.Map p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.setStringMapInternal(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public final void zaC(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, java.util.ArrayList p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.setStringsInternal(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public final void zaa(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, java.math.BigDecimal p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.zab(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public void zab(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.math.BigDecimal p3)
    {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, java.util.ArrayList p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.zad(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public void zad(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.util.ArrayList p3)
    {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, java.math.BigInteger p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.zaf(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public void zaf(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.math.BigInteger p3)
    {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, java.util.ArrayList p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.zah(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public void zah(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.util.ArrayList p3)
    {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, boolean p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.setBooleanInternal(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, Boolean.valueOf(p3));
            return;
        }
    }

    public final void zaj(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, java.util.ArrayList p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.zak(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public void zak(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.util.ArrayList p3)
    {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, byte[] p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.setDecodedBytesInternal(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public final void zam(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, double p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.zan(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, Double.valueOf(p3));
            return;
        }
    }

    public void zan(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, double p3)
    {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, java.util.ArrayList p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.zap(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public void zap(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.util.ArrayList p3)
    {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, float p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.zar(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, Float.valueOf(p3));
            return;
        }
    }

    public void zar(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, float p3)
    {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, java.util.ArrayList p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.zat(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public void zat(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.util.ArrayList p3)
    {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, int p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.setIntegerInternal(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, Integer.valueOf(p3));
            return;
        }
    }

    public final void zav(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, java.util.ArrayList p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.zaw(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public void zaw(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.util.ArrayList p3)
    {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, long p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.setLongInternal(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, Long.valueOf(p3));
            return;
        }
    }

    public final void zay(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, java.util.ArrayList p3)
    {
        if (com.google.android.gms.common.server.response.FastJsonResponse$Field.zac(p2) == null) {
            this.zaz(p2, p2.zae, p3);
            return;
        } else {
            this.zaE(p2, p3);
            return;
        }
    }

    public void zaz(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.util.ArrayList p3)
    {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
