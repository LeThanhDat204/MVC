package com.store.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.store.entity.Product;
import com.store.service.ProductService;


@Controller
public class productController {
	@Autowired
	ProductService productService;
	
   @RequestMapping("/product/list")
   public String list(Model model) {
	   List<Product> list = productService.findAll();
	   model.addAttribute("items",list);
       return "product/list";
   }
//   @RequestMapping("/product/detail/{id}")
//   public String detail() {
//       return "product/detail";
//   }
//   
}
