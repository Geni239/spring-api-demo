package com.api.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.api.demo.entities.Order;
import com.api.demo.services.impl.OrderItemServiceImpl;
import com.api.demo.services.impl.OrderServiceImpl;
import com.api.demo.services.impl.UserServiceImpl;


@Controller
public class AppController {

	@Autowired
	private UserServiceImpl uService;
	@Autowired
	private OrderItemServiceImpl oiService;
	@Autowired
	private OrderServiceImpl oService;

	@RequestMapping("/")
	public String displayAllRecords(Model model) {

		model.addAttribute("vUsers", uService.getAllUsers());
		model.addAttribute("vItems", oiService.getAllOrderItems());
		model.addAttribute("vOrders", oService.getAllOrders());
		return "index";
	}

	@RequestMapping("/addNewOrder")
	public String displayNewOrderPage(Model model) {
		Order order = new Order();
		model.addAttribute("order", order);
		return "orderform";

	}

	@PostMapping("/saveNewOrder")
	public String addNewOrderIntoDB(@ModelAttribute("order") Order order) {
		try {
			oService.addOrder(order);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/";
	}
}
