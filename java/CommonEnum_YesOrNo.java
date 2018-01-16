import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * 公共枚举类型 （yes or no）是/否
 *
 */
public enum CommonEnum_YesOrNo {
	
	yes(1, "是"), no(0, "否");

	private CommonEnum_YesOrNo(Integer index, String name) {
		this.index = index;
		this.name = name;
	}

	private Integer index;// 索引号
	private String name;// 中文名称

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Map<String, Map<String, Object>> toMap() {
		CommonEnum_YesOrNo[] array = CommonEnum_YesOrNo.values();
		Map<String, Map<String, Object>> enumMap = new HashMap<String, Map<String, Object>>();

		for (CommonEnum_YesOrNo em : array) {
			Map<String, Object> map = new HashMap<String, Object>();
			String key = em.name();
			map.put("index", em.getIndex());
			map.put("name", em.getName());
			enumMap.put(key, map);
		}
		return enumMap;
	}

	public static List<Map<String, Object>> toList() {
		CommonEnum_YesOrNo[] array = CommonEnum_YesOrNo.values();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for (CommonEnum_YesOrNo em : array) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("index", em.getIndex());
			map.put("name", em.getName());
			list.add(map);
		}
		return list;
	}

	public static String toJsonStr() {
		CommonEnum_YesOrNo[] array = CommonEnum_YesOrNo.values();
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (CommonEnum_YesOrNo em : array) {
			if (!sb.toString().equals("[")) {
				sb.append(",");
			}
			sb.append("{\"index\":");
			sb.append("\"" + em.getIndex() + "\",");
			sb.append("\"name\":");
			sb.append("\"" + em.getName() + "\"}");
		}
		sb.append("]");
		return sb.toString();
	}

	public static CommonEnum_YesOrNo getByIndex(Integer index) {
		CommonEnum_YesOrNo[] array = CommonEnum_YesOrNo.values();
		for (CommonEnum_YesOrNo em : array) {
			if (em.getIndex() == index) {
				return em;
			}
		}
		return null;
	}

	public static CommonEnum_YesOrNo getByName(String name) {
		CommonEnum_YesOrNo[] array = CommonEnum_YesOrNo.values();
		for (CommonEnum_YesOrNo em : array) {
			if (em.name().equalsIgnoreCase(name)) {
				return em;
			}
		}
		return null;
	}

}