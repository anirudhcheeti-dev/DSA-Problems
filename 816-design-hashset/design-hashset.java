class MyHashSet {

        boolean[] arr;

    public MyHashSet() {
        arr=new boolean[1000001];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=false;
        }
    }

    public void add(int key) {
        arr[key]=true;
    }

    public void remove(int key) {
        arr[key]=false;
    }

    public boolean contains(int key) {
        return arr[key];
    }
}