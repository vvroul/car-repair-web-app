package com.example.demo.enumeration;

public enum RepairStateEnum
{
    AWAITING(1),
    ONGOING(2),
    COMPLETED(3);

    private final int state;

    public int getState() {
        return state;
    }

    RepairStateEnum(int state) {
        this.state = state;
    }

    public static RepairStateEnum getInputEnum(Integer inputValue) {
        for (RepairStateEnum value : RepairStateEnum.values()) {
            if (inputValue.equals(value.getState())) {
                return value;
            }
        }
        return AWAITING; //default
    }
}
