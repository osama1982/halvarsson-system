package com.halvarsson.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.halvarsson.repositories.ItemsRepository;

@Controller
public class ItemsController {
	
	@Autowired
	private ItemsRepository itemRepository;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "Welcome to Halvarsson System");
		model.addAttribute("menu", itemRepository.findAll());
		//model.addAttribute("menu", ItemsServices.getAllItems());
		return "index";
	}

}
