package com.boot.project.exitcode;

import java.io.FileNotFoundException;

import org.springframework.boot.ExitCodeExceptionMapper;
import org.springframework.stereotype.Component;

@Component
public class ExitCodeExceptionMapperCustom implements ExitCodeExceptionMapper {

	@Override
	public int getExitCode(Throwable exception) {
		if (exception.getCause() instanceof FileNotFoundException) {
			return 101;
		}

		return 1;
	}

}
