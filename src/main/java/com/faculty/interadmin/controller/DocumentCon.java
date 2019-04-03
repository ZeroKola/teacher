package com.faculty.interadmin.controller;

import com.faculty.interadmin.entity.DocumentEntity;
import com.faculty.interadmin.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/document",method = RequestMethod.GET)
public class DocumentCon {
    @Autowired
    private DocumentService documentService;
    //查询所有记录
    @RequestMapping("/findAll")
    public List<DocumentEntity> findAll(){
        return  documentService.findAll();
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
    }
    //增加一条记录
    @RequestMapping("/insertDocumentEntity")
    public void insertDocumentEntity(DocumentEntity documentEntity) {
        documentService.insertDocumentEntity(documentEntity);
    }
    //更新一条记录
    @RequestMapping("/updateDocumentEntity")
    public void updateDocumentEntity(DocumentEntity documentEntity) {
        documentService.updateDocumentEntity(documentEntity);
    }
    //删除一条记录
    @RequestMapping("/deleteDocumentEntity")
    public void deleteDocumentEntity(String d_no) {
        documentService.deleteDocumentEntityByD_no(d_no);
    }
}
