package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.Cheese;
import com.datorium.Datorium.API.DTOs.UpdateCheeseDTO;
import com.datorium.Datorium.API.DTOs.UpdateCheeseDTO;
import com.datorium.Datorium.API.Services.CheeseShopService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cheese")
    public class CheeseShopController {
        private CheeseShopService cheeseShopService;
        public CheeseShopController(){
            cheeseShopService = new CheeseShopService();
        }

    @PostMapping("/add")
    public int add(@RequestBody Cheese cheese){
            return cheeseShopService.add(cheese);
        }

        @GetMapping("/get")
    public ArrayList<Cheese> get(){
            return cheeseShopService.get();
        }

        @PostMapping("/update")
    public Cheese update(@RequestBody UpdateCheeseDTO updateCheeseDTO) {
            return cheeseShopService.update(updateCheeseDTO.cheeseIndex, updateCheeseDTO.cheese);
        }
}
