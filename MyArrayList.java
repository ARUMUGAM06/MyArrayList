
public class MyArrayList<t> {
    Object[] arr;
    private int point=0;
    public MyArrayList(int size){
        this.arr=new Object[size];
    }
    public MyArrayList(){
        int defaultCapacity = 10;
        this.arr=new Object[defaultCapacity];
    }
    void add(t data){
        if(isfull())
            resize();
        arr[point++]=data;
    }
    int size(){
        return arr.length;
    }
    private void resize(){
        Object temp[]=new Object[2*arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }
    boolean isfull(){
        return arr.length==point;
    }
    public String toString(){
        String x="[";
        for(int i=0;i<point;i++){
            x+=arr[i];
            if(i!=point-1)
                x+=",";
        }
        x+="]";
        return x;
    }
    t get(int x){
        return (t) arr[x];
    }
}
