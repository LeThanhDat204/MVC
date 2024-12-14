package com.store.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class orderController {
   @RequestMapping("/order/checkout")
   public String checkout() {
       return "order/checkout";
   }
   @RequestMapping("/order/list")
   public String list() {
       return "order/list";
   }
   @RequestMapping("/order/detail/id")
   public String detail() {
       return "order/detail";
   }
 
}
