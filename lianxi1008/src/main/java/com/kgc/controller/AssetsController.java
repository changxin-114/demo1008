package com.kgc.controller;

import com.kgc.pojo.Assets;
import com.kgc.servlce.AssteServlce;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class AssetsController {
    @Resource
    AssteServlce assteService;

    @RequestMapping("index")
    public String toindex(Model model, HttpServletRequest request){
        String assetid = request.getParameter("assetid");
        if(assetid != null && !assetid.equals("")){
            List<Assets> asstes = assteService.selByAssteId(assetid);
            model.addAttribute("assteslist",asstes);
        }else{
            List<Assets> asstes = assteService.selByAssteId(null);
            model.addAttribute("assteslist",asstes);
        }

        return "index";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request){
        String assetid = request.getParameter("assetid");
        String assetname = request.getParameter("assetname");
        String assettype = request.getParameter("assettype");
        String intodate = request.getParameter("intodate");
        SimpleDateFormat simdate1=new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        try {
            date1 = simdate1.parse(intodate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Assets assets = new Assets();
        assets.setAssetid(assetid);
        assets.setAssetname(assetname);
        assets.setAssettype(assettype);
        assets.setIntodate(date1);
        int insert = assteService.insert(assets);
        return "redirect:index";
    }
}
