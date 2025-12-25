package kotlin.jvm.internal;
public abstract class h extends kotlin.jvm.internal.c implements kotlin.jvm.internal.g, z7.e {
    private final int arity;
    private final int flags;

    public h(int p9, Object p10, Class p11, String p12, String p13, int p14)
    {
        int v7;
        if ((p14 & 1) != 1) {
            v7 = 0;
        } else {
            v7 = 1;
        }
        kotlin.jvm.internal.h v2_0 = super(p10, p11, p12, p13, v7);
        v2_0.arity = p9;
        v2_0.flags = 0;
        return;
    }

    public z7.b computeReflected()
    {
        kotlin.jvm.internal.s.a.getClass();
        return this;
    }

    public boolean equals(Object p5)
    {
        if (p5 != this) {
            if (!(p5 instanceof kotlin.jvm.internal.h)) {
                if (!(p5 instanceof z7.e)) {
                    return 0;
                } else {
                    return p5.equals(this.compute());
                }
            } else {
                if ((!this.getName().equals(((kotlin.jvm.internal.h) p5).getName())) || ((!this.getSignature().equals(((kotlin.jvm.internal.h) p5).getSignature())) || ((this.flags != ((kotlin.jvm.internal.h) p5).flags) || ((this.arity != ((kotlin.jvm.internal.h) p5).arity) || ((!kotlin.jvm.internal.j.a(this.getBoundReceiver(), ((kotlin.jvm.internal.h) p5).getBoundReceiver())) || (!kotlin.jvm.internal.j.a(this.getOwner(), ((kotlin.jvm.internal.h) p5).getOwner()))))))) {
                    return 0;
                } else {
                    return 1;
                }
            }
        } else {
            return 1;
        }
    }

    public int getArity()
    {
        return this.arity;
    }

    public bridge synthetic z7.b getReflected()
    {
        return this.getReflected();
    }

    public z7.e getReflected()
    {
        d8.e0 v0_0 = this.compute();
        if (v0_0 == this) {
            throw new d8.e0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        } else {
            return ((z7.e) v0_0);
        }
    }

    public int hashCode()
    {
        int v0_6;
        if (this.getOwner() != null) {
            v0_6 = (this.getOwner().hashCode() * 31);
        } else {
            v0_6 = 0;
        }
        return (this.getSignature().hashCode() + ((this.getName().hashCode() + v0_6) * 31));
    }

    public boolean isExternal()
    {
        return this.getReflected().isExternal();
    }

    public boolean isInfix()
    {
        return this.getReflected().isInfix();
    }

    public boolean isInline()
    {
        return this.getReflected().isInline();
    }

    public boolean isOperator()
    {
        return this.getReflected().isOperator();
    }

    public boolean isSuspend()
    {
        return this.getReflected().isSuspend();
    }

    public String toString()
    {
        String v0_0 = this.compute();
        if (v0_0 == this) {
            if (!"<init>".equals(this.getName())) {
                String v0_1 = new StringBuilder("function ");
                v0_1.append(this.getName());
                v0_1.append(" (Kotlin reflection is not available)");
                return v0_1.toString();
            } else {
                return "constructor (Kotlin reflection is not available)";
            }
        } else {
            return v0_0.toString();
        }
    }
}
