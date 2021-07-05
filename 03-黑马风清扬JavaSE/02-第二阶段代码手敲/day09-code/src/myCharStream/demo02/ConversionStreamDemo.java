package myCharStream.demo02;

/**
 * @author 李明
 * @date 2021年07月05日 4:25
 */

import java.io.*;

/**
    InputStreamReader：是从字节流到字符流的桥梁
        它读取字节，并使用指定的编码将其解码为字符
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集

    OutputStreamWriter：是从字符流到字节流的桥梁
        是从字符流到字节流的桥梁，使用指定的编码将写入的字符编码为字节
        它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
 */
public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        //        OutputStreamWriter(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。
        //        OutputStreamWriter(OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter。

//        FileOutputStream fos = new FileOutputStream("day09-code\\osw.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);

        //简写如下：
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\osw.txt"));
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\osw.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\osw.txt"),"GBK");
        osw.write("中国");
        osw.close();


        //        InputStreamReader(InputStream in) 创建一个使用默认字符集的InputStreamReader。
        //        InputStreamReader(InputStream in, String charsetName) 创建一个使用命名字符集的InputStreamReader。
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\osw.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\osw.txt"),"GBK");
        //一次读取一个字符数据
        int ch;
        while ((ch = isr.read()) !=-1){
            System.out.print((char)ch);
        }
        isr.close();
    }
}
