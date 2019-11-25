package com.demo.design.adapter;

import com.demo.design.adapter.sd.SDCard;
import com.demo.design.adapter.tf.TFCard;

public class SDAdapterTF implements SDCard {
	
	private TFCard card;
	
	public SDAdapterTF(TFCard card) {
		this.card = card;
	}

	@Override
	public String readSD() {
		return card.readTF();
	}

	@Override
	public int writeSD(String msg) {
		return card.writeTF("adapter write tf card");
	}

}
