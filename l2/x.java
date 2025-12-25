package l2;
public final class x implements android.text.TextWatcher {
    public final synthetic android.widget.EditText a;
    public final synthetic l2.a0 b;

    public x(l2.a0 p1, android.widget.EditText p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void afterTextChanged(android.text.Editable p10)
    {
        if (!android.text.TextUtils.isEmpty(p10.toString().trim())) {
            android.widget.EditText v0_3 = this.a;
            v0_3.removeTextChangedListener(this);
            com.google.android.material.textfield.TextInputLayout v10_2 = p10.toString().trim();
            String v1_0 = this.b;
            int v2_0 = v1_0.R1;
            if (v0_3 != v2_0) {
                if (v0_3 != v1_0.S1) {
                    if (v0_3 == v1_0.T1) {
                        v2_0.setText("");
                        v1_0.O1.setError(0);
                        try {
                            double v5_2 = Double.parseDouble(v10_2);
                        } catch (NumberFormatException) {
                            v1_0.Q1.setError(v1_0.getString(2131951829));
                        }
                        if (v5_2 >= -4582834833314545664) {
                            if (v5_2 <= 4640537203540230144) {
                                v1_0.Q1.setError(0);
                                v0_3.addTextChangedListener(this);
                                return;
                            } else {
                            }
                        }
                        v1_0.Q1.setError(v1_0.getString(2131951829));
                    }
                } else {
                    v2_0.setText("");
                    v1_0.O1.setError(0);
                    try {
                        double v5_3 = Double.parseDouble(v10_2);
                    } catch (NumberFormatException) {
                        v1_0.P1.setError(v1_0.getString(2131951830));
                    }
                    if (v5_3 >= -4587338432941916160) {
                        if (v5_3 <= 4636033603912859648) {
                            v1_0.P1.setError(0);
                            v0_3.addTextChangedListener(this);
                            return;
                        } else {
                        }
                    }
                    v1_0.P1.setError(v1_0.getString(2131951830));
                }
            } else {
                v1_0.S1.setText("");
                v1_0.T1.setText("");
                v1_0.S1.setError(0);
                v1_0.T1.setError(0);
                if (v10_2.matches("[\\p{L} .,\'-]+")) {
                    v1_0.O1.setError(0);
                } else {
                    v1_0.O1.setError(v1_0.getString(2131952203));
                }
            }
            v0_3.addTextChangedListener(this);
            return;
        } else {
            return;
        }
    }

    public final void beforeTextChanged(CharSequence p1, int p2, int p3, int p4)
    {
        return;
    }

    public final void onTextChanged(CharSequence p1, int p2, int p3, int p4)
    {
        return;
    }
}
