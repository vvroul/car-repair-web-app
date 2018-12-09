package com.example.demo.enumeration;

public enum UserTypeEnum {
    USER(1),
    ADMIN(2);

    private final int type;

    public int getType() {
        return type;
    }

    UserTypeEnum(int type) {
        this.type = type;
    }

    public static UserTypeEnum getInputEnum(Integer inputValue) {
        for (UserTypeEnum value : UserTypeEnum.values()) {
            if (inputValue.equals(value.getType())) {
                return value;
            }
        }
        return USER; //default
    }
}
