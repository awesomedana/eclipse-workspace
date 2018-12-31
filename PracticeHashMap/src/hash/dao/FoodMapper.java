package hash.dao;

import java.util.HashMap;
import java.util.List;

public interface FoodMapper {
	public int insert(HashMap<String, String> map);
	public HashMap<String, String> search(String fcode);
	public List<HashMap<String, String>> searchAll();
	public int update(HashMap<String, String> map);
	public int delete(String fcode);
}
