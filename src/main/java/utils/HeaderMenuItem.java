package utils;

public enum HeaderMenuItem {
    LOGIN("//a[text()='LOGIN']"),
    ADD("//a[text()='ADD']");
    private final String locator;
    HeaderMenuItem(String locator){
        this.locator = locator;
    }
    public String getLocator(){
        return locator;
    }
}
