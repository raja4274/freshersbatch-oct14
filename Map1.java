import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Double> map= new HashMap<>();
		map.put(0, 52.00);
		map.put(1, 32.00);
		map.put(2, 39.00);
		map.put(3, 63.00);
		map.put(4, 31.00);
		map.put(5, 49.00);
		map.put(6, 40.00);
		map.put(7, 44.00);
		map.put(8, 45.00);
		map.put(9, 33.00);
		for(Integer key:map.keySet())
		System.out.println(key+"="+map.get(key));
		
		

	}

}
