package g1;
public final class i {
    public static final Object j;
    public static volatile g1.i k;
    public final java.util.concurrent.locks.ReentrantReadWriteLock a;
    public final r.f b;
    public volatile int c;
    public final android.os.Handler d;
    public final c5.b e;
    public final g1.h f;
    public final a6.e g;
    public final int h;
    public final g1.d i;

    static i()
    {
        g1.i.j = new Object();
        return;
    }

    public i(g1.q p6)
    {
        g1.e v0_1 = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.a = v0_1;
        this.c = 3;
        g1.h v1_2 = ((g1.h) p6.b);
        this.f = v1_2;
        int v2 = p6.a;
        this.h = v2;
        this.i = ((g1.d) p6.c);
        this.d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.b = new r.f(0);
        this.g = new a6.e();
        Throwable v6_10 = new c5.b(this);
        this.e = v6_10;
        v0_1.writeLock().lock();
        if (v2 == 0) {
            try {
                this.c = 0;
            } catch (Throwable v6_11) {
                this.a.writeLock().unlock();
                throw v6_11;
            }
        }
        v0_1.writeLock().unlock();
        if (this.b() == 0) {
            try {
                v1_2.a(new g1.e(v6_10));
                return;
            } catch (Throwable v6_12) {
                this.d(v6_12);
            }
        }
        return;
    }

    public static g1.i a()
    {
        int v2;
        IllegalStateException v1_0 = g1.i.k;
        if (v1_0 == null) {
            v2 = 0;
        } else {
            v2 = 1;
        }
        if (v2 == 0) {
            throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        } else {
            return v1_0;
        }
    }

    public final int b()
    {
        this.a.readLock().lock();
        try {
            Throwable v0_3 = this.c;
            this.a.readLock().unlock();
            return v0_3;
        } catch (Throwable v0_1) {
            this.a.readLock().unlock();
            throw v0_1;
        }
    }

