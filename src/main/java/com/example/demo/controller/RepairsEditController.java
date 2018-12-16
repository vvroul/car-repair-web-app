package com.example.demo.controller;

import com.example.demo.controller.mappers.RepairsToRepairsMapper;
import com.example.demo.controller.mappers.UsersToUsersMapper;
import com.example.demo.forms.UsersEditForm;
import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.model.UsersModel;
import com.example.demo.service.RepairsService;
import com.example.demo.service.RepairsServiceImpl;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.util.List;

import static com.example.demo.utils.GlobalAttributes.ERROR_MESSAGE;

@Controller
@RequestMapping("/admin")
public class RepairsEditController {

    private static final String REPAIRS_ATTR = "repairs";

    @Autowired
    private RepairsService repairsService;

    @Autowired
    private RepairsToRepairsMapper repairsToRepairsMapper;


//    @GetMapping(value = "/repairs/{u_id}")
//    public String updateUsers(@PathVariable(name = "u_id") String  id, Model model) {
//        UsersModel usersModel = usersService.findUsers(Long.valueOf(id)).orElse(new UsersModel());
//
//        UsersEditForm usersEditForm = new UsersEditForm();
//        usersEditForm.setFirstName(usersModel.getFirstName());
//        usersEditForm.setLastName(usersModel.getLastName());
//        usersEditForm.setU_id(id);
//        model.addAttribute("usersEditForm", usersEditForm);
//        return "editUsers";
//    }
//
//
//    @PostMapping(value = "/customers/{u_id}")
//    public String updateUsers(Model model, @ModelAttribute(name = "usersEditForm")UsersEditForm usersEditForm,
//                              RedirectAttributes redirectAttributes) {
//        usersService.update(usersEditForm);
//        return redirect("/admin/customers");
//    }


    @GetMapping(value = "/repairs/{r_id}/delete")
    public String deleteRepair(@PathVariable Long r_id, RedirectAttributes redirectAttributes) {
        repairsService.deleteRepairsById(r_id);
        return redirect("/admin/repairs");
    }




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
