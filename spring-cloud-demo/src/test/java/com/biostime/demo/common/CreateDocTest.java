package com.biostime.demo.common;

import com.biostime.autodoc.utils.CreateDocUtil;
import org.junit.Test;

/**
 * Function:测试文档生成
 * <P> 版权所有 ©2013 Biostime Inc.. All Rights Reserved
 * <p> 未经本公司许可，不得以任何方式复制或使用本程序任何部分 <p>
 * User: 12360
 * Date: 2015/12/1
 * Time: 19:22
 */
public class CreateDocTest {
    @Test
    public void testCreateDoc(){
        CreateDocUtil.create("demo");
    }
}
