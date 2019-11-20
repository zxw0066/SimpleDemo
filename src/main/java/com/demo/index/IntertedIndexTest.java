package com.demo.index;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * ��������
 * 
 * @author zhaoxingwu
 *
 */
public class IntertedIndexTest {

	// ���������ļ�
	private static Map<String, ArrayList<String>> map = new HashMap<>();
	// �ļ�����
	private static ArrayList<String> list;
	// ��������
	private static Map<String, Integer> nums = new HashMap<>();

	public void CreateIndex(String filePath) {
		String[] words = null;
		BufferedReader bufferedReader = null;
		try {
			File file = new File(filePath);
			bufferedReader = new BufferedReader(new FileReader(file));
			String s = "";
			while ((s = bufferedReader.readLine()) != null) {
				words = s.split(" ");
			}
			for (String word : words) {
				if (!map.containsKey(word)) {
					list = new ArrayList<String>();
					list.add(filePath);
					map.put(word, list);
					nums.put(word, 1);
				} else {
					list = map.get(word);
					if (!list.contains(filePath)) {
						list.add(filePath);
						map.put(word, list);
					}
					nums.put(word, nums.get(word) + 1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {

		IntertedIndexTest index = new IntertedIndexTest();

		for (int i = 1; i <= 3; i++) {
			String path = "D:\\eclipse-workspace\\\\SimpleDemo\\resources\\file" + i;
			index.CreateIndex(path);
		}
		for (Map.Entry<String, ArrayList<String>> map : index.map.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}

		for (Map.Entry<String, Integer> num : index.nums.entrySet()) {
			System.out.println(num.getKey() + ":" + num.getValue());
		}
	}
}
