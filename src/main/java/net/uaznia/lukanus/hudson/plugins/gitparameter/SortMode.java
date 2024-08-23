package net.uaznia.lukanus.hudson.plugins.gitparameter;

enum SortMode {
    NONE,
    ASCENDING_SMART,
    DESCENDING_SMART,
    ASCENDING,
    DESCENDING,
    TIME_DESCENDING,
    TIME;

    public boolean getIsUsingSmartSort() {
        return this == ASCENDING_SMART || this == DESCENDING_SMART;
    }

    public boolean getIsDescending() {
        return this == DESCENDING || this == DESCENDING_SMART;
    }

    public boolean getIsSortByName() {
        return this != NONE && this != TIME;
    }

    public boolean getIsSortByTime() {
        return this == TIME || this == TIME_DESCENDING;
    }

    public boolean getIsTimeDescending() {
        return this == TIME_DESCENDING;
    }
}
