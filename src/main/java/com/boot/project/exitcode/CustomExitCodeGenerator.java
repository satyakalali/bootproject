package com.boot.project.exitcode;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

@Component
public class CustomExitCodeGenerator implements ExitCodeGenerator {

	@Override
	public int getExitCode() {
		return 25;
	}

}