    public final void c()
    {
        Throwable v0_11;
        if (this.h != 1) {
            v0_11 = 0;
        } else {
            v0_11 = 1;
        }
        if (v0_11 == null) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        } else {
            if (this.b() != 1) {
                this.a.writeLock().lock();
                try {
                    if (this.c != 0) {
                        this.c = 0;
                        this.a.writeLock().unlock();
                        Throwable v0_7 = this.e;
                        g1.i v1_2 = ((g1.i) v0_7.a);
                        try {
                            v1_2.f.a(new g1.e(v0_7));
                            return;
                        } catch (Throwable v0_10) {
                            v1_2.d(v0_10);
                            return;
                        }
                    } else {
                        this.a.writeLock().unlock();
                        return;
                    }
                } catch (Throwable v0_8) {
                    this.a.writeLock().unlock();
                    throw v0_8;
                }
            } else {
                return;
            }
        }
    }

    public final void d(Throwable p5)
    {
        java.util.concurrent.locks.Lock v0_1 = new java.util.ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            v0_1.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new com.google.android.material.datepicker.g(v0_1, this.c, p5));
            return;
        } catch (Throwable v5_1) {
            this.a.writeLock().unlock();
            throw v5_1;
        }
    }

    public final CharSequence e(CharSequence p11, int p12, int p13)
    {
        Throwable v0_5;
        int v1 = 0;
        boolean v2_0 = 1;
        if (this.b() != 1) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        if (v0_5 == null) {
            throw new IllegalStateException("Not initialized yet");
        } else {
            if (p12 < null) {
                throw new IllegalArgumentException("start cannot be negative");
            } else {
                if (p13 < 0) {
                    throw new IllegalArgumentException("end cannot be negative");
                } else {
                    Throwable v0_3;
                    if (p12 > p13) {
                        v0_3 = 0;
                    } else {
                        v0_3 = 1;
                    }
                    p0.e.b("start should be <= than end", v0_3);
                    Throwable v0_4 = 0;
                    if (p11 != null) {
                        b8.g v3_2;
                        if (p12 > p11.length()) {
                            v3_2 = 0;
                        } else {
                            v3_2 = 1;
                        }
                        p0.e.b("start should be < than charSequence length", v3_2);
                        if (p13 > p11.length()) {
                            v2_0 = 0;
                        }
                        Throwable v4_0;
                        p0.e.b("end should be < than charSequence length", v2_0);
                        if ((p11.length() != 0) && (p12 != p13)) {
                            b8.g v3_6 = ((b8.g) this.e.b);
                            v3_6.getClass();
                            boolean v2_4 = (p11 instanceof g1.t);
                            if (v2_4) {
                                ((g1.t) p11).a();
                            }
                            try {
                                if (v2_4) {
                                    v0_4 = new g1.x(((android.text.Spannable) p11));
                                    if (v0_4 != null) {
                                        Throwable v4_6 = ((g1.v[]) v0_4.b.getSpans(p12, p13, g1.v));
                                        if ((v4_6 != null) && (v4_6.length > 0)) {
                                            int v5_11 = v4_6.length;
                                            while (v1 < v5_11) {
                                                IllegalArgumentException v6_0 = v4_6[v1];
                                                int v7_2 = v0_4.b.getSpanStart(v6_0);
                                                int v8_2 = v0_4.b.getSpanEnd(v6_0);
                                                if (v7_2 != p13) {
                                                    v0_4.removeSpan(v6_0);
                                                }
                                                p12 = Math.min(v7_2, p12);
                                                p13 = Math.max(v8_2, p13);
                                                v1++;
                                            }
                                        }
                                    }
                                    if ((p12 != p13) && (p12 < p11.length())) {
                                        try {
                                        } catch (Throwable v0_8) {
                                            v4_0 = p11;
                                            g1.t v12_1 = v0_8;
                                            if (v2_4) {
                                                ((g1.t) v4_0).b();
                                            }
                                            throw v12_1;
                                        }
                                        v4_0 = p11;
                                        try {
                                            android.text.Spannable v11_4 = ((g1.x) v3_6.q(p11, p12, p13, 2147483647, 0, new k2.c(14, v0_4, ((a6.e) v3_6.b))));
                                        } catch (Throwable v0_1) {
                                            v12_1 = v0_1;
                                        }
                                        if (v11_4 == null) {
                                            if (!v2_4) {
                                                return v4_0;
                                            }
                                        } else {
                                            android.text.Spannable v11_5 = v11_4.b;
                                            if (v2_4) {
                                                ((g1.t) p11).b();
                                            }
                                            return v11_5;
                                        }
                                    } else {
                                        v4_0 = p11;
                                        if (!v2_4) {
                                            return v4_0;
                                        }
                                    }
                                    ((g1.t) v4_0).b();
                                    return v4_0;
                                } else {
                                    if (!(p11 instanceof android.text.Spannable)) {
                                        if ((!(p11 instanceof android.text.Spanned)) || (((android.text.Spanned) p11).nextSpanTransition((p12 - 1), (p13 + 1), g1.v) > p13)) {
                                        } else {
                                            v0_4 = new g1.x();
                                            v0_4.a = 0;
                                            v0_4.b = new android.text.SpannableString(p11);
                                        }
                                    } else {
                                    }
                                }
                            } catch (Throwable v0_2) {
                                v12_1 = v0_2;
                                v4_0 = p11;
                            } catch (Throwable v0_1) {
                                v4_0 = p11;
                            }
                        } else {
                            v4_0 = p11;
                        }
                        return v4_0;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }

    public final void f(g1.g p5)
    {
        p0.e.d(p5, "initCallback cannot be null");
        this.a.writeLock().lock();
        if (this.c == 1) {
            this.d.post(new com.google.android.material.datepicker.g(java.util.Arrays.asList(new g1.g[] {p5})), this.c, 0));
        } else {
            if (this.c != 2) {
                this.b.add(p5);
            } else {
            }
        }
        this.a.writeLock().unlock();
        return;
    }
}
