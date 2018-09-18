package com.example.demo.git;

/**
 * Created by tanke on 2018/9/17.
 */
public class Dog<T> {
    private T object;

    public Dog(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Dog<String> dog1=new Dog<String>("tanKe");
        Dog<Integer> dog2=new Dog<Integer>(66);
        String a=dog1.getObject();
        Integer b=dog2.getObject();
        System.out.println(a);
        System.out.println(b);
    }
}
