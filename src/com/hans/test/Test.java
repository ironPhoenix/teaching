package com.hans.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) throws Exception {
/*		System.out.println("111".matches("/d{3}"));*/
		
/*		Pattern pattern = Pattern.compile("111");
		Matcher m = pattern.matcher("111");
		System.out.println(m.matches());*/
		
/*		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher("asdaasdfqwe");
		StringBuffer sb = new StringBuffer();
		System.out.println(m.replaceFirst("A"));
		System.out.println(m.start()+"   "+m.end());
		m.reset();
		System.out.println(m.start()+"   "+m.end());
		while(m.find()) 
			m.appendReplacement(sb, "A");
			System.out.println(m.start()+"   "+m.end());
		}
		
		
		m.appendTail(sb);
		
		System.out.println(sb);*/
		
		String s ;
		FileReader fr = new FileReader("src/a.txt");
		BufferedReader br = new BufferedReader(fr);
		while((s=br.readLine())!=null) {
			//System.out.println(s);
			Pattern p = Pattern.compile("([\\w[.-]]+)@([\\w[.-]]+)\\.[\\w]+");
			Matcher m = p.matcher(s);
			while(m.find()) {
				System.out.println(m.group(2));
			}
		}
		
		
		
		
		
	}
}
