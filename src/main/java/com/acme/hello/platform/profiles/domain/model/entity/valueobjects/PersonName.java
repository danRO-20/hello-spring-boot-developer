package com.acme.hello.platform.profiles.domain.model.entity.valueobjects;

public record PersonName(String firstname, String lastname) {
    private static final int FIRST_NAME_MAX_LENGTH = 35;
    private static final int LAST_NAME_MAX_LENGTH = 40;

    public PersonName {
        if (StringUtils.isBlank(firstName)) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        if(StringUtils.isBlank(lastName)) {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
    }
}
