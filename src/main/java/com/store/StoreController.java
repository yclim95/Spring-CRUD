package com.store;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.store.entity.Store;

@Controller
public class StoreController {
	@Autowired
	private StoreService storeService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		List <Store> listStore = storeService.listAll();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listStore", listStore);
		return mav;
	}
	
	@RequestMapping("/new")
	public String newStoreForm(Map<String, Object> model) {
	Store store = new Store();
	model.put("store", store);
	return "new_store";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStore(@ModelAttribute("store") Store store) {
		storeService.save(store);
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editStoreForm(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("edit_store");
		Store store = storeService.get(id);
		mav.addObject("store", store);
		return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteStoreForm(@RequestParam long id) {
		storeService.delete(id);
		return "redirect:/";
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
		List<Store> result = storeService.search(keyword);
		ModelAndView mav = new ModelAndView("search");
		mav.addObject("result", result);
		return mav;
	}
}
