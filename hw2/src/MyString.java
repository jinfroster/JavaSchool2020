public class MyString implements Comparable<MyString>{
    String str;
    int len;

    public String getStr() {
        return str;
    }

    public int getLen() {
        return len;
    }

    @Override
    public String toString() {
        return str;
    }

    public MyString(String str) {
        this.str = str;
        this.len = str.length();
    }

    @Override
    public int compareTo(MyString otherLine) {
        if (this.len < otherLine.getLen())
            return -1;

        if (this.len > otherLine.getLen())
            return 1;

        return this.str.compareTo(otherLine.getStr());
    }
}
