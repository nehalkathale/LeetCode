class MyHashSet {
    List <Integer> listOfInteger ;
    public MyHashSet() {
        listOfInteger = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if(!listOfInteger.contains(key)){
            listOfInteger.add(key);
        }
    }
    
    public void remove(int key) {
        if(listOfInteger.size() > 0 && listOfInteger.contains(key)){
            listOfInteger.remove(new Integer(key));
        }
    }
    
    public boolean contains(int key) {
        return listOfInteger.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */