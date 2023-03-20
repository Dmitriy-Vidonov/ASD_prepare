package ex_8_file_search;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestSearch {
    public static void findFiles(File dir, List<File> fileList) { // dir - каталог для поиска, filelist - список для хранения файлов
        File[] files = dir.listFiles(); // files - массив типа File - там храним все файлы. listfiles() - возвращает список файлов и каталогов.
        for(File file : files) { // обходим каждую переменную в списке файлов
            fileList.add(file); // добавляем файл в список
            if(file.isDirectory()) { // если файл является директорией, то вызываем функцию рекурсивно для директории
                findFiles(file, fileList); // кормим нашей рекурсивной функции еще одну папку.
            }
        }
    }

    public static void main(String[] args) {
        File dir = new File("E:\\Zona Downloads");
        List<File> fileList = new ArrayList<>();
        findFiles(dir, fileList);
        for(File file : fileList) {
            System.out.println(file.getAbsolutePath());
        }

        System.out.println("***********************");

        // тестирование отдельного класса FilesSearch
        List<File> fileList1 = new ArrayList<>();
        fileList1 = FilesSearch.findFiles(dir);
        for(File unitFile : fileList1)
            System.out.println(unitFile.getAbsolutePath());
    }
}
