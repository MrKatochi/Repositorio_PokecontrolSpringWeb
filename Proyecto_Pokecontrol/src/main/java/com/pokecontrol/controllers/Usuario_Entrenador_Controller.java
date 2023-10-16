package com.pokecontrol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.pokecontrol.models.Entrenador;
import com.pokecontrol.services.Entrenador_Service;
import com.pokecontrol.upload.storage.StorageService;

@Controller
public class Usuario_Entrenador_Controller {
	@Autowired
	Entrenador_Service entrenador_service;

	@Autowired
	StorageService storageService;

	@GetMapping({ "/" })
	public String index(Model model) {
		return "index";
	}

	@GetMapping("/auth/login")
	public String login(Model model) {
		model.addAttribute("usuario", new Entrenador());
		return "login";
	}

	@PostMapping("/auth/register")
	public String register(@ModelAttribute Entrenador entrenador, @RequestParam("file") MultipartFile file) {
		if (!file.isEmpty()) {
			String imagen = storageService.store(file);
			entrenador.setAvatar(MvcUriComponentsBuilder.fromMethodName(Files_Controller.class, "serveFile", imagen)
					.build().toUriString());
		}
		entrenador_service.registrar(entrenador);
		return "redirect:/index";
	}
}
