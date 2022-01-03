package com.boot.project.autoconfig;

public class IrctcBookTicket {
	private IrctcOrder irctcOrder;

	public IrctcBookTicket(IrctcOrder irctcOrder) {
		this.irctcOrder = irctcOrder;
	}

	public IrctcOrder bookOrder(String name) {

		if (name.equals("satya")) {
			irctcOrder.setOrderId("Sat123");
			irctcOrder.setStatus("Booked");
		}

		return irctcOrder;
	}
}
