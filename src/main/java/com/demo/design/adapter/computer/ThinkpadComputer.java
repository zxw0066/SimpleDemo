package com.demo.design.adapter.computer;

import com.demo.design.adapter.sd.SDCard;

public class ThinkpadComputer implements Computer {

	@Override
	public String readSD(SDCard sdCard) {
		return sdCard.readSD();
	}
}
