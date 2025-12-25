package q0;
public final class h {
    public final android.content.Context a;
    public final q0.i b;
    public android.view.VelocityTracker c;
    public float d;
    public int e;
    public int f;
    public int g;
    public final int[] h;

    public h(android.content.Context p3, q0.i p4)
    {
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = new int[] {2147483647, 0});
        this.a = p3;
        this.b = p4;
        return;
    }

    public final void a(android.view.MotionEvent p28, int p29)
    {
        int v12_0;
        int v17_0;
        int v16_0;
        float v3_5 = p28.getSource();
        int v4_31 = p28.getDeviceId();
        int[] v10 = this.h;
        if ((this.f == v3_5) && ((this.g == v4_31) && (this.e == p29))) {
            v12_0 = 0;
            v16_0 = 1;
            v17_0 = 0;
        } else {
            int v14_6;
            float v5_3 = this.a;
            int v13_6 = android.view.ViewConfiguration.get(v5_3);
            int v14_2 = p28.getDeviceId();
            float v15_3 = p28.getSource();
            v16_0 = 1;
            float[] v11_4 = android.os.Build$VERSION.SDK_INT;
            v17_0 = 0;
            if (v11_4 < 34) {
                int v14_3 = android.view.InputDevice.getDevice(v14_2);
                if ((v14_3 != 0) && (v14_3.getMotionRange(p29, v15_3) != null)) {
                    float v15_6;
                    int v14_5 = v5_3.getResources();
                    if ((v15_3 != 4194304) || (p29 != 26)) {
                        v15_6 = -1;
                    } else {
                        v15_6 = v14_5.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
                    }
                    java.util.Objects.requireNonNull(v13_6);
                    if (v15_6 == -1) {
                        v14_6 = v13_6.getScaledMinimumFlingVelocity();
                        float v5_14;
                        v10[0] = v14_6;
                        int v14_7 = p28.getDeviceId();
                        float v15_8 = p28.getSource();
                        if (v11_4 < 34) {
                            float[] v11_5 = android.view.InputDevice.getDevice(v14_7);
                            if ((v11_5 != null) && (v11_5.getMotionRange(p29, v15_8) != null)) {
                                int v7_6;
                                float v5_13 = v5_3.getResources();
                                if ((v15_8 != 4194304) || (p29 != 26)) {
                                    v7_6 = -1;
                                } else {
                                    v7_6 = v5_13.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                                }
                                java.util.Objects.requireNonNull(v13_6);
                                if (v7_6 == -1) {
                                    v5_14 = v13_6.getScaledMaximumFlingVelocity();
                                    v10[1] = v5_14;
                                    this.f = v3_5;
                                    this.g = v4_31;
                                    this.e = p29;
                                    v12_0 = 1;
                                    if (v10[v17_0] != 2147483647) {
                                        if (this.c == null) {
                                            this.c = android.view.VelocityTracker.obtain();
                                        }
                                        float v3_2 = this.c;
                                        v3_2.addMovement(p28);
                                        float v5_0 = 0;
                                        int v7_0 = 20;
                                        if ((android.os.Build$VERSION.SDK_INT < 34) && (p28.getSource() == 4194304)) {
                                            int v4_2 = q0.b0.a;
                                            if (!v4_2.containsKey(v3_2)) {
                                                v4_2.put(v3_2, new q0.c0());
                                            }
                                            int v4_4 = ((q0.c0) v4_2.get(v3_2));
                                            long[] v8_3 = v4_4.b;
                                            int v13_0 = p28.getEventTime();
                                            if ((v4_4.d != 0) && ((v13_0 - v8_3[v4_4.e]) > 40)) {
                                                v4_4.d = v17_0;
                                                v4_4.c = 0;
                                            }
                                            float v9_6 = ((v4_4.e + 1) % 20);
                                            v4_4.e = v9_6;
                                            float[] v11_0 = v4_4.d;
                                            if (v11_0 != 20) {
                                                v4_4.d = (v11_0 + 1);
                                            }
                                            v4_4.a[v9_6] = p28.getAxisValue(26);
                                            v8_3[v4_4.e] = v13_0;
                                        }
                                        float v24_0;
                                        v3_2.computeCurrentVelocity(1000, 2139095039);
                                        long[] v8_6 = ((q0.c0) q0.b0.a.get(v3_2));
                                        if (v8_6 == null) {
                                            v24_0 = 0;
                                        } else {
                                            float v28_1;
                                            int v7_1;
                                            float v9_7 = v8_6.a;
                                            float[] v11_3 = v8_6.b;
                                            int v13_1 = v8_6.d;
                                            if (v13_1 >= 2) {
                                                float v15_1 = v8_6.e;
                                                int v18_2 = (((v15_1 + 20) - (v13_1 - 1)) % 20);
                                                int v19_2 = v11_3[v15_1];
                                                while(true) {
                                                    float v21_1 = v11_3[v18_2];
                                                    if ((v19_2 - v21_1) <= 100) {
                                                        break;
                                                    }
                                                    v8_6.d = (v8_6.d - 1);
                                                    v18_2 = ((v18_2 + 1) % 20);
                                                }
                                                int v13_4 = v8_6.d;
                                                if (v13_4 >= 2) {
                                                    if (v13_4 != 2) {
                                                        v28_1 = 2139095039;
                                                        float v15_2 = 0;
                                                        int v13_5 = 0;
                                                        int v14_1 = 0;
                                                        while(true) {
                                                            float v20_0 = 1065353216;
                                                            if (v13_5 >= (v8_6.d - 1)) {
                                                                break;
                                                            }
                                                            float v24_4;
                                                            int v4_14 = (v13_5 + v18_2);
                                                            float v22_1 = v11_3[(v4_14 % 20)];
                                                            int v4_16 = ((v4_14 + 1) % v7_0);
                                                            if (v11_3[v4_16] != v22_1) {
                                                                v14_1++;
                                                                if (v15_2 < v5_0) {
                                                                    v20_0 = -1082130432;
                                                                }
                                                                v24_4 = v5_0;
                                                                float v5_8 = (v9_7[v4_16] / ((float) (v11_3[v4_16] - v22_1)));
                                                                v15_2 += (Math.abs(v5_8) * (v5_8 - (v20_0 * ((float) Math.sqrt(((double) (Math.abs(v15_2) * 1073741824)))))));
                                                                if (v14_1 == v16_0) {
                                                                    v15_2 *= 1056964608;
                                                                }
                                                            } else {
                                                                v24_4 = v5_0;
                                                            }
                                                            v13_5++;
                                                            v5_0 = v24_4;
                                                            v7_0 = 20;
                                                            v16_0 = 1;
                                                        }
                                                        v24_0 = v5_0;
                                                        if (v15_2 < v24_0) {
                                                            v20_0 = -1082130432;
                                                        }
                                                        v7_1 = (v20_0 * ((float) Math.sqrt(((double) (Math.abs(v15_2) * 1073741824)))));
                                                    } else {
                                                        int v18_4 = ((v18_2 + 1) % 20);
                                                        int v13_7 = v11_3[v18_4];
                                                        if (v21_1 != v13_7) {
                                                            v7_1 = (v9_7[v18_4] / ((float) (v13_7 - v21_1)));
                                                            v28_1 = 2139095039;
                                                            v24_0 = 0;
                                                        } else {
                                                            v28_1 = 2139095039;
                                                            v7_1 = 0;
                                                            v24_0 = 0;
                                                        }
                                                    }
                                                }
                                            }
                                            int v7_4 = (v7_1 * ((float) 1000));
                                            v8_6.c = v7_4;
                                            if (v7_4 >= (- Math.abs(v28_1))) {
                                                if (v8_6.c > Math.abs(v28_1)) {
                                                    v8_6.c = Math.abs(v28_1);
                                                }
                                            } else {
                                                v8_6.c = (- Math.abs(v28_1));
                                            }
                                        }
                                        float v1_17;
                                        if (android.os.Build$VERSION.SDK_INT < 34) {
                                            if (p29 != 0) {
                                                if (p29 != 1) {
                                                    float v1_16 = ((q0.c0) q0.b0.a.get(v3_2));
                                                    if ((v1_16 != 0) && (p29 == 26)) {
                                                        v1_17 = v1_16.c;
                                                    } else {
                                                        v1_17 = v24_0;
                                                    }
                                                } else {
                                                    v1_17 = v3_2.getYVelocity();
                                                }
                                            } else {
                                                v1_17 = v3_2.getXVelocity();
                                            }
                                        } else {
                                            v1_17 = q0.a0.b(v3_2, p29);
                                        }
                                        boolean v2_1 = this.b;
                                        float v3_4 = (v2_1.l() * v1_17);
                                        float v1_18 = Math.signum(v3_4);
                                        if ((v12_0 != 0) || ((v1_18 != Math.signum(this.d)) && (v1_18 != v24_0))) {
                                            v2_1.o();
                                        }
                                        if (Math.abs(v3_4) >= ((float) v10[0])) {
                                            float v5_11;
                                            float v1_22 = v10[1];
                                            float v1_25 = Math.max(((float) (- v1_22)), Math.min(v3_4, ((float) v1_22)));
                                            if (!v2_1.g(v1_25)) {
                                                v5_11 = v24_0;
                                            } else {
                                                v5_11 = v1_25;
                                            }
                                            this.d = v5_11;
                                            return;
                                        }
                                    } else {
                                        float v1_26 = this.c;
                                        if (v1_26 != 0) {
                                            v1_26.recycle();
                                            this.c = 0;
                                            return;
                                        }
                                    }
                                    return;
                                } else {
                                    if (v7_6 != 0) {
                                        v5_14 = v5_13.getDimensionPixelSize(v7_6);
                                        if (v5_14 >= 0) {
                                        }
                                    }
                                }
                            }
                            v5_14 = -2147483648;
                        } else {
                            v5_14 = q0.a0.e(v13_6, v14_7, p29, v15_8);
                        }
                    } else {
                        if (v15_6 != 0) {
                            v14_6 = v14_5.getDimensionPixelSize(v15_6);
                            if (v14_6 >= 0) {
                            }
                        }
                    }
                }
                v14_6 = 2147483647;
            } else {
                v14_6 = q0.a0.f(v13_6, v14_2, p29, v15_3);
            }
        }
    }
}
