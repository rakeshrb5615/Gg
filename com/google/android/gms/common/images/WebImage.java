package com.google.android.gms.common.images;
public final class WebImage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    private final android.net.Uri zab;
    private final int zac;
    private final int zad;

    static WebImage()
    {
        com.google.android.gms.common.images.WebImage.CREATOR = new com.google.android.gms.common.images.zah();
        return;
    }

    public WebImage(int p1, android.net.Uri p2, int p3, int p4)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        this.zad = p4;
        return;
    }

    public WebImage(android.net.Uri p2)
    {
        this(p2, 0, 0);
        return;
    }

    public WebImage(android.net.Uri p2, int p3, int p4)
    {
        this(1, p2, p3, p4);
        if (p2 == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else {
            if ((p3 < null) || (p4 < 0)) {
                throw new IllegalArgumentException("width and height must not be negative");
            } else {
                return;
            }
        }
    }

    public WebImage(org.json.JSONObject p5)
    {
        android.net.Uri v0 = android.net.Uri.EMPTY;
        try {
            if (p5.has("url")) {
                v0 = android.net.Uri.parse(p5.getString("url"));
            }
        } catch (org.json.JSONException) {
        }
        this(v0, p5.optInt("width", 0), p5.optInt("height", 0));
        return;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 == 0) || ((!(p5 instanceof com.google.android.gms.common.images.WebImage)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zab, ((com.google.android.gms.common.images.WebImage) p5).zab)) || ((this.zac != ((com.google.android.gms.common.images.WebImage) p5).zac) || (this.zad != ((com.google.android.gms.common.images.WebImage) p5).zad))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public int getHeight()
    {
        return this.zad;
    }

    public android.net.Uri getUrl()
    {
        return this.zab;
    }

    public int getWidth()
    {
        return this.zac;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zab, Integer.valueOf(this.zac), Integer.valueOf(this.zad)}));
    }

    public org.json.JSONObject toJson()
    {
        org.json.JSONObject v0_1 = new org.json.JSONObject();
        try {
            v0_1.put("url", this.zab.toString());
            v0_1.put("width", this.zac);
            v0_1.put("height", this.zad);
        } catch (org.json.JSONException) {
        }
        return v0_1;
    }

    public String toString()
    {
        String v0_0 = this.zac;
        int v1 = this.zad;
        String v2_1 = this.zab.toString();
        StringBuilder v3_1 = new StringBuilder("Image ");
        v3_1.append(v0_0);
        v3_1.append("x");
        v3_1.append(v1);
        v3_1.append(" ");
        v3_1.append(v2_1);
        return v3_1.toString();
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0_0 = this.zaa;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.getUrl(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 3, this.getWidth());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 4, this.getHeight());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }
}
