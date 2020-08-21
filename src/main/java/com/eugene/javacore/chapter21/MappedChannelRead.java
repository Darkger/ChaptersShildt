package com.eugene.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        try(FileChannel fchan = (FileChannel) Files.newByteChannel(Paths.get("test.txt")))
        {
            long size = fchan.size();
            MappedByteBuffer mBuf = fchan.map(FileChannel.MapMode.READ_ONLY,0,size);
            for (int i =0;i<size;i++)
            {
                System.out.println((char)mBuf.get());

            }


        }catch (InvalidPathException | IOException e){}
    }
}
