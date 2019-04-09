package com.faculty.interadmin.dao;

import com.faculty.interadmin.entity.DocumentEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DocumentDao {
    //    获取所有数据
    @Select("select from document")
    List<DocumentEntity> findDAll();
    //    根据d_no查询一条记录
    @Select("select * from document where d_no=#{d_no}")
    DocumentEntity getDocumentEntityByD_no(String d_no);
    //    根据d_title查询一条记录
    @Select("select * from document where d_title=#{d_title}")
    DocumentEntity getDocumentEntityBydepart_title(String d_title);
    //     增加一条记录
    @Insert("insert into document(d_no,d_title,d_uploader,d_url,d_intro)" +
            "values(#{d_no},#{d_title},#{d_uploader},#{d_url},#{d_intro})")
    void insertDocumentEntity(DocumentEntity documentEntity);
    //     更新一条记录
    @Update("update document set d_title=#{d_title}," +
            "d_uploader=#{d_uploader},d_url=#{d_url},d_intro=#{d_intro} where d_no=#{d_no}")
    void updateDocumentEntity(DocumentEntity documentEntity);
    //     删除一条记录
    @Delete("delete from document where d_no=#{d_no}")
    void deleteDocumentEntity(String d_no);


}
