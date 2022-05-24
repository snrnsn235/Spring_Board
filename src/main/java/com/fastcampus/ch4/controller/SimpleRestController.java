//package com.fastcampus.ch4.controller;
//
//import com.fastcampus.ch4.domain.*;
//import org.springframework.stereotype.*;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
////@RestController를 넣어주면 @ResponseBody를 넣어주지 않아도 된다.
////단 @PostMapping은 넣어줘야 한다.
//public class SimpleRestController {
////    @GetMapping("/ajax")
////    public String ajax() {
////        return "ajax";
////    }
//
//    @GetMapping("/test")
//    public String test() {
//        return "test"; //뷰이름
//    }
//
////    @PostMapping("/send")
//////    @ResponseBody
////    public Person test(@RequestBody Person p) {
////        System.out.println("p = " + p);
////        p.setName("ABC");
////        p.setAge(p.getAge() + 10);
////
////        return p;
////    }
////    @PostMapping("/send")
//////    @ResponseBody
////    public Person test2(@RequestBody Person p) {
////        System.out.println("p = " + p);
////        p.setName("ABC");
////        p.setAge(p.getAge() + 10);
////
////        return p;
////    }
//}