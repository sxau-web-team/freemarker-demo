package utils;

/**
 * Created by qingfeng on 16/12/13.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerUtils {

    /**
     * 根据给定的ftl（freemarker template language）来获得一个用于操作的模板
     * @param name
     * @return
     */
    public Template getTemplate(String name) {
        try {
            // 通过Freemark而的Configuration读取到相应的模板ftl
            Configuration cfg = new Configuration();
            // 设定去哪里读取相关的模板FTL文件
            cfg.setClassForTemplateLoading(this.getClass(), "/ftl");
            // 在模板文件目录中找到名为name的文件
            Template template = cfg.getTemplate(name);
            return template != null ? template : null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 通过控制台输出文件信息
     *
     * @param name
     * @param root
     */
    public void print(String name, Map<String, Object> root) {
        try {
            // 通过Template可以将模板文件输出到相应的流
            Template template = this.getTemplate(name);
            template.process(root, new PrintWriter(System.out));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 输出为HTML文件
     *
     * @param name
     * @param root
     * @param outfile
     */
    public void htmlprint(String name, Map<String, Object> root, String outfile) {
        FileWriter writer = null;
        try {
            // 使用一个路径实现将文件的输出
            writer = new FileWriter(new File("src/"+ outfile));
            Template template = this.getTemplate(name);
            template.process(root, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}