package com.google.firebase.concurrent;
public class ExecutorsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public static final a5.r a;
    public static final a5.r b;
    public static final a5.r c;
    public static final a5.r d;

    static ExecutorsRegistrar()
    {
        com.google.firebase.concurrent.ExecutorsRegistrar.a = new a5.r(new a5.g(2));
        com.google.firebase.concurrent.ExecutorsRegistrar.b = new a5.r(new a5.g(3));
        com.google.firebase.concurrent.ExecutorsRegistrar.c = new a5.r(new a5.g(4));
        com.google.firebase.concurrent.ExecutorsRegistrar.d = new a5.r(new a5.g(5));
        return;
    }

    public ExecutorsRegistrar()
    {
        return;
    }

    public final java.util.List getComponents()
    {
        java.util.List v0_5 = new a5.x(w4.a, java.util.concurrent.ScheduledExecutorService);
        a5.c v1_2 = new a5.x[] {new a5.x(w4.a, java.util.concurrent.ExecutorService), new a5.x(w4.a, java.util.concurrent.Executor)});
        a5.t v3_5 = new java.util.HashSet();
        int v5_2 = new java.util.HashSet();
        java.util.HashSet v14_1 = new java.util.HashSet();
        v3_5.add(v0_5);
        java.util.List v0_3 = v1_2.length;
        a5.c v7_0 = 0;
        while (v7_0 < v0_3) {
            q4.b.f(v1_2[v7_0], "Null interface");
            v7_0++;
        }
        java.util.Collections.addAll(v3_5, v1_2);
        a5.c v7_2 = new a5.c(0, new java.util.HashSet(v3_5), new java.util.HashSet(v5_2), 0, 0, new a5.t(1), v14_1);
        java.util.List v0_7 = new a5.x(w4.b, java.util.concurrent.ScheduledExecutorService);
        a5.c v1_4 = new a5.x[] {new a5.x(w4.b, java.util.concurrent.ExecutorService), new a5.x(w4.b, java.util.concurrent.Executor)});
        a5.t v3_10 = new java.util.HashSet();
        int v5_6 = new java.util.HashSet();
        java.util.HashSet v23_1 = new java.util.HashSet();
        v3_10.add(v0_7);
        java.util.List v0_8 = v1_4.length;
        a5.x v8_1 = 0;
        while (v8_1 < v0_8) {
            q4.b.f(v1_4[v8_1], "Null interface");
            v8_1++;
        }
        java.util.Collections.addAll(v3_10, v1_4);
        java.util.List v0_11 = new a5.c(0, new java.util.HashSet(v3_10), new java.util.HashSet(v5_6), 0, 0, new a5.t(2), v23_1);
        a5.c v1_9 = new a5.x(w4.c, java.util.concurrent.ScheduledExecutorService);
        a5.c v2_7 = new a5.x[] {new a5.x(w4.c, java.util.concurrent.ExecutorService), new a5.x(w4.c, java.util.concurrent.Executor)});
        a5.t v3_16 = new java.util.HashSet();
        int v4_5 = new java.util.HashSet();
        java.util.HashSet v23_3 = new java.util.HashSet();
        v3_16.add(v1_9);
        a5.c v1_10 = v2_7.length;
        int v5_0 = 0;
        while (v5_0 < v1_10) {
            q4.b.f(v2_7[v5_0], "Null interface");
            v5_0++;
        }
        java.util.Collections.addAll(v3_16, v2_7);
        a5.c v1_1 = new a5.c(0, new java.util.HashSet(v3_16), new java.util.HashSet(v4_5), 0, 0, new a5.t(3), v23_3);
        a5.c v2_2 = a5.c.a(new a5.x(w4.d, java.util.concurrent.Executor));
        v2_2.f = new a5.t(4);
        return java.util.Arrays.asList(new a5.c[] {v7_2, v0_11, v1_1, v2_2.b()}));
    }
}
