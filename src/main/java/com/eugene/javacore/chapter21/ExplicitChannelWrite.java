package com.eugene.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        try(FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"), StandardOpenOption.WRITE,StandardOpenOption.CREATE))
        {
            ByteBuffer mbuf = ByteBuffer.allocate(26);
            for (int i =0;i<26;i++)
            {
                mbuf.put((byte)('A'+i));
                mbuf.rewind();
                fChan.write(mbuf);
            }
        }catch (IOException e){}
    }
}
