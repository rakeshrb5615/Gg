package com.google.android.gms.common.images;
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int p1, int p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public static com.google.android.gms.common.images.Size parseSize(String p3)
    {
        if (p3 == null) {
            throw new IllegalArgumentException("string must not be null");
        } else {
            int v0_0 = p3.indexOf(42);
            if (v0_0 < 0) {
                v0_0 = p3.indexOf(120);
            }
            if (v0_0 < 0) {
                throw com.google.android.gms.common.images.Size.zaa(p3);
            } else {
                try {
                    return new com.google.android.gms.common.images.Size(Integer.parseInt(p3.substring(0, v0_0)), Integer.parseInt(p3.substring((v0_0 + 1))));
                } catch (NumberFormatException) {
                    throw com.google.android.gms.common.images.Size.zaa(p3);
                }
            }
        }
    }

    private static NumberFormatException zaa(String p3)
    {
        throw new NumberFormatException(v1.a.l("Invalid Size: \"", p3, "\""));
    }

    public boolean equals(Object p5)
    {
        if (p5 != 0) {
            if (this != p5) {
                if ((!(p5 instanceof com.google.android.gms.common.images.Size)) || ((this.zaa != ((com.google.android.gms.common.images.Size) p5).zaa) || (this.zab != ((com.google.android.gms.common.images.Size) p5).zab))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public int getHeight()
    {
        return this.zab;
    }

    public int getWidth()
    {
        return this.zaa;
    }

    public int hashCode()
    {
        int v0_0 = this.zaa;
        return (((v0_0 >> 16) | (v0_0 << 16)) ^ this.zab);
    }

    public String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.zaa);
        v0_1.append("x");
        v0_1.append(this.zab);
        return v0_1.toString();
    }
}
