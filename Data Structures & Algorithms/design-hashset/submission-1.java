class MyHashSet {

    private LinkedList<Integer>[] buckets;
    private int size;
    private static final double LDF = 0.75;

    public MyHashSet() {
        buckets = new LinkedList[16];
        size = 0;
    }

    private int hash(int key) {
        return Math.abs(key) % buckets.length;
    }

    private void reHash() {
        LinkedList<Integer>[] oldBucket = buckets;

        buckets = new LinkedList[oldBucket.length * 2];
        size = 0;

        for (LinkedList<Integer> bucket : oldBucket) {
            if (bucket != null) {
                for (int key : bucket) {
                    add(key);
                }
            }
        }
    }
    
    public void add(int key) {
        int index = hash(key);

        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
            size++;
        }

        if ((double) size / buckets.length > LDF) {
            reHash();
        }
    }
    
    public void remove(int key) {
        int index = hash(key);

        if (buckets[index] != null && buckets[index].remove((Integer) key)) {
            size--;
        }
    }
    
    public boolean contains(int key) {
        int index = hash(key);

        return buckets[index] != null && buckets[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */