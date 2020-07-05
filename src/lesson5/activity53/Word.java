package lesson5.activity53;

public class Word {
    private String key, value;
    private int type;

    //initialization
    public Word(String key, String value, int type) {
        this.key = key;
        this.value = value;
        this.type = type;
    }

    public Word() {
    }
    //getters

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public int getType() {
        return type;
    }
    //setters

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setType(int type) {
        this.type = type;
    }
}
