package n2;
public final class t extends c4.b {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int[] K;
    public final int L;
    public boolean M;
    public final android.content.Context N;
    public float O;
    public float P;
    public final float[] Q;
    public float R;
    public float S;
    public float T;
    public int U;
    public final float[] V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public int c;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public final int g;
    public final java.nio.FloatBuffer h;
    public final java.nio.FloatBuffer i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public t(android.content.Context p5, android.content.SharedPreferences p6)
    {
        int v1_0 = new float[16];
        this.d = v1_0;
        int v1_2 = new float[16];
        this.e = v1_2;
        int v0_10 = new float[16];
        this.f = v0_10;
        int v1_3 = new int[2];
        this.K = v1_3;
        int v2_0 = new float[2];
        this.Q = v2_0;
        int v0_1 = new float[2];
        this.V = v0_1;
        this.N = p5;
        this.M = p6.getBoolean(p5.getString(2131952246), 1);
        int v6_55 = c4.b.M(35633, q4.b.l("MfzI+f+y1B50XqZJ8b0DaAjfFhpZKl58FEUhxiDdKe8FRm/FBfm6CRUxPV3BvKt/lOlWVYtSHzwA6IBt2aDdyxbnnw6WnLCsWs2Ah6JcJ/PL4Kv0GySSoRkXMrBz5J0aeXXrbOZxdrlBVKAO6m4Fekaa/xaXVjorUr8O3UV43U+JH/mnJKG5KTl1tiz75FZsCJvhFb79iFxm0gjc7pWIj2Io2bS+FUjgwC0Q54rhXWjeVmQvpfApzO4OfnmIqM87"));
        int v0_7 = new StringBuilder();
        v0_7.append(q4.b.l("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"));
        v0_7.append(q4.b.l("U1Espsk1yWfYcmNR8Xd0eKH1rO3tIAFPEegr4FYYfID7qj6Ym9ekrq9TWFbgXRFSjIJbky+ViEEAl6oPgiHk0Pz2Yfnd3lF/LBcjTaJbEGIwAT+Dq+ePQxAeppWryVqys4hEF+fjWSinSBkbcKhaU1Of5ScsYPdTIH0y30VagmDeNQdE9hRAkJFb4kRw2jotLLeqmv5jefdee7mo1lbJWrVasdYTxgXRfuqPCvNtQ6VofctdNQnj6/Ts+C9krSQSjx0NpwbjgSdQz8zcyR8vJKuoOulJ2IYKxwmg1Hijpdare/U6aGKbs5u6km8ty5bwgtUIXx62VTSmK7FM0lErOtYRi3TRYw4u2wBUrVIGjXDkXMgA4vwACrFSCoiH/IA9th7VkboUv5tEfo9rQlCcLzxCgzQTAzWhXy54CXLSfcRaCSvUXj6vYNx9BTECb5pnUTA66nnmjwdtl6WrYErh92PVkK9UDHtD3v/49Z1t9ANPj/exXrMMmYOcrgHW2da7m65Z/88FPMskrSyp6v0ZEqMrgqwhG61nLc1m3XiOAo0NSoRDV7CPhXxhXAKOYdY1PhI67FMf22GoKsNDleJUMZdQyhF62jmI+0/PmQvwO2Sq3Grqtqn/UEgCa4Qe/bNBdJbky13eYq1n8HZHXRCnJXLhuS/P1DsCr7GTU8zAVsN5gIY4+Y+++tmysQNkltb24thIfehL5ljLIryzF3fzbtL6ZE48a53syUA/zgo6h0edz7PNwHrZyDwdLjIeadscyfYSOI78rvjy0xvuxeuxjEYnIEfOf+4M6e40+Ot8UW5jXdUaF7m5mkbQvI1Zzzvka21IdsoFQVhV5lHlhQwpikNGjll+6Jr/Y6LjERVoxSS1/HDbBNKuPn8NSKQyqkTq/y6U3/VGfytBuoHjoW1VbqUZQsHa7R4iIEyJ1epOcmqnXfy/oNnXF8DrtQvSDqorRlMscn1NGf76YdEHBmQ4WbjpZx8O36M9F6PF9kEE51bwt79/wGZFz13CJ4D83LAEuT8CAbi3890q3V6nFzk7MBvs0nGOVk7KZOCw/7DA9QyiT4tJeN+9All/EN7mEE9vx25JH9Sc4VBXFc/3/PQ7skOyAvZhH1Mn/ZCxrmbN9jr1CnmtUI3FSc0jZyOxZcXH3x9/Q6wVpoFa1NS9BK5qRpLem5BDoyA51j72PjXAWM1xEGEiOIqnq76s9I2WHgSOwYWHenVxJiKgvqjHCBEUO1/f13tuaArWmXA0zU5RhRW3/ozX7iVndu4ZtYzgZeNb7ctUmX2GGTVvL6Qx5f7c5sQj1mZkGiKv9I9u4uY+M5VGsByzamJR0rDH/0DPSR9XioXZd9YjsEoqhVF7eFkWe1IML0q8Z8rgLSHMsQ4PKUKNBdjR9Ted7Txm+pGPX3Q8GODrvbVpbdsQydR20zeV4EL20IuG04dCABsGsyt4e6xa4Itkk0yp/qQD7Xr1XPtkY9XA2YbsUPvZe+LFZovoKXvnXSiTQxbks8A3yy0sbu3we23q1DzU1QauTaWKIdGGE1kvwM8LRNqBOPbS72cJxHkuT3HHPi3XZ0qiAorb2kAeT5Fw7AK6/4CUpSAEbU9YXTv0J/2f2vHsCwq07UCNiX+Aep8wlumTqH2HBDeX6SlMLU9pn5KRWcoRFTQGUkHVIppevnZfm1VWehpMMagxRKDRdoOTDcQ54XpXp9jDmRQ/vehgBAazrWh20G81vyZIdglNTRBhsEGBBpSEhbjnRNq+luZpzw02FY4liaKIZE/zcrnb3SqefC7frLqSPChLktrTaUn2wNqPBOoMmMgHbcLi1z0V4y8DM4tnxF63MMhTVMCcDF28GqxV3e+4bU1Ek7gjJnfoKfYmo0kOLApcgkNv6BnhwZeW5e/dbZPPZEwuKXuCE8tyfm1BrfU4yK9YcKTY6nfeDIsru4Za7Qxc/q27LnsC/xRj0d7qN8ExQ6N0FO1o15qagDhhEC7J7Giq"));
        v0_7.append(q4.b.l("7KV8HWO1jrl0JKozu7QwuB2d5V74xrgDh/YOui6fTyV2eMj+wJD77mJuHYL5i1XPxusxkftL63fJWmE7pdspFYBXB/gJqr6t0t/Zi56SGZc6GunTLAhzBtSXTGu6GUfvHKKmM/c1FivpCjYg3ajjX2CPLWK1Kjo+s3Zx8CBXrwR4K7rsKXmtAHoLRlQGmb+a0rtWQbHyHR3oA+mh5XjhYOb9mjgZ98WaHiHcNPId2MslDvhjB8k2r2m04sjvRvxGuHZlgJuhQaWi9XAOwexzitXqtX+rLrH1LG3Am2+63T+2QtJJM0SDGHbwcoNiRuOsnV7aAobqBEDtZA3DUOU9VI9OAZABYJnieN54qa1gOfErC93SnvHavGA5CJ97qkWlU7wqh575YZFgdewb6e7S2iA45UdEUz7luqxqp/578229YqQJ1KXgVIUK+B/Gb45t7sDtt7ZOtt4dQ4uX8cd+Aw4gbVajYN/cQbHkG09NIl3OAMOntjo9q6J2hSEbzPh36oVCgvrcAdbHOHa4Pusl7a51xRPghWFvJUybz/iJExHIDg4NwCO4PgI8crjxd0CbL+3nFsM3ExQbp6ZRaYAFSl0nIL00MrGdDhlKOF7SQErKEi8b+1x+OeuthnwjpKJ8LFgJq5LG9SnKGwc8MeVbw74M087vJaiXOPee2wxAjBiiDq+B7XDdff0GNbTHSNvasjf+P9lMILMi4/Wt/3tIV51hYVngOu5xjW8caoB2vXWo7BMbnxiPFG9KWBAbjorNvuG5rGT+Dz8fe5pBjgthMtTI/5QBOFIgMv+nH5e4zvotr9j9W5MNzdwuAP6kzArMxJZISCDcM1ICWvALHe/p5/FJMdCLn2yuw8qNE6eU16V+2hknCD+2QKnJgZe/ThWogqrFc9wzZkkiguSuIyfEeFmEhlvZocS6JfZpg0hSkJB6LquH5YxroQjl5XgnC/7Rt7LTS0PJCRpwubCruo3hzpX6OOFTircqq+ng4PaINSMOh6dygM0ipaq09xeqN7TAiVfbNu0f/+W5nKk5np1PX0b4KICet01cGHttE/hFCuhUxs4k/kobodBsL/jwqqRla1JkdiA7AKjp6ns9vG/6RWIe1rQwfShPH8o3NjluYkxLfIXrgRD6N4VccsfhERQE0UJsQmqppQ2luqjVeVS8jl7eRByoJ0LMZh0eOSZ60L31GBfK5UXhcKjeEvF/veX58FkSuRicnK1LPiSxg2I+EwqS94jmUo8oJUZY/DL+xyvF2f33T15Kl5VXeKBoHEFSv+zoJGXe+wf2zcKkDYPORwtw6CHMxgeJc/ihN1KTDtUumLTpFsbTXjs65ylT3lURFRcDs6ZJWL2/Yuddul046FwlPAxG8vFnr7yh8pnPZ5le+wt2UB/WspduPg09zdfZKOsp4b6G1EUnrOdzOKLDuPW6zkeaYUf+cnYbu3ka/lvoSXpwmABS6XODur88gZLSwZSGX+jECd0fb+vexC7jCvQtElHZ3q+bMuwQa13qlzXZgNkrWdWCs/C+cSsWXXTERJQJe93bL179H0LK43DuLw9rik9fgrpCAc0DRtXmzVD2gOHW0vLQ2pFZx7KRo3hhZmoFvCogz1V9RvnaVfv/pzFtBQ50Q5exGH5Uv2fHOKe5J1Q4cdbtkIwXqCzlmoZ0i01DsasevrjT5tzDB5Tqby6TtaNHS3sBA/p0OgogUZ1jvBY0yWJAywie48fX3t5KG/wMfHSrMqLvqXuz8s/FIceKLQsLzp60fZmXeS6Ru8li2CpbnkYLqVwBVOPg/wG6jCJ5qAIqgkdig1IDhXXpDV6ivOzgTKqzO0VlXc9LQhmUaFfiXHgMlrdZJOmAus9nenMYkM+WWF5vNmoJuzcS1QwJyI4+AHNxPOWYgBH1LV0Gh1XdNNuk+j8TIsrGGRekOvUpoaAWUpIrI9Px2qSpXmrmIlfooAY+EebZzB+kYqS/OGCRLwukLwWASLxUruLFpd/4sij8uDFZ1nMzLrxBjVuNe9k3v1fR9McKudwRNiyAF23iIvCk2COqltJxh+7COQ+kDHtXNesbe5M0lXYcaoqLEXE5unzfzBQ1uw9fBq6TR/V5Djz6/g98PFC/bEmtZHYziPzE5uNdrRY07QuiqI8EhQHAEAEaHmFSWf53r4KHUptiPQqt8MuePBHO+pU7PVUgA3V4pSfkgwAv+/0U8X8zO06ieVpsQ66YRcY3HuGVLS2oT86cnWqVnMVg9lamq33rPz7kDMpZBa6gmlchWGreLMoWDQ0+wnJClgC15gVRCo1OCtxDWkce1wxMYVA446XttXDACgXvbVS84SgGovMJaEAJfWhQ7vJsIwcctZ9TOGa5i6fCXY+UgXv6FeQQf/E99G0XhhcW8Z4LmKujvQr18tevXKz+JUGupYCoALLq2lhbI2UL/Vau64kdp+1saYePlkHSZ9wlfxKG84mrBnJP5kk2B8WnMO+RH4HIrrf/EVmuyL4uisZ0p/ZhYR/HH667ToLZhA0CrmhR+516DeyIT0Yxb2vVhH4WoWXrG71Wlw0hYQgXbz5fRzzTCEJiDyM7x+5H6FpsuKmbWtemfnRLdCQB485dOa0aM4b9XPUOHnWHD1GN+51/aap9htEPf+5lpqJtaon6kenASN6opI6DcXojY7jD5lMe2c+FQRZjb+pGx0ur+E8Wb9lJtwOo4kCQxMatmQOpywe5bnNes/VHYF9dSROhI89HushU9z7Tvx0WllhhIJgGnR1MIvzBnr8IByFpRY6sJTlDC14ljAQ/YWqNvfXeQ/qFAqnwoWAXbYFby+cYW+zzFCRLOyCY8cRP4sc59OIl3oeXf8w7fbaUPbUZW6ELZl0M8O+74Ex2vlcQxsTmIknvx9+6X9I2Hah4l4CVzGnysQpM//6FNOQLboQSR8fhNUPA3Taws7HfOczWppI5FBK9c8wZaZCnEhDcywil5C4RdJDrBySTFw=="));
        int v0_9 = c4.b.M(35632, v0_7.toString());
        int v2_11 = android.opengl.GLES20.glCreateProgram();
        this.g = v2_11;
        android.opengl.GLES20.glAttachShader(v2_11, v6_55);
        android.opengl.GLES20.glAttachShader(v2_11, v0_9);
        android.opengl.GLES20.glLinkProgram(v2_11);
        this.j = android.opengl.GLES20.glGetAttribLocation(v2_11, "a_Position");
        this.k = android.opengl.GLES20.glGetAttribLocation(v2_11, "a_TexCoord");
        this.l = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_MVPMatrix");
        this.m = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_ReflectionTexture");
        this.n = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_DistortionMap");
        this.o = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_DistortionMapIce");
        this.p = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_Time");
        this.q = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_SunScreenPos");
        this.r = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_SunColor");
        this.s = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_deepWaterColor");
        this.t = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_shallowWaterColor");
        this.u = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_WaterHeightRatio");
        this.v = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_HorizonY");
        this.w = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_WindStrength");
        android.opengl.GLES20.glGetUniformLocation(v2_11, "u_WindDirection");
        this.x = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_xOffset");
        this.y = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_waveStrength");
        this.z = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_waveScaleFar");
        this.A = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_waveScaleClose");
        this.B = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_clarity");
        this.C = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_rainAmount");
        this.D = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_rainStrength");
        android.opengl.GLES20.glGetUniformLocation(v2_11, "u_FishTexture");
        this.E = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_FishCenter");
        this.F = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_FishSize");
        this.G = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_FishVisibility");
        android.opengl.GLES20.glGetUniformLocation(v2_11, "u_rippleCount");
        android.opengl.GLES20.glGetUniformLocation(v2_11, "u_RippleCenters");
        android.opengl.GLES20.glGetUniformLocation(v2_11, "u_RippleStrengths");
        this.H = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_motion1");
        this.I = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_motion2");
        this.J = android.opengl.GLES20.glGetUniformLocation(v2_11, "u_motion3");
        int v6_38 = new float[12];
        v6_38 = {-1082130432, -1082130432, 0, 1065353216, -1082130432, 0, -1082130432, 1065353216, 0, 1065353216, 1065353216, 0};
        this.h = c4.b.q(v6_38);
        int v6_41 = new float[8];
        v6_41 = {0, 0, 1065353216, 0, 0, 1065353216, 1065353216, 1065353216};
        this.i = c4.b.q(v6_41);
        int v6_44 = new android.graphics.BitmapFactory$Options();
        v6_44.inScaled = 0;
        int v6_47 = new android.graphics.Bitmap[] {android.graphics.BitmapFactory.decodeResource(p5.getResources(), 2131231515, v6_44)})[0];
        if (v6_47 != 0) {
            int v6_48 = c4.b.N(v6_47);
            v1_3[0] = v6_48;
            android.opengl.GLES20.glBindTexture(3553, v6_48);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 10497);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 10497);
            android.opengl.GLES20.glBindTexture(3553, 0);
        }
        this.L = c4.b.O(p5, 2131231516);
        return;
    }

    public final void k0(int p21, float[] p22, float[] p23, float[] p24, float[] p25, float p26, float p27, float p28)
    {
        n2.t v0 = this;
        int v2_5 = this.g;
        if ((v2_5 != 0) && (p21 != 0)) {
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendFunc(770, 771);
            android.opengl.GLES20.glDisable(2929);
            android.opengl.GLES20.glDepthMask(0);
            android.opengl.GLES20.glUseProgram(v2_5);
            int v2_1 = (this.P + p28);
            this.P = v2_1;
            android.opengl.GLES20.glUniform1f(this.p, v2_1);
            int v5_6 = (p27 * 1051260355);
            int v6_19 = (p22[0] / p26);
            android.opengl.GLES20.glUniform1f(this.u, (v5_6 / p27));
            android.opengl.GLES20.glUniform1f(this.v, 1051260355);
            android.opengl.GLES20.glUniform1f(this.w, 1051260355);
            android.opengl.GLES20.glUniform2f(this.q, v6_19, Math.min((p22[1] / 1051260355), 1065353216));
            android.opengl.GLES20.glUniform3fv(this.r, 1, p23, 0);
            android.opengl.GLES20.glUniform3fv(this.s, 1, p24, 0);
            android.opengl.GLES20.glUniform3fv(this.t, 1, p25, 0);
            android.opengl.GLES20.glUniform1f(v0.x, v0.Z);
            android.opengl.GLES20.glUniform1f(v0.y, v0.Y);
            android.opengl.GLES20.glUniform1f(v0.z, v0.X);
            android.opengl.GLES20.glUniform1f(v0.A, v0.W);
            android.opengl.GLES20.glUniform1f(v0.B, v0.S);
            android.opengl.GLES20.glUniform1i(v0.C, v0.U);
            android.opengl.GLES20.glUniform1f(v0.D, v0.T);
            int v8_30 = ((double) ((float) (((double) this.P) % 4641240890982006784)));
            int v10_8 = (4585925428558828667 * v8_30);
            int v8_31 = (v8_30 * 4581421828931458171);
            int v12_6 = (4618760160132070795 * v8_31);
            int v11_3 = ((float) (Math.cos(v12_6) * 4599075939685498880));
            int v8_2 = ((float) (Math.sin((v8_31 * 4614256447914709615)) * 4599075939685498880));
            int v9_0 = ((float) (Math.sin(v12_6) * 4600877379429072896));
            int v12_2 = ((float) (Math.cos(v12_6) * 4600877379429072896));
            android.opengl.GLES20.glUniform2f(this.H, ((float) (Math.sin((v10_8 * 4618760160132070795)) * 4596373779801702400)), ((float) (Math.cos((v10_8 * 4614256447914709615)) * 4596373779801702400)));
            android.opengl.GLES20.glUniform2f(this.I, v11_3, v8_2);
            android.opengl.GLES20.glUniform2f(this.J, v9_0, v12_2);
            int v8_4 = (this.O + 995211031);
            this.O = v8_4;
            if (v8_4 <= 1067450368) {
                if (v8_4 < -1090519040) {
                    this.O = 1069547520;
                }
            } else {
                this.O = -1090519040;
            }
            int v6_13;
            int v8_5 = this.Q;
            v8_5[0] = this.O;
            android.opengl.GLES20.glUniform2f(this.E, -1090519040, 1041865114);
            android.opengl.GLES20.glUniform1f(this.F, 1048576000);
            if (v8_5[0] >= 1056964608) {
                v6_13 = (- this.O);
            } else {
                v6_13 = this.O;
            }
            android.opengl.GLES20.glUniform1f(this.G, v6_13);
            int v9_3 = this.e;
            android.opengl.Matrix.orthoM(v9_3, 0, 0, p26, 0, p27, -1082130432, 1065353216);
            int v6_14 = this.d;
            android.opengl.Matrix.setIdentityM(v6_14, 0);
            int v10_2 = (p26 / 1073741824);
            int v5_0 = (v5_6 / 1073741824);
            android.opengl.Matrix.translateM(v6_14, 0, v10_2, v5_0, 0);
            android.opengl.Matrix.scaleM(v6_14, 0, v10_2, v5_0, 1065353216);
            int v22_1 = this.f;
            android.opengl.Matrix.multiplyMM(v22_1, 0, v9_3, 0, v6_14, 0);
            android.opengl.GLES20.glUniformMatrix4fv(this.l, 1, 0, v22_1, 0);
            int v2_4 = this.j;
            android.opengl.GLES20.glEnableVertexAttribArray(v2_4);
            android.opengl.GLES20.glVertexAttribPointer(this.j, 3, 5126, 0, 12, this.h);
            int v5_5 = this.k;
            android.opengl.GLES20.glEnableVertexAttribArray(v5_5);
            android.opengl.GLES20.glVertexAttribPointer(this.k, 2, 5126, 0, 8, this.i);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, p21);
            android.opengl.GLES20.glUniform1i(this.m, 0);
            android.opengl.GLES20.glActiveTexture(33985);
            android.opengl.GLES20.glBindTexture(3553, this.K[0]);
            android.opengl.GLES20.glUniform1i(this.n, 1);
            android.opengl.GLES20.glActiveTexture(33986);
            android.opengl.GLES20.glBindTexture(3553, this.L);
            android.opengl.GLES20.glUniform1i(this.o, 2);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(v2_4);
            android.opengl.GLES20.glDisableVertexAttribArray(v5_5);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glUseProgram(0);
            android.opengl.GLES20.glDepthMask(1);
            android.opengl.GLES20.glDisable(3042);
        }
        return;
    }

    public final void l0(i2.v0 p8)
    {
        float v0_4 = m2.a.c(this.N, 9)[3];
        float v8_7 = p8.j();
        float v2_8 = this.R;
        this.W = ((1050253722 * v2_8) + 1045220557);
        this.X = ((v2_8 * 1045220557) + 1036831949);
        this.Y = ((v2_8 * 1025758986) + 990057071);
        if ((v8_7[0] == 0) && (v8_7[1] == 0)) {
            if (v8_7[2] == 0) {
                if ((v8_7[3] == 0) && (v8_7[4] == 0)) {
                    this.S = 0;
                    return;
                } else {
                    this.S = g2.g.b(1056964608, ((v0_4 * -1102263091) + 1045220557), ((1065353216 - v0_4) * (v0_4 * 1065353216)), ((v0_4 * -1102263091) + 1045220557));
                    return;
                }
            } else {
                this.S = 1045220557;
                return;
            }
        } else {
            this.S = g2.g.b(1056964608, ((v0_4 * 1045220557) + 0), ((1065353216 - v0_4) * (v0_4 * 1065353216)), ((v0_4 * 1045220557) + 0));
            return;
        }
    }

    public final void m0(i2.v0 p4, int p5)
    {
        float[] v0_5 = (((float) Math.abs(p5)) / 1115815936);
        this.R = v0_5;
        if (!this.M) {
            this.T = 0;
        } else {
            this.T = ((1099956224 - (v0_5 * 1094713344)) * 1073741824);
        }
        float[] v0_4 = this.V;
        v0_4[0] = (- (((float) p5) / 1115815936));
        v0_4[1] = 1036831949;
        if (p4 != null) {
            this.l0(p4);
        }
        return;
    }
}
