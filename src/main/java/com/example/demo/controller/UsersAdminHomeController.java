package com.example.demo.controller;
import com.example.demo.controller.mappers.RepairsToRepairsMapper;
import com.example.demo.domain.Repairs;
import com.example.demo.domain.Users;
import com.example.demo.forms.RepairsEditForm;
import com.example.demo.model.RepairsModel;
import com.example.demo.model.UsersModel;
import com.example.demo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static com.example.demo.utils.GlobalAttributes.ERROR_MESSAGE;

@Controller
@RequestMapping(path = "/admin")
public class UsersAdminHomeController {

    @Autowired
    RepairsServiceImpl repairsServiceImpl;

    @Autowired
    private RepairsService repairsService;

    @Autowired
    private RepairsToRepairsMapper repairsToRepairsMapper;


    @GetMapping(value = "/")
    public String adminHome(String  id, Model model) {
        List<RepairsModel> topRepairs = repairsServiceImpl.getFirst10RepairsByDateTime();
        model.addAttribute("topRepairs", topRepairs);
        return "adminMain";
    }

    @PostMapping(value = "/{r_id}")
    public String updateRepairs(Model model, RepairsEditForm repairsEditForm,
                                RedirectAttributes redirectAttributes) {
        System.out.println("THE FORM : " + repairsEditForm.getDateTime());
        repairsService.update(repairsEditForm);
        return redirect("/admin/");
    }

//    @PostMapping(value = "/")
//    public String updatedCustomers(Model model) {
//        List<RepairsModel> topRepairs = repairsServiceImpl.getFirst10RepairsByDateTime();
//        model.addAttribute("topRepairs", topRepairs);
//        return "adminHome";
//    }

    //@ExceptionHandler({BooksNotFoundException.class})
    public String handleError(HttpServletRequest request,
                              RedirectAttributes redirectAttrs,
                              RuntimeException e) {
        redirectAttrs.addFlashAttribute(ERROR_MESSAGE,
                "Couldn't fetch data");
        return "redirect:/";
    }

    private static String redirect(String uri) {
        return String.format("redirect:%s", uri);
    }

}
