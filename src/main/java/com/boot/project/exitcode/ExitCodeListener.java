package com.boot.project.exitcode;

import org.springframework.boot.ExitCodeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ExitCodeListener {

	@EventListener
	public void exitEvent(ExitCodeEvent event) {
		System.out.println("Exit Code: "+event.getExitCode());
	}

}
