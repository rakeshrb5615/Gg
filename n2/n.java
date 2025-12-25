package n2;
public final class n extends c4.b {
    public java.nio.FloatBuffer c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float[] r;
    public boolean s;
    public boolean t;
    public float u;
    public float v;
    public final float[] w;
    public final float[] x;
    public final float[] y;

    public n(android.content.Context p4)
    {
        this.l = 1051931443;
        this.m = 1065353216;
        this.p = 1077936128;
        this.q = 1014350479;
        int v2_0 = new float[16];
        this.w = v2_0;
        int v2_1 = new float[16];
        this.x = v2_1;
        android.content.SharedPreferences v1_0 = new float[16];
        this.y = v1_0;
        this.n = ((-1082130432 + 1077936128) - (1077936128 * 1028443341));
        this.o = -1090519040;
        this.k0(1);
        this.s = j5.t1.z(p4).getBoolean(p4.getResources().getString(2131952262), 1);
        return;
    }

    public final void k0(boolean p14)
    {
        c4.b.i(this.c);
        if (p14 != 0) {
            int v14_16 = i2.k0.a;
            this.p = (v14_16.nextFloat() + 1073741824);
            this.q = ((v14_16.nextFloat() * 1000593162) + 1008981770);
            String v0_9 = this.p;
            this.n = (((v14_16.nextFloat() - 1073741824) + v0_9) - (v0_9 * 1028443341));
        }
        this.o = -1072902963;
        String v0_11 = this.n;
        float[] v1_1 = this.p;
        float[] v2_3 = new float[156];
        v2_3[0] = v0_11;
        v2_3[1] = -1072902963;
        v2_3[2] = 0;
        int v6_0 = 0;
        int v7 = 3;
        while (v6_0 <= 50) {
            int v8_2 = (v7 + 1);
            float v9_3 = ((double) ((((float) v6_0) * 1078530011) / 1112014848));
            v2_3[v7] = ((((float) Math.cos(v9_3)) * v1_1) + v0_11);
            int v11_4 = (v7 + 2);
            v2_3[v8_2] = ((((float) Math.sin(v9_3)) * v1_1) + -1072902963);
            v7 += 3;
            v2_3[v11_4] = 0;
            v6_0++;
        }
        this.r = v2_3;
        c4.b.i(this.c);
        int v14_21 = java.nio.ByteBuffer.allocateDirect((this.r.length * 4));
        v14_21.order(java.nio.ByteOrder.nativeOrder());
        int v14_22 = v14_21.asFloatBuffer();
        this.c = v14_22;
        v14_22.put(this.r);
        this.c.position(0);
        c4.b.j(this.d);
        int v14_27 = c4.b.M(35633, q4.b.l("iNTFXzuz/36A/EciPxE9n3yeZtJq6OKnizaKeP/pP01crsZhY4zoPTaEYPgL66r7acEXT1BSEfWZC6s5Io9nkS+JXGbq4FAWWOLjanvqsezNHtYfqX9dxVef/bKuL/WYVD+VAZfrRwpHNgyBcQpxZWfPkUUqn6LjpCRplTVgWUNd6VrKdc2aMRM9KcbcAIy2dPYOeY9GMVMwOJWocB3e/jmVIk+rquFCSCHTQnP8YGU/KGTWyW3oXMJ3zDNIA5V24TRD4xLGbXgKsokuwoIalYPbHLR0CgnITOccxeWh/hQ7lrcjwzAOLKw8NJD90C4rU2jpBrBZZmy6hpaTkeNRImNZsIQHugr/Boka4kBVv/4Acb+7NwY3dVaiv4uocpWVyvVUb3e9jacI/0I4w3ornJCjkb1a8PhZpag2aFNpFEBDCYKxBLNoUM7zFPDGy36xdjKZ+3bEtf8cyzqIX+LuaKSBIl1FRrO86gX1Rit/ol3XSDzlOEOQXv4/MJLggRnn4L0/hMEL24KMlk6WECYeatz7ypQ3z6csnVuTtwMmpUbOgva+t+MikwzxAv3mwQSbvoPgPf/MFXkPBe4jp244qtIhHThK0MiUtOrh+YkwBGKSx44n35R/07dlujtRaOlXHaoP1zDUG3PIPNjQmO5LmDtoi+pOYstR4yPFhJVzMhg="));
        String v0_19 = c4.b.M(35632, q4.b.l("KOd+G86ICKS0CZskYfaItOUQ/GVRgfOeD0cOanAjglf/InPJQmptz+DaSAruC+/MPNgHjjcfP8Xycxnh/8WVuAaeyXSEWNQBUAgrlAmFabg7YfJYuQoFL/y4g9JPuPD1/xbfnzEZdjQ+xpNpmOs/auYxQGX41ZZ1HAVUzAsRDfaIrFutmdD+IDJPLfuErRrN94CeXOcs9lLwTPj86EKvTAaLOv+j/ehWWKjfWybdd+rQ7PH6gEcuYjYmVbG3DO3cr3vAPeTgX2uMnpSnqAO24njonDJSOJsO2+5JGrbWdqjB81i4mXPTazzISca58dqL5lKzofsa91vorXdc3sJk2Q0nP9xFwuR9NNlDRcwuCPk4jAzWKCiYtxwBl/62kdLFPSrm2lGO0SjYg0cF52DaQZljicNV0vaycx7fBpUMNNw+shH7bSoTKhblYPK/0JAajOgYrHTExfymP8acSuZN+ILwCbCLdZdUgCoF9utGDgKVzsXu0Pm1TtHd81tZrOBle3FyG0bgRTrRDXAikXtFBxziMiSv12I/q87v0ZMyg999Op8mIbojLHKkBZGsKc865ccxagL7d+EG4LOzfuzwlJmoaY62DaRIxVMdeO8mdbLUk/0Ka3X33SgEBtMcM+3HXkADinuUIRqFLe0R410hPRvMWxgew43TsrIQdrBTSTa4MeCKSNrSofQVOZG9CquxmRYn5YOfOe9rMG9krmEcCq2PClkY3n51joZ2UCGsljfB4m47veMDXsY+3yfYEU8AVhDsAI4BbIk8LZzSKKjTqf38kTNPMsGH3lEYrFi/cMNJ7ZqyYwa5u6AnD2uQ7N/q1At0FW/4S/I98FyxuYzAypRFIQKf1UAH1Y1BIY5SCSVZrZ2YRnnlLnALeG/HNl9bt8ZEm8celWei5ZOwt2C+cLQ7sC1nZSrkCfzQT/MYSfKfY5oPlE4W2l04QVH/rwNX3gNBCTSftDzwLFHKALf9frTkpSPxvYHJsgCFwhQrBcyCEIiUQln1fMw2e4AUTO5I/hWaEj7lcMqKMWQtba3p3K2nAAVwPTWicgNYPTjIsUtpaDR6607u70MUgaNtiWK5z9CkPIXoWFSjjx0310NywS/WTxAPg+JIeLoo7vhxeFHNUP4tPV6tHVkxXD/pFkR1lXXiDrruyDdGCO80Xk0oTbWHfiF5jw3rUrRLS5+uxcsTWQE7hz1m4FRjN4qiao6gZnNSJwPjQg/3ZRPALl3rLJcsdPB2uK7JGSclbI0Uf3YsJWhkUsZrYIgsEFN3VE0ircQVqKehZE4COjrizPrCeL7Som8Nx74P3G4aZa0csVZiaorurBFdDnYJ4s4yDHiMYJFeJ+Jd0Kj4CUOq4gPiFAcV1YdCKMXpSxmkrT7CA29BWWLPx21zpWL2AApiBSAcxe5hKwGY5/gCQcRbO7tN9mxwE94Wl26GcXYVqgQXt64LKtfEf9TrQeebdQMVjIasO/zYEucyqbv8y1+LSZgafi/eoP2skWJKHA6BQ037avDg13k5JVVlIBTdL/0bsXCzAF5dmvxPV3CXtsDFBwuDp+BmaqlmiDiny4ti0NnLSG9TM4mL2e98C0Pzt8q+aLl00MA6/YZndnRst8Wh1PEip1l8om2nWEwDR0unpcePOJwYkxdbziIwWqOeyrboOwnMAo1Q3pvaMj6qjzm46ykA0K+4Is9LPwrcPFsbevjREF50HH/Lh1kkh1un38F7WNXY07LXMtheTiW7Sq5alecPoogrnvOkanRyvYPqTj8AY4VOoiwmlaTTDPJaF/U2hncp4vn9HZ+GeXLDdCXK2dwDkFGMaerA+jxJYD1XEOh7AoQEg7/RmoXHyJ/Z4C74Y7RFJs6otBSUAcJFQu20DWHz7Nt0+9C01z/nAE1+sZJTs3UhYQDTWr1BO0txQTA4VJpegI3VS6gwDmNZaD7/KzxonAlrUwig1FDB1EDd7uojEQ5WWC1A3mE9dRGidnbjS+9+cue2nk9q4H8UFkV2G4ou1dsvIM58a2I2zKNUXOYkdWq2kML2yFl8xh9vlOnFJ93DHEVilSGIoR27vdTEs34YDhgyv+dQV2xMITL6zywGKmwU3ZFlIsWT9UiL8C+MIE7aQ/2vR0i8EjhDp0dJNecwgO9XfCUjRpFljSh7XEx7/gStoQei2NpofqqWrfIKxhGIolLD16oDlIPJD3r48L5z9m9S2AFnCfjNhZGtZBK4sn3RFI0BH6NXYqlYLlGX4yuifP1WccvoS12Z8Sg/JxSBGiX1M4umxNcMlqB9BEsLa0k="));
        float[] v1_4 = android.opengl.GLES20.glCreateProgram();
        this.d = v1_4;
        android.opengl.GLES20.glAttachShader(v1_4, v14_27);
        android.opengl.GLES20.glAttachShader(this.d, v0_19);
        android.opengl.GLES20.glLinkProgram(this.d);
        c4.b.a0(this.w, this.x, this.y, -1082130432, 1065353216, -1082130432, 1065353216);
        this.e = android.opengl.GLES20.glGetAttribLocation(this.d, "vPosition");
        this.f = android.opengl.GLES20.glGetUniformLocation(this.d, "uAlpha");
        this.g = android.opengl.GLES20.glGetUniformLocation(this.d, "uAspectRatio");
        this.h = android.opengl.GLES20.glGetUniformLocation(this.d, "uCenter");
        this.i = android.opengl.GLES20.glGetUniformLocation(this.d, "uRadius");
        this.j = android.opengl.GLES20.glGetUniformLocation(this.d, "step");
        this.k = android.opengl.GLES20.glGetUniformLocation(this.d, "uOffsetX");
        return;
    }
}
