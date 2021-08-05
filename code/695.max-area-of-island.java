class MapSum {

    /** Initialize your data structure here. */
    HashMap<String, Integer> map;
    
    public MapSum() {
        map = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        map.put(key, val);
    }
    
    public int sum(String prefix) {
        int s = 0;
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getKey().startsWith(prefix)){
                s += e.getValue();
            }
        }
        return s;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */