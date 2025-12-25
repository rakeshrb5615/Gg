package j6;
public final class s implements t6.b, t2.b, x8.g0, com.google.android.gms.tasks.Continuation {
    public static j6.s f;
    public static j6.s m;
    public final synthetic int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public s(int p3)
    {
        this.a = p3;
        switch (p3) {
            case 3:
                this.b = new p0.c(10);
                this.c = new r.j(0);
                this.d = new java.util.ArrayList();
                this.e = new java.util.HashSet();
                return;
            case 5:
                this.b = new r.e(0);
                this.c = new android.util.SparseArray();
                this.d = new r.g();
                this.e = new r.e(0);
                return;
            case 15:
                this.b = new Object();
                this.c = new android.os.Handler(android.os.Looper.getMainLooper(), new y3.k(this));
                return;
            default:
                this.b = 0;
                this.c = 0;
                this.d = 0;
                this.e = new java.util.ArrayDeque();
                return;
        }
    }

    public synthetic s(int p1, boolean p2)
    {
        this.a = p1;
        return;
    }

    public s(a1.g0 p2, java.util.List p3)
    {
        this.a = 1;
        this.e = p2;
        this.b = m8.d.a();
        this.c = d8.f0.a();
        this.d = i7.i.j0(p3);
        return;
    }

    public s(android.content.Context p2, android.view.ActionMode$Callback p3)
    {
        this.a = 7;
        this.c = p2;
        this.b = p3;
        this.d = new java.util.ArrayList();
        this.e = new r.j(0);
        return;
    }

    public s(android.graphics.Typeface p8, h1.b p9)
    {
        g1.u v0_2;
        this.a = 6;
        this.e = p8;
        this.b = p9;
        this.d = new g1.r(1024);
        g1.u v0_1 = p9.b(6);
        if (v0_1 == null) {
            v0_2 = 0;
        } else {
            g1.u v0_3 = (v0_1 + p9.a);
            v0_2 = ((java.nio.ByteBuffer) p9.d).getInt((((java.nio.ByteBuffer) p9.d).getInt(v0_3) + v0_3));
        }
        int v8_2;
        g1.u v0_7 = new char[(v0_2 * 2)];
        this.c = v0_7;
        int v8_1 = p9.b(6);
        if (v8_1 == 0) {
            v8_2 = 0;
        } else {
            int v8_3 = (v8_1 + p9.a);
            v8_2 = ((java.nio.ByteBuffer) p9.d).getInt((((java.nio.ByteBuffer) p9.d).getInt(v8_3) + v8_3));
        }
        int v9_1 = 0;
        while (v9_1 < v8_2) {
            g1.r v2_6;
            g1.u v0_14 = new g1.u(this, v9_1);
            g1.r v2_5 = v0_14.b();
            int v3_5 = v2_5.b(4);
            if (v3_5 == 0) {
                v2_6 = 0;
            } else {
                v2_6 = ((java.nio.ByteBuffer) v2_5.d).getInt((v3_5 + v2_5.a));
            }
            g1.r v2_9;
            Character.toChars(v2_6, ((char[]) this.c), (v9_1 * 2));
            g1.r v2_8 = v0_14.b();
            int v4_3 = v2_8.b(16);
            if (v4_3 == 0) {
                v2_9 = 0;
            } else {
                int v4_4 = (v4_3 + v2_8.a);
                v2_9 = ((java.nio.ByteBuffer) v2_8.d).getInt((((java.nio.ByteBuffer) v2_8.d).getInt(v4_4) + v4_4));
            }
            g1.r v2_12;
            if (v2_9 <= null) {
                v2_12 = 0;
            } else {
                v2_12 = 1;
            }
            int v3_2;
            p0.e.b("invalid metadata codepoint length", v2_12);
            g1.r v2_14 = ((g1.r) this.d);
            h1.a v5_6 = v0_14.b();
            int v3_10 = v5_6.b(16);
            if (v3_10 == 0) {
                v3_2 = 0;
            } else {
                int v3_11 = (v3_10 + v5_6.a);
                v3_2 = ((java.nio.ByteBuffer) v5_6.d).getInt((((java.nio.ByteBuffer) v5_6.d).getInt(v3_11) + v3_11));
            }
            v2_14.a(v0_14, 0, (v3_2 - 1));
            v9_1++;
        }
        return;
    }

