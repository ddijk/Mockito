package com.oracle.java.certification;

public class MyStuff {


    String name;

    public MyStuff(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof MyStuff) {
            MyStuff other = (MyStuff) obj;

              if ( other.name != null && name!=null) {
                  return true;
              }
        }
        System.out.println("** not equal");
        return  false;
    }

    @Override
    public int hashCode() {
        System.out.println("Calling hashcode....");
        return super.hashCode();
    }
}
