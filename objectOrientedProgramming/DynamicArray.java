package objectOrientedProgramming;

public class DynamicArray{

    private int data[];
    private int nextElementIndex;

    public DynamicArray(){
      data=new int[5];
      nextElementIndex=0;
    }

    public int size(){
      return nextElementIndex;
    }

    public boolean isEmpty(){
      return nextElementIndex ==0;
      }

    public int get(int i){
      if(i >=nextElementIndex){
        return -1;
      }
      return data[i];
    }

    public void set(int i, int elem){
      if(i >=nextElementIndex){
          //Error
        return;
      }
      data[i]=elem;
    }

    public void add(int elem){
      if(nextElementIndex==data.length){
        doubleCapacity();
      }
      data[nextElementIndex]=elem;
      nextElementIndex++;
    }
    public void addAti(int i,int elem){
        if(i==data.length){
          doubleCapacity();
        }
        for(int j=nextElementIndex;j>i;j--) {
        	data[j]=data[j-1];
        }
        data[i]=elem;
        nextElementIndex++;
      }

    private void doubleCapacity(){
      int temp[]= data;
      data= new int[2*temp.length];
      for(int i=0;i<temp.length;i++){
        data[i]=temp[i];
      }
    }

    public int removeLast(){
      if(nextElementIndex==0){
        return -1;
      }
      int temp= data[nextElementIndex-1];
      data[nextElementIndex-1]=0;
      nextElementIndex--;
      return temp;
    }
    public int removeAti(int i){
        if(nextElementIndex==0){
          return -1;
        }
        int temp= data[i];
        for(int j=i+1;j<nextElementIndex;j++) {
        	data[j-1]=data[j];
        }
        nextElementIndex--;
        return temp;
      }

}
