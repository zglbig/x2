package org.baize.test;

/**
 * 作者： 白泽
 * 时间： 2017/12/25.
 * 描述：
 */
public class B extends JdbcModel {
    private String str = "撒的发生";
    private String s = "dsfsdfdsf奥术大师";

    public String getStr() {
        return str;
    }


    public void setStr(String str) {
        this.str = str;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "B{" +
                "str='" + str + '\'' +
                ", s='" + s + '\'' +
                ", id=" + id +
                '}';
    }
}
