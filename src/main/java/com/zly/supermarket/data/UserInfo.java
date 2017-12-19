package com.zly.supermarket.data;

public class UserInfo {
    private int code;
    private String msg;
    private Data info;

    public static class Data{
        private String name;
        private int age;

        public Data() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Data getInfo() {
        return info;
    }

    public void setInfo(Data info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", info=" + info +
                '}';
    }
}
