package androidx.core.graphics.drawable;
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    public static final android.graphics.PorterDuff$Mode k;
    public int a;
    public Object b;
    public byte[] c;
    public android.os.Parcelable d;
    public int e;
    public int f;
    public android.content.res.ColorStateList g;
    public android.graphics.PorterDuff$Mode h;
    public String i;
    public String j;

    static IconCompat()
    {
        androidx.core.graphics.drawable.IconCompat.k = android.graphics.PorterDuff$Mode.SRC_IN;
        return;
    }

    public IconCompat()
    {
        this.a = -1;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = androidx.core.graphics.drawable.IconCompat.k;
        this.i = 0;
        return;
    }

    public IconCompat(int p3)
    {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = androidx.core.graphics.drawable.IconCompat.k;
        this.i = 0;
        this.a = p3;
        return;
    }

    public static androidx.core.graphics.drawable.IconCompat a(int p2)
    {
        if (p2 == null) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        } else {
            String v0_2 = new androidx.core.graphics.drawable.IconCompat(2);
            v0_2.e = p2;
            v0_2.b = "";
            v0_2.j = "";
            return v0_2;
        }
    }

    public final int b()
    {
        int v0_0 = this.a;
        if (v0_0 != -1) {
            if (v0_0 != 2) {
                String v1_5 = new StringBuilder("called getResId() on ");
                v1_5.append(this);
                throw new IllegalStateException(v1_5.toString());
            } else {
                return this.e;
            }
        } else {
            String v1_2 = this.b;
            if (android.os.Build$VERSION.SDK_INT < 28) {
                try {
                    return ((Integer) v1_2.getClass().getMethod("getResId", 0).invoke(v1_2, 0)).intValue();
                } catch (int v0_11) {
                    android.util.Log.e("IconCompat", "Unable to get icon resource", v0_11);
                    return 0;
                } catch (int v0_10) {
                    android.util.Log.e("IconCompat", "Unable to get icon resource", v0_10);
                    return 0;
                } catch (int v0_9) {
                    android.util.Log.e("IconCompat", "Unable to get icon resource", v0_9);
                    return 0;
                }
            } else {
                return e0.a.f(v1_2);
            }
        }
    }

    public final int c()
    {
        NoSuchMethodException v0_0 = this.a;
        if (v0_0 != -1) {
            return v0_0;
        } else {
            String v2_3 = this.b;
            if (android.os.Build$VERSION.SDK_INT < 28) {
                try {
                    return ((Integer) v2_3.getClass().getMethod("getType", 0).invoke(v2_3, 0)).intValue();
                } catch (NoSuchMethodException v0_8) {
                    StringBuilder v5_6 = new StringBuilder("Unable to get icon type ");
                    v5_6.append(v2_3);
                    android.util.Log.e("IconCompat", v5_6.toString(), v0_8);
                    return -1;
                } catch (NoSuchMethodException v0_7) {
                    StringBuilder v5_4 = new StringBuilder("Unable to get icon type ");
                    v5_4.append(v2_3);
                    android.util.Log.e("IconCompat", v5_4.toString(), v0_7);
                    return -1;
                } catch (NoSuchMethodException v0_6) {
                    StringBuilder v5_2 = new StringBuilder("Unable to get icon type ");
                    v5_2.append(v2_3);
                    android.util.Log.e("IconCompat", v5_2.toString(), v0_6);
                    return -1;
                }
            } else {
                return e0.a.m(v2_3);
            }
        }
    }

    public final android.net.Uri d()
    {
        IllegalStateException v0_0 = this.a;
        if (v0_0 != -1) {
            if ((v0_0 != 4) && (v0_0 != 6)) {
                NoSuchMethodException v1_1 = new StringBuilder("called getUri() on ");
                v1_1.append(this);
                throw new IllegalStateException(v1_1.toString());
            } else {
                return android.net.Uri.parse(((String) this.b));
            }
        } else {
            NoSuchMethodException v1_3 = this.b;
            if (android.os.Build$VERSION.SDK_INT < 28) {
                try {
                    return ((android.net.Uri) v1_3.getClass().getMethod("getUri", 0).invoke(v1_3, 0));
                } catch (NoSuchMethodException v1_9) {
                    android.util.Log.e("IconCompat", "Unable to get icon uri", v1_9);
                    return 0;
                } catch (NoSuchMethodException v1_8) {
                    android.util.Log.e("IconCompat", "Unable to get icon uri", v1_8);
                    return 0;
                } catch (NoSuchMethodException v1_7) {
                    android.util.Log.e("IconCompat", "Unable to get icon uri", v1_7);
                    return 0;
                }
            } else {
                return e0.a.n(v1_3);
            }
        }
    }

    public final android.graphics.drawable.Icon e(android.content.Context p6)
    {
        IllegalStateException v6_10;
        String v0_0 = android.os.Build$VERSION.SDK_INT;
        android.net.Uri v1_0 = this.a;
        switch (v1_0) {
            case -1:
                return ((android.graphics.drawable.Icon) this.b);
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
                break;
            case 1:
                v6_10 = android.graphics.drawable.Icon.createWithBitmap(((android.graphics.Bitmap) this.b));
                break;
            case 2:
                java.io.FileInputStream v2_0;
                if (v1_0 != -1) {
                    if (v1_0 != 2) {
                        String v0_24 = new StringBuilder("called getResPackage() on ");
                        v0_24.append(this);
                        throw new IllegalStateException(v0_24.toString());
                    } else {
                        String v0_2 = this.j;
                        if ((v0_2 != null) && (!android.text.TextUtils.isEmpty(v0_2))) {
                            v2_0 = this.j;
                        } else {
                            v2_0 = ((String) this.b).split(":", -1)[0];
                        }
                    }
                } else {
                    IllegalStateException v6_3 = this.b;
                    if (v0_0 < 28) {
                        try {
                            v2_0 = ((String) v6_3.getClass().getMethod("getResPackage", 0).invoke(v6_3, 0));
                        } catch (IllegalStateException v6_8) {
                            android.util.Log.e("IconCompat", "Unable to get icon package", v6_8);
                        } catch (IllegalStateException v6_7) {
                            android.util.Log.e("IconCompat", "Unable to get icon package", v6_7);
                        } catch (IllegalStateException v6_6) {
                            android.util.Log.e("IconCompat", "Unable to get icon package", v6_6);
                        }
                    } else {
                        v2_0 = e0.a.g(v6_3);
                    }
                }
                v6_10 = android.graphics.drawable.Icon.createWithResource(v2_0, this.e);
                break;
            case 3:
                v6_10 = android.graphics.drawable.Icon.createWithData(((byte[]) this.b), this.e, this.f);
                break;
            case 4:
                v6_10 = android.graphics.drawable.Icon.createWithContentUri(((String) this.b));
                break;
            case 5:
                v6_10 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(((android.graphics.Bitmap) this.b));
                break;
            case 6:
                if (v0_0 < 30) {
                    if (p6 == null) {
                        String v0_4 = new StringBuilder("Context is required to resolve the file uri of the icon: ");
                        v0_4.append(this.d());
                        throw new IllegalArgumentException(v0_4.toString());
                    } else {
                        java.io.FileInputStream v2_2;
                        String v0_14 = this.d();
                        android.net.Uri v1_6 = v0_14.getScheme();
                        if ((!"content".equals(v1_6)) && (!"file".equals(v1_6))) {
                            try {
                                v2_2 = new java.io.FileInputStream(new java.io.File(((String) this.b)));
                            } catch (IllegalStateException v6_20) {
                                android.net.Uri v1_11 = new StringBuilder("Unable to load image from path: ");
                                v1_11.append(v0_14);
                                android.util.Log.w("IconCompat", v1_11.toString(), v6_20);
                            }
                        } else {
                            try {
                                v2_2 = p6.getContentResolver().openInputStream(v0_14);
                            } catch (IllegalStateException v6_22) {
                                android.net.Uri v1_14 = new StringBuilder("Unable to load image from URI: ");
                                v1_14.append(v0_14);
                                android.util.Log.w("IconCompat", v1_14.toString(), v6_22);
                            }
                        }
                        if (v2_2 == null) {
                            String v0_18 = new StringBuilder("Cannot load adaptive icon from uri: ");
                            v0_18.append(this.d());
                            throw new IllegalStateException(v0_18.toString());
                        } else {
                            v6_10 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(android.graphics.BitmapFactory.decodeStream(v2_2));
                        }
                    }
                } else {
                    v6_10 = e0.b.b(this.d());
                }
                break;
        }
        String v0_10 = this.g;
        if (v0_10 != null) {
            v6_10.setTintList(v0_10);
        }
        String v0_11 = this.h;
        if (v0_11 != androidx.core.graphics.drawable.IconCompat.k) {
            v6_10.setTintMode(v0_11);
        }
        return v6_10;
    }

    public final String toString()
    {
        if (this.a != -1) {
            String v1_1;
            String v0_2 = new StringBuilder("Icon(typ=");
            switch (this.a) {
                case 1:
                    v1_1 = "BITMAP";
                    break;
                case 2:
                    v1_1 = "RESOURCE";
                    break;
                case 3:
                    v1_1 = "DATA";
                    break;
                case 4:
                    v1_1 = "URI";
                    break;
                case 5:
                    v1_1 = "BITMAP_MASKABLE";
                    break;
                case 6:
                    v1_1 = "URI_MASKABLE";
                    break;
                default:
                    v1_1 = "UNKNOWN";
            }
            v0_2.append(v1_1);
            switch (this.a) {
                case 1:
                case 5:
                    v0_2.append(" size=");
                    v0_2.append(((android.graphics.Bitmap) this.b).getWidth());
                    v0_2.append("x");
                    v0_2.append(((android.graphics.Bitmap) this.b).getHeight());
                    break;
                case 2:
                    v0_2.append(" pkg=");
                    v0_2.append(this.j);
                    v0_2.append(" id=");
                    v0_2.append(String.format("0x%08x", new Object[] {Integer.valueOf(this.b())})));
                    break;
                case 3:
                    v0_2.append(" len=");
                    v0_2.append(this.e);
                    if (this.f == 0) {
                    } else {
                        v0_2.append(" off=");
                        v0_2.append(this.f);
                    }
                    break;
                case 4:
                case 6:
                    v0_2.append(" uri=");
                    v0_2.append(this.b);
                    break;
                default:
            }
            if (this.g != null) {
                v0_2.append(" tint=");
                v0_2.append(this.g);
            }
            if (this.h != androidx.core.graphics.drawable.IconCompat.k) {
                v0_2.append(" mode=");
                v0_2.append(this.h);
            }
            v0_2.append(")");
            return v0_2.toString();
        } else {
            return String.valueOf(this.b);
        }
    }
}
