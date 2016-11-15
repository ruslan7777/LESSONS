package com;

/**
 * Created by RUSLAN77 on  15.11.2016 in Ukraine        Объекты передаются методам no ссылке
 */
class Test1 {
    int a, b;

    Test1(int i, int j) {
        a = i;
        b = j;
    }

    /* Передача объекта методу. Теперь переменные оb.а и оb.b объекта, используемого при вызове, также будут изменяться. */
    void change(Test1 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class CallByRef {
    public static void main(String[] args) {
        Test1 ob=new Test1(15,20);
        System.out.println(" ob.a and ob.b before call " + ob.a +" "+ob.b);

        ob.change(ob);
        System.out.println(" ob.a and ob.b after call " + ob.a +" "+ob.b);
    }
}
