package com.google.android.gms.common.server.response;
public class FastJsonResponse$Field extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final com.google.android.gms.common.server.response.zaj CREATOR;
    protected final int zaa;
    protected final boolean zab;
    protected final int zac;
    protected final boolean zad;
    protected final String zae;
    protected final int zaf;
    protected final Class zag;
    protected final String zah;
    private final int zai;
    private com.google.android.gms.common.server.response.zan zaj;
    private final com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter zak;

    static FastJsonResponse$Field()
    {
        com.google.android.gms.common.server.response.FastJsonResponse$Field.CREATOR = new com.google.android.gms.common.server.response.zaj();
        return;
    }

    public FastJsonResponse$Field(int p1, int p2, boolean p3, int p4, boolean p5, String p6, int p7, String p8, com.google.android.gms.common.server.converter.zaa p9)
    {
        this.zai = p1;
        this.zaa = p2;
        this.zab = p3;
        this.zac = p4;
        this.zad = p5;
        this.zae = p6;
        this.zaf = p7;
        if (p8 != null) {
            this.zag = com.google.android.gms.common.server.response.SafeParcelResponse;
            this.zah = p8;
        } else {
            this.zag = 0;
            this.zah = 0;
        }
        if (p9 != null) {
            this.zak = p9.zab();
            return;
        } else {
            this.zak = 0;
            return;
        }
    }

    public FastJsonResponse$Field(int p2, boolean p3, int p4, boolean p5, String p6, int p7, Class p8, com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter p9)
    {
        this.zai = 1;
        this.zaa = p2;
        this.zab = p3;
        this.zac = p4;
        this.zad = p5;
        this.zae = p6;
        this.zaf = p7;
        this.zag = p8;
        if (p8 != null) {
            this.zah = p8.getCanonicalName();
        } else {
            this.zah = 0;
        }
        this.zak = p9;
        return;
    }

    public static com.google.android.gms.common.server.response.FastJsonResponse$Field forBase64(String p9, int p10)
    {
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(8, 0, 8, 0, p9, p10, 0, 0);
    }

    public static com.google.android.gms.common.server.response.FastJsonResponse$Field forBoolean(String p9, int p10)
    {
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(6, 0, 6, 0, p9, p10, 0, 0);
    }

    public static com.google.android.gms.common.server.response.FastJsonResponse$Field forConcreteType(String p9, int p10, Class p11)
    {
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(11, 0, 11, 0, p9, p10, p11, 0);
    }

    public static com.google.android.gms.common.server.response.FastJsonResponse$Field forConcreteTypeArray(String p9, int p10, Class p11)
    {
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(11, 1, 11, 1, p9, p10, p11, 0);
    }

    public static com.google.android.gms.common.server.response.FastJsonResponse$Field forDouble(String p9, int p10)
    {
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(4, 0, 4, 0, p9, p10, 0, 0);
    }

    public static com.google.android.gms.common.server.response.FastJsonResponse$Field forFloat(String p9, int p10)
    {
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(3, 0, 3, 0, p9, p10, 0, 0);
    }

    public static com.google.android.gms.common.server.response.FastJsonResponse$Field forInteger(String p9, int p10)
    {
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(0, 0, 0, 0, p9, p10, 0, 0);
    }

    public static com.google.android.gms.common.server.response.FastJsonResponse$Field forLong(String p9, int p10)
    {
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(2, 0, 2, 0, p9, p10, 0, 0);
    }

    public static com.google.android.gms.common.server.response.FastJsonResponse$Field forString(String p9, int p10)
    {
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(7, 0, 7, 0, p9, p10, 0, 0);
    }

    public static com.google.android.gms.common.server.response.FastJsonResponse$Field forStringMap(String p9, int p10)
    {
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(10, 0, 10, 0, p9, p10, 0, 0);
    }

    public static com.google.android.gms.common.server.response.FastJsonResponse$Field forStrings(String p9, int p10)
    {
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(7, 1, 7, 1, p9, p10, 0, 0);
    }

    public static com.google.android.gms.common.server.response.FastJsonResponse$Field withConverter(String p9, int p10, com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter p11, boolean p12)
    {
        p11.zaa();
        p11.zab();
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(7, p12, 0, 0, p9, p10, 0, p11);
    }

    public static bridge synthetic com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter zac(com.google.android.gms.common.server.response.FastJsonResponse$Field p0)
    {
        return p0.zak;
    }

    public int getSafeParcelableFieldId()
    {
        return this.zaf;
    }

    public final String toString()
    {
        String v0_7 = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.zai)).add("typeIn", Integer.valueOf(this.zaa)).add("typeInArray", Boolean.valueOf(this.zab)).add("typeOut", Integer.valueOf(this.zac)).add("typeOutArray", Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", Integer.valueOf(this.zaf)).add("concreteTypeName", this.zag());
        String v1_12 = this.zag;
        if (v1_12 != null) {
            v0_7.add("concreteType.class", v1_12.getCanonicalName());
        }
        String v1_15 = this.zak;
        if (v1_15 != null) {
            v0_7.add("converterName", v1_15.getClass().getCanonicalName());
        }
        return v0_7.toString();
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0_0 = this.zai;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 2, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 3, this.zab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 4, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 5, this.zad);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 6, this.zae, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 7, this.getSafeParcelableFieldId());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 8, this.zag(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 9, this.zaa(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }

    public final com.google.android.gms.common.server.converter.zaa zaa()
    {
        com.google.android.gms.common.server.converter.zaa v0_0 = this.zak;
        if (v0_0 != null) {
            return com.google.android.gms.common.server.converter.zaa.zaa(v0_0);
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.common.server.response.FastJsonResponse$Field zab()
    {
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, this.zaa());
    }

    public final com.google.android.gms.common.server.response.FastJsonResponse zad()
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zag);
        com.google.android.gms.common.server.response.FastJsonResponse v0_4 = this.zag;
        if (v0_4 != com.google.android.gms.common.server.response.SafeParcelResponse) {
            return ((com.google.android.gms.common.server.response.FastJsonResponse) v0_4.newInstance());
        } else {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zah);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new com.google.android.gms.common.server.response.SafeParcelResponse(this.zaj, this.zah);
        }
    }

    public final Object zae(Object p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zak);
        return com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zak.zac(p2));
    }

    public final Object zaf(Object p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zak);
        return this.zak.zad(p2);
    }

    public final String zag()
    {
        int v0 = this.zah;
        if (v0 == 0) {
            v0 = 0;
        }
        return v0;
    }

    public final java.util.Map zah()
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zah);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaj);
        return ((java.util.Map) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaj.zab(this.zah)));
    }

    public final void zai(com.google.android.gms.common.server.response.zan p1)
    {
        this.zaj = p1;
        return;
    }

    public final boolean zaj()
    {
        if (this.zak == null) {
            return 0;
        } else {
            return 1;
        }
    }
}
