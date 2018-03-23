	package com.bonzai.assigment;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HttpCodeSortedOrderFrequency {

	public static void main(String[] args) throws IOException {
		  Map<String, Integer> map = new HashMap<>();
			    try (LineNumberReader r = new LineNumberReader(new FileReader("logs.txt"))) {
			        String line;
			        while ((line = r.readLine()) != null) {
			    		    for (String httpCode : line.split(" ")) {
					    if (httpCode.equalsIgnoreCase("503") || httpCode.equalsIgnoreCase("323") || httpCode.equalsIgnoreCase("200")) {
		    		        Integer count = map.get(httpCode);
		    		        if(count == null)
		    		        	count=1;
		    		        else
		    		        	count=count+1;
		    		        map.put(httpCode, count);
					    }
			    		    }
			        }
			    }
			    List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
			    Collections.sort(list, (key1, key2) -> key2.getValue() - key1.getValue());
			    Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		        for (Entry<String, Integer> entry : list)
		        {
		            sortedMap.put(entry.getKey(), entry.getValue());
		        }
			    System.out.println("Descending order of occurrences is: "+sortedMap);
	}

}
