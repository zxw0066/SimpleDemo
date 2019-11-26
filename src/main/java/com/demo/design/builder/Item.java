package com.demo.design.builder;

import com.demo.design.builder.pack.Packing;

/**
 * 食品
 * @author zhaoxingwu
 *
 */
public interface Item {

	// 食品名称
	public String name();
	// 包装
	public Packing packing();
	// 价格
	public int price();
}
