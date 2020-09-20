package main.Java实战.chapter05.p5_8_04;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 10:53
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        // 文件流统计单词个数（）去掉重复项
        System.out.println(
                Files.lines(Paths.get("D:\\workspace\\iblog\\about.md"), Charset.defaultCharset())
                        .flatMap(line-> Arrays.stream(line.split(" ")))
                        .distinct()
                        .count()
        );
    }
}
