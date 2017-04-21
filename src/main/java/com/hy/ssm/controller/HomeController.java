package com.hy.ssm.controller;


import com.hy.ssm.domain.AppUser;
import com.hy.ssm.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LynAs on 20-Jan-16
 */
@RestController
@RequestMapping(value = "/admin")
public class HomeController extends BaseController {

    @Autowired
    AppUserService appUserService;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> home() {
        AppUser appUser = appUserService.get(1L);
        return ResponseEntity.ok(appUser);
    }
}


















