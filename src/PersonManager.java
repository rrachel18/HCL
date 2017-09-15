import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class PersonManager {

	HashMap<Integer, Person> data;
	
	public PersonManager() {
		data = new HashMap<>();
	}
	public static void main(String[] args) {
	
		PersonManager personManager = new PersonManager();
		personManager.putHardData();
		personManager.print(null);
		
		Field[] fields = String.class.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
	}
	
	public void print(HashMap<Integer, Person> data){
		
		if(data == null){
			data = this.data;
		}
		Set<Entry<Integer, Person>> set = data.entrySet();
		Iterator<Entry<Integer, Person>> it = set.iterator();
		while(it.hasNext()){
				Entry<Integer, Person> entry = it.next();
				System.out.println(entry.getValue());
		}
	}
	
	
	public void put(Person person){
		data.put(person.getId(), person);
	}
	
	public Person get(Integer key){
		return data.get(key);
	}
	
	public void putHardData(){
		
		for(int i = 0; i < 10; i++){
			Person p1 = new Person(i, "Rinu-"+i, "1234567890", new Address("street", "City", "state"));
			put(p1);
		}
		
		
		
	}
	
}
