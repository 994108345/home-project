package IO;

import org.junit.Test;
import utils.StringUtils;

import java.io.*;

/**
 * Created by wenzailong on 2017/11/10.
 */
public class Demo1 {
    @Test
    public void test1() throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters , 'q' to quit .");
        do{
            c = (char) br.read();
            StringUtils.print(c);

        } while (c != 'q');
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' too quit.");
        System.out.println("stop");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
    @Test
    public void test2(){
        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println("this is a string");
        int i= -7;
        pw.println(i);
        double d= 4.5- 7;
        pw.println(d);
        }

    //读取文件留流
    @Test
    public void readFileTest() throws IOException {
        int i;
        FileInputStream fin;
        FileOutputStream fout;
        File file =new File("C:\\Users\\wenzailong\\Desktop\\测试文件流.txt");
        try{
            fin = new FileInputStream(file);
            do {
                i = fin.read();
                if (i != -1){
                    System.out.println((char) i);
                }
            } while (i !=-1);
            i= fin.read();
            fin.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    //写文件留流(会清除原内容)
    @Test
    public void writeFileTest() throws IOException {
        FileOutputStream fout;
        File file =new File("C:\\Users\\wenzailong\\Desktop\\测试文件流.txt");
        try{
            fout = new FileOutputStream(file);
            byte[] bt = "woqunidaye".getBytes();
            fout.write(bt);
            fout.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Test
    public void transientTest(){
        FileObject fileObject =new FileObject();
        System.out.println(fileObject.title);

        FileOutputStream fout;
        File file =new File("C:\\Users\\wenzailong\\Desktop\\测试文件流.txt");
        try{
            fout = new FileOutputStream(file);
            byte[] bt = "gaobudong".getBytes();
            fout.write(bt);
            fout.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //文件操作文件目录(返回字符串文件名)
    @Test
    public void fileDirectory(){
        File file = new File("C:\\Users\\wenzailong\\Desktop\\工作文档");
        FilenameFilter filenameFilter= new OnlyExt("txt");
        String[] fileNamws = file.list(filenameFilter);
        for (String fileName: fileNamws){
            StringUtils.print(fileName);
        }
    }
    //文件操作文件目录(返回file对象)
    @Test
    public void fileArray(){
        File file = new File("C:\\Users\\wenzailong\\Desktop\\工作文档");
        FilenameFilter filenameFilter = new OnlyExt("txt");
        File[] files = file.listFiles(filenameFilter);
        for (File fileName: files){
            StringUtils.print(fileName);
        }
    }
    //创建目录(mkdir 和 mkdirs的区别，前者需要父目录，后者不需要)
    @Test
    public void createMidirs(){
        File file =new File("C:\\Users\\wenzailong\\Desktop\\1\\2\\3\\4\\5\\6\\7");
        file.mkdirs();
    }

    @Test
    public void FileInputStrenmTest() throws IOException {
        File file = new File("C:\\Users\\wenzailong\\Desktop\\工作文档\\保存修改前文件\\2017.11.06.波次管理缓存\\components\\edit.compoent.ts");
        InputStream inputStream = new FileInputStream(file);
        int size = inputStream.available();
        int n =size/40;
        System.out.println("目前可读的字节数" + size);
        byte b[] = new byte[40];
        for (int i = 0; i < 60; i++){
            System.out.println("开始组个字符输出" + (char)inputStream.read());
            if (inputStream.read(b) != 10){
                System.out.println("不能读的字符是：'");
            }
        }


    }
    @Test
    public void fileOutPutStream() throws IOException {
        String fileText = "标准打字";
        byte buf [] = fileText.getBytes();
        OutputStream outputStream = new FileOutputStream("C:\\Users\\wenzailong\\Desktop\\1.txt");
        for (int i = 0; i < buf.length;  i +=2) {
            outputStream.write(buf[i]);
        }
        outputStream.close();

        OutputStream outputStream1 = new FileOutputStream("C:\\Users\\wenzailong\\Desktop\\2.txt");
        outputStream1.write(buf);
        outputStream1.close();

        OutputStream outputStream2 = new FileOutputStream("C:\\Users\\wenzailong\\Desktop\\3.txt");
        outputStream2.write(buf,buf.length-buf.length/4,2);
        outputStream2.close();
    }
    @Test
    public void BateArrayTest(){
        String tmp = "abc";
        byte[] b = tmp.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(b,0,3);
        for (int i = 0; i < 2; i++){
            int c ;
            while ((c = byteArrayInputStream.read()) != -1){
                if (i == 0){
                    System.out.println((char)c);
                }else {
                    System.out.println(Character.toUpperCase((char) c));
                }
            }
            System.out.println();
            byteArrayInputStream.reset();

        }
    }
    /*a字节数组输出流*/

    @Test
    public void byteArrayOutputStreamTest() throws IOException {
        ByteArrayOutputStream f =new ByteArrayOutputStream();
        String s = "This should end up in the array";
        byte buf[] = s.getBytes();
        f.write(buf);
        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("Into array");
        byte b[] = f.toByteArray();
        for (int i = 0 ; i<b.length; i++){
            System.out.println((char) b[i]);
        }
        System.out.println("\nTo an OutputStream()");
        OutputStream f2 =new FileOutputStream("C:\\Users\\wenzailong\\Desktop\\字节数组文件流.txt");
        f.writeTo(f2);
        f2.close();
        System.out.println("Doing a reset");
        f.reset();
        for (int i = 0; i<3; i++){
            f.write('X');
        }
        System.out.println(f.toString());
    }

    /*缓冲字节流*/
    @Test
    public void bufferedInputStreamTest() throws IOException {
        String s = "This is a &copy ; copuright symbol " + "but this  is  &copy not.\n";
        byte buf[] = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        BufferedInputStream f = new BufferedInputStream(in);
        int c;
        boolean marked = false;
        while ((c = f.read()) != -1){
            switch (c){
                case  '&':
                    if (!marked){
                        f.mark(16);
                        System.out.println("缓存:"+f.read());
                    } else {
                        marked = false;
                    }
                    break;
                default:
                    if (!marked){
                        System.out.println((char) c);
                        break;
                    }
            }
        }
        System.out.println("缓存1"+f.read());

    }
}
class OnlyExt implements FilenameFilter{
    String ext;
    public OnlyExt(String ext){
        this.ext = "." + ext;
    }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
class FileOnlyFileter implements  FileFilter{
    File file = new File("C:\\Users\\wenzailong\\Desktop\\工作文档\\保存修改前文件\\2017.11.06.波次管理缓存\\components");
    @Override
    public boolean accept(File pathname) {
        return false;
    }
}


