package me.exterminate.utils;

public class BetterBoolean implements NiggerUtil {

    private BooleanValue value;

    public BetterBoolean(BooleanValue value) {
        this.value = value;
    }

    public BooleanValue getValue() {
        return value;
    }

    public void setValue(BooleanValue value) {
        this.value = value;
    }

    public static enum BooleanValue {
        TRUE,
        MAYBE,
        FALSE;
    }
}
