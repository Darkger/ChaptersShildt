package com.eugene.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWtire {
    public static void main(String[] args) {
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE) ){
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE,0,26);
            for (int i=0 ;i<26;i++)
            {
                mBuf.put((byte)('A'+i));
            }
        }catch (InvalidPathException| IOException e){}
    }
}
