//: innerclasses/ClassInInterface.java
package innerclasses; /* Added by Eclipse.py */
// {main: ClassInInterface$FunVarShare}

public interface ClassInInterface {
  void howdy();
  class Test implements ClassInInterface {
    public void howdy() {
      System.out.println("Howdy!");
    }
    public static void main(String[] args) {
      new Test().howdy();
    }
  }
} /* Output:
Howdy!
*///:~
