package ex_8_file_search;

import java.io.File;
import java.util.List;

class FilesSearch {
    public static void findFiles(File dir, List<File> fileList) {
        File[] files = dir.listFiles();
        for(File file : files) {
            fileList.add(file);
            if(file.isDirectory()) {
                findFiles(file, fileList);
            }
        }
    }
}