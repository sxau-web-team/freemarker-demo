package main;

import freemarker.template.Template;
import utils.FreemarkerUtils;

import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by qingfeng on 16/12/13.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("start");
        try {
            testftl1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

    /**
     * 仅仅针对有一个数据的测试
     *
     * @throws Exception
     */
    public static void testftl1() throws Exception {
        FreemarkerUtils util = new FreemarkerUtils();
        Template template = util.getTemplate("test1.ftl");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", "Test");
        // 默认输出到了控制台上
        template.process(map, new OutputStreamWriter(System.out));
        util.htmlprint("test1.ftl", map, "./../pages/05.html");
    }


}

