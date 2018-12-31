package hash.service;

import java.util.HashMap;

import hash.dao.FoodDao;

public class FoodService {
	FoodDao dao = new FoodDao();

	public int insert(HashMap<String, String> map) {
		int result = 0;
		int resultI = dao.insert(map);
		if (resultI == 1) {
			result = 1;
		} else {
			result = 0;
		}
		return result;		
	}
	
	public HashMap<String, String> search(String fcode) {
		HashMap<String, String> map = new HashMap<String, String>();
		map = dao.search(fcode);
		return map;
	}

	public int update(HashMap<String, String> map) {
		int result = 0;
		
		return result;
	}
	
	public int delete() {
		int result = 0;
		return result;
	}
}
