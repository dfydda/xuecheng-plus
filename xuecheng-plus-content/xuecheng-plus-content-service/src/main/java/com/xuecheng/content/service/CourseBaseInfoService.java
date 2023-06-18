package com.xuecheng.content.service;


//课程基本信息管理业务接口

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
//课程信息管理接口
public interface CourseBaseInfoService {

    //分页查询
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
    //新增课程
     CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto dto);
    //根据课程id查询课程信息
    CourseBaseInfoDto getCourseBaseInfo(Long courseId);
    //修改课程信息
    CourseBaseInfoDto updateCourseBase(Long companyId,EditCourseDto editCourseDto);
}
