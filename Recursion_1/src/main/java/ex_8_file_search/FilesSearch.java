package ex_8_file_search;

import java.io.File;
import java.util.ArrayList;

class FilesSearch {
    public static ArrayList<File> findFiles(File dir) {
        ArrayList<File> filelist = new ArrayList<>();
        return findFilesHelper(dir, filelist);
    }

    private static ArrayList<File> findFilesHelper(File dir, ArrayList<File> filelist) {
        File[] files = dir.listFiles();
        for(File file : files) {
            filelist.add(file);
            if(file.isDirectory()) {
                findFilesHelper(file, filelist);
            }
        }
        return filelist;
    }
}