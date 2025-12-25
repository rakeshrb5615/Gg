package y6;
public abstract class j {
    public static final int a;

    static j()
    {
        int v0_1 = System.getProperty("java.version");
        int v1 = 0;
        try {
            StringBuilder v3_4 = v0_1.split("[._]", 3);
            int v4_0 = Integer.parseInt(v3_4[0]);
        } catch (NumberFormatException) {
            v4_0 = -1;
            if (v4_0 == -1) {
                try {
                    StringBuilder v3_2 = new StringBuilder();
                } catch (NumberFormatException) {
                    v4_0 = -1;
                }
                while (v1 < v0_1.length()) {
                    int v4_2 = v0_1.charAt(v1);
                    if (!Character.isDigit(v4_2)) {
                        break;
                    }
                    v3_2.append(v4_2);
                    v1++;
                }
                v4_0 = Integer.parseInt(v3_2.toString());
            }
            if (v4_0 == -1) {
                v4_0 = 6;
            }
            y6.j.a = v4_0;
            return;
        }
        if ((v4_0 != 1) || (v3_4.length <= 1)) {
        } else {
            v4_0 = Integer.parseInt(v3_4[1]);
        }
    }
}