    public s(androidx.lifecycle.a1 p2, androidx.lifecycle.x0 p3, o1.b p4)
    {
        this.a = 9;
        kotlin.jvm.internal.j.e(p2, "store");
        kotlin.jvm.internal.j.e(p4, "defaultExtras");
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = new a6.e();
        return;
    }

    public s(d0.p p19)
    {
        String v9_24;
        this.a = 4;
        j6.s v0_1 = ;
new java.util.ArrayList();
        v0_1.e = new android.os.Bundle();
        v0_1.d = p19;
        android.os.Bundle v2_3 = p19.a;
        java.util.Iterator v3_0 = p19.t;
        android.app.Notification$Builder v4_8 = p19.c;
        android.os.Bundle v5_0 = p19.d;
        v0_1.b = v2_3;
        int v7_9 = new android.app.Notification$Builder(v2_3, p19.q);
        v0_1.c = v7_9;
        android.os.Bundle v6_4 = p19.s;
        android.os.Bundle v10_6 = 0;
        android.app.Notification$Builder vtmp6 = v7_9.setWhen(v6_4.when).setSmallIcon(v6_4.icon, v6_4.iconLevel).setContent(v6_4.contentView).setTicker(v6_4.tickerText, 0).setVibrate(v6_4.vibrate).setLights(v6_4.ledARGB, v6_4.ledOnMS, v6_4.ledOffMS);
        String v11_2 = 1;
        if ((v6_4.flags & 2) == 0) {
            v9_24 = 0;
        } else {
            v9_24 = 1;
        }
        String v9_27;
        String v8_12 = vtmp6.setOngoing(v9_24);
        if ((v6_4.flags & 8) == 0) {
            v9_27 = 0;
        } else {
            v9_27 = 1;
        }
        String v9_30;
        String v8_13 = v8_12.setOnlyAlertOnce(v9_27);
        if ((v6_4.flags & 16) == 0) {
            v9_30 = 0;
        } else {
            v9_30 = 1;
        }
        android.app.Notification$Builder vtmp15 = v8_13.setAutoCancel(v9_30).setDefaults(v6_4.defaults).setContentTitle(p19.e).setContentText(p19.f).setContentInfo(0).setContentIntent(p19.g).setDeleteIntent(v6_4.deleteIntent);
        if ((v6_4.flags & 128) == 0) {
            v11_2 = 0;
        }
        android.os.Bundle v2_32;
        vtmp15.setFullScreenIntent(0, v11_2).setNumber(p19.i).setProgress(0, 0, 0);
        String v8_23 = p19.h;
        if (v8_23 != null) {
            v2_32 = v8_23.e(v2_3);
        } else {
            v2_32 = 0;
        }
        v7_9.setLargeIcon(v2_32);
        v7_9.setSubText(0).setUsesChronometer(0).setPriority(p19.j);
        android.os.Bundle v2_2 = p19.b;
        int v7_1 = v2_2.size();
        String v8_0 = 0;
        while (v8_0 < v7_1) {
            android.app.PendingIntent v14_3 = v2_2.get(v8_0);
            v8_0++;
            android.app.PendingIntent v14_4 = ((d0.j) v14_3);
            int v15 = android.os.Build$VERSION.SDK_INT;
            if (v14_4.b == null) {
                String v9_12 = v14_4.e;
                if (v9_12 != null) {
                    v14_4.b = androidx.core.graphics.drawable.IconCompat.a(v9_12);
                }
            }
            String v9_15;
            String v9_14 = v14_4.b;
            int v13_4 = v14_4.c;
            int v12_13 = v14_4.a;
            if (v9_14 == null) {
                v9_15 = v10_6;
            } else {
                v9_15 = v9_14.e(v10_6);
            }
            android.os.Bundle v2_25;
            int v16 = v2_2;
            android.app.Notification$Builder v17_1 = v4_8;
            android.app.Notification$Builder v4_34 = new android.app.Notification$Action$Builder(v9_15, v14_4.f, v14_4.g);
            if (v12_13 == 0) {
                v2_25 = new android.os.Bundle();
            } else {
                v2_25 = new android.os.Bundle(v12_13);
            }
            v2_25.putBoolean("android.support.allowGeneratedReplies", v13_4);
            v4_34.setAllowGeneratedReplies(v13_4);
            v2_25.putInt("android.support.action.semanticAction", 0);
            if (v15 >= 28) {
                d0.r.a(v4_34);
            }
            if (v15 >= 29) {
                d0.e.d(v4_34);
            }
            if (v15 >= 31) {
                d0.s.a(v4_34);
            }
            v2_25.putBoolean("android.support.action.showsUserInterface", v14_4.d);
            v4_34.addExtras(v2_25);
            ((android.app.Notification$Builder) v0_1.c).addAction(v4_34.build());
            v2_2 = v16;
            v4_8 = v17_1;
            v10_6 = 0;
        }
        android.app.Notification$Builder v17_0 = v4_8;
        android.os.Bundle v2_4 = p19.n;
        if (v2_4 != null) {
            ((android.os.Bundle) v0_1.e).putAll(v2_4);
        }
        ((android.app.Notification$Builder) v0_1.c).setShowWhen(p19.k);
        ((android.app.Notification$Builder) v0_1.c).setLocalOnly(p19.m);
        ((android.app.Notification$Builder) v0_1.c).setGroup(0);
        ((android.app.Notification$Builder) v0_1.c).setSortKey(0);
        ((android.app.Notification$Builder) v0_1.c).setGroupSummary(0);
        ((android.app.Notification$Builder) v0_1.c).setCategory(0);
        ((android.app.Notification$Builder) v0_1.c).setColor(p19.o);
        ((android.app.Notification$Builder) v0_1.c).setVisibility(p19.p);
        ((android.app.Notification$Builder) v0_1.c).setPublicVersion(0);
        ((android.app.Notification$Builder) v0_1.c).setSound(v6_4.sound, v6_4.audioAttributes);
        if (android.os.Build$VERSION.SDK_INT < 28) {
            android.os.Bundle v2_7;
            if (v17_0 != null) {
                v2_7 = new java.util.ArrayList(v17_0.size());
                android.app.Notification$Builder v4_24 = v17_0.iterator();
                if (v4_24.hasNext()) {
                    throw v1.a.e(v4_24);
                }
            } else {
                v2_7 = 0;
            }
            if (v2_7 != null) {
                if (v3_0 != null) {
                    android.app.Notification$Builder v4_26 = new r.f((v3_0.size() + v2_7.size()));
                    v4_26.addAll(v2_7);
                    v4_26.addAll(v3_0);
                    v3_0 = new java.util.ArrayList(v4_26);
                } else {
                    v3_0 = v2_7;
                }
            }
        }
        if ((v3_0 != null) && (!v3_0.isEmpty())) {
            android.os.Bundle v2_9 = v3_0.size();
            android.app.Notification$Builder v4_27 = 0;
            while (v4_27 < v2_9) {
                android.os.Bundle v6_7 = v3_0.get(v4_27);
                v4_27++;
                ((android.app.Notification$Builder) v0_1.c).addPerson(((String) v6_7));
            }
        }
        if (v5_0.size() > 0) {
            if (p19.n == null) {
                p19.n = new android.os.Bundle();
            }
            android.os.Bundle v2_16 = p19.n.getBundle("android.car.EXTENSIONS");
            if (v2_16 == null) {
                v2_16 = new android.os.Bundle();
            }
            android.app.Notification$Builder v4_29 = new android.os.Bundle(v2_16);
            android.os.Bundle v6_6 = new android.os.Bundle();
            int v7_10 = 0;
            while (v7_10 < v5_0.size()) {
                String v8_7 = Integer.toString(v7_10);
                String v9_6 = ((d0.j) v5_0.get(v7_10));
                android.os.Bundle v10_5 = new android.os.Bundle();
                if (v9_6.b == null) {
                    int v12_1 = v9_6.e;
                    if (v12_1 != 0) {
                        v9_6.b = androidx.core.graphics.drawable.IconCompat.a(v12_1);
                    }
                }
                int v12_4;
                int v12_3 = v9_6.b;
                int v13_0 = v9_6.a;
                if (v12_3 == 0) {
                    v12_4 = 0;
                } else {
                    v12_4 = v12_3.b();
                }
                int v12_8;
                v10_5.putInt("icon", v12_4);
                v10_5.putCharSequence("title", v9_6.f);
                v10_5.putParcelable("actionIntent", v9_6.g);
                if (v13_0 == 0) {
                    v12_8 = new android.os.Bundle();
                } else {
                    v12_8 = new android.os.Bundle(v13_0);
                }
                v12_8.putBoolean("android.support.allowGeneratedReplies", v9_6.c);
                v10_5.putBundle("extras", v12_8);
                v10_5.putParcelableArray("remoteInputs", 0);
                v10_5.putBoolean("showsUserInterface", v9_6.d);
                v10_5.putInt("semanticAction", 0);
                v6_6.putBundle(v8_7, v10_5);
                v7_10++;
            }
            v2_16.putBundle("invisible_actions", v6_6);
            v4_29.putBundle("invisible_actions", v6_6);
            if (p19.n == null) {
                p19.n = new android.os.Bundle();
            }
            p19.n.putBundle("android.car.EXTENSIONS", v2_16);
            ((android.os.Bundle) v0_1.e).putBundle("android.car.EXTENSIONS", v4_29);
        }
        android.os.Bundle v2_20 = android.os.Build$VERSION.SDK_INT;
        ((android.app.Notification$Builder) v0_1.c).setExtras(p19.n);
        ((android.app.Notification$Builder) v0_1.c).setRemoteInputHistory(0);
        ((android.app.Notification$Builder) v0_1.c).setBadgeIconType(0);
        ((android.app.Notification$Builder) v0_1.c).setSettingsText(0);
        ((android.app.Notification$Builder) v0_1.c).setShortcutId(0);
        ((android.app.Notification$Builder) v0_1.c).setTimeoutAfter(0);
        ((android.app.Notification$Builder) v0_1.c).setGroupAlertBehavior(0);
        if (!android.text.TextUtils.isEmpty(p19.q)) {
            ((android.app.Notification$Builder) v0_1.c).setSound(0).setDefaults(0).setLights(0, 0, 0).setVibrate(0);
        }
        if (v2_20 >= 28) {
            java.util.Iterator v3_24 = v17_0.iterator();
            if (v3_24.hasNext()) {
                throw v1.a.e(v3_24);
            }
        }
        if (v2_20 >= 29) {
            d0.e.b(((android.app.Notification$Builder) v0_1.c), p19.r);
            d0.e.c(((android.app.Notification$Builder) v0_1.c));
        }
        return;
    }

