package com.zhc.springframework.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileSystemResource  implements Resource {

    //File类是对文件信息的封装，而不是具体文件内容，一般用于文件和目录的创建、文件的查找和文件的删除
    //File类指向的文件，甚至会是磁盘上本来不存在的文件
    private final File file;

    private final String path;

    public FileSystemResource(File file) {
        this.file = file;
        this.path = file.getPath();
    }

    public FileSystemResource(String path) {
        this.file = new File(path);
        this.path = path;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }

    public final String getPath() {
        return this.path;
    }

}