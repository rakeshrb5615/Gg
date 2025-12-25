package w6;
public final class s extends w6.o {
    public final java.io.Serializable a;

    public s(Boolean p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.a = p1;
        return;
    }

    public s(Number p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.a = p1;
        return;
    }

    public s(String p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.a = p1;
        return;
    }

    public static boolean d(w6.s p1)
    {
        boolean v1_1 = p1.a;
        if ((v1_1 instanceof Number)) {
            boolean v1_5 = ((Number) v1_1);
            if (((v1_5 instanceof java.math.BigInteger)) || (((v1_5 instanceof Long)) || (((v1_5 instanceof Integer)) || (((v1_5 instanceof Short)) || ((v1_5 instanceof Byte)))))) {
                return 1;
            }
        }
        return 0;
    }

    public final java.math.BigInteger a()
    {
        String v0_0 = this.a;
        if (!(v0_0 instanceof java.math.BigInteger)) {
            if (!w6.s.d(this)) {
                String v0_6 = this.c();
                y6.i.c(v0_6);
                return new java.math.BigInteger(v0_6);
            } else {
                return java.math.BigInteger.valueOf(this.b().longValue());
            }
        } else {
            return ((java.math.BigInteger) v0_0);
        }
    }

    public final Number b()
    {
        UnsupportedOperationException v0_0 = this.a;
        if (!(v0_0 instanceof Number)) {
            if (!(v0_0 instanceof String)) {
                throw new UnsupportedOperationException("Primitive is neither a number nor a string");
            } else {
                return new y6.k(((String) v0_0));
            }
        } else {
            return ((Number) v0_0);
        }
    }

    public final String c()
    {
        String v0_0 = this.a;
        if (!(v0_0 instanceof String)) {
            if (!(v0_0 instanceof Number)) {
                if (!(v0_0 instanceof Boolean)) {
                    StringBuilder v2_0 = new StringBuilder("Unexpected value type: ");
                    v2_0.append(v0_0.getClass());
                    throw new AssertionError(v2_0.toString());
                } else {
                    return ((Boolean) v0_0).toString();
                }
            } else {
                return this.b().toString();
            }
        } else {
            return ((String) v0_0);
        }
    }

    public final boolean equals(Object p6)
    {
        if (this != p6) {
            if ((p6) && (w6.s == p6.getClass())) {
                java.math.BigDecimal v0_3 = ((w6.s) p6).a;
                java.math.BigDecimal v1_8 = this.a;
                if (v1_8 != null) {
                    if ((!w6.s.d(this)) || (!w6.s.d(((w6.s) p6)))) {
                        if ((!(v1_8 instanceof Number)) || (!(v0_3 instanceof Number))) {
                            return v1_8.equals(v0_3);
                        } else {
                            if ((!(v1_8 instanceof java.math.BigDecimal)) || (!(v0_3 instanceof java.math.BigDecimal))) {
                                java.math.BigDecimal v1_2;
                                if (!(v1_8 instanceof Number)) {
                                    v1_2 = Double.parseDouble(this.c());
                                } else {
                                    v1_2 = this.b().doubleValue();
                                }
                                double v3;
                                if (!(v0_3 instanceof Number)) {
                                    v3 = Double.parseDouble(((w6.s) p6).c());
                                } else {
                                    v3 = ((w6.s) p6).b().doubleValue();
                                }
                                if ((v1_2 == v3) || ((Double.isNaN(v1_2)) && (Double.isNaN(v3)))) {
                                    return 1;
                                }
                            } else {
                                java.math.BigDecimal v1_6;
                                if (!(v1_8 instanceof java.math.BigDecimal)) {
                                    v1_6 = y6.i.i(this.c());
                                } else {
                                    v1_6 = ((java.math.BigDecimal) v1_8);
                                }
                                java.math.BigDecimal v0_2;
                                if (!(v0_3 instanceof java.math.BigDecimal)) {
                                    v0_2 = y6.i.i(((w6.s) p6).c());
                                } else {
                                    v0_2 = ((java.math.BigDecimal) v0_3);
                                }
                                if (v1_6.compareTo(v0_2) == 0) {
                                    return 1;
                                }
                            }
                        }
                    } else {
                        if ((!(v1_8 instanceof java.math.BigInteger)) && (!(v0_3 instanceof java.math.BigInteger))) {
                            if (this.b().longValue() == ((w6.s) p6).b().longValue()) {
                                return 1;
                            }
                        } else {
                            return this.a().equals(((w6.s) p6).a());
                        }
                    }
                } else {
                    if (v0_3 == null) {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final int hashCode()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            int v0_3;
            if (!w6.s.d(this)) {
                if (!(v0_0 instanceof Number)) {
                    return v0_0.hashCode();
                } else {
                    v0_3 = Double.doubleToLongBits(this.b().doubleValue());
                }
            } else {
                v0_3 = this.b().longValue();
            }
            return ((int) (v0_3 ^ (v0_3 >> 32)));
        } else {
            return 31;
        }
    }
}
