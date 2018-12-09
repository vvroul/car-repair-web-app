package com.example.demo.enumeration;

public enum RepairTypeEnum {
    LITTLE(1),
    BIG(2);

    private final int type;

    public int getType() {
        return type;
    }

    RepairTypeEnum(int type) {
        this.type = type;
    }

    public static RepairTypeEnum getInputEnum(Integer inputValue) {
        for (RepairTypeEnum value : RepairTypeEnum.values()) {
            if (inputValue.equals(value.getType())) {
                return value;
            }
        }
        return LITTLE; //default
    }
}
