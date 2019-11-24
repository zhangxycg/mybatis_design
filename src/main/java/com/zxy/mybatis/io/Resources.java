package com.zxy.mybatis.io;

import java.io.InputStream;

/**
 * @Description: 使用类加载器读取配置文件
 * @Author: zhangxy
 * @Date: Created in 2019/11/23
 * @Modified By:
 */
public class Resources {
    /**
     * 根据传入的参数获取字节输入流
     *
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath) {
        // 获取当前类的字节码，获取字节码的类加载器，根据类加载器读取配置文件信息
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