    public s(d8.c0 p3, a1.d0 p4, a1.d p5)
    {
        this.a = 2;
        this.b = p3;
        this.c = p5;
        this.d = a.a.a(2147483647, 0, 6);
        this.e = new l6.c(1);
        d8.e1 v3_3 = ((d8.e1) p3.a().get(d8.b0.b));
        if (v3_3 != null) {
            v3_3.invokeOnCompletion(new a1.b1(1, p4, this));
        }
        return;
    }

    public synthetic s(Object p1, Object p2, Object p3, Object p4, int p5)
    {
        this.a = p5;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        return;
    }

    public s(java.net.Socket p2)
    {
        this.a = 16;
        this.b = p2;
        this.c = new java.util.concurrent.atomic.AtomicInteger();
        this.d = new y8.e(this);
        this.e = new y8.d(this);
        return;
    }

    public static declared_synchronized j6.s g()
    {
        if (j6.s.f == null) {
            j6.s.f = new j6.s(0);
        }
        return j6.s.f;
    }

    public static j6.s h()
    {
        if (j6.s.m == null) {
            j6.s.m = new j6.s(15);
        }
        return j6.s.m;
    }

    public x8.h0 a()
    {
        return ((y8.e) this.d);
    }

    public x8.f0 b()
    {
        return ((y8.d) this.e);
    }

