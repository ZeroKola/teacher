package com.faculty.interadmin.controller;

import com.faculty.interadmin.entity.DocumentEntity;

import com.faculty.interadmin.service.DocumentService;

import org.springframework.beans.factory.annotation.Autowired;





import java.util.List;



@RestController



public class DocumentCon {

    @Autowired

    private DocumentService documentService;
<<<<<<< HEAD
    //查询所有记录
    @RequestMapping("/findAll")
    public List<DocumentEntity> findAll(){
        return  documentService.findDAll();
    }
    //根据d_no查询一条记录
    @RequestMapping("/getDocumentEntityByD_no")
    public DocumentEntity getDocumentEntityByD_no(String d_no){
        return documentService.getDocumentEntityByD_no(d_no);
    }
    //根据d_title查询一条记录
    @RequestMapping("/getDocumentEntityByD_title")
    public DocumentEntity getDocumentEntityByD_title(String d_title){
        return documentService.getDocumentEntityByD_title(d_title);
=======
>>>>>>> dev-wujy
    }
    }
    }
    }
}
