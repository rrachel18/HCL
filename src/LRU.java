

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LRU {

	public static void main(String[] args) {
		
	}
}


class LRUAlgo<Key,Value>{
	int maxSize;
	ConcurrentHashMap<Key, Value> map ;
	ConcurrentLinkedQueue<Key> queue;
	
	public LRUAlgo(int maxSize) {
		this.maxSize = maxSize;
		map = new ConcurrentHashMap<>(maxSize);
		queue = new ConcurrentLinkedQueue<>();
	}
	
	public void put(Key key,Value value){
		
		if(map.containsKey(key))
			map.remove(key);
		
		while(queue.size() >= maxSize){
			Key k = queue.poll();
			if(k != null)
				map.remove(k);
		}
		map.put(key, value);
		queue.add(key);
	}
	
}