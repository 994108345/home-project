package IO;

import utils.StringUtils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by wenzailong on 2017/11/9.
 */
public class FileTest {
}

 class DirList {
    public static void main (String[] args){
        File path = new File("G:\\迅雷下载");
        String[] list;
        if (args.length != 0){
            list = path.list();
        }else{
            list = path.list(new DirFilter("."));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String dirItrm : list){
            StringUtils.print(dirItrm);
        }
    }
}
class DirFilter implements FilenameFilter{
    private Pattern pattern;
    public DirFilter(String regex){
        pattern = Pattern.compile(regex);
    }
    public boolean accept(File dir,String name){
        return  pattern.matcher(name).matches();
    }
}