    public boolean c(y3.l p4, int p5)
    {
        y3.h v0_3 = ((y3.f) p4.a.get());
        if (v0_3 == null) {
            return 0;
        } else {
            ((android.os.Handler) this.c).removeCallbacksAndMessages(p4);
            android.os.Handler v4_1 = y3.h.x;
            v4_1.sendMessage(v4_1.obtainMessage(1, p5, 0, v0_3.a));
            return 1;
        }
    }

    public void cancel()
    {
        ((java.net.Socket) this.b).close();
        return;
    }

    public void d(Object p5, java.util.ArrayList p6, java.util.HashSet p7)
    {
        if (!p6.contains(p5)) {
            if (p7.contains(p5)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            } else {
                p7.add(p5);
                java.util.ArrayList v0_4 = ((java.util.ArrayList) ((r.j) this.c).get(p5));
                if (v0_4 != null) {
                    int v1 = v0_4.size();
                    int v2 = 0;
                    while (v2 < v1) {
                        this.d(v0_4.get(v2), p6, p7);
                        v2++;
                    }
                }
                p7.remove(p5);
                p6.add(p5);
                return;
            }
        } else {
            return;
        }
    }

    public Object e(n7.c p7)
    {
        a1.i v1_1;
        j6.s v0_1 = ((a1.g0) this.e);
        if (!(p7 instanceof a1.i)) {
            v1_1 = new a1.i(this, p7);
        } else {
            v1_1 = ((a1.i) p7);
            m7.a v2_2 = ((a1.i) p7).d;
            if ((v2_2 & -2147483648) == 0) {
            } else {
                ((a1.i) p7).d = (v2_2 - -2147483648);
            }
        }
        h7.l v7_7;
        j6.s v0_2;
        h7.l v7_1 = v1_1.b;
        m7.a v2_1 = m7.a.a;
        a1.l v3_0 = v1_1.d;
        if (v3_0 == null) {
            c4.b.e0(v7_1);
            h7.l v7_3 = ((java.util.List) this.d);
            if ((v7_3 != null) && (!v7_3.isEmpty())) {
                h7.l v7_5 = v0_1.h();
                a1.l v3_2 = new a1.l(v0_1, this, 0);
                v1_1.a = this;
                v1_1.d = 2;
                v7_1 = v7_5.a(v3_2, v1_1);
                if (v7_1 != v2_1) {
                    v0_2 = this;
                    v7_7 = ((a1.c) v7_1);
                    ((a1.g0) v0_2.e).h.l(v7_7);
                    return h7.l.a;
                }
            } else {
                v1_1.a = this;
                v1_1.d = 1;
                v7_1 = a1.g0.g(v0_1, 0, v1_1);
                if (v7_1 != v2_1) {
                    v0_2 = this;
                    v7_7 = ((a1.c) v7_1);
                    ((a1.g0) v0_2.e).h.l(v7_7);
                    return h7.l.a;
                }
            }
            return v2_1;
        } else {
            if (v3_0 == 1) {
                v0_2 = v1_1.a;
                c4.b.e0(v7_1);
            } else {
                if (v3_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v0_2 = v1_1.a;
                    c4.b.e0(v7_1);
                }
            }
        }
        ((a1.g0) v0_2.e).h.l(v7_7);
        return h7.l.a;
    }

