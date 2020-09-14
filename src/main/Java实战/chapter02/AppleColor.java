package main.Java实战.chapter02;

public enum AppleColor {
    RED(1,"red"),
    GREEN(2,"green");

    private int key ;
    private String value;

    AppleColor(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
