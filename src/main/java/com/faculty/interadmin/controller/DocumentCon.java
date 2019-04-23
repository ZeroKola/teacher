package com.faculty.interadmin.controller;



import com.faculty.interadmin.Another.Msg;

import com.faculty.interadmin.Another.ResultUtil;

import com.faculty.interadmin.Another.Rt_document;

import com.faculty.interadmin.entity.DocumentEntity;

import com.faculty.interadmin.service.DocumentService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



import javax.websocket.server.PathParam;

import java.util.List;



@RestController

@CrossOrigin(origins = "*", maxAge = 3600)//跨域访问

@RequestMapping(value = "/document")

public class DocumentCon {

    @Autowired

    private DocumentService documentService;

    //@GetMapping()

//    public List<Rt_document> findAll() {

//        System.out.println();

//        return this.documentService.findDocumentinAll();

//    }
    @GetMapping()
    public Msg<Rt_document> findAlldocumentinByTitleAndUploader(@PathParam("uploader") String uploader, @PathParam("title") String title) {

       if (title == null && uploader == null) {//查找全部
            return ResultUtil.success(this.documentService.findDocumentAll());
        } else if (title != null) {//title查找
            return ResultUtil.success(this.documentService.findDocumentByTitle(title));
        }else if (uploader != null) {//uploader查找
           return ResultUtil.success(this.documentService.findDocumentByUploader(uploader));}
       else {
            return ResultUtil.success(null);
        }
    }
    @PutMapping()
    public void updateSignin(DocumentEntity documentEntity) {

        this.documentService.updateDocument(documentEntity);
    }
    @PostMapping()

    public void insertSignin(@RequestBody DocumentEntity documentEntity) {

        this.documentService.addDocument(documentEntity);

    }
    @DeleteMapping()
    public void deleteById(String document_id) {
        this.documentService.deleteDocumentinById(document_id);
    }
}
