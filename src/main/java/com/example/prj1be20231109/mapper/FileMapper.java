package com.example.prj1be20231109.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FileMapper {

    @Insert("""
        INSERT INTO boardFile (boardId, name)
        VALUES (#{boardId}, #{name})
        """)
    int insert(Integer boardId, String name);

    @Select("""
        SELECT name
        FROM boardFile
        WHERE boardId = #{boardId}
        """)
    List<String> selectNamesByBoardId(Integer boardId);
}
