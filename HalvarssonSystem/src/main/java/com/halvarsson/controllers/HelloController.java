package com.halvarsson.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.halvarsson.models.ItemSizes;
import com.halvarsson.models.Items;
import com.halvarsson.repositories.ItemsRepository;
//import com.halvarsson.services.ItemsServices;

//@Controller
public class HelloController {
	
	//@Autowired
	//private ItemsRepository itemRepository;
	/*	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "Welcome to Halvarsson System");
		model.addAttribute("menu", itemRepository.findAll());
		//model.addAttribute("menu", ItemsServices.getAllItems());
		return "index";
	}*/
/*	@RequestMapping(value = "/start/add", method = RequestMethod.GET)
	public String displayOrdersMenu(Model model) {
		
		model.addAttribute("title", "Add Customer Order");
		model.addAttribute(new Items());
		model.addAttribute("arrayItemSizes", ItemSizes.values());
		return "start/add";
	}*/
	
/*	The Old way to get parameters from post method
  	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processMenuOrders(HttpServletRequest request) {
		
		String custMainCourse = request.getParameter("mainCourse");
		
	}*/
	
/*	@RequestMapping(value = "/start/add", method = RequestMethod.POST)
	public String processMenuOrders(@ModelAttribute @Valid Items newItem, Errors error, Model model) {
		
		if(error.hasErrors()) {
			model.addAttribute("title", "Add Customer Order");
			return "/start/add";
		}
		
		//ItemsServices.addItem(newItem);
		itemRepository.save(newItem);
		return "redirect:/"; //redirects to the "/" view
	}*/
	
/*	@RequestMapping(value = "/start/remove", method = RequestMethod.GET)
	public String displayRemoveItemForm(Model model) {
		model.addAttribute("title", "Remove Cheese");
		model.addAttribute("itemsArray", itemRepository.findAll());
		//model.addAttribute("itemsArray", ItemsServices.getAllItems());
		return "start/remove";
	}
	*/
/*	@RequestMapping(value = "/start/remove", method = RequestMethod.POST)
	public String processRemoveItemForm(@RequestParam int[] itemsId) {
		
		for (int targetedId : itemsId) {
			//ItemsServices.removeItem(targetedId);
			itemRepository.delete(targetedId);
		}
		return "redirect:/";
	}
	*/
}
