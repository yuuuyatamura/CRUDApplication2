package com.example.demo.trySpring;

import java.util.Map;

public interface JDBCTemplete {

	Map<String, Object> queryForMap(String query, int id);

}
