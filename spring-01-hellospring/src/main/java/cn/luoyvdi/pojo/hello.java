package cn.luoyvdi.pojo;

public class hello {
    private String str;

    public hello(String name){
        this.str = name;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
