
package generics;

public class ChainingPair<T,S>{
    private T first;
    private S second;

    public ChainingPair(){}

    public ChainingPair(T first, S second){
      this.first = first;
      this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public void setFirst(T first){
        this.first=first;
    }

    public S getSecond(){
      return second;
    }

    public void setSecond(S second){
      this.second= second;
    }
}