    public l.e f(l.a p6)
    {
        java.util.ArrayList v0_1 = ((java.util.ArrayList) this.d);
        l.e v1_0 = v0_1.size();
        int v2_0 = 0;
        while (v2_0 < v1_0) {
            l.e v3_1 = ((l.e) v0_1.get(v2_0));
            if ((v3_1 == null) || (v3_1.b != p6)) {
                v2_0++;
            } else {
                return v3_1;
            }
        }
        l.e v1_2 = new l.e(((android.content.Context) this.c), p6);
        v0_1.add(v1_2);
        return v1_2;
    }

    public Object get()
    {
        switch (this.a) {
            case 11:
                return new r6.o(((q4.f) ((k4.i) this.b).b), ((u6.k) ((g7.a) this.c).get()), ((l7.h) ((g7.a) this.d).get()), ((r6.w0) ((t6.c) this.e).get()));
            default:
                return new j6.s(((java.util.concurrent.Executor) ((g7.a) this.b).get()), ((y2.d) ((g7.a) this.c).get()), ((b8.g) ((b8.g) this.d).get()), ((z2.c) ((g7.a) this.e).get()), 13);
        }
    }

    public androidx.lifecycle.v0 i(kotlin.jvm.internal.e p6, String p7)
    {
        kotlin.jvm.internal.j.e(p7, "key");
        String v2_2;
        androidx.lifecycle.v0 v1_4 = ((androidx.lifecycle.a1) this.b);
        v1_4.getClass();
        androidx.lifecycle.v0 v1_0 = ((androidx.lifecycle.v0) v1_4.a.get(p7));
        String v2_0 = p6.a;
        kotlin.jvm.internal.j.e(v2_0, "jClass");
        Class v3_1 = kotlin.jvm.internal.e.b;
        kotlin.jvm.internal.j.c(v3_1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Class v3_3 = ((Integer) v3_1.get(v2_0));
        if (v3_3 == null) {
            if (v2_0.isPrimitive()) {
                v2_0 = q4.b.v(kotlin.jvm.internal.s.a(v2_0));
            }
            v2_2 = v2_0.isInstance(v1_0);
        } else {
            v2_2 = kotlin.jvm.internal.u.c(v3_3.intValue(), v1_0);
        }
        if (v2_2 == null) {
            androidx.lifecycle.v0 v1_2 = new o1.c(((o1.b) this.d));
            v1_2.a.put(androidx.lifecycle.z0.b, p7);
            String v2_8 = ((androidx.lifecycle.x0) this.c);
            androidx.lifecycle.v0 v6_1 = v2_8.c(p6, v1_2);
            v1_0 = v6_1;
            androidx.lifecycle.v0 v6_4 = ((androidx.lifecycle.a1) this.b);
            v6_4.getClass();
            kotlin.jvm.internal.j.e(v1_0, "viewModel");
            androidx.lifecycle.v0 v6_7 = ((androidx.lifecycle.v0) v6_4.a.put(p7, v1_0));
            if (v6_7 != null) {
                v6_7.a();
            }
        } else {
            androidx.lifecycle.v0 v6_9 = ((androidx.lifecycle.x0) this.c);
            if ((v6_9 instanceof androidx.lifecycle.t0)) {
                androidx.lifecycle.v0 v6_10 = ((androidx.lifecycle.t0) v6_9);
                kotlin.jvm.internal.j.b(v1_0);
                androidx.lifecycle.p v7_2 = v6_10.d;
                if (v7_2 != null) {
                    androidx.lifecycle.v0 v6_11 = v6_10.e;
                    kotlin.jvm.internal.j.b(v6_11);
                    androidx.lifecycle.q0.a(v1_0, v6_11, v7_2);
                }
            }
            kotlin.jvm.internal.j.c(v1_0, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
        }
        return v1_0;
    }

    public boolean j(android.content.Context p2)
    {
        if (((Boolean) this.d) == null) {
            String v2_12;
            if (p2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                v2_12 = 0;
            } else {
                v2_12 = 1;
            }
            this.d = Boolean.valueOf(v2_12);
        }
        if ((!((Boolean) this.c).booleanValue()) && (android.util.Log.isLoggable("FirebaseMessaging", 3))) {
            android.util.Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean k(android.content.Context p2)
    {
        if (((Boolean) this.c) == null) {
            String v2_12;
            if (p2.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") != 0) {
                v2_12 = 0;
            } else {
                v2_12 = 1;
            }
            this.c = Boolean.valueOf(v2_12);
        }
        if ((!((Boolean) this.c).booleanValue()) && (android.util.Log.isLoggable("FirebaseMessaging", 3))) {
            android.util.Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public boolean l(y3.f p2)
    {
        Object v0_1 = ((y3.l) this.d);
        if ((v0_1 == null) || ((p2 == 0) || (v0_1.a.get() != p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean m(l.a p4, android.view.MenuItem p5)
    {
        return ((android.view.ActionMode$Callback) this.b).onActionItemClicked(this.f(p4), new m.t(((android.content.Context) this.c), ((j0.a) p5)));
    }

    public boolean n(l.a p6, android.view.Menu p7)
    {
        android.view.ActionMode$Callback v0_1 = ((android.view.ActionMode$Callback) this.b);
        boolean v6_2 = this.f(p6);
        r.j v1_1 = ((r.j) this.e);
        m.b0 v2_1 = ((android.view.Menu) v1_1.get(p7));
        if (v2_1 == null) {
            v2_1 = new m.b0(((android.content.Context) this.c), ((m.m) p7));
            v1_1.put(p7, v2_1);
        }
        return v0_1.onCreateActionMode(v6_2, v2_1);
    }

    public void o(y3.f p3)
    {
        if (this.l(p3)) {
            y3.l v3_4 = ((y3.l) this.d);
            if (!v3_4.c) {
                v3_4.c = 1;
                ((android.os.Handler) this.c).removeCallbacksAndMessages(v3_4);
            }
        }
        return;
    }

    public void p(y3.f p3)
    {
        if (this.l(p3)) {
            y3.l v3_4 = ((y3.l) this.d);
            if (v3_4.c) {
                v3_4.c = 0;
                this.r(v3_4);
            }
        }
        return;
    }

    public Object q(n7.c p8)
    {
        j6.s v0_2;
        if (!(p8 instanceof a1.e1)) {
            v0_2 = new a1.e1(this, p8);
        } else {
            v0_2 = ((a1.e1) p8);
            d8.u v1_2 = ((a1.e1) p8).e;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((a1.e1) p8).e = (v1_2 - -2147483648);
            }
        }
        d8.u v1_3;
        d8.u v8_6;
        j6.s v0_5;
        j6.s v4_1;
        d8.u v8_1 = v0_2.c;
        d8.u v1_1 = m7.a.a;
        boolean v2_0 = v0_2.e;
        h7.l v5 = h7.l.a;
        try {
            if (!v2_0) {
                c4.b.e0(v8_1);
                if (!((d8.u) this.c).isCompleted()) {
                    v8_6 = ((m8.c) this.b);
                    v0_2.a = this;
                    v0_2.b = v8_6;
                    v0_2.e = 1;
                    if (v8_6.d(v0_2) != v1_1) {
                        v4_1 = this;
                        try {
                            if (!((d8.u) v4_1.c).isCompleted()) {
                                v0_2.a = v4_1;
                                v0_2.b = v8_6;
                                v0_2.e = 2;
                                if (v4_1.e(v0_2) != v1_1) {
                                    v1_3 = v8_6;
                                    v0_5 = v4_1;
                                    ((d8.u) v0_5.c).A(v5);
                                    v1_3 = ((m8.c) v1_3);
                                    v1_3.f(0);
                                    return v5;
                                } else {
                                    return v1_1;
                                }
                            } else {
                                ((m8.c) v8_6).f(0);
                                return v5;
                            }
                        } catch (j6.s v0_4) {
                            v1_3 = v8_6;
                            d8.u v8_7 = v0_4;
                        }
                    }
                } else {
                    return v5;
                }
            } else {
                if (v2_0 == 1) {
                    boolean v2_2 = v0_2.b;
                    v4_1 = v0_2.a;
                    c4.b.e0(v8_1);
                    v8_6 = v2_2;
                } else {
                    if (v2_0 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v1_3 = v0_2.b;
                        v0_5 = v0_2.a;
                        c4.b.e0(v8_1);
                        ((d8.u) v0_5.c).A(v5);
                        v1_3 = ((m8.c) v1_3);
                        v1_3.f(0);
                        return v5;
                    }
                }
            }
        } catch (d8.u v8_7) {
        }
        ((m8.c) v1_3).f(0);
        throw v8_7;
    }

    public void r(y3.l p4)
    {
        android.os.Handler v0_1 = ((android.os.Handler) this.c);
        int v1_1 = p4.b;
        if (v1_1 != -2) {
            if (v1_1 <= 0) {
                if (v1_1 != -1) {
                    v1_1 = 2750;
                } else {
                    v1_1 = 1500;
                }
            }
            v0_1.removeCallbacksAndMessages(p4);
            v0_1.sendMessageDelayed(android.os.Message.obtain(v0_1, 0, p4), ((long) v1_1));
            return;
        } else {
            return;
        }
    }

    public void s()
    {
        android.os.Message v0_1 = ((y3.l) this.e);
        if (v0_1 != null) {
            this.d = v0_1;
            this.e = 0;
            android.os.Message v0_6 = ((y3.f) v0_1.a.get());
            if (v0_6 == null) {
                this.d = 0;
            } else {
                android.os.Handler v1_0 = y3.h.x;
                v1_0.sendMessage(v1_0.obtainMessage(0, v0_6.a));
                return;
            }
        }
        return;
    }

    public Object then(com.google.android.gms.tasks.Task p8)
    {
        switch (this.a) {
            case 17:
                Throwable v8_11;
                String v4_2 = ((com.google.android.recaptcha.RecaptchaAction) this.c);
                j6.s v1_5 = ((com.google.firebase.auth.FirebaseAuth) this.d);
                com.google.android.recaptcha.RecaptchaAction v2_0 = ((String) this.b);
                j6.o v5_1 = ((j6.o) this.e);
                if (!p8.isSuccessful()) {
                    Throwable v8_10 = ((Exception) com.google.android.gms.common.internal.Preconditions.checkNotNull(p8.getException()));
                    if (!com.google.android.gms.internal.firebase-auth-api.zzaen.zzd(v8_10)) {
                        j6.s v1_1 = String.valueOf(v4_2);
                        com.google.android.recaptcha.RecaptchaAction v2_4 = v8_10.getMessage();
                        a5.z v3_1 = new StringBuilder("Initial task failed for action ");
                        v3_1.append(v1_1);
                        v3_1.append("with exception - ");
                        v3_1.append(v2_4);
                        android.util.Log.e("RecaptchaCallWrapper", v3_1.toString());
                        v8_11 = com.google.android.gms.tasks.Tasks.forException(v8_10);
                    } else {
                        if (android.util.Log.isLoggable("RecaptchaCallWrapper", 4)) {
                            android.util.Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(v4_2)));
                        }
                        if (v1_5.j == null) {
                            v1_5.j = new a5.z(v1_5.a, v1_5);
                        }
                        a5.z v3_3 = v1_5.j;
                        v8_11 = v3_3.w(v2_0, Boolean.FALSE, v4_2).continueWithTask(v5_1).continueWithTask(new j6.s(v2_0, v3_3, v4_2, v5_1, 18));
                    }
                } else {
                    v8_11 = com.google.android.gms.tasks.Tasks.forResult(p8.getResult());
                }
                return v8_11;
            default:
                Throwable v0_18 = ((String) this.b);
                if ((!p8.isSuccessful()) && (com.google.android.gms.internal.firebase-auth-api.zzaen.zzc(((Exception) com.google.android.gms.common.internal.Preconditions.checkNotNull(p8.getException()))))) {
                    if (android.util.Log.isLoggable("RecaptchaCallWrapper", 4)) {
                        Throwable v8_3 = new StringBuilder("Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant ");
                        v8_3.append(v0_18);
                        android.util.Log.i("RecaptchaCallWrapper", v8_3.toString());
                    }
                    p8 = ((a5.z) this.c).w(v0_18, Boolean.TRUE, ((com.google.android.recaptcha.RecaptchaAction) this.d)).continueWithTask(((j6.o) this.e));
                }
                return p8;
        }
    }

    public String toString()
    {
        switch (this.a) {
            case 16:
                String v0_4 = ((java.net.Socket) this.b).toString();
                kotlin.jvm.internal.j.d(v0_4, "toString(...)");
                return v0_4;
            default:
                return super.toString();
        }
    }
}
