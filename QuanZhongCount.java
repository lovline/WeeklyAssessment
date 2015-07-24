package com.tusehgntkeji.quiz02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuanZhongCount {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(
				new FileReader(new File("C:\\Users\\Administrator.KCIII4TVX3OWXML\\Desktop\\src.txt")));
		String info="";
		String str="";
		String cc[]={"am","is","are","was","been", "has","have","had","a", "an", "the", "in", "at", "on","to","or"};
		while(null!=(info=br.readLine())){
			str+=info;
		}
		Pattern pt=Pattern.compile("[a-zA-Z]+");
		Matcher m=pt.matcher(str);
		Map<String,Integer> map = new HashMap<String,Integer>();
		String word="";
		int num=0;
		while(m.find()){
			word=m.group();
			if(map.containsKey(word)){
				num=(int) map.get(word);
				map.put(word,  (num+1));
			}else{
				map.put(word, 1);
			}
		}
		int quan=0;
		Set key = map.keySet();
		for (Iterator iterator = key.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			int countNum =(int) map.get(name);
			for(int i=0;i<cc.length;i++){
				if(name.equals(cc[i])){
					quan= (int) (countNum*0.2);
					map.put(name, quan);
					break;
				}else{
					quan=countNum;
					map.put(name, quan);
				}
			}
		}
		List<Map.Entry<String, Integer>> infoIds =
			    new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

			Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {   
			    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {      
			        return (o2.getValue() - o1.getValue()); //按照值从大到小
			    }
			}); 
			
			List<String> list=new ArrayList<String>();
			
			
			for (int i = 0; i < 15; i++) {
			    String _word = infoIds.get(i).toString();
			    if(i<8){
			    	System.out.println(_word.replaceAll("\\=\\d+", ""));
			    }
			    if(i>=8 && i<=13){
			    	list.add(_word);
			    }
			}
			Collections.sort(list);
			System.out.println(list.get(0).replaceAll("\\=\\d+", ""));
			System.out.println(list.get(1).replaceAll("\\=\\d+", ""));
	}

}
