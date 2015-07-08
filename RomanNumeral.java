public enum RomanNumeral {

    M(1000),
    CM(900),
    D(500),
    CD(400),
    C(100),
    XC(90),
    L(50),
    XL(40),
    X(10),
    IX(9),
    V(5),
    IV(4),
    I(1);

    private int value;

    RomanNumeral(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

    public static RomanNumeral findHighestRomanFor(int arabic) {
        for (RomanNumeral romanNumeral : values()) {
            if (romanNumeral.intValue() <= arabic) return romanNumeral;
        }
        throw new IllegalStateException(arabic + "");
    }
}