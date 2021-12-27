package com.boot.project.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.project.jpa.VogoBikeRepository;
import com.boot.project.model.VogoBikeModel;

@Service
public class VogoService {
	@Autowired
	private VogoBikeRepository vogoBikeRepository;

	public List<VogoBikeModel> fetchBikes() {
		List<VogoBikeModel> listOfBikes = vogoBikeRepository.findAll().stream().map(vogo -> {
			VogoBikeModel bikeModel = new VogoBikeModel();
			BeanUtils.copyProperties(vogo, bikeModel);
			return bikeModel;
		}).collect(Collectors.toList());
		return listOfBikes;
	}
}
