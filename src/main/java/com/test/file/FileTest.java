package com.test.file;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileTest {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\zhaoxingwu\\Desktop\\1.txt";
		String str = "abc123";
		try {
			// 写入文件（追加方式：StandardOpenOption.APPEND）
			Files.write(Paths.get(filePath), str.getBytes("UTF-8"), StandardOpenOption.APPEND);

			// 读取文件
			byte[] data = Files.readAllBytes(Paths.get(filePath));
			System.out.println(new String(data, StandardCharsets.UTF_8));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
