package com.demo.design.adapter;

import com.demo.design.adapter.computer.Computer;
import com.demo.design.adapter.computer.ThinkpadComputer;
import com.demo.design.adapter.sd.SDCard;
import com.demo.design.adapter.sd.SDCardImpl;
import com.demo.design.adapter.tf.TFCard;
import com.demo.design.adapter.tf.TFCardImpl;

/**
 * SD和computer是原有，保持不变
 * TF新增
 * @author zhaoxingwu
 *
 */
public class ComputerReadDemo {
	
	public static void main(String[] args) {
		Computer computer = new ThinkpadComputer();
		SDCard sdCard = new SDCardImpl();
		System.out.println(computer.readSD(sdCard));
		
		System.out.println("--------------------------");
		TFCard card = new TFCardImpl();
		SDAdapterTF adapterTF = new SDAdapterTF(card);
		
		System.out.println(computer.readSD(adapterTF));
	}
}