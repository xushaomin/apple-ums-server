package com.appleframework.ums.server.storage.hdfs;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ByteUtils {

	// 从消息中取出对象
	public static Object fromByte(byte[] obj) {
		Object object = null;
		// 读取字节数组中为字节数组流
		ByteArrayInputStream bis = new ByteArrayInputStream(obj);
		try {
			// 读字节数组流为对象输出流
			ObjectInputStream ois = new ObjectInputStream(bis);
			// 从对象输出流中取出对象 并强转
			object = ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}

	// 将对象转换成消息
	public static byte[] toBytes(Object object) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();// 字节数组输出流
			ObjectOutputStream oos;
			oos = new ObjectOutputStream(bos);
			oos.writeObject(object);// 写入对象
			byte[] objMessage = bos.toByteArray();// 字节数组输出流转成字节数组
			return objMessage;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
