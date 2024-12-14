package com.store.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class shoppingCartController {
   @RequestMapping("/cart/view")
   public String view() {
       return "cart/view";
   }
   @RequestMapping("/product/detail/{id}")
   public String detail() {
       return "product/detail";
   }
   
}
