package d0;
public final class m extends d0.q {
    public androidx.core.graphics.drawable.IconCompat b;
    public androidx.core.graphics.drawable.IconCompat c;
    public boolean d;

    public final void a(j6.s p17)
    {
        IllegalStateException v1_7 = ((android.content.Context) p17.b);
        String v3_0 = new android.app.Notification$BigPictureStyle(((android.app.Notification$Builder) p17.c)).setBigContentTitle(0);
        android.graphics.Bitmap v4_3 = this.b;
        if (v4_3 != null) {
            if (android.os.Build$VERSION.SDK_INT < 31) {
                if (v4_3.c() == 1) {
                    android.graphics.Bitmap v4_0;
                    android.graphics.Bitmap v4_8 = this.b;
                    android.graphics.Bitmap v8_0 = v4_8.a;
                    if (v8_0 != -1) {
                        if (v8_0 != 1) {
                            if (v8_0 != 5) {
                                String v2_3 = new StringBuilder("called getBitmap() on ");
                                v2_3.append(v4_8);
                                throw new IllegalStateException(v2_3.toString());
                            } else {
                                android.graphics.Bitmap v4_10 = ((android.graphics.Bitmap) v4_8.b);
                                int v7_8 = ((int) (((float) Math.min(v4_10.getWidth(), v4_10.getHeight())) * 1059760811));
                                android.graphics.Bitmap v8_4 = android.graphics.Bitmap.createBitmap(v7_8, v7_8, android.graphics.Bitmap$Config.ARGB_8888);
                                android.graphics.Canvas v9_2 = new android.graphics.Canvas(v8_4);
                                android.graphics.Paint v10_1 = new android.graphics.Paint(3);
                                android.graphics.Matrix v11_1 = ((float) v7_8);
                                float v12_1 = (1056964608 * v11_1);
                                float v13_1 = (1063955115 * v12_1);
                                float v14_1 = (1009429163 * v11_1);
                                v10_1.setColor(0);
                                v10_1.setShadowLayer(v14_1, 0, (v11_1 * 1017817771), 1023410176);
                                v9_2.drawCircle(v12_1, v12_1, v13_1, v10_1);
                                v10_1.setShadowLayer(v14_1, 0, 0, 503316480);
                                v9_2.drawCircle(v12_1, v12_1, v13_1, v10_1);
                                v10_1.clearShadowLayer();
                                v10_1.setColor(-16777216);
                                android.graphics.BitmapShader v5_4 = new android.graphics.BitmapShader(v4_10, android.graphics.Shader$TileMode.CLAMP, android.graphics.Shader$TileMode.CLAMP);
                                android.graphics.Matrix v11_6 = new android.graphics.Matrix();
                                v11_6.setTranslate((((float) (- (v4_10.getWidth() - v7_8))) / 1073741824), (((float) (- (v4_10.getHeight() - v7_8))) / 1073741824));
                                v5_4.setLocalMatrix(v11_6);
                                v10_1.setShader(v5_4);
                                v9_2.drawCircle(v12_1, v12_1, v13_1, v10_1);
                                v9_2.setBitmap(0);
                                v4_0 = v8_4;
                            }
                        } else {
                            v4_0 = ((android.graphics.Bitmap) v4_8.b);
                        }
                    } else {
                        android.graphics.Bitmap v4_2 = v4_8.b;
                        if (!(v4_2 instanceof android.graphics.Bitmap)) {
                            v4_0 = 0;
                        } else {
                            v4_0 = ((android.graphics.Bitmap) v4_2);
                        }
                    }
                    v3_0 = v3_0.bigPicture(v4_0);
                }
            } else {
                d0.l.a(v3_0, v4_3.e(v1_7));
            }
        }
        if (this.d) {
            android.graphics.Bitmap v4_6 = this.c;
            if (v4_6 != null) {
                d0.k.a(v3_0, v4_6.e(v1_7));
            } else {
                v3_0.bigLargeIcon(0);
            }
        }
        if (android.os.Build$VERSION.SDK_INT >= 31) {
            d0.l.c(v3_0, 0);
            d0.l.b(v3_0, 0);
        }
        return;
    }

    public final String b()
    {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
