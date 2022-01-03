package com.boot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.project.model.VogoBikeModel;
import com.boot.project.service.VogoService;

@Controller
public class VogoBikeController {
	@Autowired
	private VogoService service;

	@GetMapping("/vogo")
	public String fetchBikeDetails(Model model) {
		List<VogoBikeModel> fetchBikes = service.fetchBikes();
		model.addAttribute("vogo", fetchBikes.get(0));
		return "vogo";
	}

}
